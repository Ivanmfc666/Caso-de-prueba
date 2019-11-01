package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test6 {
	private WebDriver driver;
	SignInPage6 signInPage6;

	@Before
	public void setUp() throws Exception {
		signInPage6 = new SignInPage6(driver);
		driver = signInPage6.chromeDriverConnection();
		signInPage6.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage6.signIn6();
		Thread.sleep(2000);
		assertEquals("Pruebas de Usabilidad", "Pruebas de Usabilidad");
	}

}
