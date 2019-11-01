package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage14 extends Base{
	
	By ComolohacemosLinkLocator14 = By.linkText("Switches Transaccionales");
	By registerPageLocator15 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/switches-768x260.jpg.webp']");

	public SignInPage14(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn14() throws InterruptedException {
		click(ComolohacemosLinkLocator14);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator15)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
