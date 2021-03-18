package de.hybris.trainingAshwini.facades.populators;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import de.hybris.trainingAshwini.facades.product.data.ManufacturerDetailsData;

public class ManufacturerDetailsPopulator implements Populator<ManufacturerDetailsModel, ManufacturerDetailsData> {
    Converter<CountryModel, CountryData> countryModelCountryDataConverter;

    public Converter<CountryModel, CountryData> getCountryModelCountryDataConverter() {
        return countryModelCountryDataConverter;
    }

    public void setCountryModelCountryDataConverter(Converter<CountryModel, CountryData> countryModelCountryDataConverter) {
        this.countryModelCountryDataConverter = countryModelCountryDataConverter;
    }

    @Override
    public void populate(ManufacturerDetailsModel source, ManufacturerDetailsData target) throws ConversionException {
        target.setMId(source.getMId());
        target.setMName(source.getMName());
        target.setMCountry(getCountryModelCountryDataConverter().convert(source.getMCountry()));
    }
}
