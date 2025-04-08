/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:11
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.smarteditwebservices.dto;

import java.io.Serializable;
import de.hybris.platform.smarteditwebservices.data.ConfigurationData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Collection;

/**
 * List of configurations
 */
@ApiModel(value="ConfigurationDataListWsDto", description="List of configurations")
public  class ConfigurationDataListWsDto  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** The list of configuration data<br/><br/><i>Generated property</i> for <code>ConfigurationDataListWsDto.configurations</code> property defined at extension <code>smarteditwebservices</code>. */
	@ApiModelProperty(name="configurations", value="The list of configuration data", required=true) 	
	private Collection<ConfigurationData> configurations;
	
	public ConfigurationDataListWsDto()
	{
		// default constructor
	}
	
	public void setConfigurations(final Collection<ConfigurationData> configurations)
	{
		this.configurations = configurations;
	}

	public Collection<ConfigurationData> getConfigurations() 
	{
		return configurations;
	}
	


}
