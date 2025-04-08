/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Collection;

@ApiModel(value="SiteListData")
public  class SiteListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SiteListData.sites</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="sites") 	
	private Collection<SiteData> sites;
	
	public SiteListData()
	{
		// default constructor
	}
	
	public void setSites(final Collection<SiteData> sites)
	{
		this.sites = sites;
	}

	public Collection<SiteData> getSites() 
	{
		return sites;
	}
	


}
