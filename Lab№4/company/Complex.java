package com.company;

public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void add(Complex complex) {
        this.real += complex.real;
        this.imag += complex.imag;
    }

    public double pabs() {
        return real * real + imag * imag;
    }

    public void pow() {
        double temp = real;
        real = real * real - imag * imag;
        imag = 2 * temp * imag;
    }
}

