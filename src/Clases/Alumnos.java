package Clases;

import java.util.Scanner;

public class Alumnos implements Persona{
    private Scanner usuario = new Scanner(System.in);
    private int cantidad;
    private String nombres[];
    private int edades[];
    private String administrador;
    private String alumnos[][];

    public Alumnos(String administrador){
        this.administrador = administrador;
        System.out.println("¿Cuantos alumnos quieres organisar " + this.administrador + "?");
        this.cantidad = this.usuario.nextInt();
        //inisialiso los arreglos nombres y edades ,utilisando la cantidad que me otorgaron
        this.nombres = new String[this.cantidad];
        this.edades = new int[this.cantidad];
        //lleno los datos de los alumnos
        for (int i = 0; i < this.cantidad; i++) {
            this.nombre(i);
            this.edad(i);
        }
        //Ver los datos
        this.verDatos();
        //llenado de la matriz
        this.llenarMatriz();
        //Enviar
        Enviar<String> enviar = new Enviar<String>(this.alumnos,this.administrador);
    }


    public String nombre(int i) {
        System.out.println("¿Cual es el nombre del alumno "+ (i+1)+"?");
        this.nombres[i] = this.usuario.next();
        return this.nombres[i];
    }

    public int edad(int i) {
        System.out.println("¿Cual es el la edad del alumno "+ (i+1)+"?");
        this.edades[i]= this.usuario.nextInt();
        return this.edades[i];
    }

    private void verDatos(){
        System.out.println("Se guardaron los siguientes datos " + this.administrador + ":");
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("Alumno: " + (i +1) +  ", Nombre: " +this.nombres[i] + ", Edad: " + this.edades[i]);
        }
    }

    private void llenarMatriz(){
        this.alumnos = new String[2][this.cantidad];
        //llenado de la matriz
        for (int i = 0; i < this.cantidad; i++) {
            //ingresando los nombre
            this.alumnos[0][i] = this.nombres[i];
            //ingresado de las edades
            this.alumnos[1][i] = String.valueOf(this.edades[i]);
        }/*
        VER LOS ALUMNOS DE LA MATRIZ
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("Alumno: " + (i+1) + " Nombre: " + this.alumnos[0][i] + " Edad: " + this.alumnos[1][i]);
        }
        */
    }

}
