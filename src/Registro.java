import javax.swing.*;
import java.util.HashMap;

public class Registro {
    private String nombreUsuario;
    private String contraseñaUsuario;
    private int numpubli;

//Mostrar nombre de usuario y contraseña
    public void getDatosUsuario() {
        JOptionPane.showInputDialog("El usuário es: "+nombreUsuario+" y su contraseña es: "+contraseñaUsuario);
    }
//Creación del Hash Map
    HashMap<String, Usuarios> Usuarios = new HashMap<String, Usuarios>();
//Creámos el metodo que servirá para iniciar sesión
    public void setDatosUsuario() {
        String opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
        do{
            if (opcion.equalsIgnoreCase("no")){
                JOptionPane.showInputDialog("Los usuarios creados y sus contraseñas son: " +Usuarios);
            } else if (opcion.equalsIgnoreCase("si")) {
                //String nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                Usuarios.put(nombreUsuario, new Usuarios(nombreUsuario,JOptionPane.showInputDialog("Ingrese un nombre de usuario")));
                Usuarios.put(contraseñaUsuario, new Usuarios(contraseñaUsuario,JOptionPane.showInputDialog("Ingrese una contraseña")));
                //contraseña= JOptionPane.showInputDialog("Ingrese una contraseña");
                //opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");
                opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
            }else if (opcion!="si"&&opcion!="no"){
                opcion = "si";
            }
        }while (opcion=="si");



    }
}
