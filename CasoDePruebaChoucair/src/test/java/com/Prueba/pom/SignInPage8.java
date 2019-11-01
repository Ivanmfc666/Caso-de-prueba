package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage8 extends Base{
	
	By ComolohacemosLinkLocator8 = By.linkText("Pruebas de Desempeño");
	By registerPageLocator9 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/desempeno-768x260.jpg.webp']");

	public SignInPage8(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn8() throws InterruptedException {
		click(ComolohacemosLinkLocator8);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator9)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
