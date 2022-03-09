import sun.awt.X11.XSystemTrayPeer;

public class Main {


    public static void main(String[] args) {
        personas p1 = new personas("nicolas", 17, 46214212, 55922725,"nahuel huapi 4661");
        personas p2 = new personas("joaquin", 17, 46024621, 54996960,"congreso 5060");
        personas p3 = new personas("lautaro", 17, 46213732, 71673009, "franco 3750");
        int dni1 = p1.Dni;
        int dni2 = p2.Dni;
        p1.Edad = p1.Edad *2;
        p2.Telefono = p2.Telefono+1;

        if(p1.sonLaMismaPersona(dni1, dni2) == true){
            System.out.println(" son la misma persona");
        }else{
            System.out.println(" no son la misma persona");
        }
        if(p1.esMayorDeEdad() == true){
            System.out.println(p1.Nombre + " es mayor de edad");
        }else{
            System.out.println(p1.Nombre + " es menor de edad");
        }
        int edad1 = p1.Edad;
        int edad2 = p2.Edad;
        if(p1.tienenLaMismaEdad(edad1, edad2) == true){
            System.out.println(" Tienen la misma edad");
        }else{
            System.out.println(" No tienen la misma edad");
        }
        System.out.println("nombre: " + p3.Nombre + "\n edad: " + p3.Edad + "\n dni: " + p3.Dni + "\n telefono: " + p3.Telefono + "\n direccion: " + p3.Direccion);


        }

    }








