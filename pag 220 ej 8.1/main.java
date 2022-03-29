import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Fechas f = new Fechas(2018,5,25);
        System.out.println("1.reiniciar");
        System.out.println("2.avanzar");
        System.out.println("3.imprimir");
        System.out.println();
        int eleccion;
        Scanner s = new Scanner(System.in);
        eleccion = s.nextInt();

        if(eleccion == 1){
            System.out.println("ingrese el nuevo año");
            Scanner s1 = new Scanner(System.in);
            int año1 = s1.nextInt();
            System.out.println("ingrese el nuevo mes");
            Scanner s2 = new Scanner(System.in);
            int mes1 = s2.nextInt();
            System.out.println("ingrese el nuevo dia");
            Scanner s3 = new Scanner(System.in);
            int dia1 = s3.nextInt();
            f.Reiniciar(dia1,mes1,año1);
        }
        else if (eleccion == 2){
            System.out.println("ingrese la cantidad de años a avanzar");
            Scanner s1 = new Scanner(System.in);
            int año1 = s1.nextInt();
            System.out.println("ingrese la cantidad de meses a avanzar");
            Scanner s2 = new Scanner(System.in);
            int mes1 = s2.nextInt();
            while (mes1 > 12){
                mes1 -= 12;
                año1 += 1;
            }
            System.out.println("ingrese la cantidad de dias a avanzar");
            Scanner s3 = new Scanner(System.in);
            int dia1 = s3.nextInt();
            f.Adelantar(dia1,mes1,año1);
        }
        else if(eleccion == 3){
            f.imprimir();
        }
    }
}

