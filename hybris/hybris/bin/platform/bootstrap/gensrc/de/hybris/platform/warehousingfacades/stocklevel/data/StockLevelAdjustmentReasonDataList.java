/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.stocklevel.data;

import java.io.Serializable;
import de.hybris.platform.warehousing.enums.StockLevelAdjustmentReason;
import java.util.List;

public  class StockLevelAdjustmentReasonDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StockLevelAdjustmentReasonDataList.reasons</code> property defined at extension <code>warehousingfacades</code>. */
		
	private List<StockLevelAdjustmentReason> reasons;
	
	public StockLevelAdjustmentReasonDataList()
	{
		// default constructor
	}
	
	public void setReasons(final List<StockLevelAdjustmentReason> reasons)
	{
		this.reasons = reasons;
	}

	public List<StockLevelAdjustmentReason> getReasons() 
	{
		return reasons;
	}
	


}
