package Entidades;
import EstructurasPadres.Persona;
public class Director extends Persona{
    private static int id=1;
    private int cedula;
    private int identificador;

    public Director(String nombre, String apPaterno, String apMaterno, byte edad, int cedula) {
        super(nombre, apPaterno, apMaterno, edad);
        this.cedula=cedula;
        identificador = id++;
        System.out.println("hijo");
    }


}