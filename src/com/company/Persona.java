package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int peso;
    private double altura;

    public Persona(String nombre, int edad, int dni, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean mayorDeEdad() {
        return this.edad > 17;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

}
