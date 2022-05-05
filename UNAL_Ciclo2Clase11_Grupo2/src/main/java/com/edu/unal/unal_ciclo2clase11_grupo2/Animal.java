/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2clase11_grupo2;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    public String nombre;
    public int edad;
    
    public Animal(String s, int i){
        this.nombre=s;
        this.edad=i;
    
    }
    
    public String saludo(){
    return "Hola, soy "+nombre+" y tengo "+edad+" años";
    }
    
}
