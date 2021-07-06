package ClasesAnteriores;

public class Ordenamiento<T> {
    private Envio<T> envio = new Envio<T>();
    private T matriz[][] = null;
    private int cantidad;
    private String cadenaTexto[];
    private int cadenaEnteroUno[];
    private Recibir<T> recibir;

    private Ordenamiento(){
    }

    public Ordenamiento(T matriz[][]){
        this.matriz = matriz;
        this.cantidad = this.matriz[0].length;
        this.descomponerMatriz();
        this.ordenarDeMenorAMayor();
        this.llenarMatriz();
        this.recibir = new Recibir<T>(this.matriz);
    }

    private void descomponerMatriz(){
        this.cadenaTexto = new String[this.cantidad];
        this.cadenaEnteroUno = new int[this.cantidad];
        //Ingresando los valores de las cadenas
        for (int i = 0; i <this.cantidad ; i++) {
            this.cadenaTexto[i] = String.valueOf(this.matriz[0][i]);
        }
        //Ingresando los valores de las cadenas
        for (int i = 0; i <this.cantidad ; i++) {
            this.cadenaEnteroUno[i] = Integer.valueOf((Integer) this.matriz[1][i]);
        }
    }

    private void ordenarDeMenorAMayor(){
        //Algoritmo para acomodar del menor al mayor
        for (int i = 0; i < this.cantidad; i++) {
            for (int j = (i+1); j < this.cantidad; j++) {
                if(this.cadenaEnteroUno[i] > this.cadenaEnteroUno[j]){
                    int edadMenor = this.cadenaEnteroUno[j];
                    int edadMayor = this.cadenaEnteroUno[i];
                    String nombreMenor = this.cadenaTexto[j];
                    String nombreMayor = this.cadenaTexto[i];
                    this.cadenaTexto[i] = nombreMenor;
                    this.cadenaTexto[j] = nombreMayor;
                    this.cadenaEnteroUno[i] = edadMenor;
                    this.cadenaEnteroUno[j] = edadMayor;
                }
            }
        }
    }

    public void llenarMatriz(){
        //llenando los datos en una matriz
        for (int i = 0; i < this.cantidad; i++) {
            String nombre = this.cadenaTexto[i];
            int edad = this.cadenaEnteroUno[i];
            this.matriz[0][i] = (T) String.valueOf(nombre);
            this.matriz[1][i] = (T)String.valueOf(edad);
        }
    }
}
