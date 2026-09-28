import controlador.EmpleadoControlador;
import vista.VentanaEmpleados;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
              }

        SwingUtilities.invokeLater(() -> {
            EmpleadoControlador controlador = new EmpleadoControlador();
            VentanaEmpleados ventana = new VentanaEmpleados(controlador);
            ventana.setVisible(true);
        });
    }
}