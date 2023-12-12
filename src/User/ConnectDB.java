
package User;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
    public Statement stm;
    public ResultSet rs;
    
    private final String driver = "org.mysq.Driver";
    private final String root = "jdbc:mysql://127.0.0.1/face_recogn";
    private final String user = "root";
    private final String pass = "";
    
    public Connection conn;
    
    public void connect(){
        try{
            System.setProperty("jdbc.driver", driver);
            conn = DriverManager.getConnection(root, user, pass);
            System.out.println("Successful");
        } catch(SQLException e){    
            System.out.println("Error: " + e);
        }
    }
    
    public void disconnect(){
        try{
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Error: " + e);
        }
    }
    
    public void executeSQL(String SQL){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
 /*   
    public static void main(String[] args){
        ConnectDB connect = new ConnectDB();
        connect.connect();
   } */ 
}
