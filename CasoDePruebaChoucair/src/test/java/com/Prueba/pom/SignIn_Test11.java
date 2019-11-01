package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test11 {
	
	private WebDriver driver;
	SignInPage11 signInPage11;
	

	@Before
	public void setUp() throws Exception {
		signInPage11 = new SignInPage11(driver);
		driver = signInPage11.chromeDriverConnection();
		signInPage11.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
			signInPage11.signIn11();
			Thread.sleep(2000);
			assertEquals("Automatización de Pruebas SAP", "Automatización de Pruebas SAP");
	}

}
