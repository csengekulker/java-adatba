public class App {
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");

    //independent of db type 
    Data data = new Data(new MariaDB());

    data.connect();

    System.out.println("Connection established(?)");
  }
}
