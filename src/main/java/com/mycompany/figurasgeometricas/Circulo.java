package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        if (radio <= 0) {
            return 0;
        }
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        if (radio <= 0) {
            return 0; 
        }
        return 2 * Math.PI * radio;
    }
}
