/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.notificationoccaddon.dto.conversation;

import java.io.Serializable;
import de.hybris.platform.notificationoccaddon.dto.conversation.NotificationPreferenceWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Notification preference list
 */
@ApiModel(value="notificationPreferenceList", description="Notification preference list")
public  class NotificationPreferenceListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** notification preferences<br/><br/><i>Generated property</i> for <code>NotificationPreferenceListWsDTO.preferences</code> property defined at extension <code>notificationoccaddon</code>. */
	@ApiModelProperty(name="preferences", value="notification preferences") 	
	private List<NotificationPreferenceWsDTO> preferences;
	
	public NotificationPreferenceListWsDTO()
	{
		// default constructor
	}
	
	public void setPreferences(final List<NotificationPreferenceWsDTO> preferences)
	{
		this.preferences = preferences;
	}

	public List<NotificationPreferenceWsDTO> getPreferences() 
	{
		return preferences;
	}
	


}
