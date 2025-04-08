/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CardTypeData;
import java.util.List;

public  class CardTypeDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CardTypeDataList.cardTypes</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<CardTypeData> cardTypes;
	
	public CardTypeDataList()
	{
		// default constructor
	}
	
	public void setCardTypes(final List<CardTypeData> cardTypes)
	{
		this.cardTypes = cardTypes;
	}

	public List<CardTypeData> getCardTypes() 
	{
		return cardTypes;
	}
	


}
