/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSWorkflowActionWsDTO")
public  class CMSWorkflowActionWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.code</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.name</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="name") 	
	private String name;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.description</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="description") 	
	private String description;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.actionType</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="actionType") 	
	private String actionType;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.status</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="status") 	
	private String status;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.isCurrentUserParticipant</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="isCurrentUserParticipant") 	
	private boolean isCurrentUserParticipant;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.startedAgoInMillis</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="startedAgoInMillis") 	
	private Long startedAgoInMillis;

	/** <i>Generated property</i> for <code>CMSWorkflowActionWsDTO.decisions</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="decisions") 	
	private List<CMSWorkflowDecisionWsDTO> decisions;
	
	public CMSWorkflowActionWsDTO()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setActionType(final String actionType)
	{
		this.actionType = actionType;
	}

	public String getActionType() 
	{
		return actionType;
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setIsCurrentUserParticipant(final boolean isCurrentUserParticipant)
	{
		this.isCurrentUserParticipant = isCurrentUserParticipant;
	}

	public boolean isIsCurrentUserParticipant() 
	{
		return isCurrentUserParticipant;
	}
	
	public void setStartedAgoInMillis(final Long startedAgoInMillis)
	{
		this.startedAgoInMillis = startedAgoInMillis;
	}

	public Long getStartedAgoInMillis() 
	{
		return startedAgoInMillis;
	}
	
	public void setDecisions(final List<CMSWorkflowDecisionWsDTO> decisions)
	{
		this.decisions = decisions;
	}

	public List<CMSWorkflowDecisionWsDTO> getDecisions() 
	{
		return decisions;
	}
	


}
