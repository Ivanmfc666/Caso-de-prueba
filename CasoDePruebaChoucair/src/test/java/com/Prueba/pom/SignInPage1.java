package com.Prueba.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage1 extends Base{
	
	By ComolohacemosLinkLocator1 = By.linkText("Cómo lo hacemos");
	By registerPageLocator2 = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/BCT_ULTIMO-02-02.jpg']");

	public SignInPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signIn() throws InterruptedException {
		click(ComolohacemosLinkLocator1);
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator2)) {
			System.out.println("Pagina Correcta");
		}
		else {
			System.out.println("Pagina Incorrecta");
		}
	}
}
