package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        System.out.println("Programa de números primos");
        System.out.println("--------------------------");
        System.out.println(Utils.listadoPrimos(1, 100000));
        System.out.println(Utils.listadoPrimos(1, 100000).size());

    }
}