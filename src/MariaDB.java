import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDB implements Database {

  public Connection tryConnectDB() throws SQLException {

    Connection conn = null;
    String url = "jdbc:mariadb://localhost:3306/adatba";
    String usr = "adatba";
    String psw = "titok";
  
    conn = DriverManager.getConnection(url, usr, psw);

    return conn;
  }

  public void tryCloseDB (Connection conn) throws SQLException {
    conn.close();
  }

  public Connection connectDB() {
    Connection conn = null;
    try {
      conn = tryConnectDB();

    } catch (SQLException e) {
      System.err.println(e);
    }

    return conn;
  }

  public void closeDB(Connection conn) {
    
    try {
      tryCloseDB(conn);
    } catch (SQLException e) {
      System.err.println(e);
    }

  }
}
