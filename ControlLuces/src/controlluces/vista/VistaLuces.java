/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces.vista;

import java.util.Scanner;

/**
 *
 * @author Johan
 */


public class VistaLuces {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("Menu de Control de Luces");
        System.out.println("1.Activar modo noche");
        System.out.println("2.Desactivar modo noche");
        System.out.println("3.Verificar luces");
        System.out.println("4.Mostrar historial de movimiento");
        System.out.println("5.Salir");
        System.out.print("Seleccione una opcion:");
        return scanner.nextInt();
    }

    public void mostrarEstadoLuces(boolean lucesEncendidas) {
        System.out.println(lucesEncendidas ? "Las luces estan prendidas." : "Las luces estan apagadas.");
    }

    public void mostrarHistorial(boolean[] historial) {
        System.out.println("Historial de Movimiento");
        for (int i = 0; i < historial.length; i++) {
            System.out.println("Movimiento detectado: " + (historial[i] ? "Si" : "No"));
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
