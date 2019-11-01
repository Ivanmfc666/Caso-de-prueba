package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage17 extends Base{
	
	By ComolohacemosLinkLocator17 = By.linkText("Alta automatización");
	By registerPageLocator18 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/11/Alta-automatizacion-768x260.jpg.webp']");

	public SignInPage17(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn17() throws InterruptedException {
		click(ComolohacemosLinkLocator17);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator18)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
