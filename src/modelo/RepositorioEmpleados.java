package modelo;

import java.util.HashMap;

public class RepositorioEmpleados {
    private final HashMap<String, EmpleadoBase> empleados = new HashMap<>();

    public boolean agregar(EmpleadoBase empleado) {
        if (empleados.containsKey(empleado.getCedula())) {
            return false; // ya existe: no se permiten cédulas duplicadas
        }
        empleados.put(empleado.getCedula(), empleado);
        return true;
    }

    public EmpleadoBase buscar(String cedula) {
        return empleados.get(cedula); // devuelve null si no existe
    }
}