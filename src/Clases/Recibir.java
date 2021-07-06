package Clases;

public class Recibir<T> {

    private String matriz[][];
    private int cantidad;


    public Recibir(T matriz[][]){
        this.matriz = (String[][]) matriz;
        this.cantidad = this.matriz[0].length;
        if(matriz.length == 2){
            System.out.println("Datos Recibidos: ");
            this.mostrarMatrizAlumnos();
        }else if(matriz.length==3){

        }
    }

    private void mostrarMatrizAlumnos(){
        //Mostrando los datos
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("Alumno: "+ (i+1) + ", Nombre: " + this.matriz[0][i]+ ", Edad: " + this.matriz[1][i]);
        }
    }

}
