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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingAshwini.core.constants.TrainingAshwiniCoreConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Customer1}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomer1 extends GenericItem
{
	/** Qualifier of the <code>Customer1.customerCreated</code> attribute **/
	public static final String CUSTOMERCREATED = "customerCreated";
	/** Qualifier of the <code>Customer1.cId</code> attribute **/
	public static final String CID = "cId";
	/** Qualifier of the <code>Customer1.cName</code> attribute **/
	public static final String CNAME = "cName";
	/** Qualifier of the <code>Customer1.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Customer1.isNewCustomer</code> attribute **/
	public static final String ISNEWCUSTOMER = "isNewCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERCREATED, AttributeMode.INITIAL);
		tmp.put(CID, AttributeMode.INITIAL);
		tmp.put(CNAME, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(ISNEWCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cId</code> attribute.
	 * @return the cId
	 */
	public Integer getCId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cId</code> attribute.
	 * @return the cId
	 */
	public Integer getCId()
	{
		return getCId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cId</code> attribute. 
	 * @return the cId
	 */
	public int getCIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cId</code> attribute. 
	 * @return the cId
	 */
	public int getCIdAsPrimitive()
	{
		return getCIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cId</code> attribute. 
	 * @param value the cId
	 */
	public void setCId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cId</code> attribute. 
	 * @param value the cId
	 */
	public void setCId(final Integer value)
	{
		setCId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cId</code> attribute. 
	 * @param value the cId
	 */
	public void setCId(final SessionContext ctx, final int value)
	{
		setCId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cId</code> attribute. 
	 * @param value the cId
	 */
	public void setCId(final int value)
	{
		setCId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cName</code> attribute.
	 * @return the cName
	 */
	public String getCName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.cName</code> attribute.
	 * @return the cName
	 */
	public String getCName()
	{
		return getCName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cName</code> attribute. 
	 * @param value the cName
	 */
	public void setCName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.cName</code> attribute. 
	 * @param value the cName
	 */
	public void setCName(final String value)
	{
		setCName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CUSTOMERCREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated()
	{
		return getCustomerCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CUSTOMERCREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final Date value)
	{
		setCustomerCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer()
	{
		return isIsNewCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsNewCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive()
	{
		return isIsNewCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final boolean value)
	{
		setIsNewCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
