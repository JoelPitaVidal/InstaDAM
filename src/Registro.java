import javax.swing.*;
import java.util.HashMap;

public class Registro {
     String nombreUsuario;
     String contraseñaUsuario;
     int numpubli;

    /**
     * nobmreusuario: nombre del usuario
     * contraseñaUsuario: contraseña del usuario
     * numpubli:numero de publicaciones realizadas por el usuario
     */

//Mostrar nombre de usuario y contraseña
    public void getDatosUsuario() {
        JOptionPane.showInputDialog("El usuário es: "+nombreUsuario+" y su contraseña es: "+contraseñaUsuario);
    }
//Creación del Hash Map
    HashMap<String, Usuarios> Usuarios = new HashMap<String, Usuarios>();
//Creámos el metodo que servirá para iniciar sesión
    public void setDatosUsuario() {
        String opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
//iniciamos un bucle, se mantiene mientras la variable opción sea igual a "si"
        do{
            if (opcion.equalsIgnoreCase("no")){
                JOptionPane.showInputDialog("Los usuarios creados y sus contraseñas son: " +Usuarios);
//Si opcion es igual a "si" se pide un usuario y contraseña nuevo y se pregunta si se desea crear otro usuario
            } else if (opcion.equalsIgnoreCase("si")) {
                Usuarios.put(nombreUsuario, new Usuarios(nombreUsuario,JOptionPane.showInputDialog("Ingrese un nombre de usuario")));
                Usuarios.put(contraseñaUsuario, new Usuarios(contraseñaUsuario,JOptionPane.showInputDialog("Ingrese una contraseña")));
                opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
//Si opción es igual a algo diferente de "si" o "no" se da por echo que se desea crear otro usuario nuevo y opcion se iguala a "si"
            }else if (opcion!="si"&&opcion!="no"){
                opcion = "si";
            }
        }while (opcion=="si");



    }
}
