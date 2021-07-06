package ClasesAnteriores;

public class Envio<T>{
    private T obj[][] = null;
    private Ordenamiento<T> ordenamiento= new Ordenamiento<T>(this.matriz(this.obj));

    public Envio(){

    }

    public void enviarObjeto(T obj[][]){
        this.obj = obj;
    }

    private T[][] matriz(T obj[][]){
        return obj;
    }

}
