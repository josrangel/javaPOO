import javax.swing.*;

public class Pila {
    private int[] arreglo;
    private int tope;

    public Pila() {
        arreglo = new int[10];
        tope=1;
    }

    private boolean validaVacio(){
        return tope==-1;
    }

    private boolean validaLleno(){
        return tope==9;
    }

    public void push(int dato){
        if(!validaLleno()) {
            arreglo[++tope]=dato;
        }
    }

    public void push(){
        if(!validaLleno()) {
            arreglo[++tope]=new Integer(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
        }
    }

    public void pop(){
        if(!validaVacio()) {
            tope--;
            System.out.println("valor eliminado: "+arreglo[tope+1]);
        }
    }

    public int busqueda(int numero){
        for (int i=0;i<=tope;i++){
            if(arreglo[i] == numero){
                return i;
            }
        }
        return -1;
    }

    public double promedio(){
        int suma=0;
        if(validaVacio()){
            for (int i=0;i<=tope;i++){
                suma+=arreglo[i];
            }
            return suma/(tope+1);
        }
        return -1;
    }

    public boolean sustituir(int numero, int nuevoNumero){
        int n2=busqueda(numero);
        if(n2 != -1){
            arreglo[n2] = nuevoNumero;
            return true;
        }
        return false;
    }
}
