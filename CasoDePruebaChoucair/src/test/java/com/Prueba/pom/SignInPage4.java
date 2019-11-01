package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage4 extends Base{
	
	By ComolohacemosLinkLocator4 = By.linkText("Pruebas Móviles");
	By registerPageLocator5 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/moviles-768x260.jpg.webp']");
	public SignInPage4(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn4() throws InterruptedException {
		click(ComolohacemosLinkLocator4);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator5)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
