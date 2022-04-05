import java.util.ArrayList;

public class Personas {
    String nombre;
    int edad;
    int dni;
    String direccion;
    int telefono;

    class hijo extends Personas {
        String escuela;
        String juego;

        public hijo() {
            this.escuela = "politecnico";
            this.juego = "outerWilds";
            this.direccion = "nahuel huapi 4661";
            this.dni = 46212214;
            this.edad = 17;
            this.nombre = "nicolas";
            this.telefono = 14542425;
        }


        public hijo(String escuela, String juego, String nombre, int edad, int dni, String direccion, int telefono) {
            this.escuela = escuela;
            this.juego = juego;
            this.direccion = direccion;
            this.dni = dni;
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }


    class madre extends Personas {
        String empresea;
        ArrayList<hijo> listaHijos = new ArrayList<>();

        public madre() {
            this.empresea = "lenovo";
            this.listaHijos = new ArrayList<>();
            this.direccion = "nahuel huapi 4661";
            this.dni = 25722277;
            this.edad = 40;
            this.nombre = "qsy";
            this.telefono = 14542425;
        }

        public madre(String empresea, ArrayList<hijo> listaHijos, String nombre, int edad, int dni, String direccion, int telefono) {
            this.empresea = empresea;
            this.listaHijos = listaHijos;
            this.direccion = direccion;
            this.dni = dni;
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public ArrayList<hijo> getListaHijos() {

            for (int i = 0; i < listaHijos.size();i++){
                if (listaHijos.get(i).edad < 18){
                    getListaHijos().add(listaHijos.get(i));
                }
            }

            return listaHijos;
        }
    }
}



