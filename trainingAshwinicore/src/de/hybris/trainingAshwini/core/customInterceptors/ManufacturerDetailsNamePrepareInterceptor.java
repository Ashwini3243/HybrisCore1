package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;


public class ManufacturerDetailsNamePrepareInterceptor implements PrepareInterceptor<ManufacturerDetailsModel> {

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsNamePrepareInterceptor.class);
    @Override
    public void onPrepare(ManufacturerDetailsModel detailsModel, InterceptorContext interceptorContext) throws InterceptorException {
          String name=detailsModel.getMName();
          String modName=name+"Rakam";
          detailsModel.setMName(modName);
        LOG.info("Name prepare Interceptor"+ modName);
    }
}


