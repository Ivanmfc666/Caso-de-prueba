package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base{
	
	By ServicioLinkLocator = By.linkText("Servicios");
	By registerPageLocator = By.xpath("//img[@class='attachment-full size-full']");

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		click(ServicioLinkLocator);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator)) {
			System.out.println("Pagina Correcta");
		}
		else {
			System.out.println("Pagina Incorrecta");
		}
	}

}
