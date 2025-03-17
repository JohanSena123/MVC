/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Johan
 */

public class SistemaSeguridad {
    private Sensor[] sensores;
    private boolean esDeNoche;
    private boolean alarmaActivada;

    public SistemaSeguridad() {
        sensores = new Sensor[3];
        for (int i = 0; i < sensores.length; i++) {
            sensores[i] = new Sensor();
        }
        esDeNoche = false;
        alarmaActivada = false;
    }

    public void setEsDeNoche(boolean estado) {
        esDeNoche = estado;
    }

    public void verificarSensores() {
        int detecciones = 0;
        for (Sensor sensor : sensores) {
            sensor.actualizarEstado();
            if (sensor.getEstado()) {
                detecciones++;
            }
        }
        if (esDeNoche && detecciones >= 2) {
            alarmaActivada = true;
        } else {
            alarmaActivada = false;
        }
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public boolean getEsDeNoche() {
        return esDeNoche;
    }

    public boolean[] obtenerEstadosSensores() {
        boolean[] estados = new boolean[sensores.length];
        for (int i = 0; i < sensores.length; i++) {
            estados[i] = sensores[i].getEstado();
        }
        return estados;
    }
}
