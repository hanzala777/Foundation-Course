import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {  static Connection conn;
    public static Connection create() {
        try {
//			Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "Hanzala@mysql";
            String url= "jdbc:mysql://localhost:3306/student";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
}

}
