package de.hybris.trainingAshwini.core.customDao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;

import java.util.List;

/**
 * Dao for ManufacturerDetails
 */
public interface ManufacturerDetailsDao {
    /**
     *
     * @param mId, based on this mId  getting the manufacturerDetails
     * @return the {@link ManufacturerDetailsModel}
     * @throws UnknownIdentifierException if data result ==0 then we get this exception
     * @throws AmbiguousIdentifierException if data result >0 with same id then we get this error
     *      *
     */
    ManufacturerDetailsModel findManufacturerDetailsById(int mId);
    List<ManufacturerDetailsModel> manufacturerDetailsListWithPagination(int start);
    List<ManufacturerDetailsModel> findManufacturerDetailsByIdAndName(int mId,String mName);
    public List<CustumCustomerModel> getListOfCustomCustomerDetails(int currentPage);

}
