/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected double valorVehiculo;

    public Automovil(String nP, String p, double vH) {
        nombrePropietario = nP;
        placa = p;
        valorVehiculo = vH;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nNombre Propietario: %s"
                + "\nPlaca: %s"
                + "\nValor Vehiculo: %.2f", 
                nombrePropietario,
                placa,
                valorVehiculo);
        return cadena;
    }

}
