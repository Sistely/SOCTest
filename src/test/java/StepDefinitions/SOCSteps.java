package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SOCSteps {

	WebDriver driver;

	@Given("que esteja no blog da SOC")
	public void que_esteja_no_blog_da_soc() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sistely/eclipse-workspace/ProvaSOC/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.soc.com.br/blog/");
	}

	@When("preencher campo de pesquisa")
	public void preencher_campo_de_pesquisa() {
		driver.findElement(By.linkText("Aceitar cookies")).click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input"))
				.sendKeys("teste");
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/button"))
				.sendKeys("teste");
	}

	@When("pressionar botão de pesquisa")
	public void pressionar_botão_de_pesquisa() {
		driver.findElement(By.className("elementor-search-form__submit")).click();
	}

	@Then("será redirecionado para página contendo resultados da pesquisa")
	public void será_redirecionado_para_página_contendo_resultados_da_pesquisa() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.soc.com.br/?s=teste", url);
	}

	@Given("que esteja no site da SOC")
	public void que_esteja_no_site_da_soc() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sistely/eclipse-workspace/ProvaSOC/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.soc.com.br/");
	}

	@Given("clicar no submenu Soluções")
	public void clicar_no_submenu_soluções() {
		driver.findElement(By.linkText("Soluções")).click();
	}

	@Given("clicar na opção SOCNET")
	public void clicar_na_opção_socnet() {
		driver.findElement(By.linkText("SOCNET")).click();
	}

	@When("clicar no botão Buscar credenciados")
	public void clicar_no_botão_buscar_credenciados() {
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[4]/div/div/a"))
				.click();
	}

	@When("preencher filtros de pesquisa")
	public void preencher_filtros_de_pesquisa() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.ipt-busca-credenciado-2"))).click();

		String inputText = "11310441";
		WebElement myElement = driver.findElement(By.id("ipt-busca-credenciado-2"));
		String js = "arguments[0].setAttribute('value','" + inputText + "')";
		((JavascriptExecutor) driver).executeScript(js, myElement);

		driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11310441");
	}

	@When("clicar no botão de pesquisa")
	public void clicar_no_botão_de_pesquisa() {
		driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/div[1]/form/button[2]")).click();
	}

	@Then("retorna redes credenciadas")
	public void retorna_redes_credenciadas() {
		driver.findElement(By.className("center btn-estreito")).click();
	}

	@Then("exibe perfil selecionado")
	public void exibe_perfil_selecionado() {
		String perfil = driver.getCurrentUrl();
		Assert.assertEquals("https://socnet.soc.com.br/perfil", perfil);
	}

}
