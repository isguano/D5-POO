package com.mycompany.d5principal;

public class D5Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Guano Matic", "0250311495", "Conocoto calle La Paz y Felix Gallardo", "isguano@espe.edu.ec");

        // Crear empleados
        Empleados empleado1 = new Empleados("Juan Pérez", "123", 500.0);
        Empleados empleado2 = new Empleados("Ana Gómez", "456", 600.0);

        // Agregar empleados
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        // Buscar un empleado
        Empleados buscado = empresa.buscarEmpleado("123");
        if (buscado != null) {
            System.out.println("Empleado encontrado: " + buscado.getNombre());
        }

        // Analizar empleados
        empresa.analizarEmpleados();

        // Eliminar un empleado
        empresa.eliminarEmpleado("123");

    }
}
