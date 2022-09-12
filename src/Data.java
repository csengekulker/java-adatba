import java.sql.SQLException;

public class Data {

  //later: SQLite 
  Database db;

  public Data(Database db) {
    this.db = db;
  }

  public void connect() throws SQLException{
    this.db.connect();
  }
}
