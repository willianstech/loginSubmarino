package Funcoes;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;

import Telas.TelaCadastro;

public class Cadastro extends TelaCadastro {

	
	public void inserirDadosPaginaCadastro() throws Throwable {
		inserir_meus_dados();
		clicar_em_Continuar();
		ira_aparecer_a_informacao_Ola_Nome();
		inserir_meus_dados_incorretos();
	
	}
	public void inserirDadosIncorretos() throws Throwable {		
		inserir_meus_dados_incorretos();
		ira_aparecer_a_mensagem_E_mail_ou_senha_incorretos();
	}
}