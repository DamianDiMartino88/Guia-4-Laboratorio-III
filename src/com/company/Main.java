package com.company;

import com.ClasesAbstractas.ClaseA;
import com.ClasesAbstractas.ClaseB;
import com.ClasesAbstractas.ClaseC;
import com.EmpresaXYZ.EAsalariado;
import com.EmpresaXYZ.EComision;
import com.EmpresaXYZ.Empleado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 1
        /*
            Lo q se imprimira por pantalla es:
            Métodos llamados con objeto b desde
            referencia de la clase A
            Método dinámico de clase B
            Método estático de la clase A
            Métodos llamados con objeto c desde
            referencia de la clase A
            Método dinámico de clase C
            Método estático de la clase A
         */
        ClaseA a = new ClaseA() {
            @Override
            public void dinamica() {

            }
        };
        ClaseB b = new ClaseB();
        ClaseC c= new ClaseC();

        System.out.print( "Métodos llamados con objeto b desde");
        System.out.println("referencia de la clase A");
        a = b;
        a.dinamica();
        a.estatica();
        System.out.print( "Métodos llamados con objeto c desde");
        System.out.println(" referencia de la clase A");
        a = c;
        a.dinamica();
        a.estatica();

        //Ejercicio 2
        EAsalariado EmpleadoAsalariado1 = new EAsalariado("569587A","Javier","Gomez",2008,1225);
        EAsalariado EmpleadoAsalariado2 = new EAsalariado();
        EComision EmpleadoComision1 = new EComision("695235B","Eva","Nieto",2010,179,8.10);
        EComision EmpleadoComision2 = new EComision();
        EmpleadoAsalariado2.setDNI("896325D");
        EmpleadoAsalariado2.setNombre("Maria");
        EmpleadoAsalariado2.setApellido("Nuñez");
        EmpleadoAsalariado2.setAnioIngreso(2013);
        EmpleadoAsalariado2.setSalarioFijoBase(1155);
        EmpleadoComision2.setDNI("741258C");
        EmpleadoComision2.setNombre("Jose");
        EmpleadoComision2.setApellido("Ruiz");
        EmpleadoComision2.setAnioIngreso(2012);
        EmpleadoComision2.setClientesCaptados(81);
        EmpleadoComision2.setMontoPorCliente(7.90);


        EmpleadoComision2.muestraEmpleados();
        EmpleadoComision2.sueldoMayor();


    }



}