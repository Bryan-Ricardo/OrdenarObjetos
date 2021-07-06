package ClasesAnteriores;

import java.util.Scanner;

public class Alumno implements Persona {
    private String alumnos[][];
    private int cantidadAlumnos;
    private String nombre;
    private int edad;
    private String nombres[];
    private int edades [];
    private Scanner usuario = new Scanner(System.in);
    private Envio<String> envio = new Envio<String>();
    private Recibir<String> recibir;

    public Alumno(){

    }

    public Alumno(String administrador){
        System.out.println("Hola, " + administrador + " ¿Cuantos alumnos quieres ordenar?");
        this.cantidadAlumnos = this.usuario.nextInt();
        //Coloco la capacidad de los arreglos nombres y edades
        this.nombres = new String[this.cantidadAlumnos];
        this.edades = new int[this.cantidadAlumnos];
        //Realiso un ciclo que llenara los valores de los arreglos nombres y edades
        for (int i = 0; i < this.cantidadAlumnos; i++) {
            this.nombres[i] = this.nombre();
            this.edades[i] = this.edad();
        }
        //Inisialiso la matriz
        this.alumnos = new String[2][this.cantidadAlumnos];
        //Realiso un llenado de la matriz que se enviara
        //lleno primero con los nombres
        for (int i = 0; i < this.cantidadAlumnos; i++) {
            this.alumnos[0][i] = this.nombres[i];
        }
        //lleno las edades
        for (int i = 0; i < this.cantidadAlumnos; i++) {
            this.alumnos[1][i] = String.valueOf(this.edades[i]);
        }
        //Envio la matriz
        this.envio.enviarObjeto(this.alumnos);
        //Recibir la matriz
        System.out.println("Ya se acomodaron los datos " +administrador + "son los siguientes: ");
        this.recibir = new Recibir<String>();
    }

    public String nombre(){
        System.out.println("¿Cual es el nombre del alumno?");
        this.nombre = this.usuario.next();
        return this.nombre;
    }
    public int edad(){
        System.out.println("¿Cual es la edad del alumno?");
        this.edad = this.usuario.nextInt();
        return this.edad;
    }
}
