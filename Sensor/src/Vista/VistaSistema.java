/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;


/**
 *
 * @author Johan
 */

public class VistaSistema {
    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1.Activar modo noche");
        System.out.println("2.Desactivar modo noche");
        System.out.println("3.Simular sensores");
        System.out.println("4.Salir");
        System.out.print("Seleccione una opcion");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstadosSensores(boolean[] estados) {
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Sensor " + (i + 1) + ": " + (estados[i] ? "Movimiento detectado" : "Movimiento no detectado"));
        }
    }
}
