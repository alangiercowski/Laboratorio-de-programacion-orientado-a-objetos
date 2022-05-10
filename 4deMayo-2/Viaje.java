public class Viaje {
    @Override
    public String toString() {
        return   "hora: " + this.hora + "| fecha: " + this.fecha + "| precio: " + this.precio;
    }

    private float precio;
    private String hora;
    private String fecha;

    public float getPrecio() {
        return precio;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }
}
