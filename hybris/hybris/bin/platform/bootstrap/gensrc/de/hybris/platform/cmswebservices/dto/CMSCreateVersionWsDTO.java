/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 6 avr. 2025 à 23:07:12
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;

public abstract  class CMSCreateVersionWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSCreateVersionWsDTO.createVersion</code> property defined at extension <code>cmswebservices</code>. */
		
	private Boolean createVersion;

	/** <i>Generated property</i> for <code>CMSCreateVersionWsDTO.versionLabel</code> property defined at extension <code>cmswebservices</code>. */
		
	private String versionLabel;
	
	public CMSCreateVersionWsDTO()
	{
		// default constructor
	}
	
	public void setCreateVersion(final Boolean createVersion)
	{
		this.createVersion = createVersion;
	}

	public Boolean getCreateVersion() 
	{
		return createVersion;
	}
	
	public void setVersionLabel(final String versionLabel)
	{
		this.versionLabel = versionLabel;
	}

	public String getVersionLabel() 
	{
		return versionLabel;
	}
	


}
