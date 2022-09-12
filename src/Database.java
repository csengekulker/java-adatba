import java.sql.Connection;
import java.sql.SQLException;

public interface Database {

  public Connection connectDB() throws SQLException;
  public void close(Connection conn) throws SQLException;

}
