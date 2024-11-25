package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.CatalogoPageObjects;
import com.co.arturocalle.utils.DatosExcel;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class CatalogoSteps {

    public CatalogoSteps() {
    }

    @Step
    public void seleccionarPrenda() {
        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");

            Utils.esperarElementoVisible(CatalogoPageObjects.getBtnPrenda(dataExcel.get(0).get("Prenda")), Duration.ofSeconds(15));
            Utils.clickJavaScript(CatalogoPageObjects.getBtnPrenda(dataExcel.get(0).get("Prenda")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
