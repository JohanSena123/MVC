
package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import Modelo.SistemaSeguridad;
import Vista.VistaSistema;
import Controlador.ControladorSistema;

/**
 *
 * @author Johan
 */

public class Main {
    public static void main(String[] args) {
        SistemaSeguridad sistema = new SistemaSeguridad();
        VistaSistema vista = new VistaSistema();
        ControladorSistema controlador = new ControladorSistema(sistema, vista);
        controlador.iniciar();
    }
}
