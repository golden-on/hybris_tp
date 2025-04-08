/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:15
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rule.data;

import de.hybris.platform.ruleengineservices.rule.data.AbstractRuleDefinitionData;
import de.hybris.platform.ruleengineservices.rule.data.RuleConditionDefinitionCategoryData;
import java.util.List;

public  class RuleConditionDefinitionData extends AbstractRuleDefinitionData 
{

 

	/** <i>Generated property</i> for <code>RuleConditionDefinitionData.allowsChildren</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Boolean allowsChildren;

	/** <i>Generated property</i> for <code>RuleConditionDefinitionData.categories</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<RuleConditionDefinitionCategoryData> categories;
	
	public RuleConditionDefinitionData()
	{
		// default constructor
	}
	
	public void setAllowsChildren(final Boolean allowsChildren)
	{
		this.allowsChildren = allowsChildren;
	}

	public Boolean getAllowsChildren() 
	{
		return allowsChildren;
	}
	
	public void setCategories(final List<RuleConditionDefinitionCategoryData> categories)
	{
		this.categories = categories;
	}

	public List<RuleConditionDefinitionCategoryData> getCategories() 
	{
		return categories;
	}
	


}
