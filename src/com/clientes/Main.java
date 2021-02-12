package com.clientes;

import com.clases.BeneficiosCovid19;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import javax.xml.crypto.Data;
import java.util.*;
import java.lang.Math;


public class Main {
    public static ArrayList<BeneficiosCovid19> ListaBeneficios1 = new ArrayList<>();
    public static void main(String[] args) {

        ListaBeneficios1.add(new BeneficiosCovid19(getIdBeneficio(),"Beneficio Covid19 Desempleo", (float) 500000.00));
        ListaBeneficios1.add(new BeneficiosCovid19(getIdBeneficio(),"Beneficio Covid19 Enfermedad", (float) 200000.00));
      // Se invoca metodo Void para imprimir el listado
        ImprimirListado();

    }

    public static void ImprimirListado() {
        // se imprime los dos beneficios previamentes cargados a la lista
        System.out.println("Beneficio 1 = " + ListaBeneficios1.get(0).datos());
        System.out.println("Beneficio 2 = " + ListaBeneficios1.get(1).datos());
        // se invoca el metodo getMejorbeneficios para obetener el mejor beneficio cargado
        Float mejorben = ListaBeneficios1.get(0).getMejorbeneficios(ListaBeneficios1.get(1));
        System.out.println("El Mejor Beneficio es monto de: " + mejorben);
        // se obtiene informacion de la lista segun lo devuelto en el metodo getMejorbeneficios
        int pos = -1;
        for (int i = 0; i < ListaBeneficios1.size() ; i++) {
           int resul = Float.compare(mejorben, ListaBeneficios1.get(i).getValorSubsidio());
           if(resul == 0){
                pos = i;
           }
        }
        System.out.println("El mismo corresponde al siguiente Beneficio: " +
                "Id: " +ListaBeneficios1.get(pos).getId() +
                ", Nombre: " + ListaBeneficios1.get(pos).getNombre());
    }

    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        Integer idcod = new Integer((int) Math.floor(Math.random()*99999+10000));
        return idcod.toString();
    }
}
