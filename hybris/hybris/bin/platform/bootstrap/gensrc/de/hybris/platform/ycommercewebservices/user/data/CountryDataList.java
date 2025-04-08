/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.user.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.CountryData;
import java.util.List;

public  class CountryDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CountryDataList.countries</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<CountryData> countries;
	
	public CountryDataList()
	{
		// default constructor
	}
	
	public void setCountries(final List<CountryData> countries)
	{
		this.countries = countries;
	}

	public List<CountryData> getCountries() 
	{
		return countries;
	}
	


}
