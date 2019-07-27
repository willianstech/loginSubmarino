package Testes;

import org.junit.Test;

import Funcoes.Cadastro;
import Funcoes.Inicial;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class CTAcessarPagina {
	Inicial inicial = new Inicial();
	Cadastro cadastro = new Cadastro();

	
	@Test
	
	
	public void sysout() throws Throwable {
		System.out.println("Teste.123");
		inicial.acessarPaginaInicial();
		cadastro.inserirDadosPaginaCadastro();
	}
}
