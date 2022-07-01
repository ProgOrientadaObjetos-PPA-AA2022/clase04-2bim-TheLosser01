/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    int numGalones;
    double costoGalon;
    double iva;
    double valorTotalG;

    public int getNumGalones() {
        return numGalones;
    }

    public void setNumGalones(int numGalones) {
        this.numGalones = numGalones;
    }

    public double getCostoGalon() {
        return costoGalon;
    }

    public void setCostoGalon(double costoGalon) {
        this.costoGalon = costoGalon;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = (0.1);
    }

    public double getValorTotalG() {
        return valorTotalG;
    }

    public void calcularValorTotalG(double vT) {
        valorTotalG = ((costoGalon * numGalones) + ((iva)*
                (costoGalon * numGalones)));
    }
    
    
}
