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

    public void setDatosUsuario() {
        HashMap<String, String> Usuarios = new HashMap<String, String>();
        String opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");;
        do{
            if (opcion=="no"){
                JOptionPane.showInputDialog("Los usuarios creados y sus contraseñas son: " +Usuarios);
            } else if (opcion=="si") {
                Usuarios.put(this.nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario"), this.contraseña= JOptionPane.showInputDialog("Ingrese una contraseña"));
                opcion = JOptionPane.showInputDialog("Desea añadir un nuevo usuario?  (si/no) ");
            }else if (opcion!="si"&&opcion!="no"){
                opcion = "si";
            }

        }while (opcion=="si");
    }
}
