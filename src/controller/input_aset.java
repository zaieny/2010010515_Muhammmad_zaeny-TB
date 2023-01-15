
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class input_aset {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_aset;
    public String nama_aset;
    public String tanggal_transaksi;
    public String harga_aset;
    public String jumlah;
    
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO input_aset(id_aset,nama_aset,tanggal_transaksi,harga_aset,jumlah)VALUE(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_aset);
        pst.setString(2,nama_aset);
        pst.setString(3,tanggal_transaksi);
        pst.setString(4,harga_aset);
        pst.setString(5,jumlah);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "UPDATE input_aset set  nama_aset=?, tanggal_transaksi=?, harga_aset=?, jumlah=? where id_aset=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,nama_aset);
        pst.setString(2,tanggal_transaksi);
        pst.setString(3,harga_aset);
        pst.setString(4,jumlah);
        pst.setString(5,id_aset);
        pst.execute();
        pst.close();
    }
    
    public void hapus() throws SQLException{
        conn=Koneksi.getKoneksi();
        String sql="DELETE from input_aset where id_aset=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, id_aset);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet Updatetbaset()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "select id_aset,nama_aset,tanggal_transaksi,harga_aset,jumlah from input_aset";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
    
}
