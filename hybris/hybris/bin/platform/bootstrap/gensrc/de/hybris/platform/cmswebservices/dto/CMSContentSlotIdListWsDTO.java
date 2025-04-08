/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Specifies a list of slot ids.
 */
@ApiModel(value="CMSContentSlotIdListWsDTO", description="Specifies a list of slot ids.")
public  class CMSContentSlotIdListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSContentSlotIdListWsDTO.slotIds</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="slotIds", example="[\"Section1Slot-Homepage\", \"Section2Footer-Homepage\"]") 	
	private List<String> slotIds;
	
	public CMSContentSlotIdListWsDTO()
	{
		// default constructor
	}
	
	public void setSlotIds(final List<String> slotIds)
	{
		this.slotIds = slotIds;
	}

	public List<String> getSlotIds() 
	{
		return slotIds;
	}
	


}
