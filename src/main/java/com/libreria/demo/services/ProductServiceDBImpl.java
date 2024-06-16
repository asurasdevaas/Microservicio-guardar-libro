package com.libreria.demo.services;

import com.libreria.demo.controllers.domain.Producto;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
/*import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.sql.Statement;

/*@Service("BD")
@ConditionalOnProperty(value = "productos.estrategia", havingValue = "EN_BD")*/

public class ProductServiceDBImpl {

    String url = "jdbc:postgresql://localhost:5432/tienda";
    String user = "postgres";
    String password = "1234";

    public List<Producto> getProductos() {

        List<Producto> productStore = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión establecida con éxito.");

            // Crea un Statement para ejecutar consultas
            Statement statement = connection.createStatement();

            // Define tu consulta SQL
            String sql = "SELECT * FROM productos";

            // Ejecuta la consulta y obtiene el resultado
            ResultSet resultSet = statement.executeQuery(sql);

            // Procesa el resultado

            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                int quantity = resultSet.getInt("quantity");
                Producto producto = new Producto(isbn, quantity);
                productStore.add(producto);
                System.out.println("ID: " + isbn + ", Nombre: " + quantity);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos:");
            e.printStackTrace();
        }
        return productStore;
    }

    public void saveProducto(Producto producto) {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión establecida con éxito.");

            // Define tu sentencia SQL de inserción
            String sql = "INSERT INTO productos (isbn, quantity) VALUES (?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Establece los valores de los parámetros
                preparedStatement.setString(1, producto.getIsbn());
                preparedStatement.setInt(2, producto.getQuantity());

                // Ejecuta la inserción
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Filas insertadas: " + rowsAffected);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos o al insertar datos:");
            e.printStackTrace();
        }

    }
}
