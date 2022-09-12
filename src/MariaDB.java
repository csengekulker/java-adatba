import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDB implements Database{
  public Connection tryConnect() throws SQLException {

    Connection conn = null;
    String url = "jdb:mariadb://localhost:3306/adatba";
    String usr = "adatba";
    String psw = "titok";
  
    conn = DriverManager.getConnection(url, usr, psw);

    return conn;
  }

  public Connection connect() {
    Connection conn = null;
    try {
      conn = tryConnect();

    } catch (SQLException e) {
      System.err.println(e);
    }

    return conn;
  }

  public void close(Connection conn) {

  }
}
