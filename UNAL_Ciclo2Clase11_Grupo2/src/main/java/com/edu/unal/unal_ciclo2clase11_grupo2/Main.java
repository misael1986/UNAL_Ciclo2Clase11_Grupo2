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
public class Main {

    public static void main(String[] args) {
        /*
        Caja caja = new Caja();
        Caja cajax = new Caja();
        
        String s = caja.decorar(134165);
        System.out.println(s);

        String s2 = caja.decorar(-20.34);
        System.out.println(s2);

        String s3 = caja.decorar("Pedro Paramo");
        System.out.println(s3);
        
        String sx = caja.decorar(cajax);
        System.out.println(sx);
         */

 /*
        
        Caja caja = new Caja("Pedro Paramo");
        System.out.println(caja.decorar());
        System.out.println(caja.obtener());
        
        Caja caja2 = new Caja(56.87);
        System.out.println(caja2.decorar());
        System.out.println(caja2.obtener());
        
        Caja caja3 = new Caja(caja);
        System.out.println(caja3.decorar());
        System.out.println(caja3.obtener());
        
        char c=caja.obtener().charAt(2);//Se PERDIO EL CONOCIMIENMTO
        char c2=String.valueOf(caja.obtener()).charAt(2);
        char c3=((String)caja.obtener()).charAt(2);

         */
        Caja<String> caja = new Caja<String>("Pedro Paramo");
        System.out.println(caja.decorar());
        char c = caja.obtener().charAt(2);
        System.out.println(c);

        Caja<Double> caja2 = new Caja<Double>(20.34);
        System.out.println(caja2.decorar());
        double y = caja2.obtener() + 20.0;
        System.out.println(y);

        Pareja<Integer, String> pareja
                = new Pareja<Integer, String>(20, "Pedro Paramo");
        System.out.println(pareja);
        Integer i = pareja.clave() + 10;
        System.out.println(i);
        System.out.println(pareja.valor().charAt(2));
        
        Pareja<String, Boolean> pareja2 = 
                new Pareja<String, Boolean> ("Casado", false);
        System.out.println(pareja2);
        
        Animal animal= new Animal("Spike",9);
        Caja<Animal> an= new Caja<Animal>(animal);
        System.out.println(an.obj.saludo());
        
        Perro firulais= new Perro("Firulais",3);
        Caja<Perro> fi= new Caja<Perro>(firulais);
        System.out.println(fi.obj.saludo());
    }
}
