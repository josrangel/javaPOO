public class PruebaAutos {
    public static void main(String[] args) {
        Auto auto = new Auto("Aveo","45453435","Rojo");
        auto.acelerar();
        auto.info();

        System.out.println("El modelo del carro es: "+ auto.modelo);
        //eliminar
        auto=null;
    }
}
