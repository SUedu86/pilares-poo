/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2;

/**
 *
 * @author Ceduc-Lab306-16
 */
public class Equipo {
    private String serie;
    private String modelo;
    protected String estado = "inactivo";

    public Equipo(String serie, String modelo) {
        this.serie = serie;
        this.modelo = modelo;
    }
    public String getSerie() {
        return serie;
    }
    public String getModelo() {
        return modelo;
    }
    public void activar() {
        estado = "activo";
    }
    public double calcularCosto() {
        return 15.0;
    }
    public void mostrarFicha() {
        System.out.println("Serie: " + serie + " - Modelo: " + 
                           modelo + " - Estado: " + estado);
    }
}
