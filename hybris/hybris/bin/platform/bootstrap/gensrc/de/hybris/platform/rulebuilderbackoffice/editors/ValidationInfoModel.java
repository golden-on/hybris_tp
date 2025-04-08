/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.rulebuilderbackoffice.editors;

import java.io.Serializable;
import de.hybris.platform.rulebuilderbackoffice.editors.ValidationInfoSeverity;

/**
 * Represents results of Rule Validation in rule builder
 */
public  class ValidationInfoModel  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ValidationInfoModel.severity</code> property defined at extension <code>rulebuilderbackoffice</code>. */
		
	private ValidationInfoSeverity severity;

	/** <i>Generated property</i> for <code>ValidationInfoModel.iconStyleClass</code> property defined at extension <code>rulebuilderbackoffice</code>. */
		
	private String iconStyleClass;

	/** <i>Generated property</i> for <code>ValidationInfoModel.styleClass</code> property defined at extension <code>rulebuilderbackoffice</code>. */
		
	private String styleClass;

	/** <i>Generated property</i> for <code>ValidationInfoModel.message</code> property defined at extension <code>rulebuilderbackoffice</code>. */
		
	private String message;
	
	public ValidationInfoModel()
	{
		// default constructor
	}
	
	public void setSeverity(final ValidationInfoSeverity severity)
	{
		this.severity = severity;
	}

	public ValidationInfoSeverity getSeverity() 
	{
		return severity;
	}
	
	public void setIconStyleClass(final String iconStyleClass)
	{
		this.iconStyleClass = iconStyleClass;
	}

	public String getIconStyleClass() 
	{
		return iconStyleClass;
	}
	
	public void setStyleClass(final String styleClass)
	{
		this.styleClass = styleClass;
	}

	public String getStyleClass() 
	{
		return styleClass;
	}
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final ValidationInfoModel other = (ValidationInfoModel) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getSeverity(), other.getSeverity()) 
			.append(getStyleClass(), other.getStyleClass()) 
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
		.append(getSeverity()) 
		.append(getStyleClass()) 
		.toHashCode();
	}

}
