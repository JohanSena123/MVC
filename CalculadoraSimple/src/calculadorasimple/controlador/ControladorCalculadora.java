/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasimple.controlador;

import calculadorasimple.modelo.Calculadora;
import calculadorasimple.vista.VistaCalculadora;

/**
 *
 * @author Johan
 */


public class ControladorCalculadora {
    private Calculadora calculadora;
    private VistaCalculadora vista;

    public ControladorCalculadora(Calculadora calculadora, VistaCalculadora vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            double num1 = vista.pedirNumero("Ingrese el primer numero:");
            double num2 = vista.pedirNumero("Ingrese el segundo numero:");
            String operacion = vista.pedirOperacion();

            double resultado = 0;
            switch (operacion) {
                case "suma":
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case "resta":
                    resultado = calculadora.restar(num1, num2);
                    break;
                case "multiplicacion":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "division":
                    resultado = calculadora.dividir(num1, num2);
                    break;
                case "salir":
                    continuar = false;
                    vista.mostrarMensaje("Finalizo el programa");
                    vista.cerrarScanner();
                    return;
                default:
                    vista.mostrarMensaje("Error, intente de nuevo.");
                    continue;
            }

            vista.mostrarResultado(resultado);
        }
    }
}
