/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.order.data;

import java.io.Serializable;
import java.util.List;

public  class ConsignmentCodeDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsignmentCodeDataList.codes</code> property defined at extension <code>warehousingfacades</code>. */
		
	private List<String> codes;
	
	public ConsignmentCodeDataList()
	{
		// default constructor
	}
	
	public void setCodes(final List<String> codes)
	{
		this.codes = codes;
	}

	public List<String> getCodes() 
	{
		return codes;
	}
	


}
