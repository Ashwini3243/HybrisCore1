package de.hybris.trainingAshwini.facades.customFacades.customFacadeImpl;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.CustumCustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingAshwini.core.customServices.ManufacturerDetailsService;
import de.hybris.trainingAshwini.core.jalo.CustumCustomer;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import de.hybris.trainingAshwini.facades.customFacades.ManufacturerDetailsFacade;
import de.hybris.trainingAshwini.facades.product.data.ManufacturerDetailsData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * implementation for ManufacturerDetailsFacade
 */
public class DefaultManufacturerDetailsFacade implements ManufacturerDetailsFacade {

    private static final Logger log= Logger.getLogger(ManufacturerDetailsFacade.class);

    private Converter<ManufacturerDetailsModel,ManufacturerDetailsData> manufacturerDetailsDataConverter;
    Converter<CustumCustomerModel,CustumCustomerData> CustumCustomerDataConverter;
    private ManufacturerDetailsService manufacturerDetailsService;

    @Override
    public ManufacturerDetailsData findManufacturerDetailsById(int mId) {
       ManufacturerDetailsModel manufacturerDetailsModel=getManufacturerDetailsService().findManufacturerDetailsById(mId);
       ManufacturerDetailsData manufacturerDetailsData=getManufacturerDetailsDataConverter().convert(manufacturerDetailsModel);
       log.info(manufacturerDetailsData+"in facade");
       return manufacturerDetailsData;
    }

    public List<ManufacturerDetailsData> manufacturerDetailsListWithPagination(int start){
        List<ManufacturerDetailsModel> manufacturerDetailsModel=getManufacturerDetailsService().manufacturerDetailsListWithPagination(start);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModel);
    return  manufacturerDetailsData;
    }

    public List<ManufacturerDetailsData> findManufacturerDetailsByIdAndName(int mId,String mName){
        List<ManufacturerDetailsModel> manufacturerDetailsModel=getManufacturerDetailsService().findManufacturerDetailsByIdAndName(mId,mName);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModel);
       log.info(manufacturerDetailsData+"in facade");
        return  manufacturerDetailsData;
    }


    @Override
    public List<CustumCustomerData> getCustomCustomerList(int currentPage) {
        List<CustumCustomerModel> customerModels=getManufacturerDetailsService().getListOfCustomCustomerDetails(currentPage);
       log.info("in facade"+customerModels);
        List<CustumCustomerData> customerData=getCustumCustomerDataConverter().convertAll(customerModels);
        log.info("in facade after convertion"+customerModels);
        return customerData;
    }

    public Converter<CustumCustomerModel, CustumCustomerData> getCustumCustomerDataConverter() {
        return CustumCustomerDataConverter;
    }

    public void setCustumCustomerDataConverter(Converter<CustumCustomerModel, CustumCustomerData> custumCustomerDataConverter) {
        CustumCustomerDataConverter = custumCustomerDataConverter;
    }

    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsDataConverter() {
        return manufacturerDetailsDataConverter;
    }

    @Required
    public void setManufacturerDetailsDataConverter(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsDataConverter) {
        this.manufacturerDetailsDataConverter = manufacturerDetailsDataConverter;
    }

    public ManufacturerDetailsService getManufacturerDetailsService() {
        return manufacturerDetailsService;
    }

    @Required
    public void setManufacturerDetailsService(ManufacturerDetailsService manufacturerDetailsService) {
        this.manufacturerDetailsService = manufacturerDetailsService;
    }

}
