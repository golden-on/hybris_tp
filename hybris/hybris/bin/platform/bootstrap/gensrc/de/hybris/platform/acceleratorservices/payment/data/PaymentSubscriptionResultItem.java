/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:06:58
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorservices.payment.data;

import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResult;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;

public  class PaymentSubscriptionResultItem extends PaymentSubscriptionResult 
{

 

	/** <i>Generated property</i> for <code>PaymentSubscriptionResultItem.storedCard</code> property defined at extension <code>acceleratorservices</code>. */
		
	private CreditCardPaymentInfoModel storedCard;
	
	public PaymentSubscriptionResultItem()
	{
		// default constructor
	}
	
	public void setStoredCard(final CreditCardPaymentInfoModel storedCard)
	{
		this.storedCard = storedCard;
	}

	public CreditCardPaymentInfoModel getStoredCard() 
	{
		return storedCard;
	}
	


}
