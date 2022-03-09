public class personas {
        String Nombre;
        int Edad;
        int Dni;
        int Telefono;
        String Direccion;

        personas() {
            this.Edad = 46;
            this.Nombre = "Horacio";
            this.Dni = 25458000;
            this.Telefono = 69773855;
            this.Direccion = "monroe 4941";



        }

        personas(String nombre) {
            this.Nombre = nombre;
        }

        personas(String Nombre, int Edad, int Dni, int Telefono, String Direccion) {
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.Dni = Dni;
            this.Telefono = Telefono;
            this.Direccion = Direccion;

        }
        public int getEdad(){
            return this.Edad;
        }

        public void setEdad(int Edad){
            this.Edad = Edad;
        }
        public String getNombre(){
            return this.Nombre;
        }

        public void setNombre( String Nombre){
            this.Nombre = Nombre;
        }
        public int getDni(){
            return this.Dni;
        }

        public void setDni(int Dni){
            this.Dni = Dni;
        }
        public int getTelefono(){
            return this.Telefono;
        }

        public void setTelefono(int Telefono){
            this.Telefono = Telefono;
        }
        public String getDireccion(){
            return this.Direccion;
        }

        public void setDireccion(String Direccion){
            this.Direccion = Direccion;
        }
        public boolean esMayorDeEdad(){
            return this.Edad > 18;

        }

        public boolean sonLaMismaPersona(int dni1, int dni2) {
            if (dni1 == dni2) {
                return true;
            } else {
                return false;
            }
        }
        public boolean tienenLaMismaEdad(int edad1, int edad2){
            if(edad1 == edad2){
                return true;
            }else{
                return false;
            }

        }
    }

