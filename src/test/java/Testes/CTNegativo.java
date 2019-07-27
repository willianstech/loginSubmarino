package Testes;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcoes.Cadastro;
import Funcoes.Inicial;

public class CTNegativo {
	ChromeDriver browser = new ChromeDriver();
	Inicial inicial = new Inicial();
	Cadastro cadastro = new Cadastro();

	@Test

	public void sysout() throws Throwable {
		
		inicial.acessarPaginaInicial();		
		cadastro.inserirDadosIncorretos();
		browser.quit();
		
		
		
		
	}
}
