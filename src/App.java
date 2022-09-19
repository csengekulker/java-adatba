import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {

    //independent of db type 
    Data data = new Data(new Sqlite());
    List<Employee> emplist = data.getEmployees();
    System.out.println(emplist.get(0).name);

  }
}

