package Testes;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcoes.Cadastro;
import Funcoes.Inicial;

public class CTPositivo {
	ChromeDriver browser = new ChromeDriver();
	Inicial inicial = new Inicial();
	Cadastro cadastro = new Cadastro();

	@Test

	public void sysout() throws Throwable {
		System.out.println("Teste.123");
		inicial.acessarPaginaInicial();
		cadastro.inserirDadosPaginaCadastro();
		browser.quit();
	}
}
