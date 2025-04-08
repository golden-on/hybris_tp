/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.pagedata;

import java.io.Serializable;

/**
 * POJO representing a sort option.
 *
 * @deprecated Since version 6.5 use de.hybris.platform.core.servicelayer.data.SortData instead
 */
@Deprecated(forRemoval = true)
public  class SortData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SortData.code</code> property defined at extension <code>commerceservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>SortData.name</code> property defined at extension <code>commerceservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>SortData.selected</code> property defined at extension <code>commerceservices</code>. */
		
	private boolean selected;
	
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
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}

	public boolean isSelected() 
	{
		return selected;
	}
	


}
