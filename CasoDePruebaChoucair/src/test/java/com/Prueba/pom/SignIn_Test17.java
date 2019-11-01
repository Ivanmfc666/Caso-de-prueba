package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test17 {
	
	private WebDriver driver;
	SignInPage17 signInPage17;

	@Before
	public void setUp() throws Exception {
		signInPage17 = new SignInPage17(driver);
		driver = signInPage17.chromeDriverConnection();
		signInPage17.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		signInPage17.signIn17();
		Thread.sleep(2000);
		assertEquals("Alta automatización", "Alta automatización");
	}

}
