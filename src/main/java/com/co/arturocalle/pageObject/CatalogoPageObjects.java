package com.co.arturocalle.pageObject;

import org.openqa.selenium.By;

public class CatalogoPageObjects {

    public static By getBtnPrenda(String textoPrenda) {
        return By.xpath(String.format("//h3/span[text()='%s']", textoPrenda));
    }

    public static By getLblPrenda(String textoPrenda) {
        String prendaKebabCase = textoPrenda.toLowerCase().replaceAll("\\s", "-");
        return By.xpath(String.format("//a[contains(@href, '%s')]/article/div/h3/span", prendaKebabCase));
    }

    public CatalogoPageObjects() {
    }
}
