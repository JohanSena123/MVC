/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz_mvc.modelo;

public class FizzBuzz {
    private String[] resultados; 

    public FizzBuzz(int limite) {
        resultados = new String[limite]; 
        generarResultados(limite);
    }


    private void generarResultados(int limite) {
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultados[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultados[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                resultados[i - 1] = "Buzz";
            } else {
                resultados[i - 1] = String.valueOf(i);
            }
        }
    }


    public String[] getResultados() {
        return resultados;
    }
}
