import Entidades.Director;

public class PruebaHerencia {
    public static void main(String[] args) {
        Director dir = new Director(args[0],args[1],args[2],Byte.parseByte(args[3]),Integer.parseInt(args[4]));
        Director dir1 = new Director(args[0],args[1],args[2],Byte.parseByte(args[3]),Integer.parseInt(args[4]));
        Director dir2 = new Director(args[0],args[1],args[2],Byte.parseByte(args[3]),Integer.parseInt(args[4]));
    }
}
