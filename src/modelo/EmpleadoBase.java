package modelo;

public class EmpleadoBase {
    private final String cedula;
    private String nombre;
    private double salarioBase;
//constructor
    public EmpleadoBase(String cedula, String nombre, double salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }

    // Getters nos permiten LEER los datos
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setter: permite MODIFICAR, pero con reglas de  la validación
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

    // Métodos que las clases hijas podrán SOBRESCRIBIR (polimorfismo)
    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public String getTipo() {
        return "Operativo";
    }
}