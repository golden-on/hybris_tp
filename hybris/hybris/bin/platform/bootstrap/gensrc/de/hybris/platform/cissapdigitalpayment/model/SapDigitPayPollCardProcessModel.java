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
package de.hybris.platform.cissapdigitalpayment.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;

/**
 * Generated model class for type SapDigitPayPollCardProcess first defined at extension cissapdigitalpayment.
 */
@SuppressWarnings("all")
public class SapDigitPayPollCardProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SapDigitPayPollCardProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapDigitPayPollCardProcess.sessionId</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String SESSIONID = "sessionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapDigitPayPollCardProcess.sessionCart</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String SESSIONCART = "sessionCart";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapDigitPayPollCardProcess.sessionUser</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String SESSIONUSER = "sessionUser";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapDigitPayPollCardProcess.baseStore</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String BASESTORE = "baseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String POLLTRANSSTATUS = "pollTransStatus";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SapDigitPayPollCardProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SapDigitPayPollCardProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SapDigitPayPollCardProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SapDigitPayPollCardProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.GETTER)
	public BaseStoreModel getBaseStore()
	{
		return getPersistenceContext().getPropertyValue(BASESTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the pollTransStatus
	 */
	@Accessor(qualifier = "pollTransStatus", type = Accessor.Type.GETTER)
	public String getPollTransStatus()
	{
		return getPersistenceContext().getPropertyValue(POLLTRANSSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the sessionCart
	 */
	@Accessor(qualifier = "sessionCart", type = Accessor.Type.GETTER)
	public CartModel getSessionCart()
	{
		return getPersistenceContext().getPropertyValue(SESSIONCART);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.GETTER)
	public String getSessionId()
	{
		return getPersistenceContext().getPropertyValue(SESSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the sessionUser
	 */
	@Accessor(qualifier = "sessionUser", type = Accessor.Type.GETTER)
	public UserModel getSessionUser()
	{
		return getPersistenceContext().getPropertyValue(SESSIONUSER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapDigitPayPollCardProcess.baseStore</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.SETTER)
	public void setBaseStore(final BaseStoreModel value)
	{
		getPersistenceContext().setPropertyValue(BASESTORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the pollTransStatus
	 */
	@Accessor(qualifier = "pollTransStatus", type = Accessor.Type.SETTER)
	public void setPollTransStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(POLLTRANSSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapDigitPayPollCardProcess.sessionCart</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the sessionCart
	 */
	@Accessor(qualifier = "sessionCart", type = Accessor.Type.SETTER)
	public void setSessionCart(final CartModel value)
	{
		getPersistenceContext().setPropertyValue(SESSIONCART, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapDigitPayPollCardProcess.sessionId</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.SETTER)
	public void setSessionId(final String value)
	{
		getPersistenceContext().setPropertyValue(SESSIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapDigitPayPollCardProcess.sessionUser</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the sessionUser
	 */
	@Accessor(qualifier = "sessionUser", type = Accessor.Type.SETTER)
	public void setSessionUser(final UserModel value)
	{
		getPersistenceContext().setPropertyValue(SESSIONUSER, value);
	}
	
}
