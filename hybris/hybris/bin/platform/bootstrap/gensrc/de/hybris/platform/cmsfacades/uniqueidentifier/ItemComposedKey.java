/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.uniqueidentifier;

import java.io.Serializable;

public  class ItemComposedKey  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ItemComposedKey.itemId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String itemId;

	/** <i>Generated property</i> for <code>ItemComposedKey.catalogId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>ItemComposedKey.catalogVersion</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogVersion;
	
	public ItemComposedKey()
	{
		// default constructor
	}
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemId() 
	{
		return itemId;
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	


}
