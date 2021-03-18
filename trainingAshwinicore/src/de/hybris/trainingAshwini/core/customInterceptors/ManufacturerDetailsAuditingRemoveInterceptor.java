package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsAuditEntryModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;

import java.util.Date;

public class ManufacturerDetailsAuditingRemoveInterceptor implements RemoveInterceptor {
    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsAuditingRemoveInterceptor.class);
    @Override
    public void onRemove(Object o, InterceptorContext interceptorContext) throws InterceptorException {

           if (o instanceof ManufacturerDetailsModel) {
               final ManufacturerDetailsModel manufacturerDetailsModel = (ManufacturerDetailsModel) o;
               final ManufacturerDetailsAuditEntryModel auditEntryModel = interceptorContext.getModelService().create(ManufacturerDetailsAuditEntryModel.class);
               auditEntryModel.setMName(manufacturerDetailsModel.getMName());
               auditEntryModel.setSaveTimestamp(new Date());
               LOG.info("remove interceptor before saving");
               interceptorContext.registerElementFor(auditEntryModel, PersistenceOperation.SAVE);
               LOG.info("remove interceptor after saving");
           }
       }
    }

