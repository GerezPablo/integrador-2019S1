package ar.edu.unahur.obj2.ejercicio1;

public class PaquetePatagoniaAdapter implements PaqueteDeViajes {
    private PaquetePatagonia paquetePatagonia;

    public PaquetePatagoniaAdapter(PaquetePatagonia paquetePatagonia) {
        this.paquetePatagonia = paquetePatagonia;
    }

    @Override
    public void intinerario() {
        paquetePatagonia.getItinerario();
    }
}
