/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz_mvc.controlador;

import fizzbuzz_mvc.modelo.FizzBuzz;
import fizzbuzz_mvc.vista.FizzBuzzVista;

public class FizzBuzzControlador {
    private FizzBuzz modelo;
    private FizzBuzzVista vista;

    public FizzBuzzControlador(FizzBuzz modelo, FizzBuzzVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarFizzBuzz() {
        String[] resultados = modelo.getResultados(); 
        vista.mostrarResultados(resultados); 
    }
}
