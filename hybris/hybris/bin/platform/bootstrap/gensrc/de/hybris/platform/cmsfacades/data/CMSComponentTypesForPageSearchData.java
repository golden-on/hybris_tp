/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:13
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.List;

public  class CMSComponentTypesForPageSearchData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.pageId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pageId;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.mask</code> property defined at extension <code>cmsfacades</code>. */
		
	private String mask;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.readOnly</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean readOnly;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.requiredFields</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> requiredFields;
	
	public CMSComponentTypesForPageSearchData()
	{
		// default constructor
	}
	
	public void setPageId(final String pageId)
	{
		this.pageId = pageId;
	}

	public String getPageId() 
	{
		return pageId;
	}
	
	public void setMask(final String mask)
	{
		this.mask = mask;
	}

	public String getMask() 
	{
		return mask;
	}
	
	public void setReadOnly(final boolean readOnly)
	{
		this.readOnly = readOnly;
	}

	public boolean isReadOnly() 
	{
		return readOnly;
	}
	
	public void setRequiredFields(final List<String> requiredFields)
	{
		this.requiredFields = requiredFields;
	}

	public List<String> getRequiredFields() 
	{
		return requiredFields;
	}
	


}
