/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.user.data;

import de.hybris.platform.commercefacades.user.data.UserGroupData;
import java.util.List;

public  class CustomerListData extends UserGroupData 
{

 

	/** <i>Generated property</i> for <code>CustomerListData.additionalColumnsKeys</code> property defined at extension <code>commercefacades</code>. */
		
	private List<String> additionalColumnsKeys;

	/** <i>Generated property</i> for <code>CustomerListData.searchBoxEnabled</code> property defined at extension <code>commercefacades</code>. */
		
	private boolean searchBoxEnabled;
	
	public CustomerListData()
	{
		// default constructor
	}
	
	public void setAdditionalColumnsKeys(final List<String> additionalColumnsKeys)
	{
		this.additionalColumnsKeys = additionalColumnsKeys;
	}

	public List<String> getAdditionalColumnsKeys() 
	{
		return additionalColumnsKeys;
	}
	
	public void setSearchBoxEnabled(final boolean searchBoxEnabled)
	{
		this.searchBoxEnabled = searchBoxEnabled;
	}

	public boolean isSearchBoxEnabled() 
	{
		return searchBoxEnabled;
	}
	


}
