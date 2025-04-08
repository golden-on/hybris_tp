/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.PageContentSlotData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of page content slots
 */
@ApiModel(value="PageContentSlotListData", description="List of page content slots")
public  class PageContentSlotListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageContentSlotListData.pageContentSlotList</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageContentSlotList") 	
	private List<PageContentSlotData> pageContentSlotList;
	
	public PageContentSlotListData()
	{
		// default constructor
	}
	
	public void setPageContentSlotList(final List<PageContentSlotData> pageContentSlotList)
	{
		this.pageContentSlotList = pageContentSlotList;
	}

	public List<PageContentSlotData> getPageContentSlotList() 
	{
		return pageContentSlotList;
	}
	


}
