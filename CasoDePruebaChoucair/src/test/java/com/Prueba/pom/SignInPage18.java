package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage18 extends Base{
	
	By ComolohacemosLinkLocator18 = By.linkText("Cursos y Certificaciones");
	By registerPageLocator19 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/cursos-768x260.jpg.webp']");
	By ComolohacemosLinkLocator19 = By.linkText("Leer MásCursos y Certificaciones");

	public SignInPage18(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void signIn18() throws InterruptedException {
		click(ComolohacemosLinkLocator18);
		Thread.sleep(2000);
		click(ComolohacemosLinkLocator19);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator19)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
		
	}
}
