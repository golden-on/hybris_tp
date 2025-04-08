/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearchbackoffice.data;

import de.hybris.platform.adaptivesearchbackoffice.data.AbstractSearchRequestData;
import java.util.List;

public  class FacetFiltersRequestData extends AbstractSearchRequestData 
{

 

	/** <i>Generated property</i> for <code>FacetFiltersRequestData.indexProperty</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String indexProperty;

	/** <i>Generated property</i> for <code>FacetFiltersRequestData.values</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private List<String> values;
	
	public FacetFiltersRequestData()
	{
		// default constructor
	}
	
	public void setIndexProperty(final String indexProperty)
	{
		this.indexProperty = indexProperty;
	}

	public String getIndexProperty() 
	{
		return indexProperty;
	}
	
	public void setValues(final List<String> values)
	{
		this.values = values;
	}

	public List<String> getValues() 
	{
		return values;
	}
	


}
