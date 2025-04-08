/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationfacades.data;

import de.hybris.platform.personalizationfacades.data.ExpressionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Segment expression
 */
@ApiModel(value="segmentExpression", description="Segment expression")
public  class SegmentExpressionData extends ExpressionData 
{

 

	/** Segment code<br/><br/><i>Generated property</i> for <code>SegmentExpressionData.code</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="code", value="Segment code") 	
	private String code;
	
	public SegmentExpressionData()
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
	


}
