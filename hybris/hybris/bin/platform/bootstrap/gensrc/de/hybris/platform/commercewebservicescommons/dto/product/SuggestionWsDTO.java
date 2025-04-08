/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of a Suggestion
 */
@ApiModel(value="Suggestion", description="Representation of a Suggestion")
public  class SuggestionWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Suggestion value<br/><br/><i>Generated property</i> for <code>SuggestionWsDTO.value</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="value", value="Suggestion value") 	
	private String value;
	
	public SuggestionWsDTO()
	{
		// default constructor
	}
	
	public void setValue(final String value)
	{
		this.value = value;
	}

	public String getValue() 
	{
		return value;
	}
	


}
