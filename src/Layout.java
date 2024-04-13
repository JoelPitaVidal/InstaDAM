import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends JFrame {
    Usuarios us = new Usuarios();
    InstaDAM inda = new InstaDAM();
    public Layout(){
        //Configuramos el titulo del Layout y el cierre del mismo
        setTitle("Bienvenido al Instagrám de DAM1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Configuramos JPanel y establecemos FlowLayout como su gestor de layout
        JPanel panel = new JPanel(new FlowLayout());
        //Botones
        JButton InicioSesion = new JButton("Início de sesión");
        JButton Registrarse = new JButton("Registrarse");
        JButton Publicar = new JButton("Hacer Publicación");
        JButton VerPublic = new JButton("Ver publicaciónes");
        JButton VerNumPubli = new JButton("Ver número de publicaciónes");
        // Añadir los botones al panel
        panel.add(InicioSesion);
        panel.add(Registrarse);
        panel.add(Publicar);
        panel.add(VerPublic);
        panel.add(VerNumPubli);
        // Añadir el panel al JFrame
        add(panel);
        //Configuramos las acciónes de los botones
            //Inicio de sesion
            InicioSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inda.iniciarSesion();
            }
        });
            //Registrarse
             Registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inda.registrarse();
            }
        });
            //Hacer Publicacion
            Publicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inda.hacerPublicacion();
            }
        });
            //Ver Publicacion
            VerPublic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inda.verContenidoPublicaciones();
            }
        });
            //Ver Número de publicaciones
            VerNumPubli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inda.verNumPublicacion();
            }
        });
        // Ajustar el tamaño del JFrame y hacerlo visible
        setSize(441, 147);
        setVisible(true);
      }
    }

