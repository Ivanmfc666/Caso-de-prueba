package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage2 extends Base{
	
	By ComolohacemosLinkLocator2 = By.linkText("Portafolio de Soluciones");
	By registerPageLocator3 = By.linkText("Digital Performance Management");

	public SignInPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn2() throws InterruptedException {
		click(ComolohacemosLinkLocator2);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator3)) {
			System.out.println("Pagina Correcta");
		}
		else {
			System.out.println("Pagina Incorrecta");
		}
	}

}
