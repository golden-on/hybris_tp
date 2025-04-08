/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:06:58
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.SegmentData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of segments
 */
@ApiModel(value="segmentList", description="List of segments")
public  class SegmentListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Pagination details<br/><br/><i>Generated property</i> for <code>SegmentListWsDTO.pagination</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="pagination", value="Pagination details") 	
	private PaginationWsDTO pagination;

	/** List of segments<br/><br/><i>Generated property</i> for <code>SegmentListWsDTO.segments</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="segments", value="List of segments") 	
	private List<SegmentData> segments;
	
	public SegmentListWsDTO()
	{
		// default constructor
	}
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	
	public void setSegments(final List<SegmentData> segments)
	{
		this.segments = segments;
	}

	public List<SegmentData> getSegments() 
	{
		return segments;
	}
	


}
