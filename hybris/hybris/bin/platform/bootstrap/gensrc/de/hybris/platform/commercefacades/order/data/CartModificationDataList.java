/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import java.util.List;

public  class CartModificationDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartModificationDataList.cartModificationList</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<CartModificationData> cartModificationList;
	
	public CartModificationDataList()
	{
		// default constructor
	}
	
	public void setCartModificationList(final List<CartModificationData> cartModificationList)
	{
		this.cartModificationList = cartModificationList;
	}

	public List<CartModificationData> getCartModificationList() 
	{
		return cartModificationList;
	}
	


}
