import java.util.Scanner;

public class TestOrdenarObjetos {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingresa, ¿Cuantos alumnos quieres ingresar?");
        int cantidadDatos = usuario.nextInt();
        //Inicialisando los arreglos
        String nombres[] =new String[cantidadDatos];
        int edades[] = new int[cantidadDatos];
        String alumnos[][] = new String[2][cantidadDatos];
        //llenando los datos
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("Ingresa el nombre:");
            nombres[i] = usuario.next();
            System.out.println("Ingrese la edad:");
            edades[i] = usuario.nextInt();

        }
        //Algoritmo para acomodar del menor al mayor
        for (int i = 0; i < cantidadDatos; i++) {
            for (int j = (i+1); j < cantidadDatos; j++) {
                if(edades[i] > edades[j]){
                    int edadMenor = edades[j];
                    int edadMayor = edades[i];
                    String nombreMenor = nombres[j];
                    String nombreMayor = nombres[i];
                    nombres[i] = nombreMenor;
                    nombres[j] = nombreMayor;
                    edades[i] = edadMenor;
                    edades[j] = edadMayor;
                }
            }
        }
        //llenando los datos en una matriz
        for (int i = 0; i < cantidadDatos; i++) {
            String nombre = nombres[i];
            int edad = edades[i];
            alumnos[0][i] = nombre;
            alumnos[1][i] = String.valueOf(edad);
        }

        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("Nombre: " + alumnos[0][i] + " Edad: " + alumnos[1][i]);
        }

        //Mostrar datos de la matiz
        /*
        for (int i = 0; i < alumnos[2].length; i++) {
                System.out.println("Nombre: " + alumnos[0][i]+"Edad: " +alumnos[1][i]);
        }

 /*
        //////////////////////////////////////////////////

        /*String  arreglo[][] = {{"Bryan","Ricardo","Barbosa","Olvera"},{"17","18","19","20"}};
        for (int i = 0; i < arreglo[0].length ; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.println("Dato arr[" + i+ "][" + j+"]" + arreglo[i][j]);
            }
        }*/
    }
}

