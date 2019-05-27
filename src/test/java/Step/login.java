package Step;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.jxc.gen.config.Config;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	private WebDriver browser;
	

	@Given("^Que eu estou na pagina do submarino$")
	public void queEuEstouNaPaginaDoSubmarino() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Support\\chromedriver.exe");
		
		browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		browser.get("https://www.submarino.com.br/");
		browser.manage().window().maximize();
	}

	@When("^acessar a pagina de login$")
	public void acessarAPaginaDeLogin() throws Throwable {

		Actions actions = new Actions(browser);
		WebElement minhaConta = browser.findElement(By.id("h_user"));
		actions.moveToElement(minhaConta).pause(2000);

		WebElement minhaContaEntrar = browser.findElement(By.id("h_usr-signin"));
		actions.moveToElement(minhaContaEntrar);
		actions.click().build().perform();

	}

	@When("^inserir meus dados$")
	public void inserirMeusDados() throws Throwable {
		browser.findElement(By.id("email-input")).sendKeys("willianstech@gmail.com");
		browser.findElement(By.id("password")).sendKeys("groovetech");

	}

	@When("^clicar em 'Continuar'$")
	public void clicarEmContinuar() throws Throwable {
		WebElement botaoClicar = browser.findElement(By.id("login-button"));
		botaoClicar.click();
	}

	@Then("^ira aparecer a informacao 'Ola Nome'$")
	public void iraAparecerAInformacaoOlaNome() throws Throwable {
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
	public void inserirMeusDadosIncorretos() throws Throwable {
		browser.findElement(By.id("email-input")).sendKeys("45893513822@gmail.com");
		browser.findElement(By.id("password")).sendKeys("653498w");
	}
	
	@Then("^ira aparecer a mensagem 'E-mail ou senha incorretos'$")
	public void iraAparecerAMensagemEMailOuSenhaIncorretos() throws Throwable {
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
