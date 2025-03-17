/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aireacondicionado.controlador;
import aireacondicionado.modelo.ControlAire;
import aireacondicionado.vista.VistaAire;

/**
 *
 * @author Johan
 */


public class ControladorAire {
    private ControlAire control;
    private VistaAire vista;

    public ControladorAire(ControlAire control, VistaAire vista) {
        this.control = control;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    control.verificarAire();
                    vista.mostrarEstadoAire(control);
                    break;
                case 2:
                    vista.mostrarHistorial(control.getHistorial());
                    break;
                case 3:
                    System.out.println("Saliendo es saliendo.");
                    break;
                default:
                    System.out.println("¡ERROR!");
            }
        } while (opcion != 3);
    }
}
