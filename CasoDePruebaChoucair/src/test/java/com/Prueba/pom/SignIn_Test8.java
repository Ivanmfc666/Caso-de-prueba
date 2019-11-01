package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test8 {
	
	private WebDriver driver;
	SignInPage8 signInPage8;

	@Before
	public void setUp() throws Exception {
		signInPage8 = new SignInPage8(driver);
		driver = signInPage8.chromeDriverConnection();
		signInPage8.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage8.signIn8();
		Thread.sleep(2000);
		assertEquals("Pruebas de Desempeño", "Pruebas de Desempeño");
	}

}
