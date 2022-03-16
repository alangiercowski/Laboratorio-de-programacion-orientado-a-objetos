import java.util.ArrayList;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        int elegir;
        Sistema s = new Sistema();
        System.out.println("1.Realizar el alta de una persona");
        System.out.println("2.Realizar la baja de una persona");
        System.out.println("3.Realizar alguna modificacion");
        System.out.println("4.Ver personas mayores de 18");
        System.out.println("5.Ver todas las personas registradas");
        System.out.println("6.Salir del sistema");
        Scanner eleccion = new Scanner(System.in);
        elegir = eleccion.nextInt();
        while (true) {
            if (elegir == 1) {
                s.alta();
                System.out.println("1.Realizar el alta de una persona");
                System.out.println("2.Realizar la baja de una persona");
                System.out.println("3.Realizar alguna modificacion");
                System.out.println("4.Ver personas mayores de 18");
                System.out.println("5.Ver todas las personas registradas");
                System.out.println("6.Salir del sistema");
                eleccion = new Scanner(System.in);
                elegir = eleccion.nextInt();
            } else if (elegir == 2) {
                s.baja();

                System.out.println("1.Realizar el alta de una persona");
                System.out.println("2.Realizar la baja de una persona");
                System.out.println("3.Realizar alguna modificacion");
                System.out.println("4.Ver personas mayores de 18");
                System.out.println("5.Ver todas las personas registradas");
                System.out.println("6.Salir del sistema");
                eleccion = new Scanner(System.in);
                elegir = eleccion.nextInt();
            } else if (elegir == 3) {
                s.modificar();
                System.out.println("1.Realizar el alta de una persona");
                System.out.println("2.Realizar la baja de una persona");
                System.out.println("3.Realizar alguna modificacion");
                System.out.println("4.Ver personas mayores de 18");
                System.out.println("5.Ver todas las personas registradas");
                System.out.println("6.Salir del sistema");
                eleccion = new Scanner(System.in);
                elegir = eleccion.nextInt();
            } else if (elegir == 4) {
                s.mayores();
                System.out.println("1.Realizar el alta de una persona");
                System.out.println("2.Realizar la baja de una persona");
                System.out.println("3.Realizar alguna modificacion");
                System.out.println("4.Ver personas mayores de 18");
                System.out.println("5.Ver todas las personas registradas");
                System.out.println("6.Salir del sistema");
                eleccion = new Scanner(System.in);
                elegir = eleccion.nextInt();
            } else if (elegir == 5) {
                s.Persona_registradas();
                System.out.println("1.Realizar el alta de una persona");
                System.out.println("2.Realizar la baja de una persona");
                System.out.println("3.Realizar alguna modificacion");
                System.out.println("4.Ver personas mayores de 18");
                System.out.println("5.Ver todas las personas registradas");
                System.out.println("6.Salir del sistema");
                eleccion = new Scanner(System.in);
                elegir = eleccion.nextInt();

            }
            else if(elegir == 6){
                System.out.println("bye!");
                break;
            }
        }
    }
}