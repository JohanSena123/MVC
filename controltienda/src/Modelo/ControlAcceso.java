/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Johan
 */


public class ControlAcceso {
    private boolean horarioAtencion;
    private Cliente[] historialClientes; 
    private int contadorClientes;

    public ControlAcceso() {
        horarioAtencion = true;
        historialClientes = new Cliente[5]; 
        contadorClientes = 0;
    }

    public void setHorarioAtencion(boolean estado) {
        horarioAtencion = estado;
    }

    public boolean permitirAcceso(Cliente cliente) {
        guardarCliente(cliente);
        return cliente.esEmpleado() || (cliente.tieneMembresia() && horarioAtencion);
    }

    private void guardarCliente(Cliente cliente) {
        if (contadorClientes < historialClientes.length) {
            historialClientes[contadorClientes] = cliente;
            contadorClientes++;
        } else {
          
            for (int i = 0; i < historialClientes.length - 1; i++) {
                historialClientes[i] = historialClientes[i + 1];
            }
            historialClientes[historialClientes.length - 1] = cliente;
        }
    }

    public Cliente[] getHistorialClientes() {
        return historialClientes;
    }
}
