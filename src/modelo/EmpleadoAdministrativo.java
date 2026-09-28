package modelo;

public class EmpleadoAdministrativo extends EmpleadoBase {
    private double bonificacion;
//constructor
    public EmpleadoAdministrativo(String cedula, String nombre, double salarioBase, double bonificacion) {
        super(cedula, nombre, salarioBase);
        this.bonificacion = bonificacion;
    }
// el gett
    public double getBonificacion() {
        return bonificacion;
    }


}