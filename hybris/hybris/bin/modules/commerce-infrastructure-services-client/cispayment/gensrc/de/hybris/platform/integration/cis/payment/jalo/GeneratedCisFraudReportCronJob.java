/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 avr. 2025 à 23:05:52                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.integration.cis.payment.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.integration.cis.payment.constants.CispaymentConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.integration.cis.payment.jalo.CisFraudReportCronJob CisFraudReportCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCisFraudReportCronJob extends CronJob
{
	/** Qualifier of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute **/
	public static final String LASTFRAUDREPORTENDTIME = "lastFraudReportEndTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTFRAUDREPORTENDTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute.
	 * @return the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	public Date getLastFraudReportEndTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTFRAUDREPORTENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute.
	 * @return the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	public Date getLastFraudReportEndTime()
	{
		return getLastFraudReportEndTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute. 
	 * @param value the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	public void setLastFraudReportEndTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTFRAUDREPORTENDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute. 
	 * @param value the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	public void setLastFraudReportEndTime(final Date value)
	{
		setLastFraudReportEndTime( getSession().getSessionContext(), value );
	}
	
}
