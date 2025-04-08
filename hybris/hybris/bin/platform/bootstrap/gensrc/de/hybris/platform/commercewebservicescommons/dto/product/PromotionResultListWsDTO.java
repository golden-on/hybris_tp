/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.PromotionResultWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Promotion result list
 */
@ApiModel(value="PromotionResultList", description="Representation of a Promotion result list")
public  class PromotionResultListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of promotion results<br/><br/><i>Generated property</i> for <code>PromotionResultListWsDTO.promotions</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="promotions", value="List of promotion results") 	
	private List<PromotionResultWsDTO> promotions;
	
	public PromotionResultListWsDTO()
	{
		// default constructor
	}
	
	public void setPromotions(final List<PromotionResultWsDTO> promotions)
	{
		this.promotions = promotions;
	}

	public List<PromotionResultWsDTO> getPromotions() 
	{
		return promotions;
	}
	


}
