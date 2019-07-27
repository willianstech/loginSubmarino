package Telas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TelaInicial {

	ChromeDriver browser = new ChromeDriver();

	@Given("^Que eu estou na pagina da casas bahia$")
	public void que_eu_estou_na_pagina_da_casas_bahia() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Wesley\\Desktop\\WIllian\\cadastroCasasBahia\\chromedriver.exe");
		// ChromeDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		browser.get("https://carrinho.casasbahia.com.br/Checkout?ReturnUrl=https://www.casasbahia.com.br#login\\");
		browser.manage().window().maximize();
		throw new PendingException();
	}

//	@When("^acessar a pagina de cadastro$")
//	public void acessar_a_pagina_de_cadastro() throws Throwable { 
//		
//		Actions actions = new Actions(browser);
////		WebElement minhaConta = browser.findElement(By.id("lnkCadastreSe"));
////		actions.moveToElement(minhaConta).pause(1000);
//
//		WebElement minhaContaEntrar = browser.findElement(By.id("href=\"https://carrinho.casasbahia.com.br/Checkout?ReturnUrl=https://www.casasbahia.com.br#login\""));
//		actions.moveToElement(minhaContaEntrar);
//		actions.click().build().perform();	
//		
//		
//		
//	}

}
