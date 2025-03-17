/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.SistemaSeguridad;
import Vista.VistaSistema;

/**
 *
 * @author Johan
 */

public class ControladorSistema {
    private SistemaSeguridad sistema;
    private VistaSistema vista;

    public ControladorSistema(SistemaSeguridad sistema, VistaSistema vista) {
        this.sistema = sistema;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    sistema.setEsDeNoche(true);
                    vista.mostrarMensaje("Modo noche ha sido activado.");
                    break;
                case 2:
                    sistema.setEsDeNoche(false);
                    vista.mostrarMensaje("Modo noche ha sido desactivado.");
                    break;
                case 3:
                    sistema.verificarSensores();
                    boolean[] estados = sistema.obtenerEstadosSensores();
                    vista.mostrarEstadosSensores(estados);
                    if (sistema.isAlarmaActivada()) {
                        vista.mostrarMensaje("¡Alarma activada!");
                    } else {
                        vista.mostrarMensaje("Esta todo en calma.");
                    }
                    break;
                case 4:
                    vista.mostrarMensaje("Ha salido del sistema");
                    break;
                default:
                    vista.mostrarMensaje("Opcion erronea");
                    break;
            }
        } while (opcion != 4);
    }
}
