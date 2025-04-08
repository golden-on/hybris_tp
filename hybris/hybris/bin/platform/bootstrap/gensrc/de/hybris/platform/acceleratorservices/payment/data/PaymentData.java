/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorservices.payment.data;

import java.io.Serializable;
import java.util.Map;

public  class PaymentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaymentData.parameters</code> property defined at extension <code>acceleratorservices</code>. */
		
	private Map<String, String> parameters;

	/** <i>Generated property</i> for <code>PaymentData.postUrl</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String postUrl;

	/** <i>Generated property</i> for <code>PaymentData.mappingLabels</code> property defined at extension <code>acceleratorwebservicesaddon</code>. */
		
	private Map<String, String> mappingLabels;
	
	public PaymentData()
	{
		// default constructor
	}
	
	public void setParameters(final Map<String, String> parameters)
	{
		this.parameters = parameters;
	}

	public Map<String, String> getParameters() 
	{
		return parameters;
	}
	
	public void setPostUrl(final String postUrl)
	{
		this.postUrl = postUrl;
	}

	public String getPostUrl() 
	{
		return postUrl;
	}
	
	public void setMappingLabels(final Map<String, String> mappingLabels)
	{
		this.mappingLabels = mappingLabels;
	}

	public Map<String, String> getMappingLabels() 
	{
		return mappingLabels;
	}
	


}
