package ClasesAnteriores;

public class Recibir<T>{
    private T matriz[][] = null;
    private int cantidad;

    public Recibir(){
        this.mostar();
    }

    public Recibir(T matriz[][]){
        this.matriz = matriz;
        this.cantidad = this.matriz[0].length;
    }

    private void mostar(){
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println("Nombre: " + this.matriz[0][i]+"Edad: " +this.matriz[1][i]);
        }
    }

}
