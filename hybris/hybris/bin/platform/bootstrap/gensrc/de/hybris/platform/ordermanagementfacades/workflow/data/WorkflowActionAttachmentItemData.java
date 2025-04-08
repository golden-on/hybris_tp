/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementfacades.workflow.data;

import java.io.Serializable;

public  class WorkflowActionAttachmentItemData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>WorkflowActionAttachmentItemData.code</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>WorkflowActionAttachmentItemData.orderCode</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private String orderCode;
	
	public WorkflowActionAttachmentItemData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setOrderCode(final String orderCode)
	{
		this.orderCode = orderCode;
	}

	public String getOrderCode() 
	{
		return orderCode;
	}
	


}
