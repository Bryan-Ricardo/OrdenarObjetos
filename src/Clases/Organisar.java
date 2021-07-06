package Clases;

public class Organisar <T>{
    private String matriz[][];
    private int primeraEleccion;
    private int segundaEleccion;
    private int terceraEleccion;
    private String nombres[] ;
    private int edades[] ;
    private double sueldos[];
    private int cantidad;
    //EL constructor Organisar para Alumnos
    public Organisar(T matriz[][],int primeraEleccion, int segundaEleccion){
        this.matriz = (String[][]) matriz;
        this.cantidad = matriz[0].length;
        this.primeraEleccion = primeraEleccion;
        this.segundaEleccion = segundaEleccion;
        //Coloco la cantidad de datos que tendran los arreglos
        this.nombres = new String[this.cantidad];
        this.edades = new int[this.cantidad];
        //Descompongo la matriz
        this.descomponerMatrizAlumnos();
        if (this.primeraEleccion == 1 ){
            if (this.segundaEleccion == 1){
                this.edadesMenorMayor();
            }else if(this.segundaEleccion == 2){
                this.edadesMayorMenor();
            }
        }else if (this.primeraEleccion == 2){
            if (this.segundaEleccion == 1){
                this.ordenAlfabeticoAZ();
            }else if(this.segundaEleccion == 2){
                this.ordenAlfabeticoZA();
            }
        }
        Recibir<T> recibir = new Recibir<T>((T[][]) this.matriz);
    }

    //EL constructor Organisar para Personas
    public Organisar(T matriz[][],int primeraEleccion, int segundaEleccion,int terceraEleccion){
        this.matriz = (String[][]) matriz;
        this.primeraEleccion = primeraEleccion;
        this.segundaEleccion = segundaEleccion;
        this.terceraEleccion = terceraEleccion;
    }

    private void descomponerMatrizAlumnos(){
        for (int i = 0; i < this.cantidad; i++) {
            //Colocando los nombres en el arreglo
            this.nombres[i] = this.matriz[0][i];
            //Colocando los edades en el arreglo
            this.edades[i] = Integer.parseInt(this.matriz[1][i]);
        }
        /*
        Mostrando los datos
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("ALumno: "+ (i+1) + ", Nombre: " + this.nombres[i]+ ", Edad: " + this.edades[i]);
        }
        */
    }

    private void descomponerMatrizEmpleados(){

    }

    //Funcionalidad para ordenar de diferentes formas
    private void edadesMenorMayor(){
        //Algoritmo para acomodar del menor al mayor
        for (int i = 0; i < this.cantidad; i++) {
            for (int j = (i+1); j < this.cantidad; j++) {
                if(this.edades[i] > this.edades[j]){
                    int edadMenor = this.edades[j];
                    int edadMayor = this.edades[i];
                    String nombreMenor = this.nombres[j];
                    String nombreMayor = this.nombres[i];
                    this.nombres[i] = nombreMenor;
                    this.nombres[j] = nombreMayor;
                    this.edades[i] = edadMenor;
                    this.edades[j] = edadMayor;
                }
            }
        }
        //llenando los datos en una matriz
        for (int i = 0; i < this.cantidad; i++) {
            String nombre = this.nombres[i];
            int edad = this.edades[i];
            this.matriz[0][i] = nombre;
            this.matriz[1][i] = String.valueOf(edad);
        }

        /*
        Mostar los datos acomodados
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("ALumno: "+ (i+1) + ", Nombre: " + this.matriz[0][i] + ", Edad: " + this.matriz[1][i]);
        }
        */
    }
    private void edadesMayorMenor(){
        //Algoritmo para acomodar del mayor al menor
        for (int i = 0; i < this.cantidad; i++) {
            for (int j = (i+1); j < this.cantidad; j++) {
                if(this.edades[i] < this.edades[j]){
                    int edadMenor = this.edades[j];
                    int edadMayor = this.edades[i];
                    String nombreMenor = this.nombres[j];
                    String nombreMayor = this.nombres[i];
                    this.nombres[i] = nombreMenor;
                    this.nombres[j] = nombreMayor;
                    this.edades[i] = edadMenor;
                    this.edades[j] = edadMayor;
                }
            }
        }
        //llenando los datos en una matriz
        for (int i = 0; i < this.cantidad; i++) {
            String nombre = this.nombres[i];
            int edad = this.edades[i];
            this.matriz[0][i] = nombre;
            this.matriz[1][i] = String.valueOf(edad);
        }

        /*
        Mostar los datos acomodados
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("ALumno: "+ (i+1) + ", Nombre: " + this.matriz[0][i] + ", Edad: " + this.matriz[1][i]);
        }
        */
    }

    //A-Z 65-90
    //a-z 97-122
    private void ordenAlfabeticoAZ(){
        //Algoritmo para acomodar de A-Z
        for (int i = 0; i < this.cantidad; i++) {
            for (int j = (i+1); j < this.cantidad; j++) {
                    if(this.nombres[i].charAt(0) > this.nombres[j].charAt(0)){
                        int edadMenor = this.edades[j];
                        int edadMayor = this.edades[i];
                        String nombreMenor = this.nombres[j];
                        String nombreMayor = this.nombres[i];
                        this.nombres[i] = nombreMenor;
                        this.nombres[j] = nombreMayor;
                        this.edades[i] = edadMenor;
                        this.edades[j] = edadMayor;
                        int nombrePequeño = 0;
                        /*if(this.nombres[i].length()<this.nombres[j].length()){
                            nombrePequeño = this.nombres[i].length()-1;
                            System.out.println(nombrePequeño);
                        }else if (this.nombres[i].length()>this.nombres[j].length()){
                            nombrePequeño = this.nombres[j].length()-1;
                            System.out.println(nombrePequeño);
                        }*/
                    }else if(this.nombres[i].charAt(0) == this.nombres[j].charAt(0)){
                        if(this.nombres[i].charAt(1) > this.nombres[j].charAt(1)){
                            int edadMenor = this.edades[j];
                            int edadMayor = this.edades[i];
                            String nombreMenor = this.nombres[j];
                            String nombreMayor = this.nombres[i];
                            this.nombres[i] = nombreMenor;
                            this.nombres[j] = nombreMayor;
                            this.edades[i] = edadMenor;
                            this.edades[j] = edadMayor;
                        }else if(this.nombres[i].charAt(1) == this.nombres[j].charAt(1)){
                            if(this.nombres[i].charAt(2) > this.nombres[j].charAt(2)){
                                int edadMenor = this.edades[j];
                                int edadMayor = this.edades[i];
                                String nombreMenor = this.nombres[j];
                                String nombreMayor = this.nombres[i];
                                this.nombres[i] = nombreMenor;
                                this.nombres[j] = nombreMayor;
                                this.edades[i] = edadMenor;
                                this.edades[j] = edadMayor;
                            }
                        }
                }
            }
        }
        //llenando los datos en una matriz
        for (int i = 0; i < this.cantidad; i++) {
            String nombre = this.nombres[i];
            int edad = this.edades[i];
            this.matriz[0][i] = nombre;
            this.matriz[1][i] = String.valueOf(edad);
        }
        /*
        Mostar los datos acomodados

        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("ALumno: "+ (i+1) + ", Nombre: " + this.matriz[0][i] + ", Edad: " + this.matriz[1][i]);
        }
        */
    }
    private void ordenAlfabeticoZA(){
        {
            //System.out.println("ordenAlfabeticoZA");
            //Algoritmo para acomodar de Z-A
            for (int i = 0; i < this.cantidad; i++) {
                for (int j = (i+1); j < this.cantidad; j++) {
                    if(this.nombres[i].charAt(0) < this.nombres[j].charAt(0)){
                        int edadMenor = this.edades[j];
                        int edadMayor = this.edades[i];
                        String nombreMenor = this.nombres[j];
                        String nombreMayor = this.nombres[i];
                        this.nombres[i] = nombreMenor;
                        this.nombres[j] = nombreMayor;
                        this.edades[i] = edadMenor;
                        this.edades[j] = edadMayor;
                        int nombrePequeño = 0;
                        /*if(this.nombres[i].length()<this.nombres[j].length()){
                            nombrePequeño = this.nombres[i].length()-1;
                            System.out.println(nombrePequeño);
                        }else if (this.nombres[i].length()>this.nombres[j].length()){
                            nombrePequeño = this.nombres[j].length()-1;
                            System.out.println(nombrePequeño);
                        }*/
                    }else if(this.nombres[i].charAt(0) == this.nombres[j].charAt(0)){
                        if(this.nombres[i].charAt(1) < this.nombres[j].charAt(1)){
                            int edadMenor = this.edades[j];
                            int edadMayor = this.edades[i];
                            String nombreMenor = this.nombres[j];
                            String nombreMayor = this.nombres[i];
                            this.nombres[i] = nombreMenor;
                            this.nombres[j] = nombreMayor;
                            this.edades[i] = edadMenor;
                            this.edades[j] = edadMayor;
                        }else if(this.nombres[i].charAt(1) == this.nombres[j].charAt(1)){
                            if(this.nombres[i].charAt(2) < this.nombres[j].charAt(2)){
                                int edadMenor = this.edades[j];
                                int edadMayor = this.edades[i];
                                String nombreMenor = this.nombres[j];
                                String nombreMayor = this.nombres[i];
                                this.nombres[i] = nombreMenor;
                                this.nombres[j] = nombreMayor;
                                this.edades[i] = edadMenor;
                                this.edades[j] = edadMayor;
                            }
                        }
                    }
                }
            }
            //llenando los datos en una matriz
            for (int i = 0; i < this.cantidad; i++) {
                String nombre = this.nombres[i];
                int edad = this.edades[i];
                this.matriz[0][i] = nombre;
                this.matriz[1][i] = String.valueOf(edad);
            }
            /*
            //Mostar los datos acomodados
            for (int i = 0; i < this.cantidad; i++) {
                System.out.println("ALumno: "+ (i+1) + ", Nombre: " + this.matriz[0][i] + ", Edad: " + this.matriz[1][i]);
            }
            */
        }
    }
}
