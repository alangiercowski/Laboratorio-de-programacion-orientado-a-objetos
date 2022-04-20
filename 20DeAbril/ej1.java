import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de numeros");
        Scanner ingreso = new Scanner(System.in);
        int cantidad = ingreso.nextInt();
        ArrayList<Integer>numerosLista = new ArrayList<>();
        HashSet<Integer>numerosConjunto = new HashSet<>();
        for (int i = 0;i <cantidad;i++){
            Scanner ingresoNumeros = new Scanner(System.in);
            int numeros = ingresoNumeros.nextInt();
            numerosLista.add(numeros);
        }
        for (int i = 0;i < numerosLista.size();i++){
            numerosConjunto.add(numerosLista.get(i));
        }
        for (int i:numerosConjunto ){
            System.out.println(i);
        }
    }
}
