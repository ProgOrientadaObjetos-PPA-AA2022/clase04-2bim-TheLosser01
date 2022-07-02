/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Arriendo;
import paquete2.Propietario;

/**
 *
 * @author reroes
 */
public class ArriendoLocalSesiones extends Arriendo {

    protected double valorSillas;
    protected double valorAmplificacion;

    public ArriendoLocalSesiones(Propietario arrendatario, double cuotaB) {
        super(arrendatario, cuotaB);
    }
    
    public ArriendoLocalSesiones(Propietario arrendatario, double cuotaB, double vS,
            double vAm) {
        super(arrendatario, cuotaB);
        valorSillas = vS;
        valorAmplificacion = vAm; 
    }

    public void establecerValorSillas(double x) {
        valorSillas = x;
    }

    public void establecerValorAmplificacion(double x) {
        valorAmplificacion = x;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = obtenerCuotaBase() + obtenerValorSillas()
                + obtenerValorAmplificacion();
    }

    public double obtenerValorSillas() {
        return valorSillas;
    }

    public double obtenerValorAmplificacion() {
        return valorAmplificacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Ariendo de Local Sesiones\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerArrendatario(),
                obtenerCuotaBase(),
                obtenerValorSillas(),
                obtenerValorAmplificacion(),
                obtenerArriendoMensual());

        return cadena;
    }
}
