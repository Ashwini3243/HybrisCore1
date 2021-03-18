package de.hybris.trainingAshwini.facades.customFacades;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.CustumCustomerData;
import de.hybris.trainingAshwini.facades.product.data.ManufacturerDetailsData;

import java.util.List;


public interface ManufacturerDetailsFacade {
    /**
     *
     * @param mId getting manufacturerDetails based on mid
     * @return the {@link ManufacturerDetailsData}
     */
    ManufacturerDetailsData findManufacturerDetailsById(int mId);
    List<ManufacturerDetailsData> manufacturerDetailsListWithPagination(int start);
    List<ManufacturerDetailsData> findManufacturerDetailsByIdAndName(int mId,String mName);
    List<CustumCustomerData> getCustomCustomerList(int currentPage);
}
