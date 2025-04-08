/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.PageRestrictionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of page restrictions
 */
@ApiModel(value="PageRestrictionListData", description="List of page restrictions")
public  class PageRestrictionListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageRestrictionListData.pageRestrictionList</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageRestrictionList") 	
	private List<PageRestrictionData> pageRestrictionList;
	
	public PageRestrictionListData()
	{
		// default constructor
	}
	
	public void setPageRestrictionList(final List<PageRestrictionData> pageRestrictionList)
	{
		this.pageRestrictionList = pageRestrictionList;
	}

	public List<PageRestrictionData> getPageRestrictionList() 
	{
		return pageRestrictionList;
	}
	


}
