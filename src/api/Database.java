package api;

import java.sql.Connection;

public interface Database {

    public Connection connect();
    public void close();
    
}
