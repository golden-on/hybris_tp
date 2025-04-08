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
import de.hybris.platform.warehousingfacades.order.data.DeclineEntryData;
import java.util.List;

public  class ConsignmentReallocationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsignmentReallocationData.declineEntries</code> property defined at extension <code>warehousingfacades</code>. */
		
	private List<DeclineEntryData> declineEntries;

	/** <i>Generated property</i> for <code>ConsignmentReallocationData.globalReallocationWarehouseCode</code> property defined at extension <code>warehousingfacades</code>. */
		
	private String globalReallocationWarehouseCode;

	/** <i>Generated property</i> for <code>ConsignmentReallocationData.globalReason</code> property defined at extension <code>warehousingfacades</code>. */
		
	private DeclineReason globalReason;

	/** <i>Generated property</i> for <code>ConsignmentReallocationData.globalComment</code> property defined at extension <code>warehousingfacades</code>. */
		
	private String globalComment;
	
	public ConsignmentReallocationData()
	{
		// default constructor
	}
	
	public void setDeclineEntries(final List<DeclineEntryData> declineEntries)
	{
		this.declineEntries = declineEntries;
	}

	public List<DeclineEntryData> getDeclineEntries() 
	{
		return declineEntries;
	}
	
	public void setGlobalReallocationWarehouseCode(final String globalReallocationWarehouseCode)
	{
		this.globalReallocationWarehouseCode = globalReallocationWarehouseCode;
	}

	public String getGlobalReallocationWarehouseCode() 
	{
		return globalReallocationWarehouseCode;
	}
	
	public void setGlobalReason(final DeclineReason globalReason)
	{
		this.globalReason = globalReason;
	}

	public DeclineReason getGlobalReason() 
	{
		return globalReason;
	}
	
	public void setGlobalComment(final String globalComment)
	{
		this.globalComment = globalComment;
	}

	public String getGlobalComment() 
	{
		return globalComment;
	}
	


}
