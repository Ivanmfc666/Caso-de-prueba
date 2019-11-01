package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage10 extends Base{
	
	By ComolohacemosLinkLocator10 = By.linkText("Pruebas Generalistas");
	By registerPageLocator11 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/generalistas-768x260.jpg.webp']");

	public SignInPage10(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn10() throws InterruptedException {
		click(ComolohacemosLinkLocator10);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator11)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
