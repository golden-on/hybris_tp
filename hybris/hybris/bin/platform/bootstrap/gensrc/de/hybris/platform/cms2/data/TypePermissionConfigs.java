/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cms2.data;

import java.io.Serializable;
import de.hybris.platform.cms2.data.AttributePermissionForType;
import java.util.List;

public  class TypePermissionConfigs  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TypePermissionConfigs.typecode</code> property defined at extension <code>cms2</code>. */
		
	private String typecode;

	/** <i>Generated property</i> for <code>TypePermissionConfigs.configs</code> property defined at extension <code>cms2</code>. */
		
	private List<AttributePermissionForType> configs;

	/** <i>Generated property</i> for <code>TypePermissionConfigs.include</code> property defined at extension <code>cms2</code>. */
		
	private List<String> include;
	
	public TypePermissionConfigs()
	{
		// default constructor
	}
	
	public void setTypecode(final String typecode)
	{
		this.typecode = typecode;
	}

	public String getTypecode() 
	{
		return typecode;
	}
	
	public void setConfigs(final List<AttributePermissionForType> configs)
	{
		this.configs = configs;
	}

	public List<AttributePermissionForType> getConfigs() 
	{
		return configs;
	}
	
	public void setInclude(final List<String> include)
	{
		this.include = include;
	}

	public List<String> getInclude() 
	{
		return include;
	}
	


}
