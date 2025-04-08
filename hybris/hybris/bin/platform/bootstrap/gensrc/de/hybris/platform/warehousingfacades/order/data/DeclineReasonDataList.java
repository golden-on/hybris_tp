/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.order.data;

import java.io.Serializable;
import de.hybris.platform.warehousing.enums.DeclineReason;
import java.util.List;

public  class DeclineReasonDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>DeclineReasonDataList.reasons</code> property defined at extension <code>warehousingfacades</code>. */
		
	private List<DeclineReason> reasons;
	
	public DeclineReasonDataList()
	{
		// default constructor
	}
	
	public void setReasons(final List<DeclineReason> reasons)
	{
		this.reasons = reasons;
	}

	public List<DeclineReason> getReasons() 
	{
		return reasons;
	}
	


}
