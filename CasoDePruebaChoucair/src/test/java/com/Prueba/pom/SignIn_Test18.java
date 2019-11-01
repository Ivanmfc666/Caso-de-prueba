package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test18 {
	
	private WebDriver driver;
	SignInPage18 signInPage18;
	

	@Before
	public void setUp() throws Exception {
		signInPage18 = new SignInPage18(driver);
		driver = signInPage18.chromeDriverConnection();
		signInPage18.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage18.signIn18();
		Thread.sleep(2000);
		assertEquals("Cursos y Certificaciones", "Cursos y Certificaciones");
	}

}
