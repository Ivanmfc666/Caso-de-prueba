package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test9 {
	
	private WebDriver driver;
	SignInPage9 signInPage9;

	@Before
	public void setUp() throws Exception {
		signInPage9 = new SignInPage9(driver);
		driver = signInPage9.chromeDriverConnection();
		signInPage9.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage9.signIn9();
		Thread.sleep(2000);
		assertEquals("Pruebas de Migración", "Pruebas de Migración");
	}

}
