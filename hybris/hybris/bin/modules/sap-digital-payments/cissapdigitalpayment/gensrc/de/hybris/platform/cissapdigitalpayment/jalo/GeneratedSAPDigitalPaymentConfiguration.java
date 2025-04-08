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

import de.hybris.platform.basecommerce.constants.BasecommerceConstants;
import de.hybris.platform.cissapdigitalpayment.constants.CissapdigitalpaymentConstants;
import de.hybris.platform.cissapdigitalpayment.jalo.SAPDigitalPaymentClient;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.store.BaseStore;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cissapdigitalpayment.jalo.SAPDigitalPaymentConfiguration SAPDigitalPaymentConfiguration}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSAPDigitalPaymentConfiguration extends GenericItem
{
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute **/
	public static final String SAPDIGITALPAYMENTCLIENT = "sapDigitalpaymentClient";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute **/
	public static final String BASEURL = "baseUrl";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute **/
	public static final String PAYMENTAUTHTYPE = "paymentAuthType";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute **/
	public static final String COMPANYCODE = "companyCode";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute **/
	public static final String CUSTOMERCOUNTRY = "customerCountry";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute **/
	public static final String PAYMENTMETHOD = "paymentMethod";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute **/
	public static final String CUSTOMPARAM = "customParam";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute **/
	public static final String MAXRETRY = "maxRetry";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute **/
	public static final String RETRYINTERVAL = "retryInterval";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute **/
	public static final String TIMEOUT = "timeOut";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute **/
	public static final String POLLCARDDELAY = "pollCardDelay";
	/** Qualifier of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute **/
	public static final String BASESTORES = "baseStores";
	/**
	* {@link OneToManyHandler} for handling 1:n BASESTORES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BaseStore> BASESTORESHANDLER = new OneToManyHandler<BaseStore>(
	BasecommerceConstants.TC.BASESTORE,
	false,
	"sapDigitalPaymentConfiguration",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SAPDIGITALPAYMENTCLIENT, AttributeMode.INITIAL);
		tmp.put(BASEURL, AttributeMode.INITIAL);
		tmp.put(PAYMENTAUTHTYPE, AttributeMode.INITIAL);
		tmp.put(COMPANYCODE, AttributeMode.INITIAL);
		tmp.put(CUSTOMERCOUNTRY, AttributeMode.INITIAL);
		tmp.put(PAYMENTMETHOD, AttributeMode.INITIAL);
		tmp.put(CUSTOMPARAM, AttributeMode.INITIAL);
		tmp.put(MAXRETRY, AttributeMode.INITIAL);
		tmp.put(RETRYINTERVAL, AttributeMode.INITIAL);
		tmp.put(TIMEOUT, AttributeMode.INITIAL);
		tmp.put(POLLCARDDELAY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute.
	 * @return the baseStores
	 */
	public Collection<BaseStore> getBaseStores(final SessionContext ctx)
	{
		return BASESTORESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute.
	 * @return the baseStores
	 */
	public Collection<BaseStore> getBaseStores()
	{
		return getBaseStores( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute. 
	 * @param value the baseStores
	 */
	public void setBaseStores(final SessionContext ctx, final Collection<BaseStore> value)
	{
		BASESTORESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute. 
	 * @param value the baseStores
	 */
	public void setBaseStores(final Collection<BaseStore> value)
	{
		setBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseStores. 
	 * @param value the item to add to baseStores
	 */
	public void addToBaseStores(final SessionContext ctx, final BaseStore value)
	{
		BASESTORESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseStores. 
	 * @param value the item to add to baseStores
	 */
	public void addToBaseStores(final BaseStore value)
	{
		addToBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseStores. 
	 * @param value the item to remove from baseStores
	 */
	public void removeFromBaseStores(final SessionContext ctx, final BaseStore value)
	{
		BASESTORESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseStores. 
	 * @param value the item to remove from baseStores
	 */
	public void removeFromBaseStores(final BaseStore value)
	{
		removeFromBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute.
	 * @return the baseUrl - Base URL for SAP Digital Payment
	 */
	public String getBaseUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BASEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute.
	 * @return the baseUrl - Base URL for SAP Digital Payment
	 */
	public String getBaseUrl()
	{
		return getBaseUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute. 
	 * @param value the baseUrl - Base URL for SAP Digital Payment
	 */
	public void setBaseUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BASEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute. 
	 * @param value the baseUrl - Base URL for SAP Digital Payment
	 */
	public void setBaseUrl(final String value)
	{
		setBaseUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute.
	 * @return the companyCode - Company Code - routing parameter for determining PSP
	 */
	public String getCompanyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute.
	 * @return the companyCode - Company Code - routing parameter for determining PSP
	 */
	public String getCompanyCode()
	{
		return getCompanyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute. 
	 * @param value the companyCode - Company Code - routing parameter for determining PSP
	 */
	public void setCompanyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute. 
	 * @param value the companyCode - Company Code - routing parameter for determining PSP
	 */
	public void setCompanyCode(final String value)
	{
		setCompanyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute.
	 * @return the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	public String getCustomerCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute.
	 * @return the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	public String getCustomerCountry()
	{
		return getCustomerCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute. 
	 * @param value the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	public void setCustomerCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute. 
	 * @param value the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	public void setCustomerCountry(final String value)
	{
		setCustomerCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute.
	 * @return the customParam - Custom parameter - routing parameter for determining PSP
	 */
	public String getCustomParam(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMPARAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute.
	 * @return the customParam - Custom parameter - routing parameter for determining PSP
	 */
	public String getCustomParam()
	{
		return getCustomParam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute. 
	 * @param value the customParam - Custom parameter - routing parameter for determining PSP
	 */
	public void setCustomParam(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMPARAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute. 
	 * @param value the customParam - Custom parameter - routing parameter for determining PSP
	 */
	public void setCustomParam(final String value)
	{
		setCustomParam( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute.
	 * @return the maxRetry - Maximum number of retries
	 */
	public Integer getMaxRetry(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXRETRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute.
	 * @return the maxRetry - Maximum number of retries
	 */
	public Integer getMaxRetry()
	{
		return getMaxRetry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @return the maxRetry - Maximum number of retries
	 */
	public int getMaxRetryAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxRetry( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @return the maxRetry - Maximum number of retries
	 */
	public int getMaxRetryAsPrimitive()
	{
		return getMaxRetryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @param value the maxRetry - Maximum number of retries
	 */
	public void setMaxRetry(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXRETRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @param value the maxRetry - Maximum number of retries
	 */
	public void setMaxRetry(final Integer value)
	{
		setMaxRetry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @param value the maxRetry - Maximum number of retries
	 */
	public void setMaxRetry(final SessionContext ctx, final int value)
	{
		setMaxRetry( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute. 
	 * @param value the maxRetry - Maximum number of retries
	 */
	public void setMaxRetry(final int value)
	{
		setMaxRetry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.name</code> attribute.
	 * @return the name - Sap Digital Payment configuration name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.name</code> attribute.
	 * @return the name - Sap Digital Payment configuration name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.name</code> attribute. 
	 * @param value the name - Sap Digital Payment configuration name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.name</code> attribute. 
	 * @param value the name - Sap Digital Payment configuration name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute.
	 * @return the paymentAuthType - Payment authentication type enum
	 */
	public EnumerationValue getPaymentAuthType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTAUTHTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute.
	 * @return the paymentAuthType - Payment authentication type enum
	 */
	public EnumerationValue getPaymentAuthType()
	{
		return getPaymentAuthType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute. 
	 * @param value the paymentAuthType - Payment authentication type enum
	 */
	public void setPaymentAuthType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTAUTHTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute. 
	 * @param value the paymentAuthType - Payment authentication type enum
	 */
	public void setPaymentAuthType(final EnumerationValue value)
	{
		setPaymentAuthType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute.
	 * @return the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	public String getPaymentMethod(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute.
	 * @return the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	public String getPaymentMethod()
	{
		return getPaymentMethod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute. 
	 * @param value the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	public void setPaymentMethod(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTMETHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute. 
	 * @param value the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	public void setPaymentMethod(final String value)
	{
		setPaymentMethod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute.
	 * @return the pollCardDelay - Poll card delay in milliseconds
	 */
	public Integer getPollCardDelay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POLLCARDDELAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute.
	 * @return the pollCardDelay - Poll card delay in milliseconds
	 */
	public Integer getPollCardDelay()
	{
		return getPollCardDelay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @return the pollCardDelay - Poll card delay in milliseconds
	 */
	public int getPollCardDelayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPollCardDelay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @return the pollCardDelay - Poll card delay in milliseconds
	 */
	public int getPollCardDelayAsPrimitive()
	{
		return getPollCardDelayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @param value the pollCardDelay - Poll card delay in milliseconds
	 */
	public void setPollCardDelay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POLLCARDDELAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @param value the pollCardDelay - Poll card delay in milliseconds
	 */
	public void setPollCardDelay(final Integer value)
	{
		setPollCardDelay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @param value the pollCardDelay - Poll card delay in milliseconds
	 */
	public void setPollCardDelay(final SessionContext ctx, final int value)
	{
		setPollCardDelay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute. 
	 * @param value the pollCardDelay - Poll card delay in milliseconds
	 */
	public void setPollCardDelay(final int value)
	{
		setPollCardDelay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute.
	 * @return the retryInterval - Retry interval in milliseconds
	 */
	public Integer getRetryInterval(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETRYINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute.
	 * @return the retryInterval - Retry interval in milliseconds
	 */
	public Integer getRetryInterval()
	{
		return getRetryInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @return the retryInterval - Retry interval in milliseconds
	 */
	public int getRetryIntervalAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRetryInterval( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @return the retryInterval - Retry interval in milliseconds
	 */
	public int getRetryIntervalAsPrimitive()
	{
		return getRetryIntervalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @param value the retryInterval - Retry interval in milliseconds
	 */
	public void setRetryInterval(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETRYINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @param value the retryInterval - Retry interval in milliseconds
	 */
	public void setRetryInterval(final Integer value)
	{
		setRetryInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @param value the retryInterval - Retry interval in milliseconds
	 */
	public void setRetryInterval(final SessionContext ctx, final int value)
	{
		setRetryInterval( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute. 
	 * @param value the retryInterval - Retry interval in milliseconds
	 */
	public void setRetryInterval(final int value)
	{
		setRetryInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute.
	 * @return the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	public SAPDigitalPaymentClient getSapDigitalpaymentClient(final SessionContext ctx)
	{
		return (SAPDigitalPaymentClient)getProperty( ctx, SAPDIGITALPAYMENTCLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute.
	 * @return the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	public SAPDigitalPaymentClient getSapDigitalpaymentClient()
	{
		return getSapDigitalpaymentClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute. 
	 * @param value the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	public void setSapDigitalpaymentClient(final SessionContext ctx, final SAPDigitalPaymentClient value)
	{
		setProperty(ctx, SAPDIGITALPAYMENTCLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute. 
	 * @param value the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	public void setSapDigitalpaymentClient(final SAPDigitalPaymentClient value)
	{
		setSapDigitalpaymentClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute.
	 * @return the timeOut - Timeout interval in millseconds
	 */
	public Integer getTimeOut(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute.
	 * @return the timeOut - Timeout interval in millseconds
	 */
	public Integer getTimeOut()
	{
		return getTimeOut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @return the timeOut - Timeout interval in millseconds
	 */
	public int getTimeOutAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeOut( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @return the timeOut - Timeout interval in millseconds
	 */
	public int getTimeOutAsPrimitive()
	{
		return getTimeOutAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @param value the timeOut - Timeout interval in millseconds
	 */
	public void setTimeOut(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMEOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @param value the timeOut - Timeout interval in millseconds
	 */
	public void setTimeOut(final Integer value)
	{
		setTimeOut( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @param value the timeOut - Timeout interval in millseconds
	 */
	public void setTimeOut(final SessionContext ctx, final int value)
	{
		setTimeOut( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute. 
	 * @param value the timeOut - Timeout interval in millseconds
	 */
	public void setTimeOut(final int value)
	{
		setTimeOut( getSession().getSessionContext(), value );
	}
	
}
