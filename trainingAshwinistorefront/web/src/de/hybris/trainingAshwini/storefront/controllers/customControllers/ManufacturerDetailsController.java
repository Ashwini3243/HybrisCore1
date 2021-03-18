package de.hybris.trainingAshwini.storefront.controllers.customControllers;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.CustumCustomerData;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingAshwini.core.customServices.ManufacturerDetailsService;
import de.hybris.trainingAshwini.core.model.ManufacturerDetailsModel;
import de.hybris.trainingAshwini.facades.customFacades.ManufacturerDetailsFacade;
import de.hybris.trainingAshwini.facades.customFacades.customFacadeImpl.DefaultManufacturerDetailsFacade;
import de.hybris.trainingAshwini.facades.product.data.ManufacturerDetailsData;
import de.hybris.trainingAshwini.storefront.controllers.ControllerConstants;
import de.hybris.trainingAshwini.storefront.cutsomCommandClasses.ManufacturerDetailsForm;
import de.hybris.trainingAshwini.storefront.util.customUtil.ManufactureDetailsUtil;
import org.apache.catalina.ha.session.SessionMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Controller for Manufacturer Details Page
 */
@Controller
@RequestMapping(value ="/**/manuData")
public class ManufacturerDetailsController {
    private static final Logger log= Logger.getLogger(ManufacturerDetailsController.class);

    @Resource(name="manufacturerDetailsFacade")
    private ManufacturerDetailsFacade manufacturerDetailsFacade;
    @Resource(name = "manufacturerDetailsService")
    private ManufacturerDetailsService manufacturerDetailsService;
    @Resource(name = "manufactureDetailsUtil")
    private ManufactureDetailsUtil manufactureDetailsUtil;


    @RequestMapping(value = "/manufacturerDetailsDataById/{mId}",method = RequestMethod.GET)
    public String getManufacturerDetailsData(@PathVariable("mId") int mId,Model model){
        ManufacturerDetailsData data=manufacturerDetailsFacade.findManufacturerDetailsById(mId);
        model.addAttribute("manData",data);
        log.info("in controller:"+data.getMId()+" "+data.getMName()+" "+data.getMCountry());
        return ControllerConstants.Views.Pages.ManuData.ManuData;
    }

    @RequestMapping(value = "/manufacturerPagging",method = RequestMethod.GET)
    public String getPagination(){
        return ControllerConstants.Views.Pages.ManuData.pagination;
    }

    @RequestMapping(value = "/manufacturerDetailsList/{start}",method = RequestMethod.GET)
    public String getManufacturerDetailsDataListWithPagination(@PathVariable("start")int start,Model model){
        List<ManufacturerDetailsData> data=manufacturerDetailsFacade.manufacturerDetailsListWithPagination(start);
        model.addAttribute("manDataList",data);
        return ControllerConstants.Views.Pages.ManuData.ManuDataListWithPagination;
    }

    @RequestMapping(value = "/manufacturerDetailsByIdAndName/{mId}/{mName}",method = RequestMethod.GET)
    public String getManufacturerDetailsDataList(@PathVariable("mId") int mId,@PathVariable("mName") String mName,Model model){
        List<ManufacturerDetailsData> data=manufacturerDetailsFacade.findManufacturerDetailsByIdAndName(mId,mName);
        log.info(data.get(0)+"in controler");
        model.addAttribute("manData",data);
        return ControllerConstants.Views.Pages.ManuData.ManuDataByIdAndName;
    }


    @RequestMapping(value = "/addManuDataForm",method = RequestMethod.GET)
    public String displayManuDataForm(Model model){
        ManufacturerDetailsForm mDetailsForm=new ManufacturerDetailsForm();
        model.addAttribute("mDetailsForm",mDetailsForm);
        return ControllerConstants.Views.Pages.ManuData.displayManuDataForm;
    }


    @RequestMapping(value = "/addManuDataFormAction",method = RequestMethod.POST)
    public String SaveManufacturerDetailsData(final ManufacturerDetailsForm mDetailsForm,Model model) {
        final ManufacturerDetailsModel detailsModel=manufactureDetailsUtil.convertFormToManufacturerModel(mDetailsForm);
        try{
            manufacturerDetailsService.SaveManufacturerDetails(detailsModel);
        }catch (InterceptorException e){
            e.getMessage();
            model.addAttribute("msg","data should be in String"+e);
        }

        return ControllerConstants.Views.Pages.ManuData.saveManuDataSuccessMsg;
    }


    @RequestMapping(value = "/customerData1/{currentPage}",method = RequestMethod.GET)
    public String getCustomCustomerData(@PathVariable("currentPage") int currentPage,Model model){
        List<CustumCustomerData> customerData=manufacturerDetailsFacade.getCustomCustomerList(currentPage);
        model.addAttribute("customerData",customerData);
        log.info("in controller"+ customerData);
        return ControllerConstants.Views.Pages.customCutsomer.customCustomer;
    }

}
