package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test14 {
	
	private WebDriver driver;
	SignInPage14 signInPage14;
	

	@Before
	public void setUp() throws Exception {
		signInPage14 = new SignInPage14(driver);
		driver = signInPage14.chromeDriverConnection();
		signInPage14.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage14.signIn14();
		Thread.sleep(2000);
		assertEquals("Switches Transaccionales", "Administración de Pruebas para Switches Transaccionales");
		
	}

}
