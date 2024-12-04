package com.mycompany.d5principal;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private String email;
    private List<Empleados> empleados; // Lista de empleados

    // Constructor
    public Empresa(String nombre, String ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>(); // Inicializamos la lista
    }

    // Métodos para agregar, buscar, eliminar y analizar empleados

    // Agregar un empleado a la lista
    public void agregarEmpleado(Empleados empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente: " + empleado.getNombre());
        System.out.println("                              ");
    }

    // Buscar un empleado por cédula
    public Empleados buscarEmpleado(String cedula) {
        for (Empleados empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        System.out.println("Empleado con cédula " + cedula + " no encontrado.");
        System.out.println("                              ");
        return null;
    }

    // Eliminar un empleado por cédula
    public boolean eliminarEmpleado(String cedula) {
        Empleados empleado = buscarEmpleado(cedula);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado correctamente: " + empleado.getNombre());
            System.out.println("                              ");
            return true;
        }
        System.out.println("No se pudo eliminar, empleado con cédula " + cedula + " no encontrado.");
        System.out.println("                              ");
        return false;
    }

    // Analizar empleados (listar todos los empleados)
    public void analizarEmpleados() {
        System.out.println("Análisis de empleados:");
        for (Empleados empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Cédula: " + empleado.getCedula() + ", Salario: " + empleado.getSalario());
            System.out.println("                              ");
        }
    }

    // Getters y Setters de Empresa
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
