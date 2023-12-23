package Capture;

import User.ConnectDB;
import User.ModelTable;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class ControlPerson {

    ConnectDB connect = new ConnectDB();
    public void insert(ModelPerson mod) {
        String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));

        try {
            connect.connection();
            PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO person (id, first_name, last_name, phone_number, father_name, date_of_birth, place_of_birth, tax_payer, article, register_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getFirst_name());
            pst.setString(3, mod.getLast_name());
            pst.setString(4, mod.getDob());
            pst.setString(5, mod.getFathername());
            pst.setString(6, mod.getDob());
            pst.setString(7, mod.getPob());
            pst.setString(8, mod.getTaxpayer());
            pst.setString(9, mod.getArticle());
            pst.setString(10, date);
            pst.executeUpdate();
            System.out.println("Data of: " + mod.getFirst_name() + " registered");
            connect.disconnect();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public void update(ModelPerson mod, int id) {
        connect.connection();
        try {
            PreparedStatement pst = connect.conn.prepareStatement("UPDATE person SET first_name= ?, last_name= ?, father_name= ?, phone_number= ?, date_of_birth= ?, place_of_birth= ?, tax_payer=?, article=?, register_date=? WHERE id=?");
            pst.setString(1, mod.getFirst_name());
            pst.setString(2, mod.getLast_name());
            pst.setString(4, mod.getDob());
            pst.setString(3, mod.getFathername());
            pst.setString(5, mod.getDob());
            pst.setString(6, mod.getPob());
            pst.setString(7, mod.getTaxpayer());
            pst.setString(8, mod.getArticle());
            pst.setInt(9, id);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Помилка оновлення даних! \n ERROR: " + ex);
        }
        connect.disconnect();
    }

    public void delete(int id) {
        connect.connection();
        try {
            PreparedStatement pst = connect.conn.prepareStatement("DELETE FROM person WHERE id= '" + id + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Успішно видалено!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Помилка видалення. Спробуйте знову!");
        } finally {
            connect.disconnect();
        }
    }

    public void fillTable(String SQL, JTable table) {
        String id = null;

        connect.connection();
        ArrayList rows = new ArrayList();
        String[] columns = new String[]{"", "ID", "ПІБ", "Телефон", "ДН", "МН", "РНКОПП", "Стаття"};
        connect.executeSQL(SQL);
        try {
            connect.rs.first();
            do {
                rows.add(new Object[]{
                    "",
                    connect.rs.getString("id"),
                    connect.rs.getString("first_name") + " " + connect.rs.getString("father_name") + " " + connect.rs.getString("last_name"),
                    connect.rs.getString("phone_number"),                
                    connect.rs.getString("date_of_birth"),
                    connect.rs.getString("place_of_birth"),
                    connect.rs.getString("tax_payer"),
                    connect.rs.getString("article")});
            } while (connect.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Empty Registration List!");
        } finally {
            connect.disconnect();
        }

        ModelTable model = new ModelTable(rows, columns);
        table.setModel((TableModel) model);
        table.getColumnModel().getColumn(0).setCellRenderer(new ControlPerson.ImageRenderer());
        table.getColumnModel().getColumn(1).setMaxWidth(0);
        table.getColumnModel().getColumn(1).setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        table.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    class ImageRenderer implements TableCellRenderer {

        public JLabel lbl = new JLabel();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            try {
                Object text = table.getValueAt(row, 1);
                File image = new File("C:\\photos\\person." + text + ".1.jpg");
                String path = image.getAbsolutePath();
                ImageIcon i = new ImageIcon(new ImageIcon(String.valueOf(path)).getImage().getScaledInstance(lbl.getWidth() + 50, lbl.getHeight() + 50, Image.SCALE_SMOOTH));
                lbl.setIcon(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lbl;
        }
    }

    public void edit(ModelPerson mod, int id) {
        connect.connection();
        try {
            PreparedStatement pst = connect.conn.prepareStatement("UPDATE apto SET apto= ? WHERE id=? ");
            pst.setString(1, mod.getFirst_name());
            pst.setInt(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Успішно оновлено");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Помилка редагування. Спробуйте знову!");
        } finally {
            connect.disconnect();
        }
    }

}
