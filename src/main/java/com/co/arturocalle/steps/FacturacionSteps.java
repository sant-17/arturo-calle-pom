package com.co.arturocalle.steps;

import com.co.arturocalle.pageObject.FacturacionPageObjects;
import com.co.arturocalle.utils.DatosExcel;
import com.co.arturocalle.utils.Utils;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.co.arturocalle.driver.SeleniumWebDriver.driver;

public class FacturacionSteps {

    @Step
    public void facturacion() {
        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Facturacion");

            Utils.seleccionClick(FacturacionPageObjects.getOptTipoPersona());
            Utils.seleccionClick(FacturacionPageObjects.getBtnTipoPersona(dataExcel.get(0).get("Tipo Persona")));

            Utils.seleccionClick(FacturacionPageObjects.getOptTipoDocumento());
            Utils.seleccionClick(FacturacionPageObjects.getBtnTipoDocumento(dataExcel.get(0).get("Tipo Documento")));

            Utils.escrituraTexto(FacturacionPageObjects.getTxtCorreo(), dataExcel.get(0).get("Email"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtNombre(), dataExcel.get(0).get("Nombre"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtApellido(), dataExcel.get(0).get("Apellidos"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtNumeroDocumento(), dataExcel.get(0).get("Numero Documento"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtNumeroTelefono(), dataExcel.get(0).get("Numero Telefono"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtFechaNacimiento(), dataExcel.get(0).get("Fecha Nacimiento"));

            Utils.esperarElementoInteractuable(FacturacionPageObjects.getBtnMedotoEntrega(), Duration.ofSeconds(15));
            Utils.seleccionClick(FacturacionPageObjects.getBtnMedotoEntrega());

            Utils.seleccionClick(FacturacionPageObjects.getOptDepartamento());
            Utils.seleccionClick(FacturacionPageObjects.getBtnDepartamento(dataExcel.get(0).get("Departamento")));
            Utils.seleccionClick(FacturacionPageObjects.getOptMunicipio());
            Utils.seleccionClick(FacturacionPageObjects.getBtnMedellin(dataExcel.get(0).get("Municipio")));

            Utils.esperarElementoVisible(FacturacionPageObjects.getTxtDireccionEntrega(), Duration.ofSeconds(15));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtDireccionEntrega(), dataExcel.get(0).get("Direccion"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtBarrio(), dataExcel.get(0).get("Barrio"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtInfoAdicional(), dataExcel.get(0).get("Info Adicional"));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtDestinatario(), dataExcel.get(0).get("Destinatario"));

            Utils.esperarElementoInteractuable(FacturacionPageObjects.getBtnMetodoPago(), Duration.ofSeconds(10));
            Utils.seleccionClick(FacturacionPageObjects.getBtnMetodoPago());
            Utils.esperarElementoImplicito(Duration.ofSeconds(10));

            driver.switchTo().frame(Utils.localizarFramePorXpath(FacturacionPageObjects.getiFrameTarjetaCredito()));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtNumeroTarjeta(), dataExcel.get(0).get("Numero Tarjeta"));
            Utils.esperarElementoImplicito(Duration.ofSeconds(10));
            Utils.seleccionClick(FacturacionPageObjects.getOptCuotas());
            Utils.seleccionClick(FacturacionPageObjects.getBtnCuota(dataExcel.get(0).get("Cuotas")));
            Utils.esperarElementoInteractuable(FacturacionPageObjects.getTxtNombreTarjeta(), Duration.ofSeconds(15));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtNombreTarjeta(), dataExcel.get(0).get("Nombre Tarjeta"));
            Utils.seleccionClick(FacturacionPageObjects.getOptMesVencimientoTarjets());
            Utils.esperarElementoImplicito(Duration.ofSeconds(10));
            Utils.seleccionClick(FacturacionPageObjects.getBtnMesVencimiento(dataExcel.get(0).get("Mes Vencimiento")));
            Utils.seleccionClick(FacturacionPageObjects.getOptAAVencimientoTarjeta());
            Utils.seleccionClick(FacturacionPageObjects.getBtnAAVencimiento(dataExcel.get(0).get("Año Vencimiento")));
            Utils.escrituraTexto(FacturacionPageObjects.getTxtCodigoSeguridad(), dataExcel.get(0).get("Codigo Seguridad"));

            driver.switchTo().defaultContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
