package de.hybris.trainingAshwini.storefront.cutsomCommandClasses;

import de.hybris.platform.core.model.c2l.CountryModel;

public class ManufacturerDetailsForm {
    private int mId;
    private String mName;
    private CountryModel mCountry;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public CountryModel getmCountry() {
        return mCountry;
    }

    public void setmCountry(CountryModel mCountry) {
        this.mCountry = mCountry;
    }
}
