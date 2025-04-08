/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:00
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CatalogDataListWsDTO")
public  class CatalogDataListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogDataListWsDTO.catalogIds</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="catalogIds") 	
	private List<String> catalogIds;
	
	public CatalogDataListWsDTO()
	{
		// default constructor
	}
	
	public void setCatalogIds(final List<String> catalogIds)
	{
		this.catalogIds = catalogIds;
	}

	public List<String> getCatalogIds() 
	{
		return catalogIds;
	}
	


}
