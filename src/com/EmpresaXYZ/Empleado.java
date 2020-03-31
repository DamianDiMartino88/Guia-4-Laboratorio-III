package com.EmpresaXYZ;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Empleado {
    private String DNI;
    private String Nombre;
    private String Apellido;
    private int AnioIngreso;
    private static int CantidadEmpleados;
    private static List<Empleado> Empleados = new ArrayList<>();


    public Empleado(){
        this.DNI="";
        this.Nombre="";
        this.Apellido="";
        this.AnioIngreso=1900;
        CantidadEmpleados++;
        this.Empleados.add(this);
    }

    public Empleado(String dni, String nombre, String apellido, int anioIngreso){
        this.DNI=dni;
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.AnioIngreso=anioIngreso;
        CantidadEmpleados++;
        this.Empleados.add(this);
    }

    public int getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        CantidadEmpleados = cantidadEmpleados;
    }

    public abstract double obtenerSalario();
    public abstract void imprimir();

    public void muestraEmpleados() {
        for (Empleado e : this.Empleados) {
            System.out.println("Nombre: " + e.getNombre() + ", Apellido: " + e.Apellido + ", DNI: " + e.DNI + ", Antiguedad: " + (e.getAntiguedad()) + ", Salario: $" + e.obtenerSalario());
        }
    }

    public void sueldoMayor(){
        Empleado mayor=null;
        for (Empleado e : this.Empleados) {
            if(mayor==null){
                mayor=e;
            }else if(mayor.obtenerSalario()<e.obtenerSalario()){
                mayor=e;
            }
        }
        System.out.println("El Empleado de Mayor Salario Es: " + mayor.getNombre() + " " + mayor.Apellido + ", Con un Salario De: $" + mayor.obtenerSalario());
    }

    public int getAntiguedad(){
        int FechaActual = Calendar.getInstance().get(Calendar.YEAR);
        return (FechaActual-this.AnioIngreso);

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getAnioIngreso() {
        return AnioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        AnioIngreso = anioIngreso;
    }
}
