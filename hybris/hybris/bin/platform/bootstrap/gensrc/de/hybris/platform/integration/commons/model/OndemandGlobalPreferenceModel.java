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
package de.hybris.platform.integration.commons.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OndemandGlobalPreference first defined at extension ondemandcommon.
 * <p>
 * Adding Ondemand Global Preference.
 */
@SuppressWarnings("all")
public class OndemandGlobalPreferenceModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "OndemandGlobalPreference";
	
	/** <i>Generated constant</i> - Attribute key of <code>OndemandGlobalPreference.atsPollingTime</code> attribute defined at extension <code>ondemandcommon</code>. */
	public static final String ATSPOLLINGTIME = "atsPollingTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>OndemandGlobalPreference.tenantID</code> attribute defined at extension <code>ondemandcommon</code>. */
	public static final String TENANTID = "tenantID";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OndemandGlobalPreferenceModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OndemandGlobalPreferenceModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OndemandGlobalPreferenceModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OndemandGlobalPreference.atsPollingTime</code> attribute defined at extension <code>ondemandcommon</code>. 
	 * @return the atsPollingTime
	 */
	@Accessor(qualifier = "atsPollingTime", type = Accessor.Type.GETTER)
	public Long getAtsPollingTime()
	{
		return getPersistenceContext().getPropertyValue(ATSPOLLINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OndemandGlobalPreference.tenantID</code> attribute defined at extension <code>ondemandcommon</code>. 
	 * @return the tenantID
	 */
	@Accessor(qualifier = "tenantID", type = Accessor.Type.GETTER)
	public String getTenantID()
	{
		return getPersistenceContext().getPropertyValue(TENANTID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OndemandGlobalPreference.atsPollingTime</code> attribute defined at extension <code>ondemandcommon</code>. 
	 *  
	 * @param value the atsPollingTime
	 */
	@Accessor(qualifier = "atsPollingTime", type = Accessor.Type.SETTER)
	public void setAtsPollingTime(final Long value)
	{
		getPersistenceContext().setPropertyValue(ATSPOLLINGTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OndemandGlobalPreference.tenantID</code> attribute defined at extension <code>ondemandcommon</code>. 
	 *  
	 * @param value the tenantID
	 */
	@Accessor(qualifier = "tenantID", type = Accessor.Type.SETTER)
	public void setTenantID(final String value)
	{
		getPersistenceContext().setPropertyValue(TENANTID, value);
	}
	
}
