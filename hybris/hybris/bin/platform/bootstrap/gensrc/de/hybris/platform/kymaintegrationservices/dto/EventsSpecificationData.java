/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:08
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public  class EventsSpecificationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EventsSpecificationData.spec</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("spec") 	
	private SpecData spec;
	
	public EventsSpecificationData()
	{
		// default constructor
	}
	
@JsonProperty("spec") 	public void setSpec(final SpecData spec)
	{
		this.spec = spec;
	}

@JsonProperty("spec") 	public SpecData getSpec() 
	{
		return spec;
	}
	


}
