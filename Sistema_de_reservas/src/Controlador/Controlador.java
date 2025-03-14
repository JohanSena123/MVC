/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas.controlador;

import java.util.ArrayList;
import sistema_de_reservas.modelo.Usuario;
import sistema_de_reservas.vista.Vista;

public class Controlador {
    private Vista vista;
    private ArrayList<Usuario> usuarios;
    private int idCounter = 1;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.usuarios = new ArrayList<>();
    }

    public void iniciarSistema() {
        boolean salir = false;

        
        String nombre = vista.pedirNombre();
        String apellido = vista.pedirApellido();
        int cedula = vista.pedirCedula();
        Usuario nuevoUsuario = new Usuario(nombre, apellido, cedula, idCounter++);
        usuarios.add(nuevoUsuario);

       
        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    vista.mostrarMensaje(nuevoUsuario.mostrarAsientos());
                    break;
                case 2:
                    int asiento = vista.pedirAsiento();
                    vista.mostrarMensaje(nuevoUsuario.reservarAsiento(asiento));
                    break;
                case 3:
                    vista.mostrarMensaje(nuevoUsuario.imprimirDatos());
                    break;
                case 4:
                    vista.mostrarMensaje("Gracias por usar el sistema");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida");
            }
        }
    }
}
