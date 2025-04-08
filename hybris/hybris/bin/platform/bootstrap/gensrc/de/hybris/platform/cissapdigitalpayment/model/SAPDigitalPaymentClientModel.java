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
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type SAPDigitalPaymentClient first defined at extension cissapdigitalpayment.
 */
@SuppressWarnings("all")
public class SAPDigitalPaymentClientModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPDigitalPaymentClient";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentClient.clientId</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String CLIENTID = "clientId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentClient.clientSecret</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String CLIENTSECRET = "clientSecret";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentClient.tokenUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String TOKENURL = "tokenUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentClient.scope</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String SCOPE = "scope";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String AUTHORIZEDGRANTTYPES = "authorizedGrantTypes";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPDigitalPaymentClientModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPDigitalPaymentClientModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _clientId initial attribute declared by type <code>SAPDigitalPaymentClient</code> at extension <code>cissapdigitalpayment</code>
	 * @param _tokenUrl initial attribute declared by type <code>SAPDigitalPaymentClient</code> at extension <code>cissapdigitalpayment</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPDigitalPaymentClientModel(final String _clientId, final String _tokenUrl)
	{
		super();
		setClientId(_clientId);
		setTokenUrl(_tokenUrl);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _clientId initial attribute declared by type <code>SAPDigitalPaymentClient</code> at extension <code>cissapdigitalpayment</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _tokenUrl initial attribute declared by type <code>SAPDigitalPaymentClient</code> at extension <code>cissapdigitalpayment</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPDigitalPaymentClientModel(final String _clientId, final ItemModel _owner, final String _tokenUrl)
	{
		super();
		setClientId(_clientId);
		setOwner(_owner);
		setTokenUrl(_tokenUrl);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the authorizedGrantTypes - Set of grant types for client
	 */
	@Accessor(qualifier = "authorizedGrantTypes", type = Accessor.Type.GETTER)
	public Set<String> getAuthorizedGrantTypes()
	{
		return getPersistenceContext().getPropertyValue(AUTHORIZEDGRANTTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientId</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the clientId - Client Id
	 */
	@Accessor(qualifier = "clientId", type = Accessor.Type.GETTER)
	public String getClientId()
	{
		return getPersistenceContext().getPropertyValue(CLIENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.clientSecret</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the clientSecret - Client Secret
	 */
	@Accessor(qualifier = "clientSecret", type = Accessor.Type.GETTER)
	public String getClientSecret()
	{
		return getPersistenceContext().getPropertyValue(CLIENTSECRET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.scope</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the scope - Set of client scopes
	 */
	@Accessor(qualifier = "scope", type = Accessor.Type.GETTER)
	public Set<String> getScope()
	{
		return getPersistenceContext().getPropertyValue(SCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentClient.tokenUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the tokenUrl - Token URL for client
	 */
	@Accessor(qualifier = "tokenUrl", type = Accessor.Type.GETTER)
	public String getTokenUrl()
	{
		return getPersistenceContext().getPropertyValue(TOKENURL);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentClient.authorizedGrantTypes</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the authorizedGrantTypes - Set of grant types for client
	 */
	@Accessor(qualifier = "authorizedGrantTypes", type = Accessor.Type.SETTER)
	public void setAuthorizedGrantTypes(final Set<String> value)
	{
		getPersistenceContext().setPropertyValue(AUTHORIZEDGRANTTYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentClient.clientId</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the clientId - Client Id
	 */
	@Accessor(qualifier = "clientId", type = Accessor.Type.SETTER)
	public void setClientId(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentClient.clientSecret</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the clientSecret - Client Secret
	 */
	@Accessor(qualifier = "clientSecret", type = Accessor.Type.SETTER)
	public void setClientSecret(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENTSECRET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentClient.scope</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the scope - Set of client scopes
	 */
	@Accessor(qualifier = "scope", type = Accessor.Type.SETTER)
	public void setScope(final Set<String> value)
	{
		getPersistenceContext().setPropertyValue(SCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentClient.tokenUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the tokenUrl - Token URL for client
	 */
	@Accessor(qualifier = "tokenUrl", type = Accessor.Type.SETTER)
	public void setTokenUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(TOKENURL, value);
	}
	
}
