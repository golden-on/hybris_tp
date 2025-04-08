/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.compiler;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.compiler.RuleIrAction;
import de.hybris.platform.ruleengineservices.compiler.RuleIrCondition;
import de.hybris.platform.ruleengineservices.compiler.RuleIrVariablesContainer;
import java.util.List;

public  class RuleIr  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RuleIr.variablesContainer</code> property defined at extension <code>ruleengineservices</code>. */
		
	private RuleIrVariablesContainer variablesContainer;

	/** <i>Generated property</i> for <code>RuleIr.conditions</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<RuleIrCondition> conditions;

	/** <i>Generated property</i> for <code>RuleIr.actions</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<RuleIrAction> actions;
	
	public RuleIr()
	{
		// default constructor
	}
	
	public void setVariablesContainer(final RuleIrVariablesContainer variablesContainer)
	{
		this.variablesContainer = variablesContainer;
	}

	public RuleIrVariablesContainer getVariablesContainer() 
	{
		return variablesContainer;
	}
	
	public void setConditions(final List<RuleIrCondition> conditions)
	{
		this.conditions = conditions;
	}

	public List<RuleIrCondition> getConditions() 
	{
		return conditions;
	}
	
	public void setActions(final List<RuleIrAction> actions)
	{
		this.actions = actions;
	}

	public List<RuleIrAction> getActions() 
	{
		return actions;
	}
	


}
