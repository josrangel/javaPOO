public class LDE {
    private NodoD p,q;
    public static int contador =0;

    public LDE(){
        p = q =null;
    }

    public LDE(NodoD init){
        p=q=init;
        q.setSig(init);
        q.setPrev(init);
        contador++;
    }

    public LDE(int dato){
        p=q=new NodoD(dato,null,null);
        q.setSig(p);
        q.setPrev(p);
    }

    public void add(int dato){
        NodoD aux= new NodoD(dato, null,null);

        if (p==null){
            p = q= aux;
            q.setSig(p);
            q.setPrev(p);
        }else{
            q.setSig(aux);
            aux.setPrev(q);
            aux.setSig(p);
            p.setPrev(aux);
            q = aux;
        }
    }

    public void eliminarFinal(){
        if (contador-- != 1) {
            q = q.getPrev();
            q.setSig(p);
            p.setPrev(q);
        }else{
            p = q =null;
        }
    }
}