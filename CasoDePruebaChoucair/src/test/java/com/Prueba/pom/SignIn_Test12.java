package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test12 {
	private WebDriver driver;
	SignInPage12 signInPage12;

	@Before
	public void setUp() throws Exception {
		signInPage12 = new SignInPage12(driver);
		driver = signInPage12.chromeDriverConnection();
		signInPage12.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage12.signIn12();
		Thread.sleep(2000);
		assertEquals("Automatización de Pruebas", "Automatización de Pruebas");
	}

}
