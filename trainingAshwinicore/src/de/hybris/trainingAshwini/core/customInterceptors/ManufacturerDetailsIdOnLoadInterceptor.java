package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;

public class ManufacturerDetailsIdOnLoadInterceptor implements LoadInterceptor<ManufacturerDetailsModel> {

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsIdOnLoadInterceptor.class);

    @Override
    public void onLoad(ManufacturerDetailsModel detailsModel, InterceptorContext interceptorContext) throws InterceptorException {

        String name=detailsModel.getMName();
        String modName="Rakam"+name;
        detailsModel.setMName(modName);
        LOG.info("on load interceptor"+ modName);

    }

}
