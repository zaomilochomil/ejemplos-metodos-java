package E;

/**
 *
 * @author saul
 */
public class P2 {

    public static String saludar(String nombre) {

        String saludo = "Hola. Bienvenido " + nombre;

        return saludo;
    }

    public static String error(String nombre) {

        String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

        return error;
    }

    public static void verificar(String usuario, String contrasenia) {
        String usuarioValido = "Zao";

        String contraseniaValida = "MilOchoMil";

        if (usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia)) {
            System.out.println(saludar(usuario));
            return;
        }

        System.out.println(error(usuario));
    }

    public static void main(String[] args) {
        String usuario = "Zao";
        String contrasenia = "MilOchoMil";

        verificar(usuario, contrasenia);

    }
}
