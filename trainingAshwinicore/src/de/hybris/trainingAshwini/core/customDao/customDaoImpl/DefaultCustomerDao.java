package de.hybris.trainingAshwini.core.customDao.customDaoImpl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.trainingAshwini.core.customDao.CustomerDao;
import de.hybris.trainingAshwini.core.model.Customer1Model;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DefaultCustomerDao implements CustomerDao {

    private static final Logger log=Logger.getLogger(DefaultCustomerDao.class);
     private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> findIsNewCustomerList(Date oldDate) {

        ServicesUtil.validateParameterNotNull(oldDate, "customer oldDate must not be null!");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDate1 = dateFormat.format(oldDate);
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT {" + CustomerModel.PK + "}");
        stringBuilder.append("FROM {" + CustomerModel._TYPECODE + "}");
        stringBuilder.append(" WHERE {").append(CustomerModel.CREATIONTIME);
        stringBuilder.append("} >= ?oldDate1");
        log.info("in doa "+oldDate1);
        FlexibleSearchQuery query=new FlexibleSearchQuery(stringBuilder);
        log.info("in dao ");
        query.addQueryParameter("oldDate1",oldDate1);
        log.info("in dao before result");
        SearchResult<CustomerModel> result=getFlexibleSearchService().search(query);
        log.info("in dao after result");
        return result.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }
    @Required
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

}
