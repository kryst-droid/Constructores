/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espesoftware.constructores;

/**
 *
 * @author labesp
 */
public class Rectangulo {
    private int ancho;
    private int altura;
    
    public Rectangulo (int ancho, int altura){
        this.altura = altura;
        this.ancho = ancho;        
    }
    public Rectangulo (int lado){
        this.altura = lado;
        this.ancho = lado;
    
    }
    public int getAncho(){
    return ancho;

}
    public int getAltura(){
    return altura;

}
   
}
