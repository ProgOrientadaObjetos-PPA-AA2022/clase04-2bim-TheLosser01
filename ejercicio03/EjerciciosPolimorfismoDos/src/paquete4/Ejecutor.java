/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import paquete2.Arriendo;
import paquete2.Propietario;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor {
    public static void main(String[] args) {
        
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        Propietario prop1 = new Propietario("Christian","Shepherd", 25);
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                prop1, 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        Propietario prop2 = new Propietario("Andrew","Schroeder", 26);
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                prop2, 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        Propietario prop3 = new Propietario("Angela","Watson", 26);
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                prop3, 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }
        
        CentroComercial centro = new CentroComercial("La Pradera", 
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);
    
    }
}
