/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.servicelayer.data;

import java.io.Serializable;

/**
 * POJO representing a sort option.
 */
public  class SortData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SortData.code</code> property defined at extension <code>core</code>. */
		
	private String code;

	/** Direction of sorting. true=ascending, false=descending<br/><br/><i>Generated property</i> for <code>SortData.asc</code> property defined at extension <code>core</code>. */
		
	private boolean asc;
	
	public SortData()
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
	
	public void setAsc(final boolean asc)
	{
		this.asc = asc;
	}

	public boolean isAsc() 
	{
		return asc;
	}
	


}
