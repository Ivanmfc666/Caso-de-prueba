package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test7 {
	
	private WebDriver driver;
	SignInPage7 signInPage7;

	@Before
	public void setUp() throws Exception {
		signInPage7 = new SignInPage7(driver);
		driver = signInPage7.chromeDriverConnection();
		signInPage7.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage7.signIn7();
		Thread.sleep(2000);
		assertEquals("Pruebas Contables y Financieras", "Pruebas Contables y Financieras");
	}

}
