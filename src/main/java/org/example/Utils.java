package org.example;

import java.util.ArrayList;

public class Utils {


    public static boolean esPrimo(Integer numero) {
        // Un número menor o igual a 1 no es primo
        if (numero <= 1) {
            return false;
        }
        // Verificar si el número es divisible por algún número entre 2 y la raíz cuadrada de número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> listadoPrimos(Integer inf, Integer sup){
        ArrayList<Integer> primos = new ArrayList<>();
        for(Integer i = inf; i<sup; i++){
            if(esPrimo(i)){
                primos.add(i);
            }
        }
        return primos;
    }

}
