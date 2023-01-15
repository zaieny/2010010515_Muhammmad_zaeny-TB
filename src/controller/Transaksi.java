
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Transaksi {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_transaksi;
    public String tanggal_transaksi;
    public String jumlah_aset;
    public String harga_aset;
     public String nama_aset;
    public String total_jumlah;
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO transaksi(id_transaksi,tanggal_transaksi,jumlah_aset,harga_aset,nama_aset,total_jumlah)VALUE(?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_transaksi);
        pst.setString(2,tanggal_transaksi);
        pst.setString(3,jumlah_aset);
        pst.setString(4,harga_aset);
        pst.setString(5,nama_aset);
        pst.setString(6,total_jumlah);
        pst.execute();
        pst.close();
     }
    
    public void edit()throws SQLException{
    conn = Koneksi.getKoneksi();
        sql = "UPDATE transaksi set  tanggal_transaksi=?,jumlah_aset=?,harga_aset=?, nama_aset=?, total_jumlah=? where id_transaksi=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,tanggal_transaksi);
        pst.setString(2,jumlah_aset);
        pst.setString(3,harga_aset);
        pst.setString(4,nama_aset);
        pst.setString(5,total_jumlah);
        pst.setString(6,id_transaksi);
        pst.execute();
        pst.close();}
        
    
    public void hapus() throws SQLException{
        conn=Koneksi.getKoneksi();
        String sql="DELETE from transaksi where id_transaksi=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, id_transaksi);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet Updatetransaksi()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "select id_transaksi,tanggal_transaksi,jumlah_aset,harga_aset,nama_aset,total_jumlah from transaksi";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }  
}
