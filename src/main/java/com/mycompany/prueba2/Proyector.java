/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2;

/**
 *
 * @author Ceduc-Lab306-16
 */
public class Proyector extends Equipo {
    private int horas;

    public Proyector(String serie, String modelo, int horas) {
        super(serie, modelo);
        this.horas = horas;
    }

    @Override
    public double calcularCosto() { return 60.0 + 1.5 * horas; }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Horas de uso: " + horas);
    }
}