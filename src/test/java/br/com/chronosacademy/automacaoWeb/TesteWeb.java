package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://chronosacademy.com.br");



    }

    @Test
    public void primeiroTeste() {


        // String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);


    }

    @Test
    public void segundoTeste() {
        String xpathBotao = "//div[3]//div[2]//a";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();

        String xpathCursos= "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        WebElement txtCursos = driver.findElement(By.xpath(xpathCursos));
        String cursos = txtCursos.getText();
        Assert.assertEquals("Conheça todos os nossos cursos",cursos);

        }


    @After
    public void finalizaTeste() {
        driver.quit();
    }
}


