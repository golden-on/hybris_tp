/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.enums.AsBoostOperator;
import java.util.Set;

public  class AsIndexPropertyData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.code</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.type</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Class<?> type;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.supportedBoostOperators</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Set<AsBoostOperator> supportedBoostOperators;
	
	public AsIndexPropertyData()
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
	
	public void setType(final Class<?> type)
	{
		this.type = type;
	}

	public Class<?> getType() 
	{
		return type;
	}
	
	public void setSupportedBoostOperators(final Set<AsBoostOperator> supportedBoostOperators)
	{
		this.supportedBoostOperators = supportedBoostOperators;
	}

	public Set<AsBoostOperator> getSupportedBoostOperators() 
	{
		return supportedBoostOperators;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsIndexPropertyData other = (AsIndexPropertyData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.append(getName(), other.getName()) 
			.append(getType(), other.getType()) 
			.append(getSupportedBoostOperators(), other.getSupportedBoostOperators()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getCode()) 
		.append(getName()) 
		.append(getType()) 
		.append(getSupportedBoostOperators()) 
		.toHashCode();
	}

}
