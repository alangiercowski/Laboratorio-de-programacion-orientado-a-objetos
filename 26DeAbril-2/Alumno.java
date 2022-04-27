import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Alumno extends Persona{
    private String curso;

    private HashMap<String, ArrayList<Float>> notasPorMateria = new HashMap<>();

    public Alumno(String curso, HashMap<String, ArrayList<Float>> notasPorMateria) {
        super();
        this.curso = curso;
        this.notasPorMateria = notasPorMateria;
    }

    public Alumno(String nombre, int edad, String direccion, int telefono, int dni, String curso, HashMap<String, ArrayList<Float>> notasPorMateria) {
        super(nombre, edad, direccion, telefono, dni);
        this.curso = curso;
        this.notasPorMateria = notasPorMateria;
    }

    public void agregarnota(){
        String materia;
        System.out.println("ingrese la materia:");
        Scanner ingreso2 = new Scanner(System.in);
        materia = ingreso2.next();
        ArrayList<Float>notas = new ArrayList<>();
        System.out.println("ingrese la nueva nota: ");
        Scanner ingreso = new Scanner(System.in);
        float nota = ingreso.nextFloat();
        notas.add(nota);
        for (String key : this.notasPorMateria.keySet()){
            if (materia == key){
                this.notasPorMateria.get(key).add(nota);
            }
        }


    }

    public Float menorNota(){
        float masChico = 11;
        int i = 0;
        for (String key : this.notasPorMateria.keySet()){
            if (masChico > this.notasPorMateria.get(key).get(i)){
                masChico = this.notasPorMateria.get(key).get(i);
            }
            i++;
        }

        return masChico;
    }
    public Float MayorNota(){
        float masGrande = 0;
        int i = 0;
        for (String key : this.notasPorMateria.keySet()){
            if (masGrande < this.notasPorMateria.get(key).get(i)){
                masGrande = this.notasPorMateria.get(key).get(i);
            }
            i++;
        }
        return masGrande;
    }
    public Float promedio(){
        float promedio = 0;

        ArrayList<Float>promedioPorMaterias = new ArrayList<>();
        for (String key : this.notasPorMateria.keySet()){
           for (int i = 0  ; i < this.notasPorMateria.get(key).size();i++) {
               promedio += this.notasPorMateria.get(key).get(i);
           }
            promedio = promedio / this.notasPorMateria.get(key).size();
           promedioPorMaterias.add(promedio);
        }
        float promedioTotal = 0;
     for (int i = 0;i < promedioPorMaterias.size();i++){
         promedioTotal+=promedioPorMaterias.get(i);
     }
     promedioTotal = promedioTotal / promedioPorMaterias.size();

        return promedioTotal;
    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float>notas = new ArrayList<>();
        notasPorMateria.put(nombreDeMateria,notas);
    }





}