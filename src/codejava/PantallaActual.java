package codejava;

import observer.Observador;

public class PantallaActual implements Observador {
    @Override
    public void actualizar(float temperatura, float humedad) {
        System.out.println("[Pantalla] Temp: " + temperatura + "°C | Humedad: " + humedad + "%");
    }
}
