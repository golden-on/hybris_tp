/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:09
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.storesession.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import java.util.Collection;

public  class LanguageDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>LanguageDataList.languages</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private Collection<LanguageData> languages;
	
	public LanguageDataList()
	{
		// default constructor
	}
	
	public void setLanguages(final Collection<LanguageData> languages)
	{
		this.languages = languages;
	}

	public Collection<LanguageData> getLanguages() 
	{
		return languages;
	}
	


}
