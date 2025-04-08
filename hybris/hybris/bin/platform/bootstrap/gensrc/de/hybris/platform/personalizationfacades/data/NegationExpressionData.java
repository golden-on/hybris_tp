/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationfacades.data;

import de.hybris.platform.personalizationfacades.data.ExpressionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Negation expression
 */
@ApiModel(value="negationExpression", description="Negation expression")
public  class NegationExpressionData extends ExpressionData 
{

 

	/** Expression to negate<br/><br/><i>Generated property</i> for <code>NegationExpressionData.element</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="element", value="Expression to negate") 	
	private ExpressionData element;
	
	public NegationExpressionData()
	{
		// default constructor
	}
	
	public void setElement(final ExpressionData element)
	{
		this.element = element;
	}

	public ExpressionData getElement() 
	{
		return element;
	}
	


}
