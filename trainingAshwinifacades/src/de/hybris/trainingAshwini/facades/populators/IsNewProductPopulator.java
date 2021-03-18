package de.hybris.trainingAshwini.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class IsNewProductPopulator extends ProductPopulator {
/*
    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        target.setIsNewProduct(source.getIsNewProduct());

    }*/

    @Override
    public void populate(ProductModel source, ProductData target) {
        super.populate(source, target);
        target.setIsNewProduct(source.getIsNewProduct());
    }
}
