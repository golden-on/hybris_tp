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
package de.hybris.platform.integration.cis.payment.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type CisFraudReportCronJob first defined at extension cispayment.
 */
@SuppressWarnings("all")
public class CisFraudReportCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CisFraudReportCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute defined at extension <code>cispayment</code>. */
	public static final String LASTFRAUDREPORTENDTIME = "lastFraudReportEndTime";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CisFraudReportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CisFraudReportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CisFraudReportCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CisFraudReportCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute defined at extension <code>cispayment</code>. 
	 * @return the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	@Accessor(qualifier = "lastFraudReportEndTime", type = Accessor.Type.GETTER)
	public Date getLastFraudReportEndTime()
	{
		return getPersistenceContext().getPropertyValue(LASTFRAUDREPORTENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CisFraudReportCronJob.lastFraudReportEndTime</code> attribute defined at extension <code>cispayment</code>. 
	 *  
	 * @param value the lastFraudReportEndTime - Used to keep track of the last end date sent for the Fraud Report Update
	 */
	@Accessor(qualifier = "lastFraudReportEndTime", type = Accessor.Type.SETTER)
	public void setLastFraudReportEndTime(final Date value)
	{
		getPersistenceContext().setPropertyValue(LASTFRAUDREPORTENDTIME, value);
	}
	
}
