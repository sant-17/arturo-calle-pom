package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.PrendaPageObjects;
import com.co.arturocalle.utils.DatosExcel;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class PrendaSteps {

    public PrendaSteps() {
    }

    @Step
    public void seleccionarTallaDePrenda() {
        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");

            Utils.esperarElementoVisible(PrendaPageObjects.getBtnTallaPrenda(dataExcel.get(0).get("Talla")), Duration.ofSeconds(15));
            Utils.clickJavaScript(PrendaPageObjects.getBtnTallaPrenda(dataExcel.get(0).get("Talla")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void agregarAlCarrito() {
        Utils.clickJavaScript(PrendaPageObjects.getBtnAgregarAlCarrito());
        Utils.clickJavaScript(PrendaPageObjects.getBtnCarrito());
        Utils.esperarElementoVisible(PrendaPageObjects.getBtnFinalizaCompra(), Duration.ofSeconds(15));
        Utils.seleccionClick(PrendaPageObjects.getBtnFinalizaCompra());
    }
}
