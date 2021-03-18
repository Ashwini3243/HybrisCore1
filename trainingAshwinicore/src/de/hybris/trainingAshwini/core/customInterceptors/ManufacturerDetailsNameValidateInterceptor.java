package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class ManufacturerDetailsNameValidateInterceptor implements ValidateInterceptor<ManufacturerDetailsModel> {
    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsNameValidateInterceptor.class);
    @Override
    public void onValidate(ManufacturerDetailsModel detailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        LOG.info("in Name validate INterceptor"+ detailsModel);
        if (!StringUtils.isAlphanumeric(detailsModel.getMName()))
        {
        LOG.error(" error in name  validate");
        throw new InterceptorException("dont use special chars");
    }
}
}
