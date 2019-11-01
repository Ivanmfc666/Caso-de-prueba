package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage15 extends Base{
	
	By ComolohacemosLinkLocator15 = By.linkText("Pruebas de Nómina");
	By registerPageLocator16 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/nomina-1024x347.jpg.webp']");

	public SignInPage15(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn15() throws InterruptedException {
		click(ComolohacemosLinkLocator15);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator16)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
