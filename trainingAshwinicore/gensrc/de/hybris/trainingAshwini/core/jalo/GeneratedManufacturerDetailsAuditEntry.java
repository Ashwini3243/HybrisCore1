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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManufacturerDetailsAuditEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufacturerDetailsAuditEntry extends GenericItem
{
	/** Qualifier of the <code>ManufacturerDetailsAuditEntry.mName</code> attribute **/
	public static final String MNAME = "mName";
	/** Qualifier of the <code>ManufacturerDetailsAuditEntry.SaveTimestamp</code> attribute **/
	public static final String SAVETIMESTAMP = "SaveTimestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MNAME, AttributeMode.INITIAL);
		tmp.put(SAVETIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsAuditEntry.mName</code> attribute.
	 * @return the mName
	 */
	public String getMName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsAuditEntry.mName</code> attribute.
	 * @return the mName
	 */
	public String getMName()
	{
		return getMName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsAuditEntry.mName</code> attribute. 
	 * @param value the mName
	 */
	public void setMName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsAuditEntry.mName</code> attribute. 
	 * @param value the mName
	 */
	public void setMName(final String value)
	{
		setMName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsAuditEntry.SaveTimestamp</code> attribute.
	 * @return the SaveTimestamp
	 */
	public Date getSaveTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAVETIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsAuditEntry.SaveTimestamp</code> attribute.
	 * @return the SaveTimestamp
	 */
	public Date getSaveTimestamp()
	{
		return getSaveTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsAuditEntry.SaveTimestamp</code> attribute. 
	 * @param value the SaveTimestamp
	 */
	public void setSaveTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAVETIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsAuditEntry.SaveTimestamp</code> attribute. 
	 * @param value the SaveTimestamp
	 */
	public void setSaveTimestamp(final Date value)
	{
		setSaveTimestamp( getSession().getSessionContext(), value );
	}
	
}
