/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

public  class AsIndexTypeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsIndexTypeData.code</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AsIndexTypeData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsIndexTypeData.itemType</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String itemType;

	/** <i>Generated property</i> for <code>AsIndexTypeData.catalogVersionAware</code> property defined at extension <code>adaptivesearch</code>. */
		
	private boolean catalogVersionAware;
	
	public AsIndexTypeData()
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
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

	public String getItemType() 
	{
		return itemType;
	}
	
	public void setCatalogVersionAware(final boolean catalogVersionAware)
	{
		this.catalogVersionAware = catalogVersionAware;
	}

	public boolean isCatalogVersionAware() 
	{
		return catalogVersionAware;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsIndexTypeData other = (AsIndexTypeData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.append(getName(), other.getName()) 
			.append(getItemType(), other.getItemType()) 
			.append(isCatalogVersionAware(), other.isCatalogVersionAware())
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getCode()) 
		.append(getName()) 
		.append(getItemType()) 
		.append(isCatalogVersionAware())
		.toHashCode();
	}

}
