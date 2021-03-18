package de.hybris.trainingAshwini.core.customDao.customDaoImpl;


import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.core.servicelayer.data.SortData;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.constants.SearchConstants;
import de.hybris.platform.servicelayer.search.paginated.strategies.SortDataParsingStrategy;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.trainingAshwini.core.customDao.ManufacturerDetailsDao;
import de.hybris.trainingAshwini.core.model.CustumCustomerModel;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import javassist.runtime.Desc;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/** implementation of the {@link ManufacturerDetailsDao}.
 */
public class DefaultManufacturerDetailsDao implements ManufacturerDetailsDao {

    private static final Logger log=Logger.getLogger(DefaultManufacturerDetailsDao.class);
    private FlexibleSearchService flexibleSearchService;
    private PaginatedFlexibleSearchService paginatedFlexibleSearchService;


    @Override
    public ManufacturerDetailsModel findManufacturerDetailsById(int mId) {
        ServicesUtil.validateParameterNotNull(mId, "Product mId must not be null!");
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT {" + ManufacturerDetailsModel.PK + "}");
        stringBuilder.append("FROM {" + ManufacturerDetailsModel._TYPECODE + "}");
        stringBuilder.append("WHERE{ " + ManufacturerDetailsModel.MID + " }");
        stringBuilder.append(" = ?").append(ManufacturerDetailsModel.MID);
        final FlexibleSearchQuery query=new FlexibleSearchQuery(stringBuilder);
        query.addQueryParameter("MID",mId);
         SearchResult<ManufacturerDetailsModel> result=getFlexibleSearchService().search(query);
         int resultCount=result.getTotalCount();
         if(resultCount==0){
             throw new UnknownIdentifierException("not found");
         }else if(resultCount>1){
             throw new AmbiguousIdentifierException("more than one record");
         }
         return result.getResult().get(0);
    }
   /* public List<ManufacturerDetailsModel> manufacturerDetailsList(int start) {
        int pageNum=start*5;
        final int range = 5;
        int total;
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {"+ManufacturerDetailsModel.PK+"}");
        builder.append("FROM {"+ManufacturerDetailsModel._TYPECODE+"}");
        builder.append("ORDER BY {"+ManufacturerDetailsModel.MID+"}");
        FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        query.setCount(range);
        query.setNeedTotal(true);
        do {
            query.setStart(pageNum);
            final SearchResult<ManufacturerDetailsModel> result = flexibleSearchService.search(query);
            total= result.getTotalCount();
            start += range;
            return result.getResult();
        }
        while (start < total);
    }*/

    @Override
    public List<ManufacturerDetailsModel> manufacturerDetailsListWithPagination(int start) {
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {" + ManufacturerDetailsModel.PK + "}");
        builder.append("FROM {" + ManufacturerDetailsModel._TYPECODE + "}");
        FlexibleSearchQuery query=new FlexibleSearchQuery(builder.toString());
        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        final SearchPageData searchPageData = PaginatedSearchUtils.createSearchPageDataWithPagination(5, start,true);
        parameter.setFlexibleSearchQuery(query);
        parameter.setSearchPageData(searchPageData);
        final SearchPageData<ManufacturerDetailsModel> searchResult = getPaginatedFlexibleSearchService().search(parameter);
        return  searchResult.getResults();
    }

    @Override
    public List<ManufacturerDetailsModel> findManufacturerDetailsByIdAndName(int mId,String mName) {
        ServicesUtil.validateParameterNotNull(mId, "Product mId must not be null!");
        ServicesUtil.validateParameterNotNull(mName, "Product mname must not be null!");
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT {" + ManufacturerDetailsModel.PK + "}");
        stringBuilder.append("FROM {" + ManufacturerDetailsModel._TYPECODE + "}");
        stringBuilder.append("WHERE{ " + ManufacturerDetailsModel.MID + " }");
        stringBuilder.append(" = ?"+ManufacturerDetailsModel.MID);
        stringBuilder.append("  AND {"+ManufacturerDetailsModel.MNAME+"}");
        stringBuilder.append(" = ?"+ManufacturerDetailsModel.MNAME);
        String id=Integer.toString(mId);
        final Map<String, String> queryParams = new HashMap<>();
        queryParams.put("MID", id);
        queryParams.put("MNAME",mName);
        final FlexibleSearchQuery query=new FlexibleSearchQuery(stringBuilder.toString(),queryParams);
        SearchResult<ManufacturerDetailsModel> result=getFlexibleSearchService().search(query);
       return result.getResult();
    }


    @Override
    public List<CustumCustomerModel> getListOfCustomCustomerDetails(int currentPage) {
        Calendar c= Calendar.getInstance();
        c.add(Calendar.DATE,-10);
        log.info(c+"date formate");
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date todate1 = c.getTime();
        log.info(" time "+todate1);
        String fromdate = dateFormat.format(todate1);
        log.info("converted format"+fromdate);
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {").append(CustumCustomerModel.PK);
        builder.append("} FROM {").append(CustumCustomerModel._TYPECODE).append("}");
        builder.append(" WHERE {").append(CustumCustomerModel.CUSTOMERCREATED);
        builder.append("} >= ?fromdate");
        FlexibleSearchQuery fquery=new FlexibleSearchQuery(builder);
        fquery.addQueryParameter("fromdate",fromdate);
        log.info("date"+fromdate);
        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        final SearchPageData searchPageData = PaginatedSearchUtils.createSearchPageDataWithPagination(5, currentPage,true);
        parameter.setFlexibleSearchQuery(fquery);
        parameter.setSearchPageData(searchPageData);
        final SearchPageData<CustumCustomerModel> searchResult = getPaginatedFlexibleSearchService().search(parameter);
        log.info("in dao"+searchResult.getResults());
        return  searchResult.getResults();
    }


    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Required
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
/*      DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 *//*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");*//*
 *//*Date date = new Date();
        String todate = dateFormat.format(date);*//*

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -10);
        Date todate1 = cal.getTime();
        String fromdate = dateFormat.format(todate1);
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT {").append(Customer1Model.PK);
        sb.append("} FROM {").append(Customer1Model._TYPECODE).append("}");
        sb.append(" WHERE {").append(Customer1Model.CUSTOMERCREATED);
        sb.append("} >= ?fromdate");
        //sb.append(fromdate);
        FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);
        fquery.addQueryParameter("fromdate",fromdate);
        SearchResult<Customer1Model> searchResult=getFlexibleSearchService().search(fquery);
        validateParameterNotNull(searchResult, "No list of customer founded");
        return searchResult.getResult();*/

/*
    final FlexibleSearchQuery query = new FlexibleSearchQuery(
            "SELECT {" + ManufacturerDetailsModel.PK + "} "
                    + "FROM {" + ManufacturerDetailsModel._TYPECODE + "} "
                    + "WHERE {" + ManufacturerDetailsModel.MID + "}=?mId");
        query.addQueryParameter(ManufacturerDetailsModel.MID, mId);

    final SearchResult<ManufacturerDetailsModel> result = getFlexibleSearchService().search(query);

    int resultCount = result.getTotalCount();
        if (resultCount == 0)
    {
        log.error("id not found with" +mId);
        throw new UnknownIdentifierException("manufacturerDetails with mId '" + mId + "' not found!");
    }
        else if (resultCount > 1)
    {
        throw new AmbiguousIdentifierException(

                "manufacturerDetails mId with '" + mId + "' is not unique, " + resultCount + "  found!");
    }
        return result.getResult().get(0);
}
*/
