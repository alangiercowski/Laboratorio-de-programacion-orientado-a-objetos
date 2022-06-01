import com.sun.jdi.FloatValue;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculadora {
    private ArrayList<Double>pila = new ArrayList<>();
    private HashMap<String,Double>memoria = new HashMap<>();
    private Programa programas = new Programa();

    public ArrayList<Double> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Double> pila) {
        this.pila = pila;
    }

    public HashMap<String, Double> getMemoria() {
        return memoria;
    }

    public void setMemoria(HashMap<String, Double> memoria) {
        this.memoria = memoria;
    }

    public Programa getProgramas() {
        return programas;
    }

    public void setProgramas(Programa programas) {
        this.programas = programas;
    }

    public void cargarPrograma(Programa p){
        this.programas=p;
    }

    public void ejecutar(String key){
        for (String i : this.programas.getRutinas().keySet()) {
            if (key==i){
                for (Instruccion j:this.programas.getRutinas().get(i)){
                    if(j.getNombre() == "PUSH"){
                        j.push(j.getNumero());
                    }
                    else if(j.getNombre() == "ADD"){
                        j.add();
                    }
                    else if(j.getNombre() == "SUB"){
                        j.sub();
                    }
                    else if(j.getNombre() == "MUL"){
                        j.mul();
                    }
                    else if(j.getNombre() == "WRITE"){
                        j.write(j.getKey());
                    }
                    else if(j.getNombre() == "READ"){
                        j.read(j.getKey());
                    }
                }
            }
        }
    }
}
