import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Publicaciones extends JFrame{
    String contenido;
    int contador;

//Constructor sin parametrizar
    public Publicaciones(){
    }
//Crreamos el ArrayList que servirá para guardar el contenido de lás publicaciones
    ArrayList<String> contenidoPub= new ArrayList<>();
    public void setHacerPublicacion(  ) {
// Configurar el título y el cierre del JFrame
        setTitle("Hacer Publicación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Crear un JPanel y establecer FlowLayout como su gestor de layout
        JPanel panel = new JPanel(new FlowLayout());
// Añadir botón de inicio de sesión
        JButton publicar = new JButton("Hacer Publicación");
        panel.add(publicar);
        add(panel);
        publicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                contenidoPub.add(JOptionPane.showInputDialog("Introduzca el contenido de su publicacion:"));
                    String siOno = JOptionPane.showInputDialog("¿Desea hacer otra publicacion?");
                    if (siOno.equalsIgnoreCase("no")){
                    JOptionPane.showInputDialog("El contenido  de la publicacion realizada es de: "+contenidoPub);
                }else if (siOno.equalsIgnoreCase("Si")){
                    contenidoPub.add(JOptionPane.showInputDialog("Introduzca el contenido de su publicacion:"));
                    contador++;
                } else if (siOno!="si"&&siOno!="no") {
                    siOno="si";
                    }

            }
        });
// Añadir el panel al JFrame
        add(panel);
// Ajustar el tamaño del JFrame y hacerlo visible
        setSize(200, 200);
        setVisible(true);
    }
    public void getContenidoPublicaciones(){
        JOptionPane.showMessageDialog(null,"El contenido  de publicaciones realizadas es de: Mostrar contenido");
    }
    public void getPublicaciones(){
        JOptionPane.showInputDialog("El número de publicaciones realizadas es de: "+contador);
    }

}
