/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
/**
 *
 * @author Johan
 */


import calculadorasimple.controlador.ControladorCalculadora;
import calculadorasimple.modelo.Calculadora;
import calculadorasimple.vista.VistaCalculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();
        VistaCalculadora vista = new VistaCalculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(modelo, vista);
        controlador.iniciar();
    }
}
