/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.storelocator.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import java.util.List;

public  class PointOfServiceDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PointOfServiceDataList.pointOfServices</code> property defined at extension <code>acceleratorwebservicesaddon</code>. */
		
	private List<PointOfServiceData> pointOfServices;
	
	public PointOfServiceDataList()
	{
		// default constructor
	}
	
	public void setPointOfServices(final List<PointOfServiceData> pointOfServices)
	{
		this.pointOfServices = pointOfServices;
	}

	public List<PointOfServiceData> getPointOfServices() 
	{
		return pointOfServices;
	}
	


}
