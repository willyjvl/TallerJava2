package com.clientes;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombreSub;
        String valorSub;
        String idAle;


        System.out.println("Procederemos a crear la lista de beneficios");
        System.out.println("Ingrese el nombre del subsidio");
        nombreSub = in.nextLine();
        System.out.println("Ingrese el valor del subsidio");
        valorSub = in.nextLine();
        idAle = getIdBeneficio();



	// write your code her

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */




    }

    /**
    * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
    * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
    * Abarcar los operadores terniarios para condiciones logicas
    * Operadores logicos
    * Operacionres aritmeticos
    **/



    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        Integer idcod = new Integer((int) Math.floor(Math.random()*99999+10000));
        //idcod = (int) Math.floor(Math.random()*99999+10000);
        //La Clase Math tiene varios metodos que te ayudaran
        return idcod.toString();
    }
}
