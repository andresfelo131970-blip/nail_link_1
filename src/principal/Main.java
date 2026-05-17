package principal;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // INSERTAR

        Usuario usuario1 =
                new Usuario(
                        "felipe",
                        "1234",
                        "Cliente"
                );

        Usuario usuario2 =
                new Usuario(
                        "alejandra",
                        "abcd",
                        "Empleado"
                );

        Usuario usuario3 =
                new Usuario(
                        "maria",
                        "5678",
                        "Empleado"
                );

        usuarioDAO.insertarUsuario(usuario1);
        usuarioDAO.insertarUsuario(usuario2);
        usuarioDAO.insertarUsuario(usuario3);

        // CONSULTAR
        System.out.println("\nLISTA DE USUARIOS");
        usuarioDAO.consultarUsuarios();

        // ACTUALIZAR
       Usuario usuarioActualizado =
                new Usuario(
                        "andres felipe",
                        "9999",
                        "Administrador"
                );


        usuarioActualizado.setIdUsuario(1);

        usuarioDAO.actualizarUsuario(usuarioActualizado);

        // ELIMINAR
       usuarioDAO.eliminarUsuario(3);

       //CONSULTA NUEVAMENTE
       System.out.println("\nLISTA ACTUALIZADA");
        usuarioDAO.consultarUsuarios();
    }
}