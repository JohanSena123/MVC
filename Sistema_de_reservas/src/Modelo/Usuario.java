/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas.modelo;

public class Usuario extends Persona {
    private int idUsuario;
    private boolean[] asientos;

    public Usuario(String nombre, String apellido, int cedula, int idUsuario) {
        super(nombre, apellido, cedula);
        this.idUsuario = idUsuario;
        this.asientos = new boolean[10];
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String reservarAsiento(int numero) {
        if (numero >= 0 && numero < asientos.length) {
            if (!asientos[numero]) {
                asientos[numero] = true;
                return "Asiento " + numero + " reservado exitosamente.";
            } else {
                return "Asiento " + numero + " ya esta ocupado.";
            }
        } else {
            return "Número de asiento invalido.";
        }
    }

    public String mostrarAsientos() {
        String mensaje = "Estado de los asientos:\n";
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]) {
                mensaje += "Asiento " + i + ": Ocupado\n";
            } else {
                mensaje += "Asiento " + i + ": Disponible\n";
            }
        }
        return mensaje;
    }

    public String imprimirDatos() {
        String mensaje = "";
        mensaje += "Nombre: " + getNombre() + "\n";
        mensaje += "Apellido: " + getApellido() + "\n";
        mensaje += "Cedula: " + getCedula() + "\n";
        mensaje += "ID Usuario: " + getIdUsuario() + "\n";
        mensaje += "Asientos reservados: ";
        boolean hayReservas = false;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]) {
                mensaje += i + " ";
                hayReservas = true;
            }
        }
        if (!hayReservas) {
            mensaje += "Ninguno";
        }
        mensaje += "\n";
        return mensaje;
    }
}
