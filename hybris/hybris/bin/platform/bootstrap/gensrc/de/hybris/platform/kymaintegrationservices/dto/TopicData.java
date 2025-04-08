/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.kymaintegrationservices.dto.SubscribeData;

public  class TopicData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TopicData.subscribe</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("subscribe") 	
	private SubscribeData subscribe;
	
	public TopicData()
	{
		// default constructor
	}
	
@JsonProperty("subscribe") 	public void setSubscribe(final SubscribeData subscribe)
	{
		this.subscribe = subscribe;
	}

@JsonProperty("subscribe") 	public SubscribeData getSubscribe() 
	{
		return subscribe;
	}
	


}
