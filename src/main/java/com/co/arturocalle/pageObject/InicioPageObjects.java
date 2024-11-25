package com.co.arturocalle.pageObject;

import org.openqa.selenium.By;

public class InicioPageObjects {
    private static By btnVentanaBusqueda = By.xpath("//div/div[@role='presentation' and contains(@class,'lupa')]");
    private static By txtBusqueda = By.xpath("//input[@placeholder='¿QUÉ BUSCAS?']");
    private static By btnBusqueda = By.xpath("//button[@aria-label='Buscar Productos']");

    public static By getBtnVentanaBusqueda() {
        return btnVentanaBusqueda;
    }

    public static By getTxtBusqueda() {
        return txtBusqueda;
    }

    public static By getBtnBusqueda() {
        return btnBusqueda;
    }

    public InicioPageObjects() {
    }
}
