/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="SynchronizationWsDTO")
public  class SynchronizationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SynchronizationWsDTO.items</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="items") 	
	private List<ItemSynchronizationWsDTO> items;
	
	public SynchronizationWsDTO()
	{
		// default constructor
	}
	
	public void setItems(final List<ItemSynchronizationWsDTO> items)
	{
		this.items = items;
	}

	public List<ItemSynchronizationWsDTO> getItems() 
	{
		return items;
	}
	


}
