package de.hybris.trainingAshwini.storefront.util.customUtil;

import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import de.hybris.trainingAshwini.storefront.cutsomCommandClasses.ManufacturerDetailsForm;
import org.springframework.stereotype.Component;

@Component("manufactureDetailsUtil")
public class ManufactureDetailsUtil {

 public ManufacturerDetailsModel convertFormToManufacturerModel(ManufacturerDetailsForm manufacturerDetailsForm){

        ManufacturerDetailsModel m=new ManufacturerDetailsModel();
        m.setMId(manufacturerDetailsForm.getmId());
        m.setMName(manufacturerDetailsForm.getmName());
        m.setMCountry(manufacturerDetailsForm.getmCountry());
        return m;
    }

}
