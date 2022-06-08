import java.time.LocalDate;

public class Conductores {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimineto;

    public Conductores(String nombre, String apellido, LocalDate fechaDeNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimineto = fechaDeNacimineto;
    }
}
