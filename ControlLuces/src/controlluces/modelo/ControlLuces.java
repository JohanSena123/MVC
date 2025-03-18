/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces.modelo;


/**
 *
 * @author Johan
 */

public class ControlLuces {
    private SensorMovimiento sensor;
    private boolean esDeNoche;
    private boolean lucesEncendidas;
    private boolean[] historial; 
    private int contador;

    public ControlLuces() {
        sensor = new SensorMovimiento();
        esDeNoche = false;
        lucesEncendidas = false;
        historial = new boolean[5]; 
        contador = 0;
    }

    public void setEsDeNoche(boolean estado) {
        esDeNoche = estado;
    }

    public void verificarLuces() {
        sensor.actualizarEstado();
        guardarHistorial(sensor.hayMovimiento());

        if (esDeNoche && sensor.hayMovimiento()) {
            lucesEncendidas = true;
        } else {
            lucesEncendidas = false;
        }
    }

    private void guardarHistorial(boolean movimiento) {
        if (contador < historial.length) {
            historial[contador] = movimiento;
            contador++;
        } else {
            for (int i = 0; i < historial.length - 1; i++) {
                historial[i] = historial[i + 1];
            }
            historial[historial.length - 1] = movimiento;
        }
    }

    public boolean estanLucesEncendidas() {
        return lucesEncendidas;
    }

    public boolean[] getHistorial() {
        return historial;
    }
}
