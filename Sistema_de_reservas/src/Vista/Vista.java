/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas.vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNombre() {
        System.out.print("Ingrese su nombre:");
        String nombre=scanner.nextLine();
        return nombre;
    }

    public String pedirApellido() {
        System.out.print("Ingrese su apellido:");
        String apellido=scanner.nextLine();
        return apellido;
    }

    public int pedirCedula() {
        System.out.print("Ingrese su cedula:");
        int cedula=scanner.nextInt();
        return cedula;
    }

    public int mostrarMenu() {
        System.out.println("Menu");
        System.out.println("1.Ver asientos");
        System.out.println("2.Reservar asiento");
        System.out.println("3.Imprimir datos");
        System.out.println("4.Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public int pedirAsiento() {
        System.out.print("Ingrese el numero de asiento a reservar:");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
