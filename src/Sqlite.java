import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Sqlite implements Database{

  public Connection tryConnectDB() throws SQLException {
    String url = "jdbc:sqlite:adatba.sqlite";

    return DriverManager.getConnection(url);
  }

  @Override
  public Connection connectDB() {

    Connection conn = null;

    try {
      conn = tryConnectDB();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return conn;
  }

  public void tryCloseDB(Connection conn ) throws SQLException {
    conn.close();
  }

  @Override
  public void closeDB(Connection conn) {
    try {
      tryCloseDB(conn );
    } catch (SQLException e) {
      System.err.println(e);
    }
  }


}