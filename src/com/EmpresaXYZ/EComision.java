package com.EmpresaXYZ;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class EComision extends Empleado {
    private int ClientesCaptados;
    private double MontoPorCliente;
    private double ComisionTotal;
    private double SalarioBase;
    private double SalarioTotal;

    public EComision(){
        super();
        this.ClientesCaptados=0;
        this.MontoPorCliente=0;
        this.ComisionTotal=0;
        this.SalarioBase=750;
        this.SalarioTotal=0;
    }

    public EComision(String dni, String nombreEmpleado, String apellidoEmpleado, int anioDeingreso,int clientesCaptados, double montoPorCliente){
        super(dni,nombreEmpleado,apellidoEmpleado,anioDeingreso);
        this.ClientesCaptados=clientesCaptados;
        this.MontoPorCliente=montoPorCliente;
        this.ComisionTotal=(montoPorCliente*clientesCaptados);
        this.SalarioBase=750;
        this.SalarioTotal=((this.ComisionTotal)>SalarioBase)?(this.ComisionTotal+SalarioBase):(this.ComisionTotal+0);
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.ClientesCaptados = clientesCaptados;
        this.ComisionTotal=(this.MontoPorCliente*this.ClientesCaptados);
        this.SalarioTotal=((this.ComisionTotal)>SalarioBase)?(this.ComisionTotal+SalarioBase):(this.ComisionTotal+0);
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.MontoPorCliente = montoPorCliente;
        this.ComisionTotal=(this.MontoPorCliente*this.ClientesCaptados);
        this.SalarioTotal=((this.ComisionTotal)>SalarioBase)?(this.ComisionTotal+SalarioBase):(this.ComisionTotal+0);
    }

    public double obtenerSalario() {
        return SalarioTotal;
    }

    public void imprimir(){
        System.out.println("Nombre: " + this.getNombre() + ", Apellido: " + this.getApellido() + ", DNI: " + this.getDNI()+ ", Antiguedad: " + this.getAntiguedad() + ", Salario: $" + this.obtenerSalario());
    }

    public void setComisionTotal(double comisionTotal) {
        ComisionTotal = comisionTotal;
    }
    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }



    public int getClientesCaptados() {
        return ClientesCaptados;
    }

    public double getMontoPorCliente() {
        return MontoPorCliente;
    }

    public double getComisionTotal() {
        return ComisionTotal;
    }

}
