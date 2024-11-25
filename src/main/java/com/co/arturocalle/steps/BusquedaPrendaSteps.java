package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.InicioPageObjects;
import com.co.arturocalle.utils.DatosExcel;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaPrendaSteps {
    public BusquedaPrendaSteps() {
    }

    @Step
    public void buscarPrenda() {
        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Prenda");

            Utils.seleccionClick(InicioPageObjects.getBtnVentanaBusqueda());
            Utils.escrituraTexto(InicioPageObjects.getTxtBusqueda(), dataExcel.get(0).get("Prenda"));
            Utils.seleccionClick(InicioPageObjects.getBtnBusqueda());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
