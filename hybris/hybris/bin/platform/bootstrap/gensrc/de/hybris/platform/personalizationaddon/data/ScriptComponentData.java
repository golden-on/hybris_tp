/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:08
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationaddon.data;

import java.io.Serializable;
import java.util.List;

public  class ScriptComponentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ScriptComponentData.actions</code> property defined at extension <code>personalizationaddon</code>. */
		
	private List<Object> actions;

	/** <i>Generated property</i> for <code>ScriptComponentData.segments</code> property defined at extension <code>personalizationaddon</code>. */
		
	private List<Object> segments;
	
	public ScriptComponentData()
	{
		// default constructor
	}
	
	public void setActions(final List<Object> actions)
	{
		this.actions = actions;
	}

	public List<Object> getActions() 
	{
		return actions;
	}
	
	public void setSegments(final List<Object> segments)
	{
		this.segments = segments;
	}

	public List<Object> getSegments() 
	{
		return segments;
	}
	


}
