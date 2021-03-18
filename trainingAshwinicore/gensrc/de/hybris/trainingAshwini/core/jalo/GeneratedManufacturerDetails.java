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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingAshwini.core.constants.TrainingAshwiniCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManufacturerDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufacturerDetails extends GenericItem
{
	/** Qualifier of the <code>ManufacturerDetails.mId</code> attribute **/
	public static final String MID = "mId";
	/** Qualifier of the <code>ManufacturerDetails.mName</code> attribute **/
	public static final String MNAME = "mName";
	/** Qualifier of the <code>ManufacturerDetails.mCountry</code> attribute **/
	public static final String MCOUNTRY = "mCountry";
	/** Qualifier of the <code>ManufacturerDetails.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for ManufacturerProdRel from ((trainingAshwinicore))*/
	protected static String MANUFACTURERPRODREL_SRC_ORDERED = "relation.ManufacturerProdRel.source.ordered";
	protected static String MANUFACTURERPRODREL_TGT_ORDERED = "relation.ManufacturerProdRel.target.ordered";
	/** Relation disable markmodifed parameter constants for ManufacturerProdRel from ((trainingAshwinicore))*/
	protected static String MANUFACTURERPRODREL_MARKMODIFIED = "relation.ManufacturerProdRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MID, AttributeMode.INITIAL);
		tmp.put(MNAME, AttributeMode.INITIAL);
		tmp.put(MCOUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mCountry</code> attribute.
	 * @return the mCountry
	 */
	public Country getMCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, MCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mCountry</code> attribute.
	 * @return the mCountry
	 */
	public Country getMCountry()
	{
		return getMCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mCountry</code> attribute. 
	 * @param value the mCountry
	 */
	public void setMCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, MCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mCountry</code> attribute. 
	 * @param value the mCountry
	 */
	public void setMCountry(final Country value)
	{
		setMCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mId</code> attribute.
	 * @return the mId
	 */
	public Integer getMId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mId</code> attribute.
	 * @return the mId
	 */
	public Integer getMId()
	{
		return getMId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @return the mId
	 */
	public int getMIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @return the mId
	 */
	public int getMIdAsPrimitive()
	{
		return getMIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @param value the mId
	 */
	public void setMId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @param value the mId
	 */
	public void setMId(final Integer value)
	{
		setMId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @param value the mId
	 */
	public void setMId(final SessionContext ctx, final int value)
	{
		setMId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mId</code> attribute. 
	 * @param value the mId
	 */
	public void setMId(final int value)
	{
		setMId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mName</code> attribute.
	 * @return the mName
	 */
	public String getMName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.mName</code> attribute.
	 * @return the mName
	 */
	public String getMName()
	{
		return getMName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mName</code> attribute. 
	 * @param value the mName
	 */
	public void setMName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.mName</code> attribute. 
	 * @param value the mName
	 */
	public void setMName(final String value)
	{
		setMName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.products</code> attribute.
	 * @return the products - Products
	 */
	public List<Product> getProducts(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			true,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			"Product",
			null,
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetails.products</code> attribute.
	 * @return the products - Products
	 */
	public List<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			"Product",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.products</code> attribute. 
	 * @param value the products - Products
	 */
	public void setProducts(final SessionContext ctx, final List<Product> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetails.products</code> attribute. 
	 * @param value the products - Products
	 */
	public void setProducts(final List<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products - Products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products - Products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products - Products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingAshwiniCoreConstants.Relations.MANUFACTURERPRODREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTURERPRODREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERPRODREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products - Products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
}
