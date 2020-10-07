public class Auto {
    //atributos
    //protected es a nivel de paquete y herencia
    protected String modelo;
    String noMotor;
    String velocidadMaxima="200 km/h";
    String aceleracion="90";
    String color;
    byte puertas=4;

    //constructor
    public Auto(String modelo, String noMotor, String color) {
        this.modelo = modelo;
        this.noMotor = noMotor;
        this.color = color;
    }

    //metodos
    void arrancar(){
        System.out.println("El vehiculo ha encendido brrrr brrr");
    }

    void acelerar(){
        System.out.println("El vehiculo esta acelerando a "+ aceleracion);
    }

    void info(){
        System.out.println("Modelo: "+modelo+"\nMotor: "+ noMotor+"\nVelocidad Maxima: "+ velocidadMaxima+"\nColor: "+ color);
    }
    //consulta
    //actualizacion
}
