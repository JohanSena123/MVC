/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperaturainvernadero.vista;

import java.util.Scanner;


/**
 *
 * @author Johan
 */

public class VistaInvernadero {
    private Scanner scanner = new Scanner(System.in);

    public double pedirTemperatura() {
        System.out.print("Ingrese la temperatura actual: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada invalida.Ingrese un numero otra vez");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public int mostrarMenu() {
        System.out.println("Menu de Control de Invernadero");
        System.out.println("1.Ingresar nueva temperatura");
        System.out.println("2.Ver estado del sistema");
        System.out.println("3.Ver historial de temperaturas");
        System.out.println("4.Salir");
        System.out.print("Seleccione una opcion:");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarHistorial(double[] historial) {
        System.out.println("Ultimos registros de temperatura");
        for (double temp : historial) {
            if (temp != 0) {
                System.out.println("Temperatura registrada: " + temp + "C");
            }
        }
    }
}
