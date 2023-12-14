
package User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControlPerson {
    ConnectDB conn = new ConnectDB();
    public void insert(ModelPerson mod){
       try{ conn.connect();
        PreparedStatement pst = conn.conn.prepareStatement("INSERT INTO person (id, first_name, last_name, father_name, dob, pob, wanted_article) values (?, ?, ?, ?, ?, ?, ?)");
        pst.setInt(1, mod.getId());
        pst.setString(2, mod.getFirstName());
        pst.setString(3, mod.getLastName());
        pst.setString(4, mod.getFatherName());
        pst.setString(5, mod.getdOb());
        pst.setString(6, mod.getpOb());
        pst.setString(7, mod.getWantedArticle());
    pst.executeUpdate();
        System.out.println("Person " + mod.getLastName() + mod.getFirstName() + mod.getFatherName() +" is registered");
        conn.disconnect();
       }
       catch(SQLException ex){
           System.out.println("Error: " + ex);
       }
    }
}
