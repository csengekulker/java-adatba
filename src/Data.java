import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class Data {

  //later: SQLite 
  Database db;
  Connection conn;

  public Data(Database db) {
    this.db = db;
  }

  public void connect() {
    this.conn = this.db.connectDB();
  }

  public void close() {
    this.db.closeDB(this.conn);
  }

  public List<Employee> getEmployees () {
    List<Employee> emplist = new ArrayList<>();

    try {
      emplist = this.tryGetEmployees();
    } catch (SQLException e) {
      System.err.println(e);
    }

    return emplist;
  }

  public List<Employee> tryGetEmployees () throws SQLException {
    List<Employee> emplist = new ArrayList<>();

    String query = "SELECT * FROM employees";

    this.connect();

    Statement stmt = this.conn.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      Employee emp = new Employee();

      emp.id = rs.getInt("id");
      emp.name = rs.getString("name");
      emp.city = rs.getString("city");
      emp.salary = rs.getDouble("salary");

      emplist.add(emp);
    }

    this.close();

    return emplist;
  }
}
