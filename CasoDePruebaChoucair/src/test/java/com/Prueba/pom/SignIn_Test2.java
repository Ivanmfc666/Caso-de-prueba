package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test2 {
	
	private WebDriver driver;
	SignInPage2 signInPage2;

	@Before
	public void setUp() throws Exception {
		signInPage2 = new SignInPage2(driver);
		driver = signInPage2.chromeDriverConnection();
		signInPage2.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage2.signIn2();
		Thread.sleep(2000);
	}

}
