/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customerinterestsoccaddon.dto;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.ImageWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.PriceWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import de.hybris.platform.customerinterestsoccaddon.dto.ProductInterestFutureStockWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Collection;
import java.util.List;

/**
 * Product interest
 *
 * @deprecated true
 */
@ApiModel(value="productInterest", description="Product interest")
@Deprecated(forRemoval = true)
public  class ProductInterestWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** product code<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.code</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="code", value="product code") 	
	private String code;

	/** product name<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.name</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="name", value="product name") 	
	private String name;

	/** url of product detail page <br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.url</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="url", value="url of product detail page") 	
	private String url;

	/** product stock<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.stock</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="stock", value="product stock") 	
	private StockWsDTO stock;

	/** list of product interest future stock<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.futureStocks</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="futureStocks", value="list of product interest future stock") 	
	private List<ProductInterestFutureStockWsDTO> futureStocks;

	/** product manufacturer<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.manufacturer</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="manufacturer", value="product manufacturer") 	
	private String manufacturer;

	/** product price<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.price</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="price", value="product price") 	
	private PriceWsDTO price;

	/** product images<br/><br/><i>Generated property</i> for <code>ProductInterestWsDTO.images</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="images", value="product images") 	
	private Collection<ImageWsDTO> images;
	
	public ProductInterestWsDTO()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setStock(final StockWsDTO stock)
	{
		this.stock = stock;
	}

	public StockWsDTO getStock() 
	{
		return stock;
	}
	
	public void setFutureStocks(final List<ProductInterestFutureStockWsDTO> futureStocks)
	{
		this.futureStocks = futureStocks;
	}

	public List<ProductInterestFutureStockWsDTO> getFutureStocks() 
	{
		return futureStocks;
	}
	
	public void setManufacturer(final String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}
	
	public void setPrice(final PriceWsDTO price)
	{
		this.price = price;
	}

	public PriceWsDTO getPrice() 
	{
		return price;
	}
	
	public void setImages(final Collection<ImageWsDTO> images)
	{
		this.images = images;
	}

	public Collection<ImageWsDTO> getImages() 
	{
		return images;
	}
	


}
