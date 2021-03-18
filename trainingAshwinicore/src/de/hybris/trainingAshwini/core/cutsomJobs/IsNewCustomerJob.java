package de.hybris.trainingAshwini.core.cutsomJobs;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobHistoryModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.cronjob.impl.DefaultCronJobHistoryService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingAshwini.core.customDao.CustomerDao;
import de.hybris.trainingAshwini.core.model.IsNewCustomerCronJobModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class IsNewCustomerJob extends AbstractJobPerformable<IsNewCustomerCronJobModel> {

    private static final Logger log=Logger.getLogger(IsNewCustomerJob.class);
    private CustomerDao customerDao;
    private ModelService modelService;
 @Override
    public PerformResult perform(IsNewCustomerCronJobModel isNewCustomerCronJobModel) {


        final int noOfDaysOld = isNewCustomerCronJobModel.getNoOfDaysToConsider();

        if(isNewCustomerCronJobModel.getCronJobHistoryEntries()==null)
        {
            final Calendar cal = Calendar.getInstance();
            log.info(Calendar.DAY_OF_MONTH);
            log.info(Calendar.DATE);
            log.info(noOfDaysOld);
            cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOld);
            final Date oldDate1=cal.getTime();

            final List<CustomerModel> isNewCustomerList = getCustomerDao().findIsNewCustomerList(oldDate1);

            log.debug("customers older than specified days size:" + isNewCustomerList.size());
            if(isNewCustomerList.size()!=0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
            }

        }

        else
        {
            Date lastTriggerCronJobDate=isNewCustomerCronJobModel.getCronJobHistoryEntries().get(0).getEndTime();
            log.info("last date"+lastTriggerCronJobDate);
            final List<CustomerModel> isNewCustomerList = getCustomerDao().findIsNewCustomerList(lastTriggerCronJobDate);

            log.debug("customers older than specified days size:" + isNewCustomerList.size());
            if(isNewCustomerList.size()!=0) {
                for (CustomerModel i : isNewCustomerList) {
                    log.info("in loop before" + i.getIsNewCustomer());
                    i.setIsNewCustomer(true);
                    modelService.save(i);
                    log.info("in loop after" + i.getIsNewCustomer());
                }
            }

        }



       /* log.info(isNewCustomerCronJobModel.getEndTime()+"end time");
        log.info(isNewCustomerCronJobModel.getActiveCronJobHistory()+"active cron job history1");
        log.info(isNewCustomerCronJobModel.getActiveCronJobHistory().getEndTime()+"active cron job history2");
        log.info(isNewCustomerCronJobModel.getActiveCronJobHistory().toString()+"active cron job history3");
        log.info(isNewCustomerCronJobModel.getActiveCronJobHistory().getStartTime()+"active cron job history");
        log.info(isNewCustomerCronJobModel.getCronJobHistoryEntries().get(0).toString()+"history entries1");*/


      /*  log.info(isNewCustomerCronJobModel.getCronJobHistoryEntries().toString()+"history entries2");
        log.info(isNewCustomerCronJobModel.getCronJobHistoryEntries()+"history entries3");*/
        /*Date  oldDate1=isNewCustomerCronJobModel.getEndTime();
        log.info("date checking");
        final Date oldDate = cal.getTime();
        log.info("before going to dao"+oldDate);

        log.debug("customers older than specified days size:" + isNewCustomerList.size());
        if(isNewCustomerList.size()!=0) {
            for (CustomerModel i : isNewCustomerList) {
                log.info("in loop before" + i.getIsNewCustomer());
                i.setIsNewCustomer(Boolean.TRUE);
                modelService.save(i);
                log.info("in loop after" + i.getIsNewCustomer());
            }
        }*/
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
   public CustomerDao getCustomerDao() {
        return customerDao;
    }
    @Required
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
