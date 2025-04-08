/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customerinterestsoccaddon.dto;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.customerinterestsoccaddon.dto.ProductInterestEntryWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Product interest relation
 */
@ApiModel(value="productInterestEntryRelation", description="Product interest relation")
public  class ProductInterestEntryRelationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** product<br/><br/><i>Generated property</i> for <code>ProductInterestEntryRelationWsDTO.product</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="product", value="product") 	
	private ProductWsDTO product;

	/** list of product interest entry<br/><br/><i>Generated property</i> for <code>ProductInterestEntryRelationWsDTO.productInterestEntry</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="productInterestEntry", value="list of product interest entry") 	
	private List<ProductInterestEntryWsDTO> productInterestEntry;
	
	public ProductInterestEntryRelationWsDTO()
	{
		// default constructor
	}
	
	public void setProduct(final ProductWsDTO product)
	{
		this.product = product;
	}

	public ProductWsDTO getProduct() 
	{
		return product;
	}
	
	public void setProductInterestEntry(final List<ProductInterestEntryWsDTO> productInterestEntry)
	{
		this.productInterestEntry = productInterestEntry;
	}

	public List<ProductInterestEntryWsDTO> getProductInterestEntry() 
	{
		return productInterestEntry;
	}
	


}
