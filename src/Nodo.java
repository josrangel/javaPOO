public class Nodo {
    private float dato;
    private Nodo sig;

    public Nodo(float dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public float getDato() {
        return dato;
    }

    public void setDato(float dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
