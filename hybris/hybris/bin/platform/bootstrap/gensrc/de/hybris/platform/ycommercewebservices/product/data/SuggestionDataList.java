/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.SuggestionData;
import java.util.List;

public  class SuggestionDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SuggestionDataList.suggestions</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<SuggestionData> suggestions;
	
	public SuggestionDataList()
	{
		// default constructor
	}
	
	public void setSuggestions(final List<SuggestionData> suggestions)
	{
		this.suggestions = suggestions;
	}

	public List<SuggestionData> getSuggestions() 
	{
		return suggestions;
	}
	


}
