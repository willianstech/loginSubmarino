package Telas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelaCadastro {

	@Given("^Que eu estou na pagina da casas bahia$")
	public void que_eu_estou_na_pagina_da_casas_bahia() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wesley\\Desktop\\WIllian\\cadastroCasasBahia\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		browser.get("https://carrinho.casasbahia.com.br/Checkout?Pagina=cadastrar&ReturnUrl=https://carrinho.casasbahia.com.br#login/");
		browser.manage().window().maximize();
		throw new PendingException();
	}

	@When("^acessar a pagina de cadastro$")
	public void acessar_a_pagina_de_cadastro() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^inserir meus dados$")
	public void inserir_meus_dados() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^clicar em 'Continuar'$")
	public void clicar_em_Continuar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^ira aparecer a informacao 'Ola Nome'$")
	public void ira_aparecer_a_informacao_Ola_Nome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^inserir meus dados incorretos$")
	public void inserir_meus_dados_incorretos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^ira aparecer a mensagem 'E-mail ou senha incorretos'$")
	public void ira_aparecer_a_mensagem_E_mail_ou_senha_incorretos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
