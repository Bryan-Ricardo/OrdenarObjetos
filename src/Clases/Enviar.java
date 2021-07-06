package Clases;

import java.util.Scanner;

public class Enviar <T>{
    private Scanner usuario = new Scanner(System.in);
    private int cantidad;
    private T matriz[][];
    private int primeraEleccion;
    private int segundaEleccion;
    private String administrador;

    public Enviar(T matriz[][],String administrador){
        this.administrador = administrador;
        this.cantidad = matriz.length;
        this.matriz = matriz;
        if(matriz.length == 2){
            this.formasOrganisarAlumnos();
            Organisar<T> organisar = new Organisar<T>(this.matriz,this.primeraEleccion,this.segundaEleccion);
        }else if (matriz.length == 3){
            this.formasOrganisarEmpleados();
        }
    }

    private void formasOrganisarAlumnos(){
        System.out.println("De que forma quieres organisarlo " + this.administrador+ ":");
        System.out.println("1-Por edades");
        System.out.println("2-Por orden alfabetico");
        this.primeraEleccion = this.usuario.nextInt();
        if (this.primeraEleccion == 1){
            //System.out.println("Por edades:");
            this.porEdades();
        }else if (this.primeraEleccion == 2){
            //System.out.println("Por orden alfabetico:");
            this.porOrdenAlfabetico();
        }
    }

    private void formasOrganisarEmpleados(){

    }

    private void porOrdenAlfabetico(){
        System.out.println("De que forma quieres organisarlo " + this.administrador+ ":");
        System.out.println("1-{A-Z}");
        System.out.println("2-{Z-A}");
        this.segundaEleccion = this.usuario.nextInt();
        /*
        Viendo las elecciones
        if (this.segundaEleccion == 1){
            System.out.println("1-{A-Z}");
        }else if (this.segundaEleccion == 2){
            System.out.println("2-{Z-A}");
        }*/
    }

    private void porEdades(){
        System.out.println("De que forma quieres organisarlo " + this.administrador+ ":");
        System.out.println("1-{Menor-Mayor}");
        System.out.println("2-{Mayor-Menor}");
        this.segundaEleccion = this.usuario.nextInt();
        /*
        Viendo las elecciones
        if (this.segundaEleccion == 1){
            System.out.println("1-{Menor-Mayor}");
        }else if (this.segundaEleccion == 2){
            System.out.println("2-{Mayor-Menor}");
        }*/
    }

}
