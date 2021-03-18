package de.hybris.trainingAshwini.core.customServices.customServiceImpl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorExecutionPolicy;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.trainingAshwini.core.customDao.ManufacturerDetailsDao;
import de.hybris.trainingAshwini.core.customServices.ManufacturerDetailsService;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsAuditEntryModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;

/**
 * implementation for ManufacturerDetailsService
 */
public class DefaultManufacturerDetailsService implements ManufacturerDetailsService {

    private static final Logger log=Logger.getLogger(DefaultManufacturerDetailsService.class);

    private ManufacturerDetailsDao manufacturerDetailsDao;
    private ModelService modelService;
    private SessionService sessionService;

    @Override
    public ManufacturerDetailsModel findManufacturerDetailsById(int mId) {
        log.info("in service");
        return getManufacturerDetailsDao().findManufacturerDetailsById(mId) ;
    }

    @Override
    public List<ManufacturerDetailsModel> manufacturerDetailsListWithPagination(int start) {
        return getManufacturerDetailsDao().manufacturerDetailsListWithPagination(start);
    }

    public List<ManufacturerDetailsModel> findManufacturerDetailsByIdAndName(int mId,String mName){
    log.info(getManufacturerDetailsDao().findManufacturerDetailsByIdAndName(mId,mName)+" in service");
        return getManufacturerDetailsDao().findManufacturerDetailsByIdAndName(mId,mName);
    }

    @Override
    public void SaveManufacturerDetails(ManufacturerDetailsModel data) throws InterceptorException {
        getModelService().save(data);
    }

    public void initDefaultMethods(ManufacturerDetailsModel detailsModel){
        modelService.initDefaults(detailsModel);
    }

    @Override
    public void removeManufacturerDetails(ManufacturerDetailsModel data) {
        getModelService().remove(data);
    }

    @Override
    public void onLoadManufacturerDetails(ManufacturerDetailsModel data){
        getModelService().get(data);
    }

    @Override
    public void SaveManufacturerDetailsAudit(ManufacturerDetailsAuditEntryModel detailsModel) {
        log.info("in audit model"+ detailsModel);
        getModelService().save(detailsModel);
    }



    @Override
    public List<CustumCustomerModel> getListOfCustomCustomerDetails(int currentPage) {
        log.info("in dao");
        return manufacturerDetailsDao.getListOfCustomCustomerDetails(currentPage);
    }

    @Override
    public void onLoadCustomCustomer(CustumCustomerModel data) {
        getModelService().get(data);
    }


    public ManufacturerDetailsDao getManufacturerDetailsDao() {
        return manufacturerDetailsDao;
    }
    @Required
    public void setManufacturerDetailsDao(ManufacturerDetailsDao manufacturerDetailsDao) {
        this.manufacturerDetailsDao = manufacturerDetailsDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {

        this.modelService = modelService;
    }

    public SessionService getSessionService() {
        return sessionService;
    }

    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }

}
  /* final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_UNIQUE_ATTRIBUTE_VALIDATOR_FOR_ITEM_TYPES, ImmutableSet.of("ManufacturerDetails"));

        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody() {
            @Override
            public void executeWithoutResult() {
                getModelService().save(data);
            }
        });*/
 /*   final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS, ImmutableSet.of("manufacturerDetailsNameValidateInterceptor","manufacturerDetailsNamePrepareInterceptor"));
        getSessionService().executeInLocalViewWithParams(params, new SessionExecutionBody() {
                    @Override
                    public void executeWithoutResult() {
                        getModelService().save(data);
                    }
        });*/
/*final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.LOAD));
        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody(){
            @Override
            public void executeWithoutResult() {

            }
        });*/
 /* final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.REMOVE));
        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody(){
            @Override
            public void executeWithoutResult() {
                getModelService().remove(data);
            }
        });*/