package com.clases;

import java.util.Objects;
import java.util.Random;
import java.lang.Math;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto

    private String id;
    private String nombre;
    private Float valorSubsidio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    //Completar clase
    public BeneficiosCovid19(String id, String name, Float valor){
        this.id = id;
        this.nombre = name;
        this.valorSubsidio = valor;
    }

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(BeneficiosCovid19 obj) {
        Float valor = obj.getValorSubsidio();
        Float valorlista1 = valorSubsidio;
        if (valor > valorlista1){
            return Float.valueOf(valor);
        }else{
            return Float.valueOf(valorlista1);
        }

    }

    public  String datos(){
        return  "ID: " + id+", Nombre Beneficio: " + nombre +", Valor subsidio: " + valorSubsidio;
    }
}
