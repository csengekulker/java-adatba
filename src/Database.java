import java.sql.Connection;
import java.sql.SQLException;

public interface Database {

  public Connection connectDB() throws SQLException;
  public void closeDB(Connection conn) throws SQLException;

}
