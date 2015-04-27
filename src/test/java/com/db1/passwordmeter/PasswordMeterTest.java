package com.db1.passwordmeter;

import junit.framework.Assert;

import org.junit.Test;

public class PasswordMeterTest {
	private PasswordMeterService passwordService;
	public static String SHORT_PASSWORD = "!@#asd";

	public PasswordMeterTest() {
		this.passwordService = new PasswordMeterService();
	}

	@Test
	public void testShortPassword() {
		Assert.assertEquals("Testing short password",
				passwordService.getTotalScore(SHORT_PASSWORD), 1);
	}
}
