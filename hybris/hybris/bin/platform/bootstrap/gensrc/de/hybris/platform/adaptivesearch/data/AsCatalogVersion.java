/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

public  class AsCatalogVersion  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsCatalogVersion.catalogId</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>AsCatalogVersion.version</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String version;
	
	public AsCatalogVersion()
	{
		// default constructor
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

	public String getVersion() 
	{
		return version;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsCatalogVersion other = (AsCatalogVersion) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCatalogId(), other.getCatalogId()) 
			.append(getVersion(), other.getVersion()) 
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
		.append(getCatalogId()) 
		.append(getVersion()) 
		.toHashCode();
	}

}
