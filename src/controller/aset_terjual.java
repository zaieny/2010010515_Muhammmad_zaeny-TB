
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class aset_terjual {
     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_jual;
     public String terjual;
     public String nama_aset;
    public String jumlah_aset;
    public String harga_aset;
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO aset_terjual(id_jual,terjual,nama_aset,jumlah_aset,harga_aset)VALUE(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_jual);
        pst.setString(2,terjual);
        pst.setString(3,nama_aset);
        pst.setString(4,jumlah_aset);
        pst.setString(5,harga_aset);
        pst.execute();
        pst.close();
     }
    
    public void edit()throws SQLException{
    conn = Koneksi.getKoneksi();
        sql = "UPDATE aset_terjual set  terjual=?,nama_aset=?,jumlah_aset=?,harga_aset=? where id_jual=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,terjual);
        pst.setString(2,nama_aset);
        pst.setString(3,jumlah_aset);
        pst.setString(4,harga_aset);
        pst.setString(5,id_jual);
        pst.execute();
        pst.close();}
        
    
    public void hapus() throws SQLException{
        conn=Koneksi.getKoneksi();
        String sql="DELETE from aset_terjual where id_jual=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, id_jual);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
   
    public ResultSet Updateasetterjual()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "select id_jual,terjual,nama_aset,jumlah_aset,harga_aset from aset_terjual";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
        
    }  
    
}
