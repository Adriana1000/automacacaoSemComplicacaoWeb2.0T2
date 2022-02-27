package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursosPage;
import br.com.chronosacademy.pages.PrincipalPage;
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
    PrincipalPage principalPage;
    CursosPage cursosPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);


    }

    @Test
    public void primeiroTeste() {


        // String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String titulo = principalPage.getTitulo();
        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);


    }



    @Test
    public void segundoTeste() {
        cursosPage = new CursosPage(driver);
        principalPage.clickBotao();

        String cursos = cursosPage.getCursos();
        Assert.assertEquals("Conheça todos os nossos cursos",cursos);

        }



    @After
    public void finalizaTeste() {
        driver.quit();
    }
}


