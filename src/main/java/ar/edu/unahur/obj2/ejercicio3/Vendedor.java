package ar.edu.unahur.obj2.ejercicio3;

public class Vendedor {

    private TipoDeVendedor vendedor;

    public Vendedor(TipoDeVendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double comision(double montoVenta) {
        return vendedor.comision(montoVenta);
    }
}
