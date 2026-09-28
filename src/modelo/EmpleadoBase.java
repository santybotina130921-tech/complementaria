package modelo;


public class EmpleadoBase {

    private final String cedula; // final: la cédula nunca cambia
    private String nombre;
    private double salarioBase;

    // Constructor
    public EmpleadoBase(String cedula, String nombre, double salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }
}