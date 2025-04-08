/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:00
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.platform.merchandising.yaas;

import java.io.Serializable;
import java.util.List;

public  class CategoryHierarchy  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CategoryHierarchy.id</code> property defined at extension <code>merchandisingservices</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>CategoryHierarchy.name</code> property defined at extension <code>merchandisingservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>CategoryHierarchy.url</code> property defined at extension <code>merchandisingservices</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>CategoryHierarchy.subcategories</code> property defined at extension <code>merchandisingservices</code>. */
		
	private List<CategoryHierarchy> subcategories;
	
	public CategoryHierarchy()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setSubcategories(final List<CategoryHierarchy> subcategories)
	{
		this.subcategories = subcategories;
	}

	public List<CategoryHierarchy> getSubcategories() 
	{
		return subcategories;
	}
	


}
