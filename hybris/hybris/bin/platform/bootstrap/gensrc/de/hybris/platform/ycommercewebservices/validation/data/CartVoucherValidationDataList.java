/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:06:59
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.validation.data;

import java.io.Serializable;
import de.hybris.platform.ycommercewebservices.validation.data.CartVoucherValidationData;
import java.util.List;

public  class CartVoucherValidationDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartVoucherValidationDataList.CartVoucherValidationDataList</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<CartVoucherValidationData> CartVoucherValidationDataList;
	
	public CartVoucherValidationDataList()
	{
		// default constructor
	}
	
	public void setCartVoucherValidationDataList(final List<CartVoucherValidationData> CartVoucherValidationDataList)
	{
		this.CartVoucherValidationDataList = CartVoucherValidationDataList;
	}

	public List<CartVoucherValidationData> getCartVoucherValidationDataList() 
	{
		return CartVoucherValidationDataList;
	}
	


}
