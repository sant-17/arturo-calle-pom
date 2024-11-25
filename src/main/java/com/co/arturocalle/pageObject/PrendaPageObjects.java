package com.co.arturocalle.pageObject;

import org.openqa.selenium.By;

public class PrendaPageObjects {
    private static By btnAgregarAlCarrito = By.xpath("//div/span[text()='Agregar al carrito']");
    private static By btnCarrito = By.xpath("//div[@role='presentation']/button");
    private static By btnFinalizaCompra = By.xpath("//button[@id='proceed-to-checkout']");

    public static By getBtnTallaPrenda(String tallaPrenda) {
        return By.xpath(String.format("//div[text()='%s']", tallaPrenda));
    }

    public static By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }

    public static By getBtnCarrito() {
        return btnCarrito;
    }

    public static By getBtnFinalizaCompra() {
        return btnFinalizaCompra;
    }

    public PrendaPageObjects() {
    }
}
