/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customerinterestsoccaddon.dto;

import java.io.Serializable;
import de.hybris.platform.customerinterestsoccaddon.dto.ProductInterestEntryWsDTO;
import de.hybris.platform.customerinterestsoccaddon.dto.ProductInterestWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Product interest relation
 *
 * @deprecated true
 */
@ApiModel(value="productInterestRelation", description="Product interest relation")
@Deprecated(forRemoval = true)
public  class ProductInterestRelationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** product interest<br/><br/><i>Generated property</i> for <code>ProductInterestRelationWsDTO.product</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="product", value="product interest") 	
	private ProductInterestWsDTO product;

	/** list of product interest entry<br/><br/><i>Generated property</i> for <code>ProductInterestRelationWsDTO.productInterestEntry</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="productInterestEntry", value="list of product interest entry") 	
	private List<ProductInterestEntryWsDTO> productInterestEntry;
	
	public ProductInterestRelationWsDTO()
	{
		// default constructor
	}
	
	public void setProduct(final ProductInterestWsDTO product)
	{
		this.product = product;
	}

	public ProductInterestWsDTO getProduct() 
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
