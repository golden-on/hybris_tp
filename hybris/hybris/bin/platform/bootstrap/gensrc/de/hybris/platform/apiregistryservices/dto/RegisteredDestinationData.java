/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.apiregistryservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public  class RegisteredDestinationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RegisteredDestinationData.identifier</code> property defined at extension <code>apiregistryservices</code>. */
	@JsonProperty("identifier") 	
	private String identifier;

	/** <i>Generated property</i> for <code>RegisteredDestinationData.targetId</code> property defined at extension <code>apiregistryservices</code>. */
	@JsonProperty("id") 	
	private String targetId;
	
	public RegisteredDestinationData()
	{
		// default constructor
	}
	
@JsonProperty("identifier") 	public void setIdentifier(final String identifier)
	{
		this.identifier = identifier;
	}

@JsonProperty("identifier") 	public String getIdentifier() 
	{
		return identifier;
	}
	
@JsonProperty("id") 	public void setTargetId(final String targetId)
	{
		this.targetId = targetId;
	}

@JsonProperty("id") 	public String getTargetId() 
	{
		return targetId;
	}
	


}
