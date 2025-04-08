/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4 avr. 2025 à 17:30:02                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.outboundsync.jalo;

import de.hybris.deltadetection.jalo.StreamConfiguration;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.outboundsync.jalo.OutboundChannelConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type OutboundSyncStreamConfiguration.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class OutboundSyncStreamConfiguration extends StreamConfiguration
{
	/** Qualifier of the <code>OutboundSyncStreamConfiguration.outboundChannelConfiguration</code> attribute **/
	public static final String OUTBOUNDCHANNELCONFIGURATION = "outboundChannelConfiguration";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StreamConfiguration.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OUTBOUNDCHANNELCONFIGURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OutboundSyncStreamConfiguration.outboundChannelConfiguration</code> attribute.
	 * @return the outboundChannelConfiguration
	 */
	public OutboundChannelConfiguration getOutboundChannelConfiguration(final SessionContext ctx)
	{
		return (OutboundChannelConfiguration)getProperty( ctx, "outboundChannelConfiguration".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OutboundSyncStreamConfiguration.outboundChannelConfiguration</code> attribute.
	 * @return the outboundChannelConfiguration
	 */
	public OutboundChannelConfiguration getOutboundChannelConfiguration()
	{
		return getOutboundChannelConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OutboundSyncStreamConfiguration.outboundChannelConfiguration</code> attribute. 
	 * @param value the outboundChannelConfiguration
	 */
	public void setOutboundChannelConfiguration(final SessionContext ctx, final OutboundChannelConfiguration value)
	{
		setProperty(ctx, "outboundChannelConfiguration".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OutboundSyncStreamConfiguration.outboundChannelConfiguration</code> attribute. 
	 * @param value the outboundChannelConfiguration
	 */
	public void setOutboundChannelConfiguration(final OutboundChannelConfiguration value)
	{
		setOutboundChannelConfiguration( getSession().getSessionContext(), value );
	}
	
}
