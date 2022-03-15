import java.util.Scanner;
import java.util.ArrayList;
public class ej3 {
    public static void main(String[]args){

        ArrayList<producto> productos = new ArrayList<>();
        System.out.println("1.Registro de producto");
        System.out.println("2.Importe parcial a pagar");
        System.out.println("3.Finalizar registro");
        Scanner ingreso = new Scanner(System.in);
        Scanner ingreso2 = new Scanner(System.in);
        Scanner nombres;
        Scanner precios;

        int elegir = ingreso.nextInt();
        while (true){
            if (elegir == 1){
                System.out.println("ingrese el nombre del producto: ");
                nombres = new Scanner(System.in);
                String nombre_p = nombres.next();
                System.out.println("ingrese el precio del producto: ");
                precios = new Scanner(System.in);
                float precio_p = precios.nextInt();
                producto p = new producto();
                p.nombre = nombre_p;
                p.precio = precio_p;
                productos.add(p);
                System.out.println("1.Registro de producto");
                System.out.println("2.Importe parcial a pagar");
                System.out.println("3.Finalizar registro");
                ingreso = new Scanner(System.in);
                elegir = ingreso.nextInt();
                System.out.println(elegir);
            }
            else if(elegir == 2){
                float total = 0;
                producto p1 = new producto();
                for (int i = 0; i < productos.size();i++){
                    p1 = productos.get(i);
                    total += p1.precio;
                }
                System.out.println(total);
                System.out.println("ingrese el nombre del producto: ");
                nombres = new Scanner(System.in);
                String nombre_p = nombres.next();
                System.out.println("ingrese el precio del producto: ");
                precios = new Scanner(System.in);
                float precio_p = precios.nextInt();
                producto p = new producto();
                p.nombre = nombre_p;
                p.precio = precio_p;
                productos.add(p);
                System.out.println("1.Registro de producto");
                System.out.println("2.Importe parcial a pagar");
                System.out.println("3.Finalizar registro");
                ingreso = new Scanner(System.in);
                elegir = ingreso.nextInt();

            }
            else if (elegir == 3){
                float total = 0;
                producto p1 = new producto();
                for (int i = 0; i < productos.size();i++){
                    p1 = productos.get(i);
                    total += p1.precio;
                }
                System.out.println(total);
                break;
            }

        }
    }
}
