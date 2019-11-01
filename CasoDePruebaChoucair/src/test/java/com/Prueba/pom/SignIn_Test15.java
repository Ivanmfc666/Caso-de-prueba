package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test15 {
	
	private WebDriver driver;
	SignInPage15 signInPage15;
	

	@Before
	public void setUp() throws Exception {
		signInPage15 = new SignInPage15(driver);
		driver = signInPage15.chromeDriverConnection();
		signInPage15.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage15.signIn15();
		Thread.sleep(2000);
		assertEquals("Pruebas de Nómina", "Pruebas de Nómina");
	}

}
