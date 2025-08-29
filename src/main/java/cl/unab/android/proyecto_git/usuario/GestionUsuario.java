package cl.unab.android.proyecto_git.usuario;

import java.util.ArrayList;

public class GestionUsuario {
    ArrayList<Usuario> usuarios;

    public GestionUsuario(){
        this.usuarios = new ArrayList<Usuario>();
    }

    public void crearUsuario(String nombre, String mail) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setMail(mail);

        usuarios.add(nuevoUsuario);
    }
}