import java.time.LocalDate;
import java.time.LocalTime;

public class Pedidos {
    LocalDate creacion;
    Platos plato;
    Personas persona;
    LocalTime entrega;
    boolean entregado;

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public void setPlato(Platos plato) {
        this.plato = plato;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public void setEntrega(LocalTime entrega) {
        this.entrega = entrega;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
