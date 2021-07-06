package Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Hola, ¿Como te llamas?");
        String administrador = usuario.next();
        Alumnos alumno = new Alumnos(administrador);

    }
}
