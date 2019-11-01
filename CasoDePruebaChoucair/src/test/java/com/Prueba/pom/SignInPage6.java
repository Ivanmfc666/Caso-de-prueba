package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage6 extends Base{
	
	By ComolohacemosLinkLocator6 = By.linkText("Pruebas de Usabilidad");
	By registerPageLocator7 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/usabilidad-768x260.jpg.webp']");

	public SignInPage6(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn6() throws InterruptedException {
		click(ComolohacemosLinkLocator6);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator7)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
