package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;



import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner ingreso1 = new Scanner(System.in);
        Scanner ingreso2 = new Scanner(System.in);
        Scanner ingreso3 = new Scanner(System.in);
        Scanner ingreso4 = new Scanner(System.in);
        Scanner ingreso5 = new Scanner(System.in);



        String nombre1 = ingreso1.next();
        int edad1 = ingreso2.nextInt();
        int telefono1 = ingreso3.nextInt();
        int dni1 = ingreso4.nextInt();
        String direccion1 = ingreso5.next();

        personas p1 = new personas(nombre1, edad1, telefono1, dni1, direccion1);

        System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
        System.out.println("desea cambiar un dato?: \n 1.si \n 2 . no");
        Scanner elegir1 = new Scanner(System.in);
        int elegir = elegir1.nextInt();
        while(elegir != 1 || elegir != 2){
            System.out.println("ingrese 1 o 2");
            elegir1 = new Scanner(System.in);
            elegir = elegir1.nextInt();
            if (elegir == 1){
                break;
            }
            else if (elegir == 2){
                break;
            }
        }
        if (elegir == 1){
            System.out.println("que desea cambiar?: \n 1.nombre \n 2. edad \n 3.telefono \n 4.dni \n 5.direccion ");
            Scanner elegir2 = new Scanner(System.in);
            int elegir3 = elegir2.nextInt();
            while (elegir3 < 1 || elegir3 > 5){
                System.out.println("ingrese un numero entre 0 y 5");
                 elegir2 = new Scanner(System.in);
                 elegir3 = elegir2.nextInt();
            }
            switch (elegir3){
                case 1:
                    ingreso1 = new Scanner(System.in);
                    nombre1 = ingreso1.next();
                    System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
                    break;
                case 2:
                    ingreso2 = new Scanner(System.in);
                    edad1 = ingreso2.nextInt();
                    System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
                    break;
                case 3:
                    ingreso3 = new Scanner(System.in);
                    telefono1 = ingreso3.nextInt();
                    System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
                    break;
                case 4:
                    ingreso4 = new Scanner(System.in);
                    dni1 = ingreso4.nextInt();
                    System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
                    break;
                case 5:
                    ingreso5 = new Scanner(System.in);
                    direccion1 = ingreso5.next();
                    System.out.println(p1.nombre + "\n" + p1.telefono + "\n" + p1.edad + "\n" + p1.dni + "\n" + p1.direccion);
                    break;

            }
        }


    }
}
