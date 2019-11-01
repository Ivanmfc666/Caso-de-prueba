package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage5 extends Base{
	
	By ComolohacemosLinkLocator5 = By.linkText("Business Intellingence");
	By registerPageLocator6 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/bussines-768x260.jpg.webp']");

	public SignInPage5(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn5() throws InterruptedException {
		click(ComolohacemosLinkLocator5);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator6)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
