package de.hybris.trainingAshwini.core.customDao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingAshwini.core.model.Customer1Model;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;

import java.util.Date;
import java.util.List;

public interface CustomerDao {
    public List<CustomerModel> findIsNewCustomerList(final Date oldDate);

}
