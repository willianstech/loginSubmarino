package Telas;

import static org.junit.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelaInicial {

	ChromeDriver browser = new ChromeDriver();

	@Given("^Que eu estou na pagina da casas bahia$")
	public void que_eu_estou_na_pagina_da_casas_bahia() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Wesley\\Desktop\\WIllian\\cadastroCasasBahia\\chromedriver.exe");
		// ChromeDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		browser.get("https://www.casasbahia.com.br/");
		browser.manage().window().maximize();
		throw new PendingException();
	}

	@When("^acessar a pagina de cadastro$")
	public void acessar_a_pagina_de_cadastro() throws Throwable { // WebDriver browser = null;
		Actions actions = new Actions(browser);
		WebElement minhaConta = browser.findElement(By.id("h_user"));
		actions.moveToElement(minhaConta).pause(2000);

		WebElement minhaContaEntrar = browser.findElement(By.id("href=\"https://carrinho.casasbahia.com.br/Checkout?ReturnUrl=https://www.casasbahia.com.br#login\""));
		actions.moveToElement(minhaContaEntrar);
		actions.click().build().perform();
	}

}
