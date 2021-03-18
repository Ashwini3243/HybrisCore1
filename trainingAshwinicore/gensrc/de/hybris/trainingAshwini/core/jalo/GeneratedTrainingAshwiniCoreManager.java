/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 16, 2021, 10:24:34 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingAshwini.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingAshwini.core.constants.TrainingAshwiniCoreConstants;
import de.hybris.trainingAshwini.core.jalo.ApparelProduct;
import de.hybris.trainingAshwini.core.jalo.ApparelSizeVariantProduct;
import de.hybris.trainingAshwini.core.jalo.ApparelStyleVariantProduct;
import de.hybris.trainingAshwini.core.jalo.Customer1;
import de.hybris.trainingAshwini.core.jalo.CustomerIsNewJob;
import de.hybris.trainingAshwini.core.jalo.CustumCustomer;
import de.hybris.trainingAshwini.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.trainingAshwini.core.jalo.IsNewCustomerCronJob;
import de.hybris.trainingAshwini.core.jalo.ManufacturerCronJob;
import de.hybris.trainingAshwini.core.jalo.ManufacturerDetails;
import de.hybris.trainingAshwini.core.jalo.ManufacturerDetailsAuditEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TrainingAshwiniCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingAshwiniCoreManager extends Extension
{
	/** Relation ordering override parameter constants for ManufacturerProdRel from ((trainingAshwinicore))*/
	protected static String MANUFACTURERPRODREL_SRC_ORDERED = "relation.ManufacturerProdRel.source.ordered";
	protected static String MANUFACTURERPRODREL_TGT_ORDERED = "relation.ManufacturerProdRel.target.ordered";
	/** Relation disable markmodifed parameter constants for ManufacturerProdRel from ((trainingAshwinicore))*/
	protected static String MANUFACTURERPRODREL_MARKMODIFIED = "relation.ManufacturerProdRel.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNewCustomer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Customer1 createCustomer1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.CUSTOMER1 );
			return (Customer1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Customer1 : "+e.getMessage(), 0 );
		}
	}
	
	public Customer1 createCustomer1(final Map attributeValues)
	{
		return createCustomer1( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerIsNewJob createCustomerIsNewJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.CUSTOMERISNEWJOB );
			return (CustomerIsNewJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerIsNewJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerIsNewJob createCustomerIsNewJob(final Map attributeValues)
	{
		return createCustomerIsNewJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CustumCustomer createCustumCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.CUSTUMCUSTOMER );
			return (CustumCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustumCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public CustumCustomer createCustumCustomer(final Map attributeValues)
	{
		return createCustumCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public IsNewCustomerCronJob createIsNewCustomerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.ISNEWCUSTOMERCRONJOB );
			return (IsNewCustomerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating IsNewCustomerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public IsNewCustomerCronJob createIsNewCustomerCronJob(final Map attributeValues)
	{
		return createIsNewCustomerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerCronJob createManufacturerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.MANUFACTURERCRONJOB );
			return (ManufacturerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerCronJob createManufacturerCronJob(final Map attributeValues)
	{
		return createManufacturerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetails createManufacturerDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.MANUFACTURERDETAILS );
			return (ManufacturerDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetails createManufacturerDetails(final Map attributeValues)
	{
		return createManufacturerDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetailsAuditEntry createManufacturerDetailsAuditEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingAshwiniCoreConstants.TC.MANUFACTURERDETAILSAUDITENTRY );
			return (ManufacturerDetailsAuditEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetailsAuditEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetailsAuditEntry createManufacturerDetailsAuditEntry(final Map attributeValues)
	{
		return createManufacturerDetailsAuditEntry( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingAshwiniCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingAshwiniCoreConstants.Attributes.Customer.ISNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final Customer item)
	{
		return isIsNewCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewCustomer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final Customer item)
	{
		return isIsNewCustomerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingAshwiniCoreConstants.Attributes.Customer.ISNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final Boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewCustomer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails - manufacturer Details
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final SessionContext ctx, final Product item)
	{
		final List<ManufacturerDetails> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			"ManufacturerDetails",
			null,
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails - manufacturer Details
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final Product item)
	{
		return getManufacturerDetails( getSession().getSessionContext(), item );
	}
	
	public long getManufacturerDetailsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			"ManufacturerDetails",
			null
		);
	}
	
	public long getManufacturerDetailsCount(final Product item)
	{
		return getManufacturerDetailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails - manufacturer Details
	 */
	public void setManufacturerDetails(final SessionContext ctx, final Product item, final Collection<ManufacturerDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails - manufacturer Details
	 */
	public void setManufacturerDetails(final Product item, final Collection<ManufacturerDetails> value)
	{
		setManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails - manufacturer Details
	 */
	public void addToManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails - manufacturer Details
	 */
	public void addToManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		addToManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails - manufacturer Details
	 */
	public void removeFromManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails - manufacturer Details
	 */
	public void removeFromManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		removeFromManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
}
