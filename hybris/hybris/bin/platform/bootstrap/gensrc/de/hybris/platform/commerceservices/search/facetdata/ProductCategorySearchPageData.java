/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.facetdata;

import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import java.util.List;

/**
 * POJO containing the result page for product or category search.
 */
public  class ProductCategorySearchPageData<STATE, RESULT, CATEGORY> extends ProductSearchPageData<STATE, RESULT> 
{

 

	/** <i>Generated property</i> for <code>ProductCategorySearchPageData<STATE, RESULT, CATEGORY>.subCategories</code> property defined at extension <code>commerceservices</code>. */
		
	private List<CATEGORY> subCategories;
	
	public ProductCategorySearchPageData()
	{
		// default constructor
	}
	
	public void setSubCategories(final List<CATEGORY> subCategories)
	{
		this.subCategories = subCategories;
	}

	public List<CATEGORY> getSubCategories() 
	{
		return subCategories;
	}
	


}
