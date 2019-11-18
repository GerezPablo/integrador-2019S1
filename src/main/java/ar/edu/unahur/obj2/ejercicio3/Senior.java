package ar.edu.unahur.obj2.ejercicio3;

public class Senior implements TipoDeVendedor {

    @Override
    public double comision(double montoVenta) {
        return montoVenta * 0.20;
    }
}
