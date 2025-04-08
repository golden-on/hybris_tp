/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorfacades.cart.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;

public  class CartWrapperData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartWrapperData.cartData</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private CartData cartData;

	/** <i>Generated property</i> for <code>CartWrapperData.errorMsg</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private String errorMsg;

	/** <i>Generated property</i> for <code>CartWrapperData.successMsg</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private String successMsg;
	
	public CartWrapperData()
	{
		// default constructor
	}
	
	public void setCartData(final CartData cartData)
	{
		this.cartData = cartData;
	}

	public CartData getCartData() 
	{
		return cartData;
	}
	
	public void setErrorMsg(final String errorMsg)
	{
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() 
	{
		return errorMsg;
	}
	
	public void setSuccessMsg(final String successMsg)
	{
		this.successMsg = successMsg;
	}

	public String getSuccessMsg() 
	{
		return successMsg;
	}
	


}
