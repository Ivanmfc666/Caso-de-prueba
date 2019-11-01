package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test13 {
	
	private WebDriver driver;
	SignInPage13 signInPage13;

	@Before
	public void setUp() throws Exception {
		signInPage13 = new SignInPage13(driver);
		driver = signInPage13.chromeDriverConnection();
		signInPage13.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		signInPage13.signIn13();
		Thread.sleep(2000);
		assertEquals("Ambientes de Prueba", "Administracion de Ambientes de Prueba");
	}

}
