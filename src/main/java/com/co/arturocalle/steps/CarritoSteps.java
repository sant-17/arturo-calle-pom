package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.CarritoPageObject;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class CarritoSteps {
    public CarritoSteps() {
    }

    @Step
    public void finalizarResumenDeCompra() {
        Utils.esperarElementoVisible(CarritoPageObject.getBtnAceptaTerminos(), Duration.ofSeconds(15));
        Utils.seleccionClick(CarritoPageObject.getBtnAceptaTerminos());
        Utils.seleccionClick(CarritoPageObject.getFinalizaCompraResumen());
    }
}
