package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage12 extends Base{

	
	By ComolohacemosLinkLocator12 = By.linkText("Automatización de Pruebas");
	By registerPageLocator13 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/automatizacion-768x260.jpg.webp']");
	public SignInPage12(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn12() throws InterruptedException {
		click(ComolohacemosLinkLocator12);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator13)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
