public class Pasajero {

    private Sube Targeta;
    private String Nombre;
    private String Apellido;

    @Override
    public String toString() {
        Sube sube = null;
        return "nombre: " + this.Nombre + "\n apellido: " + this.Apellido + "\n \n " + sube.toString();
    }

    public Sube getTargeta() {
        return Targeta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
}

