/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.solrfacetsearch.config;

import java.io.Serializable;
import java.util.Date;

public  class EndpointURL  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EndpointURL.url</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>EndpointURL.master</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean master;

	/** <i>Generated property</i> for <code>EndpointURL.modifiedTime</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Date modifiedTime;
	
	public EndpointURL()
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
	
	public void setMaster(final boolean master)
	{
		this.master = master;
	}

	public boolean isMaster() 
	{
		return master;
	}
	
	public void setModifiedTime(final Date modifiedTime)
	{
		this.modifiedTime = modifiedTime;
	}

	public Date getModifiedTime() 
	{
		return modifiedTime;
	}
	


}
