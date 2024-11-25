package com.co.arturocalle.stepDefinitions;

import com.co.arturocalle.driver.SeleniumWebDriver;
import com.co.arturocalle.steps.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinition {

    @Steps
    BusquedaPrendaSteps busquedaPrendaSteps = new BusquedaPrendaSteps();

    @Steps
    CatalogoSteps catalogoSteps = new CatalogoSteps();

    @Steps
    PrendaSteps prendaSteps = new PrendaSteps();

    @Steps
    CarritoSteps carritoSteps = new CarritoSteps();

    @Steps
    FacturacionSteps facturacionSteps = new FacturacionSteps();

    @Steps
    ValidacionSteps validacionSteps = new ValidacionSteps();

    @Dado("Estoy en el menu de Arturo Calle")
    public void estoyEnElMenuDeArturoCalle() {
        SeleniumWebDriver.chromeDrive("https://www.arturocalle.com/");
    }

    @Cuando("Busco una prenda")
    public void buscoUnaPrenda() {
        busquedaPrendaSteps.buscarPrenda();
    }

    @Cuando("Seleciono una prenda para agregar al carrito")
    public void selecionoUnaPrendaParaAgregarAlCarrito() {
        validacionSteps.validarPrendaEnCatalogo();
        catalogoSteps.seleccionarPrenda();
        prendaSteps.seleccionarTallaDePrenda();
        prendaSteps.agregarAlCarrito();
    }

    @Entonces("Visualizare la ventana de facturacion")
    public void visualizareLaVentanaDeFacturacion() {
        validacionSteps.validarPrendaEnCarrito();
        carritoSteps.finalizarResumenDeCompra();
        facturacionSteps.facturacion();
        validacionSteps.validarPrendaEnFacturacion();
        validacionSteps.validarDatosPersonalesEnFacturacion();
    }
}
