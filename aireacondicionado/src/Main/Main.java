/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import aireacondicionado.controlador.ControladorAire;
import aireacondicionado.modelo.ControlAire;
import aireacondicionado.vista.VistaAire;

/**
 *
 * @author Johan
 */


public class Main {
    public static void main(String[] args) {
        ControlAire control = new ControlAire();
        VistaAire vista = new VistaAire();
        ControladorAire controlador = new ControladorAire(control, vista);
        controlador.iniciar();
    }
}
