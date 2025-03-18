/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperaturainvernadero.modelo;

/**
 *
 * @author Johan
 */


public class SensorTemperatura {
    private double temperatura;
    private double[] historial;
    private int contador;

    public SensorTemperatura(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
        this.historial = new double[5]; 
        this.contador = 0;
    }

    public double leerTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        guardarHistorial(temperatura);
    }

    private void guardarHistorial(double temperatura) {
        if (contador < historial.length) {
            historial[contador] = temperatura;
            contador++;
        } else {
      
            for (int i = 0; i < historial.length - 1; i++) {
                historial[i] = historial[i + 1];
            }
            historial[historial.length - 1] = temperatura;
        }
    }

    public double[] getHistorial() {
        return historial;
    }
}
