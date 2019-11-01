package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage9 extends Base{
	
	By ComolohacemosLinkLocator9 = By.linkText("Pruebas de Migración");
	By registerPageLocator10 = By.xpath("///img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/migracuion-768x260.jpg.webp']");

	public SignInPage9(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn9() throws InterruptedException {
		click(ComolohacemosLinkLocator9);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator10)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
