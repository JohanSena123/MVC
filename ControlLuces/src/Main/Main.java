/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controlluces.controlador.ControladorLuces;
import controlluces.modelo.ControlLuces;
import controlluces.vista.VistaLuces;

/**
 *
 * @author Johan
 */

public class Main {
    public static void main(String[] args) {
        ControlLuces control = new ControlLuces();
        VistaLuces vista = new VistaLuces();
        ControladorLuces controlador = new ControladorLuces(control, vista);
        controlador.iniciar();
    }
}
