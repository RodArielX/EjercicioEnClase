import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        conexion.iniciar();
    }
}
    /*public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ESFOT_VENTA";
        String user ="root";
        String password = "";

        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println("Conectado a la base de datos");
        String query = "select CORREO from CLIENTES";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            //System.out.println(resultSet.getString("NOMBRE"));
            System.out.println(resultSet.getString("CORREO"));
            //System.out.println(resultSet.getString("PASSWORD"));
        }
        connection.close();

    }
}*/