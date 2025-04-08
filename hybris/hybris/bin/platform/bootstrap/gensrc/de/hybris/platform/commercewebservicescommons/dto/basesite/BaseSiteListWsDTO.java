/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.basesite;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.basesite.BaseSiteWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Base Site List
 */
@ApiModel(value="BaseSiteList", description="Representation of a Base Site List")
public  class BaseSiteListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of basesites<br/><br/><i>Generated property</i> for <code>BaseSiteListWsDTO.baseSites</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="baseSites", value="List of basesites") 	
	private List<BaseSiteWsDTO> baseSites;
	
	public BaseSiteListWsDTO()
	{
		// default constructor
	}
	
	public void setBaseSites(final List<BaseSiteWsDTO> baseSites)
	{
		this.baseSites = baseSites;
	}

	public List<BaseSiteWsDTO> getBaseSites() 
	{
		return baseSites;
	}
	


}
