package principal;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // INSERTAR
        Usuario nuevoUsuario =
                new Usuario(
                        "admin",
                        "123456",
                        "Administrador"
                );

        usuarioDAO.insertarUsuario(nuevoUsuario);

        // CONSULTAR
        usuarioDAO.consultarUsuarios();

        // ACTUALIZAR
        Usuario usuarioActualizado =
                new Usuario(
                        "superadmin",
                        "987654",
                        "Administrador"
                );

        usuarioActualizado.setIdUsuario(1);

        usuarioDAO.actualizarUsuario(usuarioActualizado);

        // ELIMINAR
        usuarioDAO.eliminarUsuario(1);
    }
}