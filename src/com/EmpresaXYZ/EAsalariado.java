package com.EmpresaXYZ;

import java.util.Calendar;
import java.util.Date;

public class EAsalariado extends Empleado {
    private double Porcentaje;
    private double SalarioFijoBase;
    private double SalarioFijoPorAntiguedad;

    public EAsalariado(){
        super();
        this.Porcentaje=0;
        this.SalarioFijoBase=0;
        this.SalarioFijoPorAntiguedad=0;
    }
    public EAsalariado(String dni, String nombreEmpleado, String apellidoEmpleado, int anioDeingreso, double salarioFijoBase){
        super(dni,nombreEmpleado,apellidoEmpleado,anioDeingreso);
        int FechaActual = Calendar.getInstance().get(Calendar.YEAR);
        this.Porcentaje=(FechaActual-this.getAnioIngreso()>=2&&FechaActual-this.getAnioIngreso()<=3)?0.05
                        :(FechaActual-this.getAnioIngreso()>3&&FechaActual-this.getAnioIngreso()<=7)?0.1
                        :(FechaActual-this.getAnioIngreso()>=8&&FechaActual-this.getAnioIngreso()<=15)?0.15
                        :(FechaActual-this.getAnioIngreso()>15)?0.20:0;
        this.SalarioFijoBase=salarioFijoBase;
        this.SalarioFijoPorAntiguedad=salarioFijoBase*(1+Porcentaje);
    }


    public double obtenerSalario() {
        return SalarioFijoBase;
    }

    public void imprimir(){
        System.out.println("Nombre: " + this.getNombre() + ", Apellido: " + this.getApellido() + ", DNI: " + this.getDNI()+ ", Antiguedad: " + this.getAntiguedad() + ", Salario: $" + this.obtenerSalario());

    }

    public void setSalarioFijoBase(double salarioFijoBase) {
        SalarioFijoBase = salarioFijoBase;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }


    public double getSalarioFijoPorAntiguedad() {
        return SalarioFijoPorAntiguedad;
    }
}
