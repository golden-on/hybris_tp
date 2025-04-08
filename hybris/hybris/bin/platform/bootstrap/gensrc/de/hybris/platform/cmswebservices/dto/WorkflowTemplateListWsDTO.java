/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="WorkflowTemplateListWsDTO")
public  class WorkflowTemplateListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>WorkflowTemplateListWsDTO.templates</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="templates") 	
	private List<WorkflowTemplateWsDTO> templates;
	
	public WorkflowTemplateListWsDTO()
	{
		// default constructor
	}
	
	public void setTemplates(final List<WorkflowTemplateWsDTO> templates)
	{
		this.templates = templates;
	}

	public List<WorkflowTemplateWsDTO> getTemplates() 
	{
		return templates;
	}
	


}
