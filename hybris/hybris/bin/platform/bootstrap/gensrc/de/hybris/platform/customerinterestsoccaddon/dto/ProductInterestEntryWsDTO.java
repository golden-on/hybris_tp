/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customerinterestsoccaddon.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Product interest entry
 */
@ApiModel(value="productInterestEntry", description="Product interest entry")
public  class ProductInterestEntryWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** product interest type<br/><br/><i>Generated property</i> for <code>ProductInterestEntryWsDTO.interestType</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="interestType", value="product interest type") 	
	private String interestType;

	/** added date of product interest<br/><br/><i>Generated property</i> for <code>ProductInterestEntryWsDTO.dateAdded</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="dateAdded", value="added date of product interest") 	
	private Date dateAdded;

	/** expiration date of product interest<br/><br/><i>Generated property</i> for <code>ProductInterestEntryWsDTO.expirationDate</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="expirationDate", value="expiration date of product interest") 	
	private Date expirationDate;
	
	public ProductInterestEntryWsDTO()
	{
		// default constructor
	}
	
	public void setInterestType(final String interestType)
	{
		this.interestType = interestType;
	}

	public String getInterestType() 
	{
		return interestType;
	}
	
	public void setDateAdded(final Date dateAdded)
	{
		this.dateAdded = dateAdded;
	}

	public Date getDateAdded() 
	{
		return dateAdded;
	}
	
	public void setExpirationDate(final Date expirationDate)
	{
		this.expirationDate = expirationDate;
	}

	public Date getExpirationDate() 
	{
		return expirationDate;
	}
	


}
