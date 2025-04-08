/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:08
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorfacades.payment.data;

import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResult;
import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;

public  class PaymentSubscriptionResultData extends PaymentSubscriptionResult 
{

 

	/** <i>Generated property</i> for <code>PaymentSubscriptionResultData.storedCard</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private CCPaymentInfoData storedCard;
	
	public PaymentSubscriptionResultData()
	{
		// default constructor
	}
	
	public void setStoredCard(final CCPaymentInfoData storedCard)
	{
		this.storedCard = storedCard;
	}

	public CCPaymentInfoData getStoredCard() 
	{
		return storedCard;
	}
	


}
