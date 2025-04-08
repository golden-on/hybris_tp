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
package de.hybris.platform.cissapdigitalpayment.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast"})
public class GeneratedCissapdigitalpaymentConstants
{
	public static final String EXTENSIONNAME = "cissapdigitalpayment";
	public static class TC
	{
		public static final String SAPDIGITALPAYMENTAUTHTYPEENUM = "SapDigitalPaymentAuthTypeEnum".intern();
		public static final String SAPDIGITALPAYMENTCLIENT = "SAPDigitalPaymentClient".intern();
		public static final String SAPDIGITALPAYMENTCONFIGURATION = "SAPDigitalPaymentConfiguration".intern();
		public static final String SAPDIGITPAYPOLLCARDPROCESS = "SapDigitPayPollCardProcess".intern();
	}
	public static class Attributes
	{
		public static class BaseStore
		{
			public static final String SAPDIGITALPAYMENTCONFIGURATION = "sapDigitalPaymentConfiguration".intern();
		}
		public static class PaymentTransactionEntry
		{
			public static final String AUTHBYACQUIRER = "authByAcquirer".intern();
			public static final String AUTHBYDIGITALPAYTSRVC = "authByDigitalPaytSrvc".intern();
			public static final String AUTHBYPAYTSRVCPRVDR = "authByPaytSrvcPrvdr".intern();
			public static final String AUTHSTATUS = "authStatus".intern();
			public static final String AUTHSTATUSNAME = "authStatusName".intern();
		}
	}
	public static class Enumerations
	{
		public static class CreditCardType
		{
			public static final String DPAM = "DPAM".intern();
			public static final String DPDI = "DPDI".intern();
			public static final String DPDS = "DPDS".intern();
			public static final String DPJC = "DPJC".intern();
			public static final String DPMC = "DPMC".intern();
			public static final String DPVI = "DPVI".intern();
		}
		public static class SapDigitalPaymentAuthTypeEnum
		{
			public static final String DEFAULT = "DEFAULT".intern();
			public static final String DUMMY = "DUMMY".intern();
			public static final String SPLIT = "SPLIT".intern();
		}
	}
	public static class Relations
	{
		public static final String SAPDIGITALPAYMENTCONFIG2BASESTORE = "SAPDigitalPaymentConfig2BaseStore".intern();
	}
	
	protected GeneratedCissapdigitalpaymentConstants()
	{
		// private constructor
	}
	
	
}
