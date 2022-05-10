import java.util.ArrayList;

public class Sube {
    private float saldo;
    private float saldoNegativoMaximo;
    private int id;

    public float getSaldo() {
        return saldo;
    }

    public float getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String todo = null;
        for(Viaje viaje : viajes){
            todo = viaje.toString() + "| saldo: " + this.saldo + "\n";
        }
        return todo;
    }

    ArrayList<Viaje> viajes = new ArrayList<>();

    public void cargarSube(float monto) {
        this.saldo += monto;
    }

    public void realizarViaje(Viaje viaje) {
        viajes.add(viaje);
    }

    public Float ultimoMontoAbonado() {
        return viajes.get(viajes.size() - 1).getPrecio();
    }

    public boolean seSuperaElSaldoNegativo() {
        return this.saldo < this.saldoNegativoMaximo;
    }
}