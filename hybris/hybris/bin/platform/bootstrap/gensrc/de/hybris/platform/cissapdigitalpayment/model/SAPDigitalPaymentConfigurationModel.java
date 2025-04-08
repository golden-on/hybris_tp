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
import de.hybris.platform.cissapdigitalpayment.enums.SapDigitalPaymentAuthTypeEnum;
import de.hybris.platform.cissapdigitalpayment.model.SAPDigitalPaymentClientModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.Collection;

/**
 * Generated model class for type SAPDigitalPaymentConfiguration first defined at extension cissapdigitalpayment.
 */
@SuppressWarnings("all")
public class SAPDigitalPaymentConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPDigitalPaymentConfiguration";
	
	/**<i>Generated relation code constant for relation <code>SAPDigitalPaymentConfig2BaseStore</code> defining source attribute <code>baseStores</code> in extension <code>cissapdigitalpayment</code>.</i>*/
	public static final String _SAPDIGITALPAYMENTCONFIG2BASESTORE = "SAPDigitalPaymentConfig2BaseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.name</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String SAPDIGITALPAYMENTCLIENT = "sapDigitalpaymentClient";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String BASEURL = "baseUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String PAYMENTAUTHTYPE = "paymentAuthType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String COMPANYCODE = "companyCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String CUSTOMERCOUNTRY = "customerCountry";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String PAYMENTMETHOD = "paymentMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.customParam</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String CUSTOMPARAM = "customParam";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String MAXRETRY = "maxRetry";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String RETRYINTERVAL = "retryInterval";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String TIMEOUT = "timeOut";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String POLLCARDDELAY = "pollCardDelay";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute defined at extension <code>cissapdigitalpayment</code>. */
	public static final String BASESTORES = "baseStores";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPDigitalPaymentConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPDigitalPaymentConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 * @param _name initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 * @param _sapDigitalpaymentClient initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPDigitalPaymentConfigurationModel(final String _baseUrl, final String _name, final SAPDigitalPaymentClientModel _sapDigitalpaymentClient)
	{
		super();
		setBaseUrl(_baseUrl);
		setName(_name);
		setSapDigitalpaymentClient(_sapDigitalpaymentClient);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 * @param _name initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sapDigitalpaymentClient initial attribute declared by type <code>SAPDigitalPaymentConfiguration</code> at extension <code>cissapdigitalpayment</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPDigitalPaymentConfigurationModel(final String _baseUrl, final String _name, final ItemModel _owner, final SAPDigitalPaymentClientModel _sapDigitalpaymentClient)
	{
		super();
		setBaseUrl(_baseUrl);
		setName(_name);
		setOwner(_owner);
		setSapDigitalpaymentClient(_sapDigitalpaymentClient);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.GETTER)
	public Collection<BaseStoreModel> getBaseStores()
	{
		return getPersistenceContext().getPropertyValue(BASESTORES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the baseUrl - Base URL for SAP Digital Payment
	 */
	@Accessor(qualifier = "baseUrl", type = Accessor.Type.GETTER)
	public String getBaseUrl()
	{
		return getPersistenceContext().getPropertyValue(BASEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the companyCode - Company Code - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "companyCode", type = Accessor.Type.GETTER)
	public String getCompanyCode()
	{
		return getPersistenceContext().getPropertyValue(COMPANYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "customerCountry", type = Accessor.Type.GETTER)
	public String getCustomerCountry()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.customParam</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the customParam - Custom parameter - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "customParam", type = Accessor.Type.GETTER)
	public String getCustomParam()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMPARAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the maxRetry - Maximum number of retries
	 */
	@Accessor(qualifier = "maxRetry", type = Accessor.Type.GETTER)
	public Integer getMaxRetry()
	{
		return getPersistenceContext().getPropertyValue(MAXRETRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.name</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the name - Sap Digital Payment configuration name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the paymentAuthType - Payment authentication type enum
	 */
	@Accessor(qualifier = "paymentAuthType", type = Accessor.Type.GETTER)
	public SapDigitalPaymentAuthTypeEnum getPaymentAuthType()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTAUTHTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "paymentMethod", type = Accessor.Type.GETTER)
	public String getPaymentMethod()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the pollCardDelay - Poll card delay in milliseconds
	 */
	@Accessor(qualifier = "pollCardDelay", type = Accessor.Type.GETTER)
	public Integer getPollCardDelay()
	{
		return getPersistenceContext().getPropertyValue(POLLCARDDELAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the retryInterval - Retry interval in milliseconds
	 */
	@Accessor(qualifier = "retryInterval", type = Accessor.Type.GETTER)
	public Integer getRetryInterval()
	{
		return getPersistenceContext().getPropertyValue(RETRYINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	@Accessor(qualifier = "sapDigitalpaymentClient", type = Accessor.Type.GETTER)
	public SAPDigitalPaymentClientModel getSapDigitalpaymentClient()
	{
		return getPersistenceContext().getPropertyValue(SAPDIGITALPAYMENTCLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 * @return the timeOut - Timeout interval in millseconds
	 */
	@Accessor(qualifier = "timeOut", type = Accessor.Type.GETTER)
	public Integer getTimeOut()
	{
		return getPersistenceContext().getPropertyValue(TIMEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.baseStores</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.SETTER)
	public void setBaseStores(final Collection<BaseStoreModel> value)
	{
		getPersistenceContext().setPropertyValue(BASESTORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.baseUrl</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the baseUrl - Base URL for SAP Digital Payment
	 */
	@Accessor(qualifier = "baseUrl", type = Accessor.Type.SETTER)
	public void setBaseUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(BASEURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.companyCode</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the companyCode - Company Code - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "companyCode", type = Accessor.Type.SETTER)
	public void setCompanyCode(final String value)
	{
		getPersistenceContext().setPropertyValue(COMPANYCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.customerCountry</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the customerCountry - Custom Country - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "customerCountry", type = Accessor.Type.SETTER)
	public void setCustomerCountry(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERCOUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.customParam</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the customParam - Custom parameter - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "customParam", type = Accessor.Type.SETTER)
	public void setCustomParam(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMPARAM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.maxRetry</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the maxRetry - Maximum number of retries
	 */
	@Accessor(qualifier = "maxRetry", type = Accessor.Type.SETTER)
	public void setMaxRetry(final Integer value)
	{
		getPersistenceContext().setPropertyValue(MAXRETRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.name</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the name - Sap Digital Payment configuration name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.paymentAuthType</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the paymentAuthType - Payment authentication type enum
	 */
	@Accessor(qualifier = "paymentAuthType", type = Accessor.Type.SETTER)
	public void setPaymentAuthType(final SapDigitalPaymentAuthTypeEnum value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTAUTHTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.paymentMethod</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the paymentMethod - Payment Method - routing parameter for determining PSP
	 */
	@Accessor(qualifier = "paymentMethod", type = Accessor.Type.SETTER)
	public void setPaymentMethod(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTMETHOD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.pollCardDelay</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the pollCardDelay - Poll card delay in milliseconds
	 */
	@Accessor(qualifier = "pollCardDelay", type = Accessor.Type.SETTER)
	public void setPollCardDelay(final Integer value)
	{
		getPersistenceContext().setPropertyValue(POLLCARDDELAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.retryInterval</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the retryInterval - Retry interval in milliseconds
	 */
	@Accessor(qualifier = "retryInterval", type = Accessor.Type.SETTER)
	public void setRetryInterval(final Integer value)
	{
		getPersistenceContext().setPropertyValue(RETRYINTERVAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.sapDigitalpaymentClient</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the sapDigitalpaymentClient - Sap Digital Payment client
	 */
	@Accessor(qualifier = "sapDigitalpaymentClient", type = Accessor.Type.SETTER)
	public void setSapDigitalpaymentClient(final SAPDigitalPaymentClientModel value)
	{
		getPersistenceContext().setPropertyValue(SAPDIGITALPAYMENTCLIENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDigitalPaymentConfiguration.timeOut</code> attribute defined at extension <code>cissapdigitalpayment</code>. 
	 *  
	 * @param value the timeOut - Timeout interval in millseconds
	 */
	@Accessor(qualifier = "timeOut", type = Accessor.Type.SETTER)
	public void setTimeOut(final Integer value)
	{
		getPersistenceContext().setPropertyValue(TIMEOUT, value);
	}
	
}
