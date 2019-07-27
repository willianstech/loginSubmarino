package Testes;

import org.junit.Test;

import Funcoes.Cadastro;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class CTAcessarPagina {
	Cadastro cadastro = new Cadastro();

	@RuntimeType
	@Test

	public void sysout() throws Throwable {
		//System.out.println("Teste.123");
		cadastro.que_eu_estou_na_pagina_da_casas_bahia();
	}
}
