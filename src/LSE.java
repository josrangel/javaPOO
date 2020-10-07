public class LSE {
    private Nodo p,q;

    public LSE() {
        p=q=null;
    }

    public LSE(Nodo init) {
        p=q=init;
    }

    public LSE(int dato) {
        p=q= new Nodo(dato,null);
    }

    public void add(int dato){
        if(p == null){
            p=q =new Nodo(dato,null);
        }else{
            Nodo aux =new Nodo(dato,null);
            q.setSig(aux);
            q = q.getSig();

        }
    }

    public void borrarPorPrincipio(){
        if(p!=null){
            p= p.getSig();
        }
    }

    public void borrarPorFinal(){
        Nodo i;

        if(p.getSig() != null){
            for (i = p; i.getSig().getSig() != null; i = i.getSig());
            q = i;
            q.setSig(null);
        }else{
            p = q =null;
        }

    }

    public void agregarPorPrincipio(int dato){
        Nodo aux = new Nodo(dato,p);
         p= aux;
    }

}
