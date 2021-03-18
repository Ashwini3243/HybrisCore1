package de.hybris.trainingAshwini.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class IsNewCustomerPopulator extends CustomerPopulator {
    @Override
    public void populate(CustomerModel source, CustomerData target) {
        super.populate(source, target);
        source.setIsNewCustomer(target.getIsNewCustomer());
    }
}
