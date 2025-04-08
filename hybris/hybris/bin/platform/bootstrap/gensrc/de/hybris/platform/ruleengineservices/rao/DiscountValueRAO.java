/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:14
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rao;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.Objects;

public  class DiscountValueRAO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>DiscountValueRAO.value</code> property defined at extension <code>ruleengineservices</code>. */
		
	private BigDecimal value;

	/** <i>Generated property</i> for <code>DiscountValueRAO.currencyIsoCode</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String currencyIsoCode;
	
	public DiscountValueRAO()
	{
		// default constructor
	}
	
	public void setValue(final BigDecimal value)
	{
		this.value = value;
	}

	public BigDecimal getValue() 
	{
		return value;
	}
	
	public void setCurrencyIsoCode(final String currencyIsoCode)
	{
		this.currencyIsoCode = currencyIsoCode;
	}

	public String getCurrencyIsoCode() 
	{
		return currencyIsoCode;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

	if (getClass() != o.getClass()) return false;

	final DiscountValueRAO other = (DiscountValueRAO) o;
	return	Objects.equals(getValue(), other.getValue())
 &&  Objects.equals(getCurrencyIsoCode(), other.getCurrencyIsoCode())
  ;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		Object attribute;

				attribute = value;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
				attribute = currencyIsoCode;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
		
		return result;
	}
	}