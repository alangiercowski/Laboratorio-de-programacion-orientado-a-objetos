import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de numeros");
        Scanner ingreso = new Scanner(System.in);
        int cantidad = ingreso.nextInt();
        ArrayList<Integer> numerosLista = new ArrayList<>();
        ArrayList<Integer> numerosLista2 = new ArrayList<>();
        HashSet<Integer>numerosConjunto = new HashSet<>();
        HashSet<Integer>numerosConjunto2 = new HashSet<>();
        for (int i = 0; i < cantidad; i++) {
            Scanner ingresoNumeros = new Scanner(System.in);
            int numeros = ingresoNumeros.nextInt();
            numerosLista.add(numeros);
        }
        for (int i = 0; i < cantidad; i++) {
            Scanner ingresoNumeros2 = new Scanner(System.in);
            int numeros2 = ingresoNumeros2.nextInt();
            numerosLista2.add(numeros2);
        }
        for (int i = 0;i < numerosLista.size();i++){
            numerosConjunto.add(numerosLista.get(i));
        }
        for (int i = 0;i < numerosLista2.size();i++){
            numerosConjunto2.add(numerosLista2.get(i));
        }
        int repeticion = 0;
        boolean sonIguales = false;
        for (int i : numerosConjunto){
            for (int j : numerosConjunto2){
                if (i == j){
                    repeticion++;
                }
                if (repeticion == numerosConjunto.size()){
                    sonIguales = true;
                }else {
                    sonIguales = false;
                }
            }
        }
        if (sonIguales){
            System.out.println("son iguales");
        }else {
            System.out.println("son distintos");
        }


    }
}