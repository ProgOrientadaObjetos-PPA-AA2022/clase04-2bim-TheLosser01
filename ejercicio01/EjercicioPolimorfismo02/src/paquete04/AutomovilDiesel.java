/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    int numLitros;
    double costoLitro;
    double descuentoLitros;
    double valorTotalD;

    public void establecernumLitros(int nL) {
        numLitros = nL;
    }

    public void establecercostoLitro(double cL) {
        costoLitro = cL;
    }

    public void establecerdescuentoLitros(double dL) {
        descuentoLitros = dL;
    }

    public void calcularvalorTotalD(double vT) {
        valorTotalD = ((costoLitro * (numLitros * descuentoLitros)));
    }
    
    public int obtenerNumLitros(){
        return numLitros;
    }
    
    public double obtenerCostoLitros(){
        return costoLitro;
    }
    
    public double obtenerdescuentoLitros(){
        return descuentoLitros;
    }
    
    public double obtenerValorTotal(){
        return valorTotalD;
    }
}
