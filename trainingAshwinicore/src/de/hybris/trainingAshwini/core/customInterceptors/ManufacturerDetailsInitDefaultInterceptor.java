package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;

public class ManufacturerDetailsInitDefaultInterceptor implements InitDefaultsInterceptor<ManufacturerDetailsModel> {

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsInitDefaultInterceptor.class);

    @Override
    public void onInitDefaults(ManufacturerDetailsModel detailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        detailsModel.setMId(100001);
        detailsModel.setMName("HYBRIS");
        LOG.info("INIT DEFAULT"+detailsModel);

    }
}
