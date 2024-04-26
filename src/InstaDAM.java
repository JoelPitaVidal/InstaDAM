import javax.swing.*;
import java.awt.*;

public class InstaDAM implements menuInstaDAM {
//Metodo para comenzar el proceso de registro
    @Override
    public void registrarse() {
        Registro reg= new Registro();
        reg.setDatosUsuario();
    }
//Metodo para comenzar el proceso de subir una publicación
    @Override
    public void hacerPublicacion() {
    Publicaciones pub = new Publicaciones();
    pub.setHacerPublicacion();
    }
//Metodo para comenzar el proceso de início de sesión
    @Override
    public void iniciarSesion() {
    Usuarios usu = new Usuarios();
    usu.setInicioSesionUsuarios();
    }
//Metodo para comenzar el proceso de revisión de las publicaciónes actuales
    @Override
    public void verNumPublicacion() {
    Publicaciones pub = new Publicaciones();
    pub.getPublicaciones();
    }
//Método para ver el contenido de lás publicaciones
    @Override
    public void verContenidoPublicaciones() {
        Publicaciones pub = new Publicaciones();
        pub.getContenidoPublicaciones();
    }


}
