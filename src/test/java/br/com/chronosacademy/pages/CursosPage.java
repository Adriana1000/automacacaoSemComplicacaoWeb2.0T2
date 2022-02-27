package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursosPage {
    WebDriver driver;

    public CursosPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCursos() {
        String xpathCursos= "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        WebElement txtCursos = driver.findElement(By.xpath(xpathCursos));
        return txtCursos.getText();
    }



}
