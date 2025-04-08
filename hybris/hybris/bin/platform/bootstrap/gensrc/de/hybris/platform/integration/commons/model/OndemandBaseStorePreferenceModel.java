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
import de.hybris.platform.store.BaseStoreModel;

/**
 * Generated model class for type OndemandBaseStorePreference first defined at extension ondemandcommon.
 */
@SuppressWarnings("all")
public class OndemandBaseStorePreferenceModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "OndemandBaseStorePreference";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2OndemandBaseStorePreferenceRel</code> defining source attribute <code>baseStore</code> in extension <code>ondemandcommon</code>.</i>*/
	public static final String _BASESTORE2ONDEMANDBASESTOREPREFERENCEREL = "BaseStore2OndemandBaseStorePreferenceRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>OndemandBaseStorePreference.externalCallsEnabled</code> attribute defined at extension <code>ondemandcommon</code>. */
	public static final String EXTERNALCALLSENABLED = "externalCallsEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>OndemandBaseStorePreference.atsFormula</code> attribute defined at extension <code>ondemandcommon</code>. */
	public static final String ATSFORMULA = "atsFormula";
	
	/** <i>Generated constant</i> - Attribute key of <code>OndemandBaseStorePreference.baseStore</code> attribute defined at extension <code>ondemandcommon</code>. */
	public static final String BASESTORE = "baseStore";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OndemandBaseStorePreferenceModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OndemandBaseStorePreferenceModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _externalCallsEnabled initial attribute declared by type <code>OndemandBaseStorePreference</code> at extension <code>ondemandcommon</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OndemandBaseStorePreferenceModel(final boolean _externalCallsEnabled)
	{
		super();
		setExternalCallsEnabled(_externalCallsEnabled);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _externalCallsEnabled initial attribute declared by type <code>OndemandBaseStorePreference</code> at extension <code>ondemandcommon</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OndemandBaseStorePreferenceModel(final boolean _externalCallsEnabled, final ItemModel _owner)
	{
		super();
		setExternalCallsEnabled(_externalCallsEnabled);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OndemandBaseStorePreference.atsFormula</code> attribute defined at extension <code>ondemandcommon</code>. 
	 * @return the atsFormula
	 */
	@Accessor(qualifier = "atsFormula", type = Accessor.Type.GETTER)
	public String getAtsFormula()
	{
		return getPersistenceContext().getPropertyValue(ATSFORMULA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OndemandBaseStorePreference.baseStore</code> attribute defined at extension <code>ondemandcommon</code>. 
	 * @return the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.GETTER)
	public BaseStoreModel getBaseStore()
	{
		return getPersistenceContext().getPropertyValue(BASESTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OndemandBaseStorePreference.externalCallsEnabled</code> attribute defined at extension <code>ondemandcommon</code>. 
	 * @return the externalCallsEnabled
	 */
	@Accessor(qualifier = "externalCallsEnabled", type = Accessor.Type.GETTER)
	public boolean isExternalCallsEnabled()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(EXTERNALCALLSENABLED));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OndemandBaseStorePreference.atsFormula</code> attribute defined at extension <code>ondemandcommon</code>. 
	 *  
	 * @param value the atsFormula
	 */
	@Accessor(qualifier = "atsFormula", type = Accessor.Type.SETTER)
	public void setAtsFormula(final String value)
	{
		getPersistenceContext().setPropertyValue(ATSFORMULA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OndemandBaseStorePreference.baseStore</code> attribute defined at extension <code>ondemandcommon</code>. 
	 *  
	 * @param value the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.SETTER)
	public void setBaseStore(final BaseStoreModel value)
	{
		getPersistenceContext().setPropertyValue(BASESTORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OndemandBaseStorePreference.externalCallsEnabled</code> attribute defined at extension <code>ondemandcommon</code>. 
	 *  
	 * @param value the externalCallsEnabled
	 */
	@Accessor(qualifier = "externalCallsEnabled", type = Accessor.Type.SETTER)
	public void setExternalCallsEnabled(final boolean value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALCALLSENABLED, toObject(value));
	}
	
}
