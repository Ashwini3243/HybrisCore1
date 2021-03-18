package de.hybris.trainingAshwini.core.cutsomJobs;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingAshwini.core.customDao.CustomerDao;
import de.hybris.trainingAshwini.core.model.CustomerIsNewJobModel;
import org.apache.log4j.Logger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomerIsNewJob extends AbstractJobPerformable<CustomerIsNewJobModel> {

    private static final Logger log=Logger.getLogger(IsNewCustomerJob.class);
    private CustomerDao customerDao;
    private ModelService modelService;
    @Override
    public PerformResult perform(CustomerIsNewJobModel customerIsNewJobModel) {
        final int noOfDaysOld = customerIsNewJobModel.getNoOfDaysToConsider();
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOld);
        final Date oldDate1 = cal.getTime();
        if (customerIsNewJobModel.getCronJobHistoryEntries() == null) {
            final List<CustomerModel> isNewCustomerList = getCustomerDao().findIsNewCustomerList(oldDate1);
            log.debug("customers older than specified days size:" + isNewCustomerList.size());
            /*if (isNewCustomerList.size() != 0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
            }*/
            this.toSetIsNewCustomer(isNewCustomerList);

        } else {
            Date lastTriggerCronJobDate = customerIsNewJobModel.getCronJobHistoryEntries().get(0).getEndTime();
            log.info("last date" + lastTriggerCronJobDate);
            final List<CustomerModel> isNewCustomerList = getCustomerDao().findIsNewCustomerList(lastTriggerCronJobDate);
            log.info("customers older than specified days size:" + isNewCustomerList.size());
           /* if (isNewCustomerList.size() != 0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
            }*/
            this.toSetIsNewCustomer(isNewCustomerList);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
    protected void toSetIsNewCustomer( List<CustomerModel> isNewCustomerList){
        if (isNewCustomerList.size() != 0) {
            for (CustomerModel i : isNewCustomerList) {
                log.info("in loop before" + i.getIsNewCustomer());
                i.setIsNewCustomer(true);
                modelService.save(i);
                log.info("in loop after" + i.getIsNewCustomer());
            }
        }}
    public CustomerDao getCustomerDao() {
        return customerDao;
    }
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    public ModelService getModelService() {
        return modelService;
    }
    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
