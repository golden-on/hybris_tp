/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.ReferenceWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of a Product Reference
 */
@ApiModel(value="ProductReference", description="Representation of a Product Reference")
public  class ProductReferenceWsDTO extends ReferenceWsDTO 
{

 

	/** Flag stating if product reference is preselected<br/><br/><i>Generated property</i> for <code>ProductReferenceWsDTO.preselected</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="preselected", value="Flag stating if product reference is preselected") 	
	private Boolean preselected;
	
	public ProductReferenceWsDTO()
	{
		// default constructor
	}
	
	public void setPreselected(final Boolean preselected)
	{
		this.preselected = preselected;
	}

	public Boolean getPreselected() 
	{
		return preselected;
	}
	


}
