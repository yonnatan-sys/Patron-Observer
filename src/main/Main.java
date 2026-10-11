package main;

import codejava.AlertaTormenta;
import codejava.EstacionMeteorologica;
import codejava.PantallaActual;
import observer.Observador;

public class Main {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        Observador pantalla = new PantallaActual();
        Observador alerta = new AlertaTormenta();

        estacion.suscribir(pantalla);
        estacion.suscribir(alerta);

        System.out.println("--- Medición 1 ---");
        estacion.setMedidas(24f, 55f);

        System.out.println("--- Medición 2 ---");
        estacion.setMedidas(15f, 90f);

        System.out.println("--- Se desuscribe la alerta ---");
        estacion.desuscribir(alerta);
        estacion.setMedidas(14f, 95f);
    }
}
