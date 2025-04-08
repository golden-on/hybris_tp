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
import de.hybris.platform.cissapdigitalpayment.jalo.SAPDigitalPaymentClient;
import de.hybris.platform.cissapdigitalpayment.jalo.SAPDigitalPaymentConfiguration;
import de.hybris.platform.cissapdigitalpayment.jalo.SapDigitPayPollCardProcess;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.payment.jalo.PaymentTransactionEntry;
import de.hybris.platform.store.BaseStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CissapdigitalpaymentManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCissapdigitalpaymentManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("authByPaytSrvcPrvdr", AttributeMode.INITIAL);
		tmp.put("authByAcquirer", AttributeMode.INITIAL);
		tmp.put("authByDigitalPaytSrvc", AttributeMode.INITIAL);
		tmp.put("authStatus", AttributeMode.INITIAL);
		tmp.put("authStatusName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.payment.jalo.PaymentTransactionEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapDigitalPaymentConfiguration", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.store.BaseStore", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByAcquirer</code> attribute.
	 * @return the authByAcquirer
	 */
	public String getAuthByAcquirer(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYACQUIRER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByAcquirer</code> attribute.
	 * @return the authByAcquirer
	 */
	public String getAuthByAcquirer(final PaymentTransactionEntry item)
	{
		return getAuthByAcquirer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByAcquirer</code> attribute. 
	 * @param value the authByAcquirer
	 */
	public void setAuthByAcquirer(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYACQUIRER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByAcquirer</code> attribute. 
	 * @param value the authByAcquirer
	 */
	public void setAuthByAcquirer(final PaymentTransactionEntry item, final String value)
	{
		setAuthByAcquirer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByDigitalPaytSrvc</code> attribute.
	 * @return the authByDigitalPaytSrvc
	 */
	public String getAuthByDigitalPaytSrvc(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYDIGITALPAYTSRVC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByDigitalPaytSrvc</code> attribute.
	 * @return the authByDigitalPaytSrvc
	 */
	public String getAuthByDigitalPaytSrvc(final PaymentTransactionEntry item)
	{
		return getAuthByDigitalPaytSrvc( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByDigitalPaytSrvc</code> attribute. 
	 * @param value the authByDigitalPaytSrvc
	 */
	public void setAuthByDigitalPaytSrvc(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYDIGITALPAYTSRVC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByDigitalPaytSrvc</code> attribute. 
	 * @param value the authByDigitalPaytSrvc
	 */
	public void setAuthByDigitalPaytSrvc(final PaymentTransactionEntry item, final String value)
	{
		setAuthByDigitalPaytSrvc( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByPaytSrvcPrvdr</code> attribute.
	 * @return the authByPaytSrvcPrvdr
	 */
	public String getAuthByPaytSrvcPrvdr(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYPAYTSRVCPRVDR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authByPaytSrvcPrvdr</code> attribute.
	 * @return the authByPaytSrvcPrvdr
	 */
	public String getAuthByPaytSrvcPrvdr(final PaymentTransactionEntry item)
	{
		return getAuthByPaytSrvcPrvdr( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByPaytSrvcPrvdr</code> attribute. 
	 * @param value the authByPaytSrvcPrvdr
	 */
	public void setAuthByPaytSrvcPrvdr(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHBYPAYTSRVCPRVDR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authByPaytSrvcPrvdr</code> attribute. 
	 * @param value the authByPaytSrvcPrvdr
	 */
	public void setAuthByPaytSrvcPrvdr(final PaymentTransactionEntry item, final String value)
	{
		setAuthByPaytSrvcPrvdr( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authStatus</code> attribute.
	 * @return the authStatus
	 */
	public String getAuthStatus(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authStatus</code> attribute.
	 * @return the authStatus
	 */
	public String getAuthStatus(final PaymentTransactionEntry item)
	{
		return getAuthStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authStatus</code> attribute. 
	 * @param value the authStatus
	 */
	public void setAuthStatus(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authStatus</code> attribute. 
	 * @param value the authStatus
	 */
	public void setAuthStatus(final PaymentTransactionEntry item, final String value)
	{
		setAuthStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authStatusName</code> attribute.
	 * @return the authStatusName
	 */
	public String getAuthStatusName(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHSTATUSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.authStatusName</code> attribute.
	 * @return the authStatusName
	 */
	public String getAuthStatusName(final PaymentTransactionEntry item)
	{
		return getAuthStatusName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authStatusName</code> attribute. 
	 * @param value the authStatusName
	 */
	public void setAuthStatusName(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.PaymentTransactionEntry.AUTHSTATUSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.authStatusName</code> attribute. 
	 * @param value the authStatusName
	 */
	public void setAuthStatusName(final PaymentTransactionEntry item, final String value)
	{
		setAuthStatusName( getSession().getSessionContext(), item, value );
	}
	
	public SAPDigitalPaymentClient createSAPDigitalPaymentClient(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CissapdigitalpaymentConstants.TC.SAPDIGITALPAYMENTCLIENT );
			return (SAPDigitalPaymentClient)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SAPDigitalPaymentClient : "+e.getMessage(), 0 );
		}
	}
	
	public SAPDigitalPaymentClient createSAPDigitalPaymentClient(final Map attributeValues)
	{
		return createSAPDigitalPaymentClient( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPDigitalPaymentConfiguration createSAPDigitalPaymentConfiguration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CissapdigitalpaymentConstants.TC.SAPDIGITALPAYMENTCONFIGURATION );
			return (SAPDigitalPaymentConfiguration)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SAPDigitalPaymentConfiguration : "+e.getMessage(), 0 );
		}
	}
	
	public SAPDigitalPaymentConfiguration createSAPDigitalPaymentConfiguration(final Map attributeValues)
	{
		return createSAPDigitalPaymentConfiguration( getSession().getSessionContext(), attributeValues );
	}
	
	public SapDigitPayPollCardProcess createSapDigitPayPollCardProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CissapdigitalpaymentConstants.TC.SAPDIGITPAYPOLLCARDPROCESS );
			return (SapDigitPayPollCardProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SapDigitPayPollCardProcess : "+e.getMessage(), 0 );
		}
	}
	
	public SapDigitPayPollCardProcess createSapDigitPayPollCardProcess(final Map attributeValues)
	{
		return createSapDigitPayPollCardProcess( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CissapdigitalpaymentConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.sapDigitalPaymentConfiguration</code> attribute.
	 * @return the sapDigitalPaymentConfiguration
	 */
	public SAPDigitalPaymentConfiguration getSapDigitalPaymentConfiguration(final SessionContext ctx, final BaseStore item)
	{
		return (SAPDigitalPaymentConfiguration)item.getProperty( ctx, CissapdigitalpaymentConstants.Attributes.BaseStore.SAPDIGITALPAYMENTCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.sapDigitalPaymentConfiguration</code> attribute.
	 * @return the sapDigitalPaymentConfiguration
	 */
	public SAPDigitalPaymentConfiguration getSapDigitalPaymentConfiguration(final BaseStore item)
	{
		return getSapDigitalPaymentConfiguration( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseStore.sapDigitalPaymentConfiguration</code> attribute. 
	 * @param value the sapDigitalPaymentConfiguration
	 */
	public void setSapDigitalPaymentConfiguration(final SessionContext ctx, final BaseStore item, final SAPDigitalPaymentConfiguration value)
	{
		item.setProperty(ctx, CissapdigitalpaymentConstants.Attributes.BaseStore.SAPDIGITALPAYMENTCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseStore.sapDigitalPaymentConfiguration</code> attribute. 
	 * @param value the sapDigitalPaymentConfiguration
	 */
	public void setSapDigitalPaymentConfiguration(final BaseStore item, final SAPDigitalPaymentConfiguration value)
	{
		setSapDigitalPaymentConfiguration( getSession().getSessionContext(), item, value );
	}
	
}
