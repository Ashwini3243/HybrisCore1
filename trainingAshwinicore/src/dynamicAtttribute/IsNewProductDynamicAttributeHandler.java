package dynamicAtttribute;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import java.util.Calendar;
import java.util.Date;

public class IsNewProductDynamicAttributeHandler  extends AbstractDynamicAttributeHandler<Boolean, ProductModel> {

    @Override
    public Boolean get(ProductModel model) {
            int isNewProduct = 0;
            final Date productRegisteredDate = model.getCreationtime();
            final Calendar cal = Calendar.getInstance();
            cal.setTime(productRegisteredDate);
            final int registeredYear = cal.get(Calendar.YEAR);
            final int registeredMonth = cal.get(Calendar.MONTH);
            final int registeredDay = cal.get(Calendar.DAY_OF_MONTH);
            final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            final int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
            final int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            if (registeredYear == currentYear) {
                if (registeredMonth == currentMonth) {
                    isNewProduct = currentDay - registeredDay;
                    if (isNewProduct > 0 && isNewProduct < 10) {
                        return true;
                    } else {
                        return false;
                    }
                }return false;
            }return false;
        }
    }

