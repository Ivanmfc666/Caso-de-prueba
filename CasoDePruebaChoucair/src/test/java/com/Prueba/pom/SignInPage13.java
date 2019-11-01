package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage13 extends Base{
	
	By ComolohacemosLinkLocator13 = By.linkText("Ambientes de Prueba");
	By registerPageLocator14 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/ambienets-768x260.jpg.webp']");

	public SignInPage13(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void signIn13() throws InterruptedException {
		click(ComolohacemosLinkLocator13);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator14)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}
}
