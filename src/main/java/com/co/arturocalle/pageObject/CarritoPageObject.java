package com.co.arturocalle.pageObject;

import org.openqa.selenium.By;

public class CarritoPageObject {
    private static By btnAceptaTerminos = By.xpath("//input[@id='checboxAcceptTerms']");
    private static By FinalizaCompraResumen = By.xpath("//a[text()='Finalizar compra']");
    private static By lblPrendaEnCarrito = By.xpath("//td[@class='product-name']/a[contains(@id, 'product-name')]");

    public static By getBtnAceptaTerminos() {
        return btnAceptaTerminos;
    }

    public static By getFinalizaCompraResumen() {
        return FinalizaCompraResumen;
    }

    public static By getLblPrendaEnCarrito() {
        return lblPrendaEnCarrito;
    }

    public CarritoPageObject() {
    }
}
