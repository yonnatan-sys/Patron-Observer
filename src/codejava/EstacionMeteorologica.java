package codejava;

import java.util.ArrayList;
import java.util.List;

import observer.Observador;
import observer.Sujeto;

public class EstacionMeteorologica implements Sujeto {
    private final List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    private float humedad;

    @Override
    public void suscribir(Observador o) { observadores.add(o); }

    @Override
    public void desuscribir(Observador o) { observadores.remove(o); }

    @Override
    public void notificar() {
        for (Observador o : observadores) {
            o.actualizar(temperatura, humedad);
        }
    }

    public void setMedidas(float temperatura, float humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        notificar();
    }
}