package codejava;

import observer.Observador;

public class AlertaTormenta implements Observador {
    @Override
    public void actualizar(float temperatura, float humedad) {
        if (humedad > 80 && temperatura < 18) {
            System.out.println("[ALERTA] Posible tormenta, humedad alta y temperatura baja");
        }
    }
}