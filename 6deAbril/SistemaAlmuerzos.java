import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlmuerzos {
    Pedidos pedido = new Pedidos();
    ArrayList<Pedidos> pedidosArrayList = new ArrayList<>();

    public void menu() {
        System.out.println("1. Agregar pedido");
        System.out.println("2. Modificar pedido");
        System.out.println("3. Eliminar pedido");
        Scanner ingreso = new Scanner(System.in);
        int opcion = ingreso.nextInt();

        if (opcion == 1) {

            System.out.println("fecha de creacion: ");
            Scanner ingreso2 = new Scanner(System.in);
            LocalDate fecha = LocalDate.ofEpochDay(ingreso.nextInt());
            pedido.setCreacion(fecha);
            System.out.println("nombre del plato: ");
            Scanner ingreso3 = new Scanner(System.in);
            String nombrePlato = ingreso3.next();
            pedido.plato.nombre = nombrePlato;
            System.out.println("nombre del plato: ");
            Scanner ingreso4 = new Scanner(System.in);
            double precioPlato = ingreso4.nextDouble();
            pedido.plato.precio = precioPlato;
            // use constructores por defecto porque me dio fiaca hacer el ingreso, es que personas tenia 8 atributos
            Personas persona = new Personas();
            pedido.persona = persona;
            System.out.println("fecha de entrega:");
            Scanner ingrso5 = new Scanner(System.in);
            LocalTime hora = LocalTime.parse(ingrso5.next());
            pedido.entrega = hora;
            System.out.println("esta entregado?");
            System.out.println("1. Si");
            System.out.println("2. No");
            Scanner ingreso6 = new Scanner(System.in);
            int eleccion = ingreso6.nextInt();
            if (eleccion == 1) {
                pedido.entregado = true;
            } else if (eleccion == 2) {
                pedido.entregado = false;
            }
            pedidosArrayList.add(pedido);
        } else if (opcion == 2) {
            System.out.println("Que desea modificar: ");
            System.out.println("1. Fecha de cracion");
            System.out.println("2. Plato");
            System.out.println("3. Personas");
            System.out.println("4. Fecha de entrega");
            System.out.println("5. Estado");
            Scanner ingreso7 = new Scanner(System.in);
            int elegir = ingreso7.nextInt();
            if (elegir == 1) {
                System.out.println("ingrese la nueva fecha");
                Scanner ingreso8 = new Scanner(System.in);
                LocalDate fechaNueva = LocalDate.ofEpochDay(ingreso8.nextInt());
                pedido.creacion = fechaNueva;
            } else if (elegir == 2) {
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                Scanner ingreso9 = new Scanner(System.in);
                int elegido = ingreso9.nextInt();
                if (elegido == 1) {
                    System.out.println("ingrese el nuevo nombre: ");
                    Scanner ingreso10 = new Scanner(System.in);
                    String nombreNuevo = ingreso10.next();
                    pedido.plato.nombre = nombreNuevo;
                } else if (elegido == 2) {
                    System.out.println("ingrese el nuevo precio: ");
                    Scanner ingreso11 = new Scanner(System.in);
                    double precioNuevo = ingreso11.nextDouble();
                    pedido.plato.precio = precioNuevo;
                }
            } else if(elegir == 3) {
                System.out.println("ya te dije que no quiero tener nada que ver con la clase persona, son demasiados atributos");
            }
            else if (elegir == 4){
                System.out.println("ingrese la nueva fecha: ");
                Scanner ingreso12 = new Scanner(System.in);
                LocalTime hora = LocalTime.parse(ingreso12.next());
                pedido.entrega = hora;
            }
            else if (elegir == 5){
                System.out.println("1. Esta entregado");
                System.out.println("2. No esta entregado");
                Scanner ingreso13  = new Scanner(System.in);
                int yaPuseTodoLoQueSeMeOcurrio = ingreso13.nextInt();
                if (yaPuseTodoLoQueSeMeOcurrio == 1){
                    pedido.entregado = true;
                }else if(yaPuseTodoLoQueSeMeOcurrio == 2){
                    pedido.entregado = false;
                }
            }
        }
        else if(opcion == 3){
            System.out.println("que pedido desea eliminar:" );
            for (int i = 0; i < pedidosArrayList.size();i++){
                System.out.println(i + 1 + ". " + "pedido " + i+1);
            }
            Scanner ingreso14 = new Scanner(System.in);
            int otraEleccionMasxd = ingreso14.nextInt();
            pedidosArrayList.remove(otraEleccionMasxd - 1);

        }
    }
        public void imprimirinforme(){
            for (int i = 0; i < pedidosArrayList.size();i++){
                if (pedidosArrayList.get(i).entrega == LocalTime.now()){
                    System.out.println( i+1 + ". " +pedidosArrayList.get(i).plato.nombre + " precio: " + pedidosArrayList.get(i).plato.precio);
                }
            }
        }

        public static void main (String[]args){
            SistemaAlmuerzos s = new SistemaAlmuerzos();
            s.menu();
        }

}