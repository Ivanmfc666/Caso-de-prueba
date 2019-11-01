package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage11 extends Base{
	
	By ComolohacemosLinkLocator11 = By.linkText("Automatización de Pruebas SAP");
	By registerPageLocator12 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/SAP-768x260.jpg.webp']");

	public SignInPage11(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn11() throws InterruptedException {
		click(ComolohacemosLinkLocator11);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator12)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
