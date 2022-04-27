import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private int telefono;
    private int dni;

    public Persona() {
        this.nombre = "juan";
        this.edad = 17;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String direccion, int telefono, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getDni() {
        return dni;
    }
}
