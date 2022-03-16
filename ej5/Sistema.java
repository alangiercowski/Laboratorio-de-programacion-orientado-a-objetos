import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
        ArrayList<Persona> persona = new ArrayList<>();
        Scanner nombres;
        Scanner edades;
        Scanner dnis;
        Scanner dirrecciones;
        Scanner telefonos;



        public void alta() {
                Persona p = new Persona();
                System.out.println("ingrese el nombre: ");
                nombres = new Scanner(System.in);
                String nombre = nombres.next();
                p.nombre = nombre;
                System.out.println("ingrese la edad: ");
                edades = new Scanner(System.in);
                int edad = edades.nextInt();
                p.edad = edad;
                System.out.println("ingrese el dni: ");
                dnis = new Scanner(System.in);
                int dni = dnis.nextInt();
                p.dni = dni;
                System.out.println("ingrese el telefono: ");
                telefonos = new Scanner(System.in);
                int telefono = telefonos.nextInt();
                p.telefono = telefono;
                System.out.println("ingrese la direccion: ");
                dirrecciones = new Scanner(System.in);
                String direccion = dirrecciones.next();
                p.direccion = direccion;
                persona.add(p);

        }

        public void baja() {
                Scanner dni2;
                System.out.println("ingrese el dni de la persona a eliminar: ");
                dni2 = new Scanner(System.in);
                int dni = dni2.nextInt();
                for(Persona p : persona){
                        if (p.dni == dni){
                                persona.remove(p);
                                break;
                        }
                }




        }

        public void modificar() {
                Scanner elegir;
                Scanner nombre;
                Scanner edad;
                Scanner dni;
                Scanner direccion;
                Scanner telefono;
                System.out.println("que dato queres cambiar delx pibx? \n 1.nombre\n 2.edad\n 3.direccion\n 4.telefono");
                elegir = new Scanner(System.in);
                int eleccion = elegir.nextInt();
                if (eleccion == 1) {
                        System.out.println("ingrese el dni de lx personx: ");
                        dni = new Scanner(System.in);
                        int dnis = dni.nextInt();
                        System.out.println("ingrese el nuevo nombre: ");
                        nombre = new Scanner(System.in);
                        String nombres = nombre.next();
                        for (Persona Persona : persona) {
                                if (dnis == Persona.dni) {
                                        Persona.nombre = nombres;
                                }
                        }
                } else if (eleccion == 2) {
                        System.out.println("ingrese el dni de le personx: ");
                        dni = new Scanner(System.in);
                        int dnis = dni.nextInt();
                        System.out.println("ingrese la nueva edad: ");
                        edad = new Scanner(System.in);
                        int edades = edad.nextInt();
                        for (Persona Persona : persona) {
                                if (dnis == Persona.dni) {
                                        Persona.edad = edades;
                                }
                        }
                } else if (eleccion == 3) {
                                System.out.println("ingrese el dni de le personx: ");
                                dni = new Scanner(System.in);
                                int dnis = dni.nextInt();
                                System.out.println("ingrese la nueva direccion: ");
                                direccion = new Scanner(System.in);
                                String direcciones = direccion.next();
                        for (Persona Persona : persona) {
                                if (dnis == Persona.dni) {
                                        Persona.direccion = direcciones;
                                }
                        }
                        }
                else if(eleccion == 4){
                        System.out.println("ingrese el dni de le personx: ");
                        dni = new Scanner(System.in);
                        int dnis = dni.nextInt();
                        System.out.println("ingrese el nuevo telefono: ");
                        telefono = new Scanner(System.in);
                        int telefonos = telefono.nextInt();
                        for (Persona Persona : persona) {
                                if (dnis == Persona.dni) {
                                        Persona.telefono = telefonos;
                                }
                        }
                }


                }
                public void mayores(){
                        for (Persona Persona : persona) {
                                if (Persona.edad >= 18) {
                                        System.out.println(Persona.nombre);
                                }
                        }
                }
        public void Persona_registradas(){
                for (Persona Persona : persona) {
                        if (Persona.edad >= 0) {
                                System.out.println(Persona.nombre);
                        }
                }
        }

        }

