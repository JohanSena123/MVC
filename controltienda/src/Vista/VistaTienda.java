/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cliente;

import java.util.Scanner;
/**
 *
 * @author Johan
 */


public class VistaTienda {
    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1.Cambiar horario (activar/desactivar atencion)");
        System.out.println("2.Simular cliente");
        System.out.println("3.Ver historial de clientes");
        System.out.println("4.Salir");
        System.out.print("Seleccione una opcion:");
        return scanner.nextInt();
    }

    public void mostrarCliente(Cliente cliente, boolean acceso) {
        System.out.println("Membresia: " + cliente.tieneMembresia() + ", Empleado: " + cliente.esEmpleado());
        System.out.println(acceso ? "Acceso permitido" : "Acceso denegado");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarHistorial(Cliente[] clientes) {
        System.out.println("Historial de clientes");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println("Membresia: " + cliente.tieneMembresia() + ", Empleado: " + cliente.esEmpleado());
            }
        }
    }
}
