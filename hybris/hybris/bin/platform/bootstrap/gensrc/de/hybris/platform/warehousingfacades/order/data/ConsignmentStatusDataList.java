/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.order.data;

import java.io.Serializable;
import de.hybris.platform.basecommerce.enums.ConsignmentStatus;
import java.util.List;

public  class ConsignmentStatusDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsignmentStatusDataList.statuses</code> property defined at extension <code>warehousingfacades</code>. */
		
	private List<ConsignmentStatus> statuses;
	
	public ConsignmentStatusDataList()
	{
		// default constructor
	}
	
	public void setStatuses(final List<ConsignmentStatus> statuses)
	{
		this.statuses = statuses;
	}

	public List<ConsignmentStatus> getStatuses() 
	{
		return statuses;
	}
	


}
