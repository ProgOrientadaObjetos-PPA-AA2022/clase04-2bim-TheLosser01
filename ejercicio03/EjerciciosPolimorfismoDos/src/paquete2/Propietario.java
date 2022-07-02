/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Propietario {

    String nombrePropietario;
    String apellidoPropietario;
    int edadPropietario;

    public Propietario(String nomProp, String apeProp, int edadProp) {
        nombrePropietario = nomProp;
        apellidoPropietario = apeProp;
        edadPropietario = edadProp;
    }

    public void establecerNombrePropietario(String nomProp) {
        nombrePropietario = nomProp;

    }
    
    public void establecerApellidoPropietario(String apeProp){
        apellidoPropietario = apeProp;
    }
    
    public void establecerEdadPropietario(int edadProp){
        edadPropietario = edadProp;
    }
    
    public String obtenerNombrePropietario(){
        return nombrePropietario;
    }
    
    public String obtenerApellidoPropietario(){
        return apellidoPropietario;
    }
    
     public int obtenerEdadPropietario(){
         return edadPropietario;
     }
    
}
