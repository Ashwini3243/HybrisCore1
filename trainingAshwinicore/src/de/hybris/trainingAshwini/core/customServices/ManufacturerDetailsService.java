package de.hybris.trainingAshwini.core.customServices;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsAuditEntryModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;

import java.util.List;

/**
 * getting data from dao and returning to facade
 */
public interface ManufacturerDetailsService {

    /**
     *
     * @param mId, based on this mId  getting the manufacturerDetails
     * @return @ ManufacturerDetailsModel
     */
    ManufacturerDetailsModel findManufacturerDetailsById(int mId );
     List<ManufacturerDetailsModel> manufacturerDetailsListWithPagination(int start);
    List<ManufacturerDetailsModel> findManufacturerDetailsByIdAndName(int mId,String mName);
     void SaveManufacturerDetails(ManufacturerDetailsModel data) throws InterceptorException;
    void removeManufacturerDetails(ManufacturerDetailsModel data);
    void onLoadManufacturerDetails(ManufacturerDetailsModel data);
    public void initDefaultMethods(ManufacturerDetailsModel detailsModel);
    public void SaveManufacturerDetailsAudit(ManufacturerDetailsAuditEntryModel detailsModel);
    public List<CustumCustomerModel> getListOfCustomCustomerDetails(int currentPage);
    public void onLoadCustomCustomer(CustumCustomerModel data);
}
