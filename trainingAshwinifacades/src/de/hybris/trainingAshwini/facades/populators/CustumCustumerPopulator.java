package de.hybris.trainingAshwini.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustumCustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingAshwini.core.customInterceptors.CustumCustomerLoadInterceptor;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import org.apache.log4j.Logger;

public class CustumCustumerPopulator implements Populator<CustumCustomerModel, CustumCustomerData> {
    private static final Logger LOG = Logger.getLogger(CustumCustumerPopulator.class);
    @Override
    public void populate(CustumCustomerModel source, CustumCustomerData target) throws ConversionException {
        target.setCustomerCreated(source.getCustomerCreated());
        target.setCName(source.getCName());
        target.setPhone(source.getPhone());
        target.setNewCustomer(source.getNewCustomer());
        LOG.info("in populator");
    }
}
