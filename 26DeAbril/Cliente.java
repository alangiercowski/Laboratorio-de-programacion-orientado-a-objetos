

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cliente {

    int idCliente;
    String nombreCliente;
    int edad;
    ArrayList<Libro> librosComprados;

    HashMap<Libro,Integer>unidadesCompradas = new HashMap<>();


    public Cliente(int idCliente, String nombreCliente, int edad) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.edad = edad;

    }



    public void clientesMasFrecuentes(Cliente cliente){

        for (int i = 0; i < cliente.librosComprados.size();i++){
            if(i >= 10){
                System.out.println(cliente.nombreCliente);
            }
        }
    }

    public void  libroMasVendid(Cliente cliente){
        int librosVendidos = 0;
        for (int i = 0; i < librosComprados.size(); i++){
            librosVendidos += i;
        }
    }
    public void edadClientesMasFrecuentes(Cliente cliente){

        for (int i = 0; i < cliente.librosComprados.size();i++){
            if(i >= 10){
                System.out.println(cliente.edad);
            }
        }
    }

    public double precioLibrosComprados(Cliente cliente) {
        double suma = 0;
        for (int i = 0; i < cliente.librosComprados.size(); i++) {
            suma += cliente.librosComprados.get(i).precio;
        }
        System.out.println("total: " + suma);
        return suma;
    }
        public void ultimometodo(Cliente cliente){
            int repeticion = 0;
            for (int i = 0;i < cliente.librosComprados.size();i++){
                for (int j = 0;j < cliente.librosComprados.size();j++){
                    if (cliente.librosComprados.get(i) == cliente.librosComprados.get(j)){
                        repeticion++;
                    }
                }
            }
        for (int i = 0;i < cliente.librosComprados.size();i++) {
            System.out.println("nombre: " + cliente.librosComprados.get(i).nombreLibro + "\n" + "unidades:" + repeticion + "\n" + "importe total:" + cliente.precioLibrosComprados(cliente));
        }


        }

    }





