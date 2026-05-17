package dao;

import conexion.conexionBD;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    // INSERTAR
    public void insertarUsuario(Usuario usuario) {

        String sql =
                "INSERT INTO Usuario(Usuario, Contrasena, Rol) VALUES (?, ?, ?)";

        try (
                Connection conexion = conexionBD.conectar();
                PreparedStatement statement =
                        conexion.prepareStatement(sql)
        ) {

            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getContrasena());
            statement.setString(3, usuario.getRol());

            statement.executeUpdate();

            System.out.println("Usuario registrado");

        } catch (SQLException e) {

            System.out.println("Error al insertar: " + e.getMessage());

        }
    }

    // CONSULTAR
    public void consultarUsuarios() {

        String sql = "SELECT * FROM Usuario";

        try (
                Connection conexion = conexionBD.conectar();
                PreparedStatement statement =
                        conexion.prepareStatement(sql);
                ResultSet resultado =
                        statement.executeQuery()
        ) {

            while (resultado.next()) {

                System.out.println("ID: "
                        + resultado.getInt("idUsuario"));

                System.out.println("Usuario: "
                        + resultado.getString("Usuario"));

                System.out.println("Contrasena: "
                        + resultado.getString("Contrasena"));

                System.out.println("Rol: "
                        + resultado.getString("Rol"));

                System.out.println("---------------------");
            }

        } catch (SQLException e) {

            System.out.println("Error en consulta: "
                    + e.getMessage());

        }
    }

    // ACTUALIZAR
    public void actualizarUsuario(Usuario usuario) {

        String sql =
                "UPDATE Usuario SET Usuario=?, Contrasena=?, Rol=? WHERE idUsuario=?";

        try (
                Connection conexion = conexionBD.conectar();
                PreparedStatement statement =
                        conexion.prepareStatement(sql)
        ) {

            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getContrasena());
            statement.setString(3, usuario.getRol());
            statement.setInt(4, usuario.getIdUsuario());

            statement.executeUpdate();

            System.out.println("Usuario actualizado");

        } catch (SQLException e) {

            System.out.println("Error al actualizar: "
                    + e.getMessage());

        }
    }

    // ELIMINAR
    public void eliminarUsuario(int idUsuario) {

        String sql =
                "DELETE FROM Usuario WHERE idUsuario=?";

        try (
                Connection conexion = conexionBD.conectar();
                PreparedStatement statement =
                        conexion.prepareStatement(sql)
        ) {

            statement.setInt(1, idUsuario);

            statement.executeUpdate();

            System.out.println("Usuario eliminado");

        } catch (SQLException e) {

            System.out.println("Error al eliminar: "
                    + e.getMessage());

        }
    }
}