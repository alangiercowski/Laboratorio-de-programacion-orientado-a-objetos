import java.util.Scanner;

public class Fechas {
    int año;
    int mes;
    int dia;

    public Fechas(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }



    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void Reiniciar(int dia , int mes, int año){
        this.año = año;
        this.dia = dia;
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void Adelantar(int d , int m, int a){

        this.año = getAño() + a;
        this.dia = getMes() + d;
        this.mes = getDia() + m;
    }

    public void imprimir(){
        System.out.println("año: " + getAño());
        System.out.println("mes: " + getMes());
        System.out.println("dia: " + getDia());
    }

}





