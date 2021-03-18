package de.hybris.trainingAshwini.core.customInterceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import org.apache.log4j.Logger;
import java.util.Calendar;
import java.util.Date;

public class CustumCustomerLoadInterceptor implements LoadInterceptor<CustumCustomerModel> {
    private static final Logger LOG = Logger.getLogger(CustumCustomerLoadInterceptor.class);
    @Override
    public void onLoad(CustumCustomerModel custumCustomerModel, InterceptorContext interceptorContext) throws InterceptorException {
       int newCustomer = 0;
        final Date CustomerCreatedDate = custumCustomerModel.getCustomerCreated();
        final Calendar cal = Calendar.getInstance();
        cal.setTime(CustomerCreatedDate);
        final int createdYear = cal.get(Calendar.YEAR);
        final int createdMonth = cal.get(Calendar.MONTH);
        final int createdDay = cal.get(Calendar.DAY_OF_MONTH);
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        final int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        final int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (createdYear == currentYear) {
            if (createdMonth == currentMonth) {
                newCustomer = currentDay - createdDay;
                if (newCustomer > 0 && newCustomer < 10) {
                    custumCustomerModel.setNewCustomer(true);
                } else {
                    custumCustomerModel.setNewCustomer(false);
                }

            }
        }
    }
}
