package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {

    private List<PaqueteDeViajes> paquetesDeViaje;

    public AgenciaDeViajes() {
        paquetesDeViaje = new ArrayList<>();
    }

    public void catalogoDePaquetes() {
        for(PaqueteDeViajes paquete: paquetesDeViaje) {
            paquete.intinerario();
        }
    }
}
