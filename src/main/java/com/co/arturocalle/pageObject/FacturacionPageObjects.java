package com.co.arturocalle.pageObject;

import org.openqa.selenium.By;

public class FacturacionPageObjects {

    private static By optTipoPersona = By.xpath("//select[@class='selectType']");
    private static By optTipoDocumento = By.xpath("//select[@class='selectTypeDocument']");
    private static By txtCorreo = By.xpath("//input[@id='client-email']");
    private static By txtNombre = By.xpath("//input[@id='client-first-name']");
    private static By txtApellido = By.xpath("//input[@id='client-last-name']");
    private static By txtNumeroDocumento = By.xpath("//input[@id='client-document']");
    private static By txtNumeroTelefono = By.xpath("//input[@id='client-phone']");
    private static By txtFechaNacimiento = By.xpath("//input[@id='birthday-client']");
    private static By btnMedotoEntrega = By.xpath("//button[@id='go-to-shipping']");
    private static By optDepartamento = By.xpath("//select[@id='ship-state']");
    private static By optMunicipio = By.xpath("//select[@id='ship-city']");
    private static By txtDireccionEntrega = By.xpath("//input[@id='ship-street']");
    private static By txtBarrio = By.xpath("//input[@id='ship-neighborhood']");
    private static By txtInfoAdicional = By.xpath("//input[@id='ship-complement']");
    private static By txtDestinatario = By.xpath("//input[@id='ship-receiverName']");
    private static By btnMetodoPago = By.xpath("//button[@id='btn-go-to-payment']");
    private static By btnPagoContraEntrega = By.xpath("//label[@id='Pago contra entrega']");
    private static By iFrameTarjetaCredito = By.xpath("//div[@id=\"iframe-placeholder-creditCardPaymentGroup\"]/iframe[contains(@src, 'https://io.vtexpayments.com.br/card-ui/1.34.0/index.html')]");
    private static By txtNumeroTarjeta = By.xpath("//input[@name='cardNumber']");
    private static By txtNombreTarjeta = By.xpath("//input[@name='ccName']");
    private static By optCuotas = By.xpath("//select[@id='creditCardpayment-card-0Brand']");
    private static By optMesVencimientoTarjets = By.xpath("//select[@id='creditCardpayment-card-0Month']");
    private static By optAAVencimientoTarjeta = By.xpath("//select[@id='creditCardpayment-card-0Year']");
    private static By txtCodigoSeguridad = By.xpath("//input[@id='creditCardpayment-card-0Code']");
    private static By lblFacturacion = By.xpath("//span[@class='fn product-name']");
    private static By lblEmailCliente = By.xpath("//p/span[@class='email']");
    private static By lblNombreCompletoCliente = By.xpath("//p/span[@class='name']");

    public static By getOptTipoPersona() {
        return optTipoPersona;
    }

    public static By getBtnTipoPersona(String tipoPersona) {
        return By.xpath(String.format("//option[@value='%s']", tipoPersona));
    }

    public static By getOptTipoDocumento() {
        return optTipoDocumento;
    }

    public static By getBtnTipoDocumento(String tipoDocumento) {
        return By.xpath(String.format("//option[@value='%s']", tipoDocumento));
    }

    public static By getTxtCorreo() {
        return txtCorreo;
    }

    public static By getTxtNombre() {
        return txtNombre;
    }

    public static By getTxtApellido() {
        return txtApellido;
    }

    public static By getTxtNumeroDocumento() {
        return txtNumeroDocumento;
    }

    public static By getTxtNumeroTelefono() {
        return txtNumeroTelefono;
    }

    public static By getTxtFechaNacimiento() {
        return txtFechaNacimiento;
    }

    public static By getBtnMedotoEntrega() {
        return btnMedotoEntrega;
    }

    public static By getOptDepartamento() {
        return optDepartamento;
    }

    public static By getBtnDepartamento(String departamento) {
        return By.xpath(String.format("//option[@value='%s']", departamento));
    }

    public static By getOptMunicipio() {
        return optMunicipio;
    }

    public static By getBtnMedellin(String municipio) {
        return By.xpath(String.format("//option[@value='%s']", municipio));
    }

    public static By getTxtDireccionEntrega() {
        return txtDireccionEntrega;
    }

    public static By getTxtBarrio() {
        return txtBarrio;
    }

    public static By getTxtInfoAdicional() {
        return txtInfoAdicional;
    }

    public static By getTxtDestinatario() {
        return txtDestinatario;
    }

    public static By getBtnMetodoPago() {
        return btnMetodoPago;
    }

    public static By getTxtNumeroTarjeta() {
        return txtNumeroTarjeta;
    }

    public static By getTxtNombreTarjeta() {
        return txtNombreTarjeta;
    }

    public static By getiFrameTarjetaCredito() {
        return iFrameTarjetaCredito;
    }

    public static By getOptCuotas() {
        return optCuotas;
    }

    public static By getBtnCuota(String cuota) {
        return By.xpath(String.format("//option[@value='%s']", cuota));
    }

    public static By getOptMesVencimientoTarjets() {
        return optMesVencimientoTarjets;
    }

    public static By getBtnMesVencimiento(String numeroMes) {
        return By.xpath(String.format("//option[@value='%s']", numeroMes));
    }

    public static By getOptAAVencimientoTarjeta() {
        return optAAVencimientoTarjeta;
    }

    public static By getBtnAAVencimiento(String aaVencimiento) {
        return By.xpath(String.format("//option[@value='%s']", aaVencimiento));
    }

    public static By getTxtCodigoSeguridad() {
        return txtCodigoSeguridad;
    }

    public static By getLblFacturacion() {
        return lblFacturacion;
    }

    public static By getLblEmailCliente() {
        return lblEmailCliente;
    }

    public static By getLblNombreCompletoCliente() {
        return lblNombreCompletoCliente;
    }

    public FacturacionPageObjects() {
    }
}
