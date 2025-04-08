/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.queues.data;

import java.io.Serializable;
import de.hybris.platform.ycommercewebservices.queues.data.OrderStatusUpdateElementData;
import java.util.List;

public  class OrderStatusUpdateElementDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementDataList.orderStatusUpdateElements</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<OrderStatusUpdateElementData> orderStatusUpdateElements;
	
	public OrderStatusUpdateElementDataList()
	{
		// default constructor
	}
	
	public void setOrderStatusUpdateElements(final List<OrderStatusUpdateElementData> orderStatusUpdateElements)
	{
		this.orderStatusUpdateElements = orderStatusUpdateElements;
	}

	public List<OrderStatusUpdateElementData> getOrderStatusUpdateElements() 
	{
		return orderStatusUpdateElements;
	}
	


}
