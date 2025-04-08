/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.payment.dto;

import java.io.Serializable;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;

/**
 * Informations about payment card
 */
public  class NewSubscription  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NewSubscription.subscriptionID</code> property defined at extension <code>payment</code>. */
		
	private String subscriptionID;

	/** <i>Generated property</i> for <code>NewSubscription.transactionEntry</code> property defined at extension <code>payment</code>. */
		
	private PaymentTransactionEntryModel transactionEntry;
	
	public NewSubscription()
	{
		// default constructor
	}
	
	public void setSubscriptionID(final String subscriptionID)
	{
		this.subscriptionID = subscriptionID;
	}

	public String getSubscriptionID() 
	{
		return subscriptionID;
	}
	
	public void setTransactionEntry(final PaymentTransactionEntryModel transactionEntry)
	{
		this.transactionEntry = transactionEntry;
	}

	public PaymentTransactionEntryModel getTransactionEntry() 
	{
		return transactionEntry;
	}
	


}
