/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Random;
/**
 *
 * @author Johan
 */


public class Sensor {
    private boolean detectaMovimiento;

    public Sensor() {
        detectaMovimiento = false;
    }

    public void actualizarEstado() {
        Random rand = new Random();
        detectaMovimiento = rand.nextBoolean();
    }

    public boolean getEstado() {
        return detectaMovimiento;
    }
}
