package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test10 {
	
	private WebDriver driver;
	SignInPage10 signInPage10;

	@Before
	public void setUp() throws Exception {
		signInPage10 = new SignInPage10(driver);
		driver = signInPage10.chromeDriverConnection();
		signInPage10.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage10.signIn10();
		Thread.sleep(2000);
		assertEquals("Pruebas Generalistas", "Pruebas Generalistas");
	}

}
