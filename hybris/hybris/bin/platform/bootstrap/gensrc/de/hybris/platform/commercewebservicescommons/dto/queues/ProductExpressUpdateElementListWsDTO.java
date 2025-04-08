/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.queues;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.queues.ProductExpressUpdateElementWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Product Express Update Element List
 */
@ApiModel(value="ProductExpressUpdateElementList", description="Representation of a Product Express Update Element List")
public  class ProductExpressUpdateElementListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of product express update element<br/><br/><i>Generated property</i> for <code>ProductExpressUpdateElementListWsDTO.productExpressUpdateElements</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="productExpressUpdateElements", value="List of product express update element") 	
	private List<ProductExpressUpdateElementWsDTO> productExpressUpdateElements;
	
	public ProductExpressUpdateElementListWsDTO()
	{
		// default constructor
	}
	
	public void setProductExpressUpdateElements(final List<ProductExpressUpdateElementWsDTO> productExpressUpdateElements)
	{
		this.productExpressUpdateElements = productExpressUpdateElements;
	}

	public List<ProductExpressUpdateElementWsDTO> getProductExpressUpdateElements() 
	{
		return productExpressUpdateElements;
	}
	


}
