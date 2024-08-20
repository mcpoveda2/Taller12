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
        if (numero < 0) {
            return 0.0;
        }
        return Math.pow(numero, 1.0 / indice);
    }

    public boolean sonAmigos(int a, int b)
    {
        return (sumaDivisores(a) == b &&
                sumaDivisores(b) == a);
    }

    public int sumaDivisores(int x)
    {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                sum += i;
                // Para manejar cuadrados perfectos
                if (x / i != i)
                    sum += x / i;
            }
        }
        return sum;
    }
    
}
