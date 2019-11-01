package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test4 {
	private WebDriver driver;
	SignInPage4 signInPage4;

	@Before
	public void setUp() throws Exception {
		signInPage4 = new SignInPage4(driver);
		driver = signInPage4.chromeDriverConnection();
		signInPage4.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage4.signIn4();
		Thread.sleep(2000);
		assertEquals("Pruebas Móviles", "Pruebas para aplicativos móviles");
	}

}
