package de.hybris.platform.sap.productconfig.runtime.ssc.wrapper;

import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.UnitTest;

import org.junit.Test;


@UnitTest
public class KBOCacheWrapperTest
{
	private final KBOCacheWrapper classUnderTest = new KBOCacheWrapper();

	@Test
	public void testConstructor()
	{
		assertNotNull(classUnderTest);
	}
} 