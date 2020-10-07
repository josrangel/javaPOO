public class NodoD {
    private int dato;

    private NodoD prev;
    private NodoD sig;

    public NodoD(int dato, NodoD prev, NodoD sig) {
        this.dato = dato;
        this.prev = prev;
        this.sig = sig;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoD getPrev() {
        return prev;
    }

    public void setPrev(NodoD prev) {
        this.prev = prev;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
}
