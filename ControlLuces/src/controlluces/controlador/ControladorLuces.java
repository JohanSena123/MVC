/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces.controlador;

import controlluces.modelo.ControlLuces;
import controlluces.vista.VistaLuces;

/**
 *
 * @author Johan
 */

public class ControladorLuces {
    private ControlLuces control;
    private VistaLuces vista;

    public ControladorLuces(ControlLuces control, VistaLuces vista) {
        this.control = control;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    control.setEsDeNoche(true);
                    vista.mostrarMensaje("Modo noche activado");
                    break;
                case 2:
                    control.setEsDeNoche(false);
                    vista.mostrarMensaje("Modo noche desactivado");
                    break;
                case 3:
                    control.verificarLuces();
                    vista.mostrarEstadoLuces(control.estanLucesEncendidas());
                    break;
                case 4:
                    vista.mostrarHistorial(control.getHistorial());
                    break;
                case 5:
                    vista.mostrarMensaje("Saliendo es saliendo");
                    break;
                default:
                    vista.mostrarMensaje("Error.");
            }
        } while (opcion != 5);
    }
}
