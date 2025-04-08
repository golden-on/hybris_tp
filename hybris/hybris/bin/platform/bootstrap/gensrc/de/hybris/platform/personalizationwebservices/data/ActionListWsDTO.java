/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.ActionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of actions
 */
@ApiModel(value="actionList", description="List of actions")
public  class ActionListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of actions<br/><br/><i>Generated property</i> for <code>ActionListWsDTO.actions</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="actions", value="List of actions") 	
	private List<ActionData> actions;
	
	public ActionListWsDTO()
	{
		// default constructor
	}
	
	public void setActions(final List<ActionData> actions)
	{
		this.actions = actions;
	}

	public List<ActionData> getActions() 
	{
		return actions;
	}
	


}
