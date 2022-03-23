import java.util.Scanner;

public class Libro {
    int idLibro;
    String nombreLibro;
    double precio;
    String editorial;
    double precio_final;

    public Libro(int idLibro, String nombreLibro, double precio, String editorial, double precio_final) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.precio = precio;
        this.editorial = editorial;
        this.precio_final = precio_final;
    }


    public void librosCaros(){
    Libro libro = new Libro(1,"ashei",5750,"????????",5750);
    if (libro.precio > 5500.50){
        System.out.println(libro.nombreLibro);
    }

}
    public void cambiarPrecio(int descuento, SistemaLibreria sistemaLibreria){
        System.out.println("ingrese el id");
        Scanner id = new Scanner(System.in);
        double ids = id.nextInt();
        for (int i = 0; i < sistemaLibreria.librosEnVenta.size();i++){
            if (ids == sistemaLibreria.librosEnVenta.get(i).idLibro){
                System.out.println("INGRESE EL NUEVO PRECIO:");
                Scanner p = new Scanner(System.in);
                int precio = p.nextInt();
                sistemaLibreria.librosEnVenta.get(i).precio = precio-((precio*descuento)/100);

            }
        }
    }
    public void navidad(SistemaLibreria sistemaLibreria){
        for (int i = 0; i < sistemaLibreria.librosEnVenta.size();i++){
            if (sistemaLibreria.librosEnVenta.get(i).idLibro % 2 == 0){
                sistemaLibreria.librosEnVenta.get(i).precio = sistemaLibreria.librosEnVenta.get(i).precio - ((sistemaLibreria.librosEnVenta.get(i).precio*25)/100);
            }else {
                sistemaLibreria.librosEnVenta.get(i).precio = sistemaLibreria.librosEnVenta.get(i).precio - ((sistemaLibreria.librosEnVenta.get(i).precio*35)/100);
            }
        }
    }

}
