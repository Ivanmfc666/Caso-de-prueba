package com.Prueba.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test1 {
	private WebDriver driver;
	SignInPage1 signInPage1;

	@Before
	public void setUp() throws Exception {
		signInPage1 = new SignInPage1(driver);
		driver = signInPage1.chromeDriverConnection();
		signInPage1.visit("https://www.choucairtesting.com/servicios/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signInPage1.signIn();
		Thread.sleep(2000);
	}

}
