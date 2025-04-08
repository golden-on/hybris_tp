/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousing.data.allocation;

import java.io.Serializable;
import java.util.Collection;

public  class DeclineEntries  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>DeclineEntries.entries</code> property defined at extension <code>warehousing</code>. */
		
	private Collection<DeclineEntry> entries;
	
	public DeclineEntries()
	{
		// default constructor
	}
	
	public void setEntries(final Collection<DeclineEntry> entries)
	{
		this.entries = entries;
	}

	public Collection<DeclineEntry> getEntries() 
	{
		return entries;
	}
	


}
