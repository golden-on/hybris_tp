/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.store.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.store.data.StoreCountData;
import java.util.List;

public  class StoreCountListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StoreCountListData.countriesAndRegionsStoreCount</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<StoreCountData> countriesAndRegionsStoreCount;
	
	public StoreCountListData()
	{
		// default constructor
	}
	
	public void setCountriesAndRegionsStoreCount(final List<StoreCountData> countriesAndRegionsStoreCount)
	{
		this.countriesAndRegionsStoreCount = countriesAndRegionsStoreCount;
	}

	public List<StoreCountData> getCountriesAndRegionsStoreCount() 
	{
		return countriesAndRegionsStoreCount;
	}
	


}
