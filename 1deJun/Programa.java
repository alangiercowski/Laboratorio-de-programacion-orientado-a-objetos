import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;

public class Programa extends  Calculadora{


    private HashMap<String, ArrayList<Instruccion>>rutinas = new HashMap<>();

    public HashMap<String, ArrayList<Instruccion>> getRutinas() {
        return rutinas;
    }

    public void setRutinas(HashMap<String, ArrayList<Instruccion>> rutinas) {
        this.rutinas = rutinas;
    }

    public Programa() {
        super();
        this.rutinas=new HashMap<>();
    }

    public void  agregarInstruccion(String nombre, Instruccion instruccion){
        ArrayList<Instruccion> instruccionesAux=this.rutinas.get(nombre);
        instruccionesAux.add(instruccion);
        this.rutinas.put(nombre,instruccionesAux);
    }
}
