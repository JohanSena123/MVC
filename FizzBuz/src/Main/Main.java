/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz_mvc;

import fizzbuzz_mvc.modelo.FizzBuzz;
import fizzbuzz_mvc.vista.FizzBuzzVista;
import fizzbuzz_mvc.controlador.FizzBuzzControlador;

public class Main {
    public static void main(String[] args) {
        int limite = 100; 

        FizzBuzz modelo = new FizzBuzz(limite); 
        FizzBuzzVista vista = new FizzBuzzVista();
        FizzBuzzControlador controlador = new FizzBuzzControlador(modelo, vista);

        controlador.ejecutarFizzBuzz();
    }
}
