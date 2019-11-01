package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage16 extends Base{
	
	By ComolohacemosLinkLocator16 = By.linkText("Pruebas de Seguridad");
	By registerPageLocator17 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/seguridad-768x260.jpg.webp']");

	public SignInPage16(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void signIn16() throws InterruptedException {
		click(ComolohacemosLinkLocator16);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator17)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}
}
