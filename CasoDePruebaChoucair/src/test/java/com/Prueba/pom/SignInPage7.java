package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage7 extends Base{
	
	By ComolohacemosLinkLocator7 = By.linkText("Pruebas Contables y Financieras");
	By registerPageLocator8 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/contables-768x260.jpg.webp']");

	public SignInPage7(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn7() throws InterruptedException {
		click(ComolohacemosLinkLocator7);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator8)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}


}
