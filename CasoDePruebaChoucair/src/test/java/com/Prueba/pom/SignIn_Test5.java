package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test5 {
	
	private WebDriver driver;
	SignInPage5 signInPage5;

	@Before
	public void setUp() throws Exception {
		signInPage5 = new SignInPage5(driver);
		driver = signInPage5.chromeDriverConnection();
		signInPage5.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage5.signIn5();
		Thread.sleep(2000);
		assertEquals("Business Intellingence", "Pruebas para Business Intellingence");
	}

}
