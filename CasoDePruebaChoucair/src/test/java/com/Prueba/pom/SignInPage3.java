package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage3 extends Base{
	
	By ComolohacemosLinkLocator3 = By.linkText("Digital Performance Management");
	By registerPageLocator4 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/digtalper-1-768x260.jpg.webp']");

	public SignInPage3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn3() throws InterruptedException {
		click(ComolohacemosLinkLocator3);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator4)) {
			System.out.println("Parte Correcta de la Pagina");
		}
		else {
			System.out.println("Parte Incorrecta de la pagina");
		}
	}

}
