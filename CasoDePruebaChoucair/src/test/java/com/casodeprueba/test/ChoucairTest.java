package com.casodeprueba.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChoucairTest {
	
	private WebDriver driver;
	By ServicioLinkLocator = By.linkText("Servicios");
	By CapacidadLinkLocator = By.linkText("Capacidades");
	By registerPageLocator = By.xpath("//img[@class='attachment-full size-full']");
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chormedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}
	
	@Test
	public void registerUser() throws InterruptedException {
		
		driver.findElement(ServicioLinkLocator).click();
		Thread.sleep(2000);
		driver.findElement(CapacidadLinkLocator).click();
		Thread.sleep(2000);
	}

	@After
	public void tearDown() {
		//driver.quit();
	}

}
