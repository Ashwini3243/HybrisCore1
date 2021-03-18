package de.hybris.trainingAshwini.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import de.hybris.trainingAshwini.facades.product.data.ManufacturerDetailsData;

public class CustomManufacturerToProductPopulator implements Populator<ProductModel, ProductData> {

    Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsDataConverter;

    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsDataConverter() {
        return manufacturerDetailsDataConverter;
    }

    public void setManufacturerDetailsDataConverter(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsDataConverter) {
        this.manufacturerDetailsDataConverter = manufacturerDetailsDataConverter;
    }

    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {

        target.setManufacturerDetails(getManufacturerDetailsDataConverter().convertAll(source.getManufacturerDetails()));
    }
}
