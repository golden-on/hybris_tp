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
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.cissapdigitalpayment.jalo.SAPDigitalPaymentClient SAPDigitalPaymentClient}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSAPDigitalPaymentClient extends GenericItem
{
	/** Qualifier of the <code>SAPDigitalPaymentClient.clientId</code> attribute **/
	public static final String CLIENTID = "clientId";
	/** Qualifier of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute **/
	public static final String CLIENTSECRET = "clientSecret";
	/** Qualifier of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute **/
	public static final String TOKENURL = "tokenUrl";
	/** Qualifier of the <code>SAPDigitalPaymentClient.scope</code> attribute **/
	public static final String SCOPE = "scope";
	/** Qualifier of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute **/
	public static final String AUTHORIZEDGRANTTYPES = "authorizedGrantTypes";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CLIENTID, AttributeMode.INITIAL);
		tmp.put(CLIENTSECRET, AttributeMode.INITIAL);
		tmp.put(TOKENURL, AttributeMode.INITIAL);
		tmp.put(SCOPE, AttributeMode.INITIAL);
		tmp.put(AUTHORIZEDGRANTTYPES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute.
	 * @return the authorizedGrantTypes - Set of grant types for client
	 */
	public Set<String> getAuthorizedGrantTypes(final SessionContext ctx)
	{
		Set<String> coll = (Set<String>)getProperty( ctx, AUTHORIZEDGRANTTYPES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute.
	 * @return the authorizedGrantTypes - Set of grant types for client
	 */
	public Set<String> getAuthorizedGrantTypes()
	{
		return getAuthorizedGrantTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute. 
	 * @param value the authorizedGrantTypes - Set of grant types for client
	 */
	public void setAuthorizedGrantTypes(final SessionContext ctx, final Set<String> value)
	{
		setProperty(ctx, AUTHORIZEDGRANTTYPES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute. 
	 * @param value the authorizedGrantTypes - Set of grant types for client
	 */
	public void setAuthorizedGrantTypes(final Set<String> value)
	{
		setAuthorizedGrantTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientId</code> attribute.
	 * @return the clientId - Client Id
	 */
	public String getClientId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientId</code> attribute.
	 * @return the clientId - Client Id
	 */
	public String getClientId()
	{
		return getClientId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.clientId</code> attribute. 
	 * @param value the clientId - Client Id
	 */
	public void setClientId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.clientId</code> attribute. 
	 * @param value the clientId - Client Id
	 */
	public void setClientId(final String value)
	{
		setClientId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute.
	 * @return the clientSecret - Client Secret
	 */
	public String getClientSecret(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTSECRET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute.
	 * @return the clientSecret - Client Secret
	 */
	public String getClientSecret()
	{
		return getClientSecret( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute. 
	 * @param value the clientSecret - Client Secret
	 */
	public void setClientSecret(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTSECRET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute. 
	 * @param value the clientSecret - Client Secret
	 */
	public void setClientSecret(final String value)
	{
		setClientSecret( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.scope</code> attribute.
	 * @return the scope - Set of client scopes
	 */
	public Set<String> getScope(final SessionContext ctx)
	{
		Set<String> coll = (Set<String>)getProperty( ctx, SCOPE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.scope</code> attribute.
	 * @return the scope - Set of client scopes
	 */
	public Set<String> getScope()
	{
		return getScope( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.scope</code> attribute. 
	 * @param value the scope - Set of client scopes
	 */
	public void setScope(final SessionContext ctx, final Set<String> value)
	{
		setProperty(ctx, SCOPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.scope</code> attribute. 
	 * @param value the scope - Set of client scopes
	 */
	public void setScope(final Set<String> value)
	{
		setScope( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute.
	 * @return the tokenUrl - Token URL for client
	 */
	public String getTokenUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOKENURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute.
	 * @return the tokenUrl - Token URL for client
	 */
	public String getTokenUrl()
	{
		return getTokenUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute. 
	 * @param value the tokenUrl - Token URL for client
	 */
	public void setTokenUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOKENURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute. 
	 * @param value the tokenUrl - Token URL for client
	 */
	public void setTokenUrl(final String value)
	{
		setTokenUrl( getSession().getSessionContext(), value );
	}
	
}
