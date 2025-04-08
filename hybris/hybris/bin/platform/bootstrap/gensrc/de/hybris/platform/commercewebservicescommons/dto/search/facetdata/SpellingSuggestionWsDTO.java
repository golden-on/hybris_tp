/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.search.facetdata;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of a Spell Checker Suggestion
 */
@ApiModel(value="SpellingSuggestion", description="Representation of a Spell Checker Suggestion")
public  class SpellingSuggestionWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Spelling suggestion<br/><br/><i>Generated property</i> for <code>SpellingSuggestionWsDTO.suggestion</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="suggestion", value="Spelling suggestion") 	
	private String suggestion;

	/** Query for spelling suggestion<br/><br/><i>Generated property</i> for <code>SpellingSuggestionWsDTO.query</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="query", value="Query for spelling suggestion") 	
	private String query;
	
	public SpellingSuggestionWsDTO()
	{
		// default constructor
	}
	
	public void setSuggestion(final String suggestion)
	{
		this.suggestion = suggestion;
	}

	public String getSuggestion() 
	{
		return suggestion;
	}
	
	public void setQuery(final String query)
	{
		this.query = query;
	}

	public String getQuery() 
	{
		return query;
	}
	


}
