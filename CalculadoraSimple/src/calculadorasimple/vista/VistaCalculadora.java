/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasimple.vista;

import java.util.Scanner;

/**
 *
 * @author Johan
 */


public class VistaCalculadora {
    private Scanner scanner = new Scanner(System.in);

    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String pedirOperacion() {
        System.out.print("Elija operacion (suma, resta, multiplicacion, division) o 'salir': ");
        return scanner.next().toLowerCase();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es:" + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
