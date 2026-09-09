/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_simple;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Calculadora_simple {

    public static void main(String[] args) {
        try (Scanner calculadora = new Scanner(System.in)) {
            System.out.println("--- Calculadora ---");
            System.out.print("Introduzca el prime rnumero: ");
            double num1 = calculadora.nextDouble();
            System.out.print("Introduzca un operador (+, -, *, /): ");
            char oper = calculadora.next().charAt(0);
            System.out.print("Introduzca el segundo numero: ");
            double num2 = calculadora.nextDouble();
            switch (oper) {
                case '+' -> System.out.println("Resultado de la suma: " + (num1 + num2));
                case '-' -> System.out.println("Resultado de la resta: " + (num1 - num2));
                case '*' -> System.out.println("Resultado de la multiplicacion: " + (num1 * num2));
                case '/' -> {
                    if (num2 != 0) {
                        System.out.println("Resultado de la division: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero (0)");
                    }
                }
                default -> System.out.println("Operador no valido");
            }
        }
    }
}
