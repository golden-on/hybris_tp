/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.SuggestionWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Suggestion List
 */
@ApiModel(value="SuggestionList", description="Representation of a Suggestion List")
public  class SuggestionListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of suggestions<br/><br/><i>Generated property</i> for <code>SuggestionListWsDTO.suggestions</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="suggestions", value="List of suggestions") 	
	private List<SuggestionWsDTO> suggestions;
	
	public SuggestionListWsDTO()
	{
		// default constructor
	}
	
	public void setSuggestions(final List<SuggestionWsDTO> suggestions)
	{
		this.suggestions = suggestions;
	}

	public List<SuggestionWsDTO> getSuggestions() 
	{
		return suggestions;
	}
	


}
