import javax.swing.*;
import java.util.HashMap;

public class Registro {
    private String nombre;
    private String contraseña;
    private int numpubli;

    //Mostrar nombre de usuario y contraseña
    public String getDatosUsuario() {
        return nombre;
    }
    HashMap<String, Usuarios> Usuarios = new HashMap<String, Usuarios>();

    public void setDatosUsuario() {
        String opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
        do{
            if (opcion.equalsIgnoreCase("no")){
                JOptionPane.showInputDialog("Los usuarios creados y sus contraseñas son: " +Usuarios);
            } else if (opcion.equalsIgnoreCase("si")) {
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                Usuarios.put(nombre, new Usuarios(nombre,JOptionPane.showInputDialog("Ingrese una contraseña")));
                opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");
            }else if (opcion!="si"&&opcion!="no"){
                opcion = "si";
            }
        }while (opcion=="si");


        contraseña= JOptionPane.showInputDialog("Ingrese una contraseña");
    }
}
