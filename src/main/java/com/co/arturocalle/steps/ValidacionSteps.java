package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.CarritoPageObject;
import com.co.arturocalle.pageObject.CatalogoPageObjects;
import com.co.arturocalle.pageObject.FacturacionPageObjects;
import com.co.arturocalle.utils.DatosExcel;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.co.arturocalle.driver.SeleniumWebDriver.driver;

public class ValidacionSteps {

    public ValidacionSteps() {
    }

    @Step
    public void validarPrendaEnCatalogo() {
        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");
            boolean prendaExiste = false;

            try {
                Utils.esperarElementoVisible(CatalogoPageObjects.getLblPrenda(dataExcel.get(0).get("Prenda")), Duration.ofSeconds(5));

                WebElement elementoPrenda = driver.findElement(CatalogoPageObjects.getLblPrenda(dataExcel.get(0).get("Prenda")));
                String prendaExtraida = elementoPrenda.getText();

                Assert.assertEquals("El texto de la prenda no coincide",
                        dataExcel.get(0).get("Prenda"),
                        prendaExtraida);
                prendaExiste = true;
            } catch (NoSuchElementException e) {
                prendaExiste = false;
            }

            Assert.assertTrue("La prenda no existe en el catálogo",
                    prendaExiste);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void validarPrendaEnCarrito() {
        Utils.esperarElementoVisible(CarritoPageObject.getLblPrendaEnCarrito(), Duration.ofSeconds(15));

        WebElement elementoPrenda = driver.findElement(CarritoPageObject.getLblPrendaEnCarrito());
        String prendaExtraidaCarrito = elementoPrenda.getText();

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");

            //Validando que el texto final contiene el nombre de la prenda
            Assert.assertTrue("El nombre de la prenda en la hoja de calculo no coincide con el de la prenda en el carrito",
                    prendaExtraidaCarrito.contains(dataExcel.get(0).get("Prenda")));

            //Validando que la talla de la prenda a comprar es la talla que especificamos en el excel
            Assert.assertEquals("La talla elegida en la hoja de excel no coincide con la talla en el carrito",
                    String.valueOf(prendaExtraidaCarrito.charAt(prendaExtraidaCarrito.length() - 1)), dataExcel.get(0).get("Talla"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void validarPrendaEnFacturacion() {
        Utils.esperarElementoVisible(FacturacionPageObjects.getLblFacturacion(), Duration.ofSeconds(15));

        WebElement elementoPrenda = driver.findElement(FacturacionPageObjects.getLblFacturacion());
        String prendaExtraidaFactura = elementoPrenda.getText();

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");

            //Validando que el texto final contiene el nombre de la prenda
            Assert.assertTrue("El nombre de la prenda en la hoja de calculo no coincide con el de la prenda en la factura",
                    prendaExtraidaFactura.contains(dataExcel.get(0).get("Prenda")));

            //Validando que la talla de la prenda a comprar es la talla que especificamos en el excel
            Assert.assertEquals("La talla elegida en la hoja de excel no coincide con la talla en la factura",
                    String.valueOf(prendaExtraidaFactura.charAt(prendaExtraidaFactura.length() - 1)),
                    dataExcel.get(0).get("Talla"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void validarDatosPersonalesEnFacturacion() {
        Utils.esperarElementoVisible(FacturacionPageObjects.getLblEmailCliente(), Duration.ofSeconds(15));

        WebElement elementoEmail = driver.findElement(FacturacionPageObjects.getLblEmailCliente());
        WebElement elementoNombreCompleto = driver.findElement(FacturacionPageObjects.getLblNombreCompletoCliente());

        String correoExtraidoFactura = elementoEmail.getText();
        String nombreExtraidoFactura = elementoNombreCompleto.getText();

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Facturacion");

            //Validando que el correo en la factura
            Assert.assertEquals("El email de la factura no coincide con el email del cliente",
                    dataExcel.get(0).get("Email"),
                    correoExtraidoFactura);

            //Validando el nombre en la factura
            Assert.assertEquals("El nombre de la factura no coincide con el nombre del cliente",
                    dataExcel.get(0).get("Nombre") + " " + dataExcel.get(0).get("Apellidos"),
                    nombreExtraidoFactura);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
