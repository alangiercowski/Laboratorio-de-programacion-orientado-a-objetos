import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
    private String nombre;
    private ArrayList<Cliente>visitas = new ArrayList<>();

    public Banco() {
        Cliente cliente = new Cliente();
        visitas.add(cliente);
        this.nombre = "galicia";

    }

    public HashSet<Integer>cbusDeClientesVisitantes(){
        for (int i = 0;i < visitas.size();i++){
            cbusDeClientesVisitantes().add(visitas.get(i).getCbu());
        }
        return cbusDeClientesVisitantes();
    }

    public void imprimirHashSet(HashSet<Integer>visitasCbu){
        for(int i :visitasCbu){
            System.out.println(i);
        }
    }

    public HashMap<Integer,Integer>cantidadDeVisitasPorCliente(){
        int repeticion = 1;
        for (int i = 0; i < visitas.size();i++){
            for(int j = 0;j < visitas.size();j++){
                if (visitas.get(i) == visitas.get(j)){
                    repeticion++;
                }
            }
            cantidadDeVisitasPorCliente().put(visitas.get(i).getCbu(),repeticion);
        }
        return  cantidadDeVisitasPorCliente();
    }

    public void imprimirHashMap(HashMap<Integer, Integer>visitasPorCliente){
        int i = 0;
        for (int key : visitasPorCliente.keySet()){
            System.out.println("clave: " + key + " - valor: " + visitasPorCliente.get(key));
            i++;
        }
    }

}
