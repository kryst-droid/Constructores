/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espesoftware.constructores;

/**
 *
 * @author labesp
 */
public class Constructores {

    public static void main(String[] args) {
        Empleado emp=new Empleado("Chasiquiza Cristofer");
        System.out.println(emp.getNombre());
        ///INSTANCIA DE RECTANGULOS
        Rectangulo rec = new Rectangulo (10, 20);
        System.out.println(rec.getAncho()* rec.getAltura());
        Rectangulo sqr = new Rectangulo (10);
        System.out.println(sqr.getAncho() * sqr.getAltura());
        
        ///////////////INSTANCIA DE VEHICULOS
        Vehiculo auto = new Vehiculo ();
        System.out.println(auto.getMarca());
        Vehiculo auto1 = new Vehiculo ("Mazda");
        System.out.println(auto1.getMarca());
        
        /////////////INSTANCIA ESTUDIANTE
        Estudiante est1 = new Estudiante ("Juanito");
        Estudiante est2 = new Estudiante (est1);
        System.out.println(est1.getNOmbre());
        System.out.println(est2.getNOmbre());
        
    }
}
