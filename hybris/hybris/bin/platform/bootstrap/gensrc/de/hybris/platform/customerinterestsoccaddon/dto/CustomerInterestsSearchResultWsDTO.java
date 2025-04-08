/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customerinterestsoccaddon.dto;

import java.io.Serializable;
import de.hybris.platform.customerinterestsoccaddon.dto.ProductInterestEntryRelationWsDTO;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import de.hybris.platform.webservicescommons.dto.SortWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Customer interests search page
 */
@ApiModel(value="customerInterestsSearchPage", description="Customer interests search page")
public  class CustomerInterestsSearchResultWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** list of product interest relation<br/><br/><i>Generated property</i> for <code>CustomerInterestsSearchResultWsDTO.results</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="results", value="list of product interest relation") 	
	private List<ProductInterestEntryRelationWsDTO> results;

	/** sorting information<br/><br/><i>Generated property</i> for <code>CustomerInterestsSearchResultWsDTO.sorts</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="sorts", value="sorting information") 	
	private List<SortWsDTO> sorts;

	/** pagination information<br/><br/><i>Generated property</i> for <code>CustomerInterestsSearchResultWsDTO.pagination</code> property defined at extension <code>customerinterestsoccaddon</code>. */
	@ApiModelProperty(name="pagination", value="pagination information") 	
	private PaginationWsDTO pagination;
	
	public CustomerInterestsSearchResultWsDTO()
	{
		// default constructor
	}
	
	public void setResults(final List<ProductInterestEntryRelationWsDTO> results)
	{
		this.results = results;
	}

	public List<ProductInterestEntryRelationWsDTO> getResults() 
	{
		return results;
	}
	
	public void setSorts(final List<SortWsDTO> sorts)
	{
		this.sorts = sorts;
	}

	public List<SortWsDTO> getSorts() 
	{
		return sorts;
	}
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	


}
