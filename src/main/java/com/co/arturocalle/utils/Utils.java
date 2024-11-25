package com.co.arturocalle.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.arturocalle.driver.SeleniumWebDriver.driver;

public class Utils {

    public static void seleccionClick(By elemento) {
        driver.findElement(elemento).click();
    }

    public static void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos){
        WebDriverWait wait = new WebDriverWait(driver,tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public static void esperarElementoImplicito(Duration tiempoEsperaSegundos) {
        driver.manage().timeouts().implicitlyWait(tiempoEsperaSegundos);
    }

    public static void clickJavaScript(By elemento){
        WebElement element = driver.findElement(elemento);
        JavascriptExecutor jsExecutor = (JavascriptExecutor)  driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static void escrituraTexto(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }

    public static WebElement localizarFramePorXpath(By xpath) {
        return driver.findElement(xpath);
    }
}
