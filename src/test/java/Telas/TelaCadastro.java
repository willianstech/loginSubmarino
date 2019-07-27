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

public class TelaCadastro {

	ChromeDriver browser = new ChromeDriver();

	@When("^inserir meus dados$")
	public void inserir_meus_dados() throws Throwable {
		Robot robot = new Robot();

		// REALIZAR VALIDAÇÃO DE ELEMENTO "IDENTIFICAÇÃO"
//		WebElement mensagemEmail = browser.findElement(By.className("entrar-formError --zeroLeft"));
//		assertEquals("E-mail ou senha incorretos", mensagemEmail.getText());

		browser.findElement(By.id("NomeCompleto")).sendKeys("Aaaa aaa");
		browser.findElement(By.id("Cpf")).sendKeys("82608098932");
		browser.findElement(By.id("Telefone1DDDPF")).sendKeys("11");
		browser.findElement(By.id("Telefone2PF")).sendKeys("111111111");
		browser.findElement(By.id("DataNascimentoDia")).sendKeys("11");
		browser.findElement(By.id("DataNascimentoMes")).sendKeys("11");
		browser.findElement(By.id("DataNascimentoAno")).sendKeys("1111");
		browser.findElement(By.id("Sexo")).click();
		browser.findElement(By.id("Email")).sendKeys("11111@111.11");
		/*
		 * robot.keyPress(KeyEvent.VK_TAB); browser.findElementByName("")
		 */
		browser.findElement(By.id("ReceberAvisoEmail")).click();
		browser.findElement(By.id("ReceberAvisoSms")).click();
		browser.findElement(By.id("btnClienteSalvarComCaptcha")).click();
	}

	@When("^clicar em 'Continuar'$")
	public void clicar_em_Continuar() throws Throwable {
		browser.findElement(By.id("login-button")).click();
	}

	@Then("^ira aparecer a informacao 'Ola Nome'$")
	public void ira_aparecer_a_informacao_Ola_Nome() throws Throwable {
		WebElement botaoClicar = browser.findElement(By.id("login-button"));

		while ((botaoClicar.isEnabled())) {
			int i = 1000;
			Thread.sleep(i);
			if (!(botaoClicar.isDisplayed())) {
				WebElement mensagemEmail = browser.findElement(By.className("usr-nick"));
				assertEquals("Nome", mensagemEmail.getText());
				browser.quit();
				break;
			}
			i++;
		}
	}

	@When("^inserir meus dados incorretos$")
	public void inserir_meus_dados_incorretos() throws Throwable {
		browser.findElement(By.id("NomeCompleto")).sendKeys("Aaaaa aaaa");
		browser.findElement(By.id("Cpf")).sendKeys("82608098932");
		browser.findElement(By.id("Telefone1DDDPF")).sendKeys("11");
		browser.findElement(By.id("Telefone2PF")).sendKeys("111111111");
//		browser.findElement(By.id("DataNascimentoDia")).sendKeys("11");
		browser.findElement(By.id("DataNascimentoMes")).sendKeys("11");
		browser.findElement(By.id("DataNascimentoAno")).sendKeys("1111");
		browser.findElement(By.id("Sexo")).click();
		browser.findElement(By.id("Email")).sendKeys("11111@111.11");
		/*
		 * robot.keyPress(KeyEvent.VK_TAB); browser.findElementByName("")
		 */
		browser.findElement(By.id("ReceberAvisoEmail")).click();
		browser.findElement(By.id("ReceberAvisoSms")).click();
		browser.findElement(By.id("btnClienteSalvarComCaptcha")).click();
	}

	@Then("^ira aparecer a mensagem 'E-mail ou senha incorretos'$")
	public void ira_aparecer_a_mensagem_E_mail_ou_senha_incorretos() throws Throwable {
		WebElement botaoClicar = browser.findElement(By.id("login-button"));
		while ((botaoClicar.isEnabled())) {
			int i = 1000;
			Thread.sleep(i);
			if (!(botaoClicar.isDisplayed())) {
				WebElement mensagemEmail = browser.findElement(By.className("entrar-formError --zeroLeft"));
				assertEquals("E-mail ou senha incorretos", mensagemEmail.getText());
				browser.quit();
				break;
			}
			i++;
		}
	}

}
