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
package de.hybris.platform.cissapdigitalpayment.jalo;

import de.hybris.platform.cissapdigitalpayment.constants.CissapdigitalpaymentConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Cart;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.store.BaseStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cissapdigitalpayment.jalo.SapDigitPayPollCardProcess SapDigitPayPollCardProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSapDigitPayPollCardProcess extends BusinessProcess
{
	/** Qualifier of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute **/
	public static final String SESSIONID = "sessionId";
	/** Qualifier of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute **/
	public static final String SESSIONCART = "sessionCart";
	/** Qualifier of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute **/
	public static final String SESSIONUSER = "sessionUser";
	/** Qualifier of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute **/
	public static final String BASESTORE = "baseStore";
	/** Qualifier of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute **/
	public static final String POLLTRANSSTATUS = "pollTransStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SESSIONID, AttributeMode.INITIAL);
		tmp.put(SESSIONCART, AttributeMode.INITIAL);
		tmp.put(SESSIONUSER, AttributeMode.INITIAL);
		tmp.put(BASESTORE, AttributeMode.INITIAL);
		tmp.put(POLLTRANSSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute.
	 * @return the baseStore
	 */
	public BaseStore getBaseStore(final SessionContext ctx)
	{
		return (BaseStore)getProperty( ctx, BASESTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute.
	 * @return the baseStore
	 */
	public BaseStore getBaseStore()
	{
		return getBaseStore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute. 
	 * @param value the baseStore
	 */
	public void setBaseStore(final SessionContext ctx, final BaseStore value)
	{
		setProperty(ctx, BASESTORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.baseStore</code> attribute. 
	 * @param value the baseStore
	 */
	public void setBaseStore(final BaseStore value)
	{
		setBaseStore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute.
	 * @return the pollTransStatus
	 */
	public String getPollTransStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POLLTRANSSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute.
	 * @return the pollTransStatus
	 */
	public String getPollTransStatus()
	{
		return getPollTransStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute. 
	 * @param value the pollTransStatus
	 */
	public void setPollTransStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POLLTRANSSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.pollTransStatus</code> attribute. 
	 * @param value the pollTransStatus
	 */
	public void setPollTransStatus(final String value)
	{
		setPollTransStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute.
	 * @return the sessionCart
	 */
	public Cart getSessionCart(final SessionContext ctx)
	{
		return (Cart)getProperty( ctx, SESSIONCART);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute.
	 * @return the sessionCart
	 */
	public Cart getSessionCart()
	{
		return getSessionCart( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute. 
	 * @param value the sessionCart
	 */
	public void setSessionCart(final SessionContext ctx, final Cart value)
	{
		setProperty(ctx, SESSIONCART,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionCart</code> attribute. 
	 * @param value the sessionCart
	 */
	public void setSessionCart(final Cart value)
	{
		setSessionCart( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute.
	 * @return the sessionId
	 */
	public String getSessionId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SESSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute.
	 * @return the sessionId
	 */
	public String getSessionId()
	{
		return getSessionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute. 
	 * @param value the sessionId
	 */
	public void setSessionId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SESSIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionId</code> attribute. 
	 * @param value the sessionId
	 */
	public void setSessionId(final String value)
	{
		setSessionId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute.
	 * @return the sessionUser
	 */
	public User getSessionUser(final SessionContext ctx)
	{
		return (User)getProperty( ctx, SESSIONUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute.
	 * @return the sessionUser
	 */
	public User getSessionUser()
	{
		return getSessionUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute. 
	 * @param value the sessionUser
	 */
	public void setSessionUser(final SessionContext ctx, final User value)
	{
		setProperty(ctx, SESSIONUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapDigitPayPollCardProcess.sessionUser</code> attribute. 
	 * @param value the sessionUser
	 */
	public void setSessionUser(final User value)
	{
		setSessionUser( getSession().getSessionContext(), value );
	}
	
}
