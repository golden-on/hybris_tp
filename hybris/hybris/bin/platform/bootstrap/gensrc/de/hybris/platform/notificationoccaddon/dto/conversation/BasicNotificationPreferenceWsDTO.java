/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.notificationoccaddon.dto.conversation;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Basic notification preference
 */
@ApiModel(value="BasicnotificationPreference", description="Basic notification preference")
public  class BasicNotificationPreferenceWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** preference channel<br/><br/><i>Generated property</i> for <code>BasicNotificationPreferenceWsDTO.channel</code> property defined at extension <code>notificationoccaddon</code>. */
	@ApiModelProperty(name="channel", value="preference channel", example="email, sms, site_message") 	
	private String channel;

	/** if true, the channel is on; if false, the channel is off<br/><br/><i>Generated property</i> for <code>BasicNotificationPreferenceWsDTO.enabled</code> property defined at extension <code>notificationoccaddon</code>. */
	@ApiModelProperty(name="enabled", value="if true, the channel is on; if false, the channel is off") 	
	private Boolean enabled;
	
	public BasicNotificationPreferenceWsDTO()
	{
		// default constructor
	}
	
	public void setChannel(final String channel)
	{
		this.channel = channel;
	}

	public String getChannel() 
	{
		return channel;
	}
	
	public void setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
	}

	public Boolean getEnabled() 
	{
		return enabled;
	}
	


}
