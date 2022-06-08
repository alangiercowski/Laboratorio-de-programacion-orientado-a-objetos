import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Programa {
    private String nombre;
    private HashMap<LocalDateTime, String> horario = new HashMap<>();
    private ArrayList<Conductores> conductores = new ArrayList<>();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<LocalDateTime, String> getHorario() {
        return horario;
    }

    public void setHorario(HashMap<LocalDateTime, String> horario) {
        this.horario = horario;
    }

    public ArrayList<Conductores> getConductores() {
        return conductores;
    }

    public void setConductores(ArrayList<Conductores> conductores) {
        this.conductores = conductores;
    }

    public LocalDateTime getLocalDateTime(LocalDateTime timee){
        for(LocalDateTime key : this.horario.keySet()){
            if (key == timee){
                return key;
            }
        }
        return null;
    }

    public Programa() {
        this.nombre = "nombre";

    }
}