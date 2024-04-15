
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Usuarios extends JFrame {
    Registro reg= new Registro();
    String  nombre;
    String  contraseña;

    /**
     * @param nombreUsuario nombre del usuario
     * @param contraseñaUsuario contraseña del usuario
     */

//Constructor Parametrizado
    public Usuarios(String nombreUsuario, String contraseñaUsuario) {
        this.nombre = nombreUsuario;
        this.contraseña = contraseñaUsuario;
    }
//Constructor sin parametrizar
    public Usuarios(){
    }
    public void setInicioSesionUsuarios(  ) {
// Configurar el título y el cierre del JFrame
        setTitle("Inicio de sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Crear un JPanel y establecer FlowLayout como su gestor de layout
          JPanel panel = new JPanel(new FlowLayout());
// Añadir botón de inicio de sesión
          JButton inicioSesion = new JButton("Iníciar de sesión");
          panel.add(inicioSesion);
          add(panel);
//Añadimos una acción al boton de inicio de sesión
          inicioSesion.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
              JOptionPane.showMessageDialog(null,"el usuário actual es: Nombre de Usuario");
          }
    });
// Añadir el panel al JFrame
        add(panel);
// Ajustar el tamaño del JFrame y hacerlo visible
        setSize(300, 150);
        setVisible(true);
    }
    public void logearUsuario(){

    }

}


