import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Conexion extends JFrame{
    private JButton button1;
    private JPanel panel1;
    private JLabel verdatos;

    public Conexion(){
        setTitle("Conexion a Base de Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setContentPane(panel1);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/ESFOT_VENTA";
                String user ="root";
                String password = "";

                try (Connection connection = DriverManager.getConnection(url,user,password);
                System.out.println("Conectado a la base de datos");
                String query = "select CORREO from CLIENTES";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                StringBuilder = new StringBuilder("<html>");

                while (resultSet.next()) {
                    verdatos.append("<b>Nombre:</b> ").append(resultSet.getString("Nombre")).append("<br>");
                    verdatos.append("<b>Correo:</b> ").append(resultSet.getString("Correo")).append("<br>");
                    verdatos.append("<b>Password:</b> ").append(resultSet.getString("Password")).append("<br><br>");

                }
                verdatos.append("</html>");
                mostrar
            }
        });
    }

    public static void main(String[] args){
        Conexion conexion = new Conexion();
    }

}
