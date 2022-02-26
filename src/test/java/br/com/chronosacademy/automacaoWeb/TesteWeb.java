package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chronosacademy.com.br");



    }

    @Test
    public void primeiroTeste() {


       // String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElementByXPath(xpathTitulo);
        String titulo = txtTitulo.getText();
        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);

    }
    @After
    public  void finalizaTeste(){
        driver.quit();
    }
}
