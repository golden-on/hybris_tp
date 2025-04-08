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
import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Product interest future stock
 *
 * @deprecated true
 */
@ApiModel(value="productInterestFutureStock", description="Product interest future stock")
@Deprecated(forRemoval = true)
public  class ProductInterestFutureStockWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** estimated available stock<br/><br/><i>Generated property</i> for <code>ProductInterestFutureStockWsDTO.stock</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="stock", value="estimated available stock") 	
	private StockWsDTO stock;

	/** estimated available date<br/><br/><i>Generated property</i> for <code>ProductInterestFutureStockWsDTO.date</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="date", value="estimated available date") 	
	private Date date;
	
	public ProductInterestFutureStockWsDTO()
	{
		// default constructor
	}
	
	public void setStock(final StockWsDTO stock)
	{
		this.stock = stock;
	}

	public StockWsDTO getStock() 
	{
		return stock;
	}
	
	public void setDate(final Date date)
	{
		this.date = date;
	}

	public Date getDate() 
	{
		return date;
	}
	


}
