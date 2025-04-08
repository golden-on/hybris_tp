/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.order;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.ReturnRequestStatusWsDTOType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of modifications for a return request
 */
@ApiModel(value="ReturnRequestModification", description="Representation of modifications for a return request")
public  class ReturnRequestModificationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Status of the return request<br/><br/><i>Generated property</i> for <code>ReturnRequestModificationWsDTO.status</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="status", value="Status of the return request") 	
	private ReturnRequestStatusWsDTOType status;
	
	public ReturnRequestModificationWsDTO()
	{
		// default constructor
	}
	
	public void setStatus(final ReturnRequestStatusWsDTOType status)
	{
		this.status = status;
	}

	public ReturnRequestStatusWsDTOType getStatus() 
	{
		return status;
	}
	


}
