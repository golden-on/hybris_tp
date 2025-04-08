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
import de.hybris.platform.ruleengineservices.enums.OrderEntrySelectionStrategy;
import de.hybris.platform.ruleengineservices.rao.OrderEntryRAO;
import java.util.List;

import java.util.Objects;

public  class EntriesSelectionStrategyRPD  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EntriesSelectionStrategyRPD.orderEntries</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<OrderEntryRAO> orderEntries;

	/** <i>Generated property</i> for <code>EntriesSelectionStrategyRPD.selectionStrategy</code> property defined at extension <code>ruleengineservices</code>. */
		
	private OrderEntrySelectionStrategy selectionStrategy;

	/** <i>Generated property</i> for <code>EntriesSelectionStrategyRPD.quantity</code> property defined at extension <code>ruleengineservices</code>. */
		
	private int quantity;

	/** <i>Generated property</i> for <code>EntriesSelectionStrategyRPD.targetOfAction</code> property defined at extension <code>ruleengineservices</code>. */
		
	private boolean targetOfAction;
	
	public EntriesSelectionStrategyRPD()
	{
		// default constructor
	}
	
	public void setOrderEntries(final List<OrderEntryRAO> orderEntries)
	{
		this.orderEntries = orderEntries;
	}

	public List<OrderEntryRAO> getOrderEntries() 
	{
		return orderEntries;
	}
	
	public void setSelectionStrategy(final OrderEntrySelectionStrategy selectionStrategy)
	{
		this.selectionStrategy = selectionStrategy;
	}

	public OrderEntrySelectionStrategy getSelectionStrategy() 
	{
		return selectionStrategy;
	}
	
	public void setQuantity(final int quantity)
	{
		this.quantity = quantity;
	}

	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setTargetOfAction(final boolean targetOfAction)
	{
		this.targetOfAction = targetOfAction;
	}

	public boolean isTargetOfAction() 
	{
		return targetOfAction;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

	if (getClass() != o.getClass()) return false;

	final EntriesSelectionStrategyRPD other = (EntriesSelectionStrategyRPD) o;
	return	Objects.equals(getOrderEntries(), other.getOrderEntries())
 &&  Objects.equals(getSelectionStrategy(), other.getSelectionStrategy())
 &&  Objects.equals(getQuantity(), other.getQuantity())
 &&  Objects.equals(isTargetOfAction(), other.isTargetOfAction())
  ;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		Object attribute;

				attribute = orderEntries;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
				attribute = selectionStrategy;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
				attribute = quantity;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
				attribute = targetOfAction;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
		
		return result;
	}
	}