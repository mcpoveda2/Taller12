/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallertest;

/**
 *
 * @author micha
 */
public class Calculadora {
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double exponenciacion(double base, double exponente) {
        if (base == 0 && exponente == 0) {
            throw new ArithmeticException("Indeterminación: no se puede calcular 0^0.");
        }
        return Math.pow(base, exponente);
    }

    public double radicacion(double numero, double indice) {
        if (indice == 0) {
            throw new ArithmeticException("Indeterminación: no se puede calcular la raíz con índice 0.");
        }
        if (numero < 0 && indice % 2 == 0) {
            throw new ArithmeticException("No se puede calcular la raíz par de un número negativo.");
        }
        if (numero < 0 && indice % 2 != 0) {
            return -Math.pow(-numero, 1.0 / indice);
        }
        return Math.pow(numero, 1.0 / indice);
    }

    public boolean sonAmigos(int a, int b) {
        return (sumaDivisores(a) == b &&
                sumaDivisores(b) == a);
    }

    public int sumaDivisores(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (x == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                sum += i;
                if (i != x / i && i != 1) {
                    sum += x / i;
                }
            }
        }
        return sum;
    }
}
