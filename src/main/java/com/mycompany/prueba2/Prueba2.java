/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//hola
package com.mycompany.prueba2;
//holaaaa
/**
 *
 * @author Ceduc-Lab306-16
 */
public class Prueba2 {

    public static void main(String[] args) {
        Equipo[] equipos = new Equipo[4];
        equipos[0] = new Impresora("IMP-1", "HP 100", 500);
        equipos[1] = new Impresora("IMP-2", "Epson L3", 1200);
        equipos[2] = new Proyector("PRO-1", "BenQ X1", 100);
        equipos[3] = new Proyector("PRO-2", "Sony V5", 250);

        equipos[0].activar();
        equipos[2].activar();

        double total = 0;
        for (Equipo e : equipos) {
            e.mostrarFicha();                 
            double costo = e.calcularCosto();
            System.out.println("Costo: " + costo);
            total += costo;
        }
        System.out.println("Costo total: " + total);
    }
}
