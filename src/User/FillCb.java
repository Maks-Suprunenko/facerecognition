package User;

import java.sql.SQLException;
import javax.swing.JComboBox;

public class FillCb {

    ConnectDB connect = new ConnectDB();

    public void fillCombo(String SQL, JComboBox combo, String column) {
        connect.connection();
        connect.executeSQL(SQL);
        try {
            combo.removeAllItems();
            connect.rs.first();
            do {
                new CustomCb(combo).customCb(combo, connect.rs.getString(column));
//                combo.addItem(connect.rs.getString(column));
                combo.setSelectedItem(null);
            } while (connect.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error receiving data");
            System.out.println(ex);
        }
        connect.disconnect();
    }

}
