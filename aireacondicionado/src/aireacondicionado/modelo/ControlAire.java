/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado.modelo;
/**
 *
 * @author Johan
 */


public class ControlAire {
    private SensorAmbiente sensor;
    private boolean aireEncendido;
    private int[][] historial;
    private int contador;

    public ControlAire() {
        sensor = new SensorAmbiente();
        aireEncendido = false;
        historial = new int[5][2];
        contador = 0;
    }
    
    public void verificarAire() {
        sensor.actualizarEstado();
        int temp = sensor.getTemperatura();
        int hum = sensor.getHumedad();
        
        if ((temp > 28 && hum > 60) || temp > 30) {
            aireEncendido = true;
        } else {
            aireEncendido = false;
        }

        guardarHistorial(temp, hum);
    }

    private void guardarHistorial(int temp, int hum) {
        if (contador < historial.length) {
            historial[contador][0] = temp;
            historial[contador][1] = hum;
            contador++;
        } else {
            for (int i = 0; i < historial.length - 1; i++) {
                historial[i][0] = historial[i + 1][0];
                historial[i][1] = historial[i + 1][1];
            }
            historial[historial.length - 1][0] = temp;
            historial[historial.length - 1][1] = hum;
        }
    }
    
    public boolean estaEncendido() {
        return aireEncendido;
    }
    
    public int getTemperatura() {
        return sensor.getTemperatura();
    }
    
    public int getHumedad() {
        return sensor.getHumedad();
    }

    public int[][] getHistorial() {
        return historial;
    }
}
