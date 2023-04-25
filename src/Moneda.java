public class Moneda {
    private String nombre;
    private double cantidad;

    public Moneda() {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Moneda(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
