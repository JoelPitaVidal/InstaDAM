import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Publicaciones extends JFrame{
    String contenido;
    int contador;
    String siOno;

    /**
     * contenido: contenido de la publicación
     * contador: cuenta el número de publicaciones realizadas por el usuario
     * siOno: gestiona el número de publicaciones realizadas, permitiendo hacer varias seguidas
     */

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
// Añadir botón para subir una publicación
        JButton publicar = new JButton("Hacer Publicación");
        panel.add(publicar);
        add(panel);
//Añadimos una acción al boton de hacer publicación
        publicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
 //Se pide un contenido para la publicación y luego se pregunta si se desea hacer otra publicacion
                contenidoPub.add(JOptionPane.showInputDialog("Introduzca el contenido de su publicacion:"));
//Si la variable siOno es igual a "no", se muestra el contenido de la publicación y se cierra la ventana
                siOno = JOptionPane.showInputDialog("¿Desea hacer otra publicacion? (si/no)");
                do{
                if (siOno.equalsIgnoreCase("no")){
                    JOptionPane.showInputDialog("El contenido  de la publicacion realizada es de: "+contenidoPub);
//Si la variable siOno es igual a "si" se repite el proceso del inicio del bucle, se pide contenido para la publicacion,
// se pide contenido para la publicación y el contador aumenta en 1
                }else if (siOno.equalsIgnoreCase("Si")){
                    contenidoPub.add(JOptionPane.showInputDialog("Introduzca el contenido de su publicacion:"));
                    siOno = JOptionPane.showInputDialog("¿Desea hacer otra publicacion?");
                    contador++;
//si la variable siOno no es igual ni a "si" ni a "no" se da por echo que la respuesta es si y se reinicia el ciclo
                } else if (siOno!="si"&&siOno!="no") {
                    siOno="si";
                    }
                }while(siOno=="si");
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
