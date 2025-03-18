/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperaturainvernadero.controlador;

import controltemperaturainvernadero.modelo.SensorTemperatura;
import controltemperaturainvernadero.vista.VistaInvernadero;

/**
 *
 * @author Johan
 */

public class ControladorInvernadero {
    private SensorTemperatura sensor;
    private VistaInvernadero vista;

    public ControladorInvernadero(SensorTemperatura sensor, VistaInvernadero vista) {
        this.sensor = sensor;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    double nuevaTemp = vista.pedirTemperatura();
                    sensor.setTemperatura(nuevaTemp);
                    vista.mostrarMensaje("Temperatura actualizada");
                    break;
                case 2:
                    vista.mostrarMensaje("Estado del sistema: " + verificarEstado());
                    break;
                case 3:
                    vista.mostrarHistorial(sensor.getHistorial());
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo es saliendo");
                    break;
                default:
                    vista.mostrarMensaje("Error");
            }
        } while (opcion != 4);
    }

    private String verificarEstado() {
        double temperatura = sensor.leerTemperatura();
        if (temperatura < 10) {
            return "Calefactor Activado";
        } else if (temperatura > 25) {
            return "Ventilador Activado";
        } else {
            return "Sistema Inactivo";
        }
    }
}
