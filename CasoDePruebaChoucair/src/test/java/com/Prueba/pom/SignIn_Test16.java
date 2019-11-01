package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test16 {
	
	private WebDriver driver;
	SignInPage16 signInPage16;

	@Before
	public void setUp() throws Exception {
		signInPage16 = new SignInPage16(driver);
		driver = signInPage16.chromeDriverConnection();
		signInPage16.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		signInPage16.signIn16();
		Thread.sleep(2000);
		assertEquals("Pruebas de Seguridad", "Pruebas de Seguridad");
	}

}
