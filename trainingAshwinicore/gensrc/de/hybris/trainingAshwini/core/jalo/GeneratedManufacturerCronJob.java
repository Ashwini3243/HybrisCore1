/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 16, 2021, 10:24:34 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingAshwini.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingAshwini.core.constants.TrainingAshwiniCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob ManufacturerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufacturerCronJob extends CronJob
{
	/** Qualifier of the <code>ManufacturerCronJob.msg</code> attribute **/
	public static final String MSG = "msg";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MSG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerCronJob.msg</code> attribute.
	 * @return the msg
	 */
	public String getMsg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MSG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerCronJob.msg</code> attribute.
	 * @return the msg
	 */
	public String getMsg()
	{
		return getMsg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerCronJob.msg</code> attribute. 
	 * @param value the msg
	 */
	public void setMsg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MSG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerCronJob.msg</code> attribute. 
	 * @param value the msg
	 */
	public void setMsg(final String value)
	{
		setMsg( getSession().getSessionContext(), value );
	}
	
}
