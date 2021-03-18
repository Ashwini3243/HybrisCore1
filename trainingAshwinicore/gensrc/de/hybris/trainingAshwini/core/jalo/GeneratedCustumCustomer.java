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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustumCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustumCustomer extends GenericItem
{
	/** Qualifier of the <code>CustumCustomer.customerCreated</code> attribute **/
	public static final String CUSTOMERCREATED = "customerCreated";
	/** Qualifier of the <code>CustumCustomer.cName</code> attribute **/
	public static final String CNAME = "cName";
	/** Qualifier of the <code>CustumCustomer.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>CustumCustomer.newCustomer</code> attribute **/
	public static final String NEWCUSTOMER = "newCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERCREATED, AttributeMode.INITIAL);
		tmp.put(CNAME, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(NEWCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.cName</code> attribute.
	 * @return the cName
	 */
	public String getCName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.cName</code> attribute.
	 * @return the cName
	 */
	public String getCName()
	{
		return getCName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.cName</code> attribute. 
	 * @param value the cName
	 */
	public void setCName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.cName</code> attribute. 
	 * @param value the cName
	 */
	public void setCName(final String value)
	{
		setCName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CUSTOMERCREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated()
	{
		return getCustomerCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CUSTOMERCREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final Date value)
	{
		setCustomerCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer()
	{
		return isNewCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive()
	{
		return isNewCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final Boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final boolean value)
	{
		setNewCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustumCustomer.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustumCustomer.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
