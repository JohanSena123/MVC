/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controlador.ControladorAcceso;
import Modelo.ControlAcceso;
import Vista.VistaTienda;
/**
 *
 * @author Johan
 */


public class Main {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();
        VistaTienda vista = new VistaTienda();
        ControladorAcceso controlador = new ControladorAcceso(control, vista);
        controlador.iniciar();
    }
}

