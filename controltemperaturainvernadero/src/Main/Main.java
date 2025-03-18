/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controltemperaturainvernadero.controlador.ControladorInvernadero;
import controltemperaturainvernadero.modelo.SensorTemperatura;
import controltemperaturainvernadero.vista.VistaInvernadero;

/**
 *
 * @author Johan
 */


public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura(20.0);
        VistaInvernadero vista = new VistaInvernadero();
        ControladorInvernadero controlador = new ControladorInvernadero(sensor, vista);
        controlador.iniciar();
    }
}
