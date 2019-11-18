package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteNOAAdapter implements PaqueteDeViajes {
    private PaqueteNOA paqueteNOA;

    public PaqueteNOAAdapter(PaqueteNOA paqueteNOA) {
        this.paqueteNOA = paqueteNOA;
    }

    @Override
    public void intinerario() {
        paqueteNOA.itinerario();
    }
}
