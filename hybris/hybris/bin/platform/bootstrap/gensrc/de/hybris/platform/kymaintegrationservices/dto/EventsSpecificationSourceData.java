/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import de.hybris.platform.apiregistryservices.model.ExposedDestinationModel;
import de.hybris.platform.apiregistryservices.model.events.EventConfigurationModel;
import java.util.List;

public  class EventsSpecificationSourceData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EventsSpecificationSourceData.exposedDestination</code> property defined at extension <code>kymaintegrationservices</code>. */
		
	private ExposedDestinationModel exposedDestination;

	/** <i>Generated property</i> for <code>EventsSpecificationSourceData.events</code> property defined at extension <code>kymaintegrationservices</code>. */
		
	private List<EventConfigurationModel> events;
	
	public EventsSpecificationSourceData()
	{
		// default constructor
	}
	
	public void setExposedDestination(final ExposedDestinationModel exposedDestination)
	{
		this.exposedDestination = exposedDestination;
	}

	public ExposedDestinationModel getExposedDestination() 
	{
		return exposedDestination;
	}
	
	public void setEvents(final List<EventConfigurationModel> events)
	{
		this.events = events;
	}

	public List<EventConfigurationModel> getEvents() 
	{
		return events;
	}
	


}
