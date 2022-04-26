import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaLibreria {
    HashSet<Cliente> clientes = new HashSet<>();
    ArrayList<Libro> librosEnVenta;
    ArrayList<Libro> liborsVendidos;
    ArrayList<Integer>librosEnOferta;
    String nombreLibreria;

    HashSet<String>editorialesConDescuento = new HashSet<>();

    HashMap<Cliente,Integer>informacionVentas = new HashMap<>();

    public void agregarEditoriales(){
        Scanner ingreso = new Scanner(System.in);
        String editorial = ingreso.next();
        editorialesConDescuento.add(editorial);

    }

}
