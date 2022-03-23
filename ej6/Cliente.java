import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.ArrayList;

public class Cliente {

    int idCliente;
    String nombreCliente;
    int edad;
    ArrayList<Libro> librosComprados;

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




}
