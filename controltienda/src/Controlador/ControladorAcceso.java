/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ControlAcceso;
import Vista.VistaTienda;

/**
 *
 * @author Johan
 */

public class ControladorAcceso {
    private ControlAcceso controlAcceso;
    private VistaTienda vista;

    public ControladorAcceso(ControlAcceso controlAcceso, VistaTienda vista) {
        this.controlAcceso = controlAcceso;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    boolean estadoActual = !controlAcceso.permitirAcceso(new Cliente());
                    controlAcceso.setHorarioAtencion(estadoActual);
                    vista.mostrarMensaje("Horario de atencio: " + (estadoActual ? "Activo" : "Inactivo"));
                    break;
                case 2:
                    Cliente cliente = new Cliente();
                    boolean acceso = controlAcceso.permitirAcceso(cliente);
                    vista.mostrarCliente(cliente, acceso);
                    break;
                case 3:
                    vista.mostrarHistorial(controlAcceso.getHistorialClientes());
                    break;
                case 4:
                    vista.mostrarMensaje("Finalizo el programa");
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida");
            }
        } while (opcion != 4);
    }
}
