package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.trainingAshwini.core.jalo.ManufacturerDetailsAuditEntry;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsAuditEntryModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class ManufacturerDetailsAuditNameValidateInterceptor implements ValidateInterceptor {
    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsAuditNameValidateInterceptor.class);
    @Override
    public void onValidate(final Object o, final InterceptorContext ctx) throws InterceptorException {

        if (o instanceof ManufacturerDetailsAuditEntry) {
            final ManufacturerDetailsAuditEntryModel auditEntry = (ManufacturerDetailsAuditEntryModel) o;
            LOG.info("audit name validator interceptor"+ auditEntry);
            if (!StringUtils.isAlphanumeric(auditEntry.getMName())) {
                throw new InterceptorException("ManufacturerDetails  audit entries cannot have empty Name");
            }
        }
    }
}
