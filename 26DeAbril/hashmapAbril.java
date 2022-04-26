import java.util.Scanner;

public class hashmapAbril    {
    public static void main(String[] args) {


        System.out.println("1.Clientes mas frecuentes");
        System.out.println("2.Libros mas vendidos");
        System.out.println("3.edades de los clientes mas frecuentes");
        System.out.println("4.Libros mas caros");
        System.out.println("5.Realizar una venta");
        System.out.println("6.obtener lista de libros con determinada letra");
        System.out.println("7.precio final");
        System.out.println("8.cambiar precio de un libro");
        System.out.println("9.cambiar precio por navidad");

        Scanner s1 = new Scanner(System.in);
        int eleccion = s1.nextInt();
        Cliente cliente = new Cliente(1,"juan",19);
        Libro libro = new Libro(1,"ashei",5700,"Lacras",5700);
        Libro libro2 = new Libro(2,"anashei",10000,"Esta editorial tiene una oferta godeana",5000);
        Libro libro3 = new Libro(3,"nashei",1400,"Esta tmb",700);
        SistemaLibreria sistemaLibreria = new SistemaLibreria();
        sistemaLibreria.librosEnOferta.add(libro2.idLibro);
        sistemaLibreria.librosEnOferta.add(libro3.idLibro);
        sistemaLibreria.librosEnVenta.add(libro);
        sistemaLibreria.librosEnVenta.add(libro2);
        sistemaLibreria.librosEnVenta.add(libro3);
        if (eleccion == 1){
            cliente.clientesMasFrecuentes(cliente);
        }
        else if(eleccion == 2){
            cliente.libroMasVendid(cliente);
        }
        else if(eleccion == 3){
            cliente.edadClientesMasFrecuentes(cliente);
        }
        else if(eleccion == 4){
            libro.librosCaros();
        }
        else if(eleccion == 5){

            System.out.println("ingrese el id: ");
            Scanner l = new Scanner(System.in);
            int id = l.nextInt();
            System.out.println("ingrese el nombre: ");
            Scanner l1 = new Scanner(System.in);
            String nombre = l1.next();
            System.out.println("ingrese el precio: ");
            Scanner l2 = new Scanner(System.in);
            double precio = l2.nextDouble();
            System.out.println("ingrese la editorial: ");
            Scanner l3 = new Scanner(System.in);
            String editorial = l3.next();
            Libro libros = new Libro(id,nombre,precio,editorial,precio);
            sistemaLibreria.liborsVendidos.add(libros);
        }
        else if(eleccion == 6){
            System.out.println("ingrese una letra: ");
            Scanner letra = new Scanner(System.in);
            char Letra = letra.next().charAt(0);
            if (letra.equals(libro.nombreLibro.charAt(0)) ) {
                System.out.println(libro.nombreLibro);
            }
        }
        else if (eleccion == 7){
            System.out.println("ingrese id del cliente");
            Scanner id = new Scanner(System.in);
            int ids = id.nextInt();
            int montoTotal = 0;
            for(int i = 0; i< cliente.librosComprados.size(); i++){
                if (ids == cliente.idCliente){
                    montoTotal += cliente.librosComprados.get(i).precio_final;
                }
            }System.out.println(montoTotal);

        }
        else if(eleccion == 8){
            System.out.println("ingrese el descuento");
            Scanner desc = new Scanner(System.in);
            int descuento = desc.nextInt();
            libro.cambiarPrecio(descuento,sistemaLibreria);
        }
        else if (eleccion == 9){
            libro.navidad(sistemaLibreria);
        }


    }



}

