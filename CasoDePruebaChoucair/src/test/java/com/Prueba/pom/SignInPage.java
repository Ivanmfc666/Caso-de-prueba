package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
	
	By CapacidadLinkLocator = By.linkText("Capacidades");
	By registerPageLocator1 = By.xpath("//img[@class='attachment-large size-large']");

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn() throws InterruptedException {
		click(CapacidadLinkLocator);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator1)) {
			System.out.println("Pagina Correcta");
		}
		else {
			System.out.println("Pagina Incorrecta");
		}
	}

}
