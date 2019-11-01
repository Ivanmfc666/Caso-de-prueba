package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test3 {
	private WebDriver driver;
	SignInPage3 signInPage3;

	@Before
	public void setUp() throws Exception {
		signInPage3 = new SignInPage3(driver);
		driver = signInPage3.chromeDriverConnection();
		signInPage3.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage3.signIn3();
		Thread.sleep(2000);
	}

}
