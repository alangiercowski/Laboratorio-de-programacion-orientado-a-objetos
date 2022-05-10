import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class Sistema {
    private ArrayList<Pasajero>pasajerosPresentes = new ArrayList<>();
    private ArrayList<Pasajero>historialPasajeros = new ArrayList<>();
    private String linea;

    public void subePasajero(Pasajero pasajero, float monto){
             if (pasajero.getTargeta().getSaldo() >= monto){
                 System.out.println("bienvenido");
             }else {
                 System.out.println("saldo insuficiente");
             }
    }

    public void seBajaPasajero(Pasajero pasajero){
        pasajerosPresentes.remove(pasajero);
    }

    public  HashSet pasajerosQueSubieronAlugunaVez(){
        HashSet<Pasajero> algunaVez = new HashSet<>();
        for (int i = 0; i < this.historialPasajeros.size();i++){
            algunaVez.add(historialPasajeros.get(i));
        }
        return algunaVez;
    }

    public HashMap ultimoMonto(){
        HashMap<Pasajero,Float>ultimo = new HashMap<>();
        HashSet<Pasajero> algunaVez = pasajerosQueSubieronAlugunaVez();
        for( Pasajero pasajero : algunaVez){
            ultimo.put(pasajero,pasajero.getTargeta().ultimoMontoAbonado());
        }
        return ultimo;
    }
    public Float ultimoMontoAbonadoPorPasajero(int numeroId){
        HashMap<Pasajero, Float>ultimo = this.ultimoMonto();
        float ultimoMontoAbonado = 0;
        for (Pasajero pasajero : ultimo.keySet()){
            if(numeroId == ultimo.get(pasajero.getTargeta().getId())){
                ultimoMontoAbonado = ultimo.get(pasajero.getTargeta().ultimoMontoAbonado());
            }
        }
        return ultimoMontoAbonado;
    }



}
