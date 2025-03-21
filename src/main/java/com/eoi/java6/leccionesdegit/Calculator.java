package com.eoi.java6.leccionesdegit;

public class Calculator {

    public int sumar(int a, int b) {
        return a + b; // ✅ Se corrigió el error
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b; // ✅ Nuevo método
    }
}
