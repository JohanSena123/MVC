/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado.vista;

import aireacondicionado.modelo.ControlAire;

import java.util.Scanner;

/**
 *
 * @author Johan
 */

public class VistaAire {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("Menu Aire Acondicionado");
        System.out.println("1.Verificar aire");
        System.out.println("2.Mostrar historial de temperatura y humedad");
        System.out.println("3.Salir");
        System.out.print("Seleccione una opcion:");
        return scanner.nextInt();
    }

    public void mostrarEstadoAire(ControlAire control) {
        System.out.println("Temperatura: " + control.getTemperatura() + "C, Humedad: " + control.getHumedad() + "%");
        System.out.println(control.estaEncendido() ? "El aire esta encendido." : "El aire esta apagado.");
    }

    public void mostrarHistorial(int[][] historial) {
        System.out.println("Ultimos Registros");
        for (int i = 0; i < historial.length; i++) {
            if (historial[i][0] != 0) {
                System.out.println("Temp: " + historial[i][0] + "C, Hum: " + historial[i][1] + "%");
            }
        }
    }
}
