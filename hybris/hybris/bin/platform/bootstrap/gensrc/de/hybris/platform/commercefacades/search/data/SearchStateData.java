/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.search.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.search.data.SearchQueryData;

public  class SearchStateData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchStateData.url</code> property defined at extension <code>commercefacades</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>SearchStateData.query</code> property defined at extension <code>commercefacades</code>. */
		
	private SearchQueryData query;
	
	public SearchStateData()
	{
		// default constructor
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setQuery(final SearchQueryData query)
	{
		this.query = query;
	}

	public SearchQueryData getQuery() 
	{
		return query;
	}
	


}
