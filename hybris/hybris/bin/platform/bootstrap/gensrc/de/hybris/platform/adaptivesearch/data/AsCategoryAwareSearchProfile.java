/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchProfile;
import de.hybris.platform.adaptivesearch.data.AsConfigurableSearchConfiguration;
import de.hybris.platform.core.PK;
import java.util.Map;

public  class AsCategoryAwareSearchProfile extends AbstractAsSearchProfile 
{

 

	/** <i>Generated property</i> for <code>AsCategoryAwareSearchProfile.searchConfigurations</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<PK,AsConfigurableSearchConfiguration> searchConfigurations;
	
	public AsCategoryAwareSearchProfile()
	{
		// default constructor
	}
	
	public void setSearchConfigurations(final Map<PK,AsConfigurableSearchConfiguration> searchConfigurations)
	{
		this.searchConfigurations = searchConfigurations;
	}

	public Map<PK,AsConfigurableSearchConfiguration> getSearchConfigurations() 
	{
		return searchConfigurations;
	}
	


}
