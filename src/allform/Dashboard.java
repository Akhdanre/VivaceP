/*
Mata Kuliah          : Workshop Sistem Informasi Berbasis Desktop
Dosen Pembimbing     : Ulfa
Author               : Kelompok A2
Dikembangkan Tanggal : 14 April 2022 - April 2022
*/

package allform;

import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.io.File;
//import java.io.FileWriter;;JJJJJJJJJJJJJJJ
import java.io.IOException;
import java.util.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Dashboard extends javax.swing.JFrame {

    Dashboard(String karyawan) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void dashboardshow(){
        dashboardbtn.setBackground(new java.awt.Color(194,184,156));
        dashboardmenu.setForeground(new java.awt.Color(0,0,0));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void barangshow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(194,184,156));
        barangmenu.setForeground(new java.awt.Color(0,0,0));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void produkmasukshow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(194,184,156));
        produkmasukmenu.setForeground(new java.awt.Color(0,0,0));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void transaksishow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(194,184,156));
        transaksimenu.setForeground(new java.awt.Color(0,0,0));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void suppliershow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(194,184,156));
        suppliermenu.setForeground(new java.awt.Color(0,0,0));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void laporanshow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(194,184,156));
        laporanmenu.setForeground(new java.awt.Color(0,0,0));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void pengaturanshow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(194,184,156));
        pengaturanmenu.setForeground(new java.awt.Color(0,0,0));
        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));
        keluarmenu.setForeground(new java.awt.Color(153,153,153));
    }
    
    private void keluarshow(){
        dashboardbtn.setBackground(new java.awt.Color(244, 239, 224));
        dashboardmenu.setForeground(new java.awt.Color(153,153,153));
        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangmenu.setForeground(new java.awt.Color(153,153,153));
        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));
        produkmasukmenu.setForeground(new java.awt.Color(153,153,153));
        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));
        transaksimenu.setForeground(new java.awt.Color(153,153,153));
        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));
        suppliermenu.setForeground(new java.awt.Color(153,153,153));
        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));
        laporanmenu.setForeground(new java.awt.Color(153,153,153));
        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));
        pengaturanmenu.setForeground(new java.awt.Color(153,153,153));
        keluarbtn.setBackground(new java.awt.Color(194,184,156));
        keluarmenu.setForeground(new java.awt.Color(0,0,0));
    }
    
    private void kosong(){
        idbarangfield.setText(null);
        namabarangfield.setText(null);
        hargabelifield.setText(null);
        hargajualfield.setText(null);
        stokfield.setText(null);
        carifield.setText(null);
        idbarangfield.enable();
    }
    
    private void kosongsp(){
        idsupplierfield.setText(null);
        namasupplierfield.setText(null);
        alamatsupplierfield.setText(null);
        notelpsupplierfield.setText(null);
        keterangansupplierfield.setText(null);
        carisupplierfield.setText(null);
        idsupplierfield.enable();
    }
    
    private void kosongst(){
        idkaryawanstfield.setText(null);
        namakaryawanstfield.setText(null);
        passwordstfield.setText(null);
        notelpstfield.setText(null);
    }
    
    private void load_tabelbarang() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Stok");
        
        try { 
            int no = 1;
            String sql = "SELECT * FROM alatmusik ORDER BY idalatmusik";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
        tabelbarang.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelbarang(){
        TableColumn kolom;
        tabelbarang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelbarang.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(40);
        kolom = tabelbarang.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100); 
        kolom = tabelbarang.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(300); 
        kolom = tabelbarang.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(120);
        kolom = tabelbarang.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(120);
        kolom = tabelbarang.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(100);
    }
    
    private void load_tabelsupplierpm() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("ID Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("Alamat");
        model.addColumn("No. Telepon");
        model.addColumn("Keterangan");
        
        try { 
            int no = 1;
            String sql = "SELECT * FROM supplier ORDER BY id_supplier";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
        tabelbarangpm.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelsupplierpm(){
        TableColumn kolom;
        tabelbarangpm.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelbarangpm.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabelbarangpm.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(70); 
        kolom = tabelbarangpm.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(180); 
        kolom = tabelbarangpm.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(120);
        kolom = tabelbarangpm.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(80);
        kolom = tabelbarangpm.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(200);
    }
    
    private void load_tabelprodukmasuk() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Produk Masuk");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga Beli");
        model.addColumn("Stok Masuk");
        model.addColumn("Harga Total");
        
        try { 
            int no = 1;
            String sql = "SELECT produkmasuk.id_produkmasuk, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_produkmasuk.harga_beli, detail_produkmasuk.stok_masuk, detail_produkmasuk.harga_total\n" +
                         "FROM produkmasuk JOIN detail_produkmasuk ON produkmasuk.id_produkmasuk = detail_produkmasuk.id_produkmasuk\n" +
                         "JOIN alatmusik ON alatmusik.idalatmusik = detail_produkmasuk.idalatmusik\n" +
                         "WHERE produkmasuk.id_produkmasuk = '"+idprodukmasukfield.getText()+"' ORDER BY produkmasuk.id_produkmasuk";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
        tabelprodukmasuk.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelprodukmasuk(){
        TableColumn kolom;
        tabelbarangpm.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelprodukmasuk.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabelprodukmasuk.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(80); 
        kolom = tabelprodukmasuk.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(80); 
        kolom = tabelprodukmasuk.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(300);
        kolom = tabelprodukmasuk.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(120);
        kolom = tabelprodukmasuk.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(80);
        kolom = tabelprodukmasuk.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(120);
    }
    
    private void load_tabellsm() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Produk Masuk");
        model.addColumn("ID Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga Beli");
        model.addColumn("Stok Masuk");
        model.addColumn("Harga Total");
        model.addColumn("Tanggal");
        
        try { 
            int no = 1;
            String sql = "SELECT produkmasuk.id_produkmasuk, supplier.id_supplier, supplier.nama_supplier, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_produkmasuk.harga_beli, detail_produkmasuk.stok_masuk, detail_produkmasuk.harga_total, produkmasuk.tgl_pembelian\n" +
                         "FROM produkmasuk JOIN detail_produkmasuk ON produkmasuk.id_produkmasuk = detail_produkmasuk.id_produkmasuk\n" +
                         "JOIN supplier ON supplier.id_supplier = produkmasuk.id_supplier\n" +
                         "JOIN alatmusik ON alatmusik.idalatmusik = detail_produkmasuk.idalatmusik ORDER BY produkmasuk.id_produkmasuk";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), ("+ " +res.getString(7)), res.getString(8), res.getString(9)});
            }
        tabellaporansm.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void load_tabellsmtampil() {
   
        String tanggal = ((JTextField)laporansmtgl1field.getDateEditor().getUiComponent()).getText();
        String tanggal2 = ((JTextField)laporansmtgl2field.getDateEditor().getUiComponent()).getText();
            
        try {
        String sql1 = "SELECT produkmasuk.id_produkmasuk, supplier.id_supplier, supplier.nama_supplier, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_produkmasuk.harga_beli, detail_produkmasuk.stok_masuk, detail_produkmasuk.harga_total, produkmasuk.tgl_pembelian\n" +
                      "FROM produkmasuk JOIN detail_produkmasuk ON produkmasuk.id_produkmasuk = detail_produkmasuk.id_produkmasuk\n" +
                      "JOIN supplier ON supplier.id_supplier = produkmasuk.id_supplier\n" +
                      "JOIN alatmusik ON alatmusik.idalatmusik = detail_produkmasuk.idalatmusik WHERE produkmasuk.tgl_pembelian BETWEEN '"+tanggal+"' AND '"+tanggal2+"' ORDER BY produkmasuk.id_produkmasuk";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.ResultSet res1 = pst1.executeQuery(sql1);
        DefaultTableModel model = (DefaultTableModel)tabellaporansm.getModel();
        model.setRowCount(0);
            int no = 1;
            while (res1.next()){
                model.addRow (new Object[] {no++, res1.getString(1),res1.getString(2), res1.getString(3), 
                    res1.getString(4), res1.getString(5),res1.getString(6), ("+ " +res1.getString(7)),res1.getString(8), res1.getString(9)});
            }
        tabellaporansm.setModel(model);
        } catch (SQLException ex) {
    }    
    }
    
    private void lebar_tabellsm(){
        TableColumn kolom;
        tabellaporansm.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabellaporansm.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabellaporansm.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporansm.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporansm.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporansm.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporansm.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(200);
        kolom = tabellaporansm.getColumnModel().getColumn(6); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporansm.getColumnModel().getColumn(7); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporansm.getColumnModel().getColumn(8); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporansm.getColumnModel().getColumn(9); 
        kolom.setPreferredWidth(150);
    }
    
    private void load_tabelbarangpm() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga Beli");
        model.addColumn("Stok");
        
        try { 
            int no = 1;
            String sql = "SELECT idalatmusik, namaalatmusik, harga_beli, stok FROM alatmusik ORDER BY idalatmusik";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4)});
            }
        tabelbarangpm.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelbarangpm(){
        TableColumn kolom;
        tabelbarangpm.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelbarangpm.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabelbarangpm.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100); 
        kolom = tabelbarangpm.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(300); 
        kolom = tabelbarangpm.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(120);
        kolom = tabelbarangpm.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(120);
    }
    
    private void load_tabelbarangtr() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga");
        model.addColumn("Stok");
        
        try { 
            int no = 1;
            String sql = "SELECT idalatmusik, namaalatmusik, harga_jual, stok FROM alatmusik ORDER BY idalatmusik";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4)});
            }
        tabelbarangtr.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelbarangtr(){
        TableColumn kolom;
        tabelbarangtr.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelbarangtr.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabelbarangtr.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100); 
        kolom = tabelbarangtr.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(300); 
        kolom = tabelbarangtr.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(120);
        kolom = tabelbarangtr.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(120);
    }
    
    private void load_tabelkeranjang() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Transaksi");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
        model.addColumn("Tanggal");
        
        try { 
            int no = 1;
            String sql2 = "SELECT transaksi.idtransaksi, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_transaksi.harga, detail_transaksi.jumlah, detail_transaksi.totalharga, detail_transaksi.tanggal FROM transaksi JOIN detail_transaksi ON transaksi.idtransaksi = detail_transaksi.idtransaksi JOIN alatmusik ON alatmusik.idalatmusik = detail_transaksi.idalatmusik WHERE transaksi.idtransaksi = '" + idtransaksitrfield.getText() + "' ORDER BY transaksi.idtransaksi";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm2 = conn.createStatement();
            java.sql.ResultSet res2 = stm2.executeQuery(sql2);
            while (res2.next()){
                model.addRow (new Object[] {no++, res2.getString(1), res2.getString(2), res2.getString(3), res2.getString(4),
                    res2.getString(5), res2.getString(6), res2.getString(7)});
            }
        tabelkeranjang.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelkeranjang(){
        TableColumn kolom;
        tabelkeranjang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelkeranjang.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(20);
        kolom = tabelkeranjang.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(50);
        kolom = tabelkeranjang.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(50);
        kolom = tabelkeranjang.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(150);
        kolom = tabelkeranjang.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(100);
        kolom = tabelkeranjang.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(20);
        kolom = tabelkeranjang.getColumnModel().getColumn(6); 
        kolom.setPreferredWidth(100);
        kolom = tabelkeranjang.getColumnModel().getColumn(7); 
        kolom.setPreferredWidth(150);
    }
    
    private void load_tabellpj() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Transaksi");
        model.addColumn("ID Pembeli");
        model.addColumn("Nama Pembeli");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
        model.addColumn("Tanggal");
        
        try { 
            int no = 1;
            String sql2 = "SELECT transaksi.idtransaksi, pembeli.idpembeli, pembeli.namapembeli, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_transaksi.harga, detail_transaksi.jumlah, detail_transaksi.totalharga, detail_transaksi.tanggal\n" +
                          "FROM transaksi JOIN detail_transaksi ON transaksi.idtransaksi = detail_transaksi.idtransaksi\n" +
                          "JOIN pembeli ON pembeli.idpembeli = transaksi.idpembeli\n" +
                          "JOIN alatmusik ON alatmusik.idalatmusik = detail_transaksi.idalatmusik ORDER BY transaksi.idtransaksi";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm2 = conn.createStatement();
            java.sql.ResultSet res2 = stm2.executeQuery(sql2);
            while (res2.next()){
                model.addRow (new Object[] {no++, res2.getString(1), res2.getString(2), res2.getString(3), res2.getString(4),
                    res2.getString(5), res2.getString(6), ("- " +res2.getString(7)), res2.getString(8), res2.getString(9)});
            }
        tabellaporanpj.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void load_tabellpjtampil() {
   
        String tanggal = ((JTextField)laporanpjtgl1field.getDateEditor().getUiComponent()).getText();
        String tanggal2 = ((JTextField)laporanpjtgl2field.getDateEditor().getUiComponent()).getText();
            
        try {
        String sql1 = "SELECT transaksi.idtransaksi, pembeli.idpembeli, pembeli.namapembeli, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_transaksi.harga, detail_transaksi.jumlah, detail_transaksi.totalharga, detail_transaksi.tanggal\n" +
                      "FROM transaksi JOIN detail_transaksi ON transaksi.idtransaksi = detail_transaksi.idtransaksi\n" +
                      "JOIN pembeli ON pembeli.idpembeli = transaksi.idpembeli\n" +
                      "JOIN alatmusik ON alatmusik.idalatmusik = detail_transaksi.idalatmusik WHERE transaksi.tanggal BETWEEN '"+tanggal+"' AND '"+tanggal2+"' ORDER BY transaksi.idtransaksi";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.ResultSet res1 = pst1.executeQuery(sql1);
        DefaultTableModel model = (DefaultTableModel)tabellaporanpj.getModel();
        model.setRowCount(0);
            int no = 1;
            while (res1.next()){
                model.addRow (new Object[] {no++, res1.getString(1),res1.getString(2), res1.getString(3), 
                    res1.getString(4), res1.getString(5),res1.getString(6), ("- " +res1.getString(7)),res1.getString(8), res1.getString(9)});
            }
        tabellaporanpj.setModel(model);
        } catch (SQLException ex) {
    }    
    }
    
    private void lebar_tabellpj(){
        TableColumn kolom;
        tabellaporanpj.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabellaporanpj.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(30);
        kolom = tabellaporanpj.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporanpj.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporanpj.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporanpj.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporanpj.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(200);
        kolom = tabellaporanpj.getColumnModel().getColumn(6); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporanpj.getColumnModel().getColumn(7); 
        kolom.setPreferredWidth(100);
        kolom = tabellaporanpj.getColumnModel().getColumn(8); 
        kolom.setPreferredWidth(150);
        kolom = tabellaporanpj.getColumnModel().getColumn(9); 
        kolom.setPreferredWidth(150);
    }
    
    private void load_tabelsupplier() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("Alamat");
        model.addColumn("No. Telepon");
        model.addColumn("Keterangan");
        
        try { 
            int no = 1;
            String sql = "SELECT * FROM supplier ORDER BY id_supplier";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
        tabelsupplier.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelsupplier(){    
        TableColumn kolom;
        tabelsupplier.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelsupplier.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(40);
        kolom = tabelsupplier.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100); 
        kolom = tabelsupplier.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(150); 
        kolom = tabelsupplier.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(100);
        kolom = tabelsupplier.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(100);
        kolom = tabelsupplier.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(270);
    }
    
    private void load_tabelsetting() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Keanggotaan");
        model.addColumn("Nama Keanggotaan");
        model.addColumn("Hak Akses");
        model.addColumn("No. Telepon");
        
        try { 
            int no = 1;
            String sql = "SELECT idkaryawan, nama_karyawan, user_parameter, telepon FROM user ORDER BY idkaryawan";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow (new Object[] {no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4)});
            }
        tabelsetting.setModel(model);
        } catch (SQLException e){
        }
    }
    
    private void lebar_tabelsetting(){    
        TableColumn kolom;
        tabelsetting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
        kolom = tabelsetting.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(40);
        kolom = tabelsetting.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(100); 
        kolom = tabelsetting.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(250); 
        kolom = tabelsetting.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(120);
        kolom = tabelsetting.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(250);
    }
    
    private void TampilkanJumlah() {
        try {
 
        String sql = "SELECT SUM(totalharga) AS total FROM detail_transaksi WHERE tanggal = CURDATE()";    
        java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);                             
        while(rs.next()){
        String data = rs.getString("total");
             if(data == null){
                angkapenjualan1hr.setText("Rp. 0");   
            }else{
                angkapenjualan1hr.setText(String.format("Rp. %,d,00", Integer.parseInt(data)));
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void TampilkanOrang() {
        try {
 
            String sql = "SELECT COUNT(idpembeli) AS total FROM transaksi WHERE tanggal = CURDATE()";      
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);
            
        while(rs.next()){
            String data = rs.getString("total");
             if(data == null){
                angkatotalpembelian.setText("0 Orang");   
            }else{
                angkatotalpembelian.setText(data+" Orang" );   
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        }
        
    private void TampilkanStok() {
        try {
 
            String sql = "SELECT SUM(stok) AS total FROM alatmusik";      
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);                             
        while(rs.next()){
            String data = rs.getString("total");
            if(data == null){
                angkastok.setText("0");   
            }else{
                angkastok.setText(data);   
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        }       
                
    private void TampilkanStokMasuk() {
        try {
 
        String sql = "SELECT SUM(stok_masuk) AS total FROM detail_produkmasuk WHERE tanggal = CURDATE()";      
        java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);                             
        while(rs.next()){
        String data = rs.getString("total");
             if(data == null){
                angkajumlah.setText("0");   
            }else{
                angkajumlah.setText(data);   
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private int TampilkanJumlah1thn() {
        
         try {
             
                Date now = new Date(); //import java.util.Date
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                String tgl = simpleDateFormat.format(now), data;

                String sql = "SELECT SUM(totalharga) AS total FROM detail_transaksi WHERE YEAR(tanggal) = '"+tgl+"'";      
                java.sql.Connection conn = (Connection)Config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                java.sql.ResultSet rs= pst.executeQuery(sql);                             

                while(rs.next()){
                    data = rs.getString("total");
                    if(data == null){
                        angkapenjualan1thn.setText("Rp. 0");
                    }else{
                        angkapenjualan1thn.setText(String.format("Rp. %,d,00", Integer.parseInt(data)));
                    }                                                     
                }
                 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           return -1;
       }
    
    private int TampilkanBeli1thn() {
        
         try {
             
                Date now = new Date(); //import java.util.Date
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                String tgl = simpleDateFormat.format(now), data;

                String sql = "SELECT SUM(harga_total) AS total FROM detail_produkmasuk WHERE YEAR(tanggal) = '"+tgl+"'";      
                java.sql.Connection conn = (Connection)Config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                java.sql.ResultSet rs= pst.executeQuery(sql);                             

                while(rs.next()){
                    data = rs.getString("total");
                    if(data == null){
                        angkapembelian1thn.setText("Rp. 0");
                    }else{
                         angkapembelian1thn.setText(String.format("Rp. %,d,00", Integer.parseInt(data)));
                    }                                                     
                }
                 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           return -1;
       }
    
    private int TampilkanBarangterjual() {
        
         try {
             
                Date now = new Date(); //import java.util.Date
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                String tgl = simpleDateFormat.format(now), data;

                String sql = "SELECT SUM(jumlah) AS total FROM detail_transaksi WHERE YEAR(tanggal) = '"+tgl+"'";      
                java.sql.Connection conn = (Connection)Config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                java.sql.ResultSet rs= pst.executeQuery(sql);                             

                while(rs.next()){
                    data = rs.getString("total");
                    if(data == null){
                        angkabrterjual.setText("0 Barang");
                    }else{
                        angkabrterjual.setText(data+" Barang");
                    }                                                     
                }
                 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           return -1;
       }
    
    private int TampilkanBarangdibeli() {
        
         try {
             
                Date now = new Date(); //import java.util.Date
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                String tgl = simpleDateFormat.format(now), data;

                String sql = "SELECT SUM(stok_masuk) AS total FROM detail_produkmasuk WHERE YEAR(tanggal) = '"+tgl+"'";      
                java.sql.Connection conn = (Connection)Config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                java.sql.ResultSet rs= pst.executeQuery(sql);                             

                while(rs.next()){
                    data = rs.getString("total");
                    if(data == null){
                        angkadibeli.setText("0 Barang");
                    }else{
                        angkadibeli.setText(data+" Barang");
                    }                                                     
                }
                 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           return -1;
       }
    
    private void auto_kode() {
        idbarangfield.disable();
        try{
        String sql = "SELECT MAX(RIGHT(idalatmusik,8)) FROM alatmusik";
        java.sql.Connection con = (Connection) Config.configDB();
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rst = st.executeQuery(sql);
        if(rst.next()) {
            String auto_kdbarang, tambah;
            int kdb;
            auto_kdbarang = Integer.toString(rst.getInt(1)+1);
            kdb = auto_kdbarang.length();
            tambah = "";
            for (int i = 1; i <= 8 - kdb; i++ ){
                tambah = tambah + "0";
            }
            idbarangfield.setText("AM"+tambah+auto_kdbarang);
            
         }
        }
        catch (Exception e) {
            idbarangfield.setText("AM00000001");
        }
    }
   
    private void auto_kdTransaksi() {
        idtransaksitrfield.disable();
        try{
        String sql = "SELECT MAX(RIGHT(idtransaksi,8)) FROM transaksi";
        java.sql.Connection con = (Connection) Config.configDB();
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rst = st.executeQuery(sql);
        if(rst.next()) {
            String auto_kdtransaksi, tambah;
            int kdb;
            auto_kdtransaksi = Integer.toString(rst.getInt(1)+1);
            kdb = auto_kdtransaksi.length();
            tambah = "";
            for (int i = 1; i <= 8 - kdb; i++ ){
                tambah = tambah + "0";
            }
            idtransaksitrfield.setText("IT"+tambah+auto_kdtransaksi);
            
         }
        }
        catch (Exception e) {
            idtransaksitrfield.setText("IT00000001");
        }
    }
   
    private void auto_kdProdukMasuk() {
        idprodukmasukfield.disable();
        try{
        String sql = "SELECT MAX(RIGHT(id_produkmasuk,8)) FROM produkmasuk";
        java.sql.Connection con = (Connection) Config.configDB();
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rst = st.executeQuery(sql);
        if(rst.next()) {
            String auto_kdPM, tambah;
            int kdb;
            auto_kdPM = Integer.toString(rst.getInt(1)+1);
            kdb = auto_kdPM.length();
            tambah = "";
            for (int i = 1; i <= 8 - kdb; i++ ){
                tambah = tambah + "0";
            }
            idprodukmasukfield.setText("PM"+tambah+auto_kdPM);
            
         }
        }
        catch (Exception e) {
            idprodukmasukfield.setText("PM00000001");
        }
    }
    
    private void auto_kdPB() {
        idpembelitrfield.disable();
        try{
        String sql = "SELECT MAX(RIGHT(idpembeli,8)) FROM pembeli";
        java.sql.Connection con = (Connection) Config.configDB();
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rst = st.executeQuery(sql);
        if(rst.next()) {
            String auto_kdPM, tambah;
            int kdb;
            auto_kdPM = Integer.toString(rst.getInt(1)+1);
            kdb = auto_kdPM.length();
            tambah = "";
            for (int i = 1; i <= 8 - kdb; i++ ){
                tambah = tambah + "0";
            }
            idpembelitrfield.setText("PB"+tambah+auto_kdPM);
            }
        }
        catch (Exception e) {
            idpembelitrfield.setText("PB00000001");
        }
    }
    
    private void auto_kdSupp() {
        idsupplierfield.disable();
        try{
        String sql = "SELECT MAX(RIGHT(id_supplier,3)) FROM supplier";
        java.sql.Connection con = (Connection) Config.configDB();
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rst = st.executeQuery(sql);
        if(rst.next()) {
            String auto_kdPM, tambah;
            int kdb;
            auto_kdPM = Integer.toString(rst.getInt(1)+1);
            kdb = auto_kdPM.length();
            tambah = "";
            for (int i = 1; i <= 3 - kdb; i++ ){
                tambah = tambah + "0";
            }
            idsupplierfield.setText("SUP"+tambah+auto_kdPM);
            
         }
        }
        catch (Exception e) {
            idsupplierfield.setText("SUP001");
        }
    }
    
    private void DatabaseBackup() {
        try {
            String javaPath = filename + ".sql"; 
            Runtime.getRuntime().exec("C:\\xampp\\mysql\\bin\\mysqldump -u " + "root" + " toko_alatmusik1 -r " + javaPath); // ("C:\\xampp\\mysql\\bin\\mysqldump -u " + "root"  + " tokoalatmusik -r " + javaPath)
            JOptionPane.showMessageDialog(this, "Backup Data Berhasil!", "Done", 1);
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    String location=null;
    String tgl, filename;
    
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon icon = new ImageIcon("src/icon/favicon-32x32.png");
        setIconImage(icon.getImage());
        setExtendedState(MAXIMIZED_BOTH);
        DASHBOARD.setVisible(true);
        BARANG.setVisible(false);
        PRODUKMASUK.setVisible(false);
        TRANSAKSI.setVisible(false);
        SUPPLIER.setVisible(false);
        LAPORANTOTAL.setVisible(false);
        LAPORANSELECT1.setVisible(false);
        LAPORANSELECT2.setVisible(false);
        SETTING.setVisible(false);
        DATABASE.setVisible(false);
        laporanselectcb.setVisible(false);
        settingcb.setVisible(false);
        idkaryawanfield.setVisible(false);
        namasupplierpmfield.disable();
        
        TampilkanJumlah();
        TampilkanOrang();
        TampilkanStok();
        TampilkanStokMasuk();
        TampilkanJumlah1thn();
        TampilkanBeli1thn();
        TampilkanBarangterjual();
        TampilkanBarangdibeli();
        auto_kdProdukMasuk();
        auto_kdTransaksi();
        auto_kdPB();
        load_tabellpjtampil(); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VivaceIcon = new javax.swing.JLabel();
        dashboardmenu = new javax.swing.JLabel();
        barangmenu = new javax.swing.JLabel();
        produkmasukmenu = new javax.swing.JLabel();
        transaksimenu = new javax.swing.JLabel();
        suppliermenu = new javax.swing.JLabel();
        laporanmenu = new javax.swing.JLabel();
        pengaturanmenu = new javax.swing.JLabel();
        dashboardbtn = new javax.swing.JPanel();
        barangbtn = new javax.swing.JPanel();
        produkmasukbtn = new javax.swing.JPanel();
        transaksibtn = new javax.swing.JPanel();
        supplierbtn = new javax.swing.JPanel();
        laporanbtn = new javax.swing.JPanel();
        pengaturanbtn = new javax.swing.JPanel();
        keluarbtn = new javax.swing.JPanel();
        keluarmenu = new javax.swing.JLabel();
        LAPORANSELECT2 = new javax.swing.JPanel();
        laporanpic2 = new javax.swing.JLabel();
        carilsmfield = new javax.swing.JTextField();
        tampilkanlpjbtn1 = new javax.swing.JPanel();
        carilpjbtn1 = new javax.swing.JPanel();
        exportlpjbtn1 = new javax.swing.JPanel();
        laporansmtgl1field = new com.toedter.calendar.JDateChooser();
        laporansmtgl2field = new com.toedter.calendar.JDateChooser();
        printlpjbtn1 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabellaporansm = new javax.swing.JTable();
        bgLaporanselect2 = new javax.swing.JLabel();
        LAPORANSELECT1 = new javax.swing.JPanel();
        laporanpic1 = new javax.swing.JLabel();
        carilpjfield = new javax.swing.JTextField();
        tampilkanlpjbtn = new javax.swing.JPanel();
        laporanpjtgl2field = new com.toedter.calendar.JDateChooser();
        laporanpjtgl1field = new com.toedter.calendar.JDateChooser();
        carilpjbtn = new javax.swing.JPanel();
        exportlpjbtn = new javax.swing.JPanel();
        printlpjbtn = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabellaporanpj = new javax.swing.JTable();
        bgLaporanselect = new javax.swing.JLabel();
        SETTING = new javax.swing.JPanel();
        idkaryawanstfield = new javax.swing.JTextField();
        namakaryawanstfield = new javax.swing.JTextField();
        passwordstfield = new javax.swing.JPasswordField();
        notelpstfield = new javax.swing.JTextField();
        carisettingfield = new javax.swing.JTextField();
        hapusstbtn = new javax.swing.JPanel();
        tglst = new com.toedter.calendar.JDateChooser();
        updatestbtn = new javax.swing.JPanel();
        tambahkanstbtn = new javax.swing.JPanel();
        exportstbtn = new javax.swing.JPanel();
        caristbtn = new javax.swing.JPanel();
        eyehide = new javax.swing.JLabel();
        eyeshow = new javax.swing.JLabel();
        hakaksescb = new javax.swing.JComboBox<>();
        jPane2 = new javax.swing.JScrollPane();
        tabelsetting = new javax.swing.JTable();
        settingpic = new javax.swing.JLabel();
        bgSetting = new javax.swing.JLabel();
        SUPPLIER = new javax.swing.JPanel();
        supplierpic = new javax.swing.JLabel();
        idsupplierfield = new javax.swing.JTextField();
        namasupplierfield = new javax.swing.JTextField();
        alamatsupplierfield = new javax.swing.JTextField();
        notelpsupplierfield = new javax.swing.JTextField();
        keterangansupplierfield = new javax.swing.JTextField();
        carisupplierfield = new javax.swing.JTextField();
        hapusspbtn = new javax.swing.JPanel();
        updatespbtn = new javax.swing.JPanel();
        tambahkanspbtn = new javax.swing.JPanel();
        exportspbtn = new javax.swing.JPanel();
        carispbtn = new javax.swing.JPanel();
        jPane1 = new javax.swing.JScrollPane();
        tabelsupplier = new javax.swing.JTable();
        bgSupplier = new javax.swing.JLabel();
        DASHBOARD = new javax.swing.JPanel();
        dashboardpic = new javax.swing.JLabel();
        angkapenjualan1hr = new javax.swing.JLabel();
        textpenjualan1hr = new javax.swing.JLabel();
        angkastok = new javax.swing.JLabel();
        textstok = new javax.swing.JLabel();
        angkatotalpembelian = new javax.swing.JLabel();
        texttotalpembelian = new javax.swing.JLabel();
        angkajumlah = new javax.swing.JLabel();
        textjumlah = new javax.swing.JLabel();
        textgrafik = new javax.swing.JLabel();
        bgDashboard = new javax.swing.JLabel();
        PRODUKMASUK = new javax.swing.JPanel();
        idprodukmasuktext = new javax.swing.JTextField();
        idprodukmasukfield = new javax.swing.JTextField();
        namasupplierpmfield = new javax.swing.JTextField();
        jumlahmasukpmfield = new javax.swing.JTextField();
        hargabelipmfield = new javax.swing.JTextField();
        totalhargapmfield = new javax.swing.JTextField();
        totalhargabelipmfield = new javax.swing.JTextField();
        kembalianpmfield = new javax.swing.JTextField();
        tambahsupplierbtn = new javax.swing.JPanel();
        tambahkanpmbtn = new javax.swing.JPanel();
        resetpmbtn = new javax.swing.JPanel();
        hitungpmbtn = new javax.swing.JPanel();
        cetakfakturpmbtn = new javax.swing.JPanel();
        daftarpmcb = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelbarangpm = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelprodukmasuk = new javax.swing.JTable();
        produkmasukpic = new javax.swing.JLabel();
        bgProdukmasuk = new javax.swing.JLabel();
        idbarangtrfield1 = new javax.swing.JTextField();
        namabarangtrfield1 = new javax.swing.JTextField();
        totalhargapm = new javax.swing.JTextField();
        settingcb = new javax.swing.JComboBox<>();
        laporanselectcb = new javax.swing.JComboBox<>();
        DATABASE = new javax.swing.JPanel();
        backuppathfield = new javax.swing.JTextField();
        exportdbbtn = new javax.swing.JPanel();
        browsedbbtn = new javax.swing.JPanel();
        emaildbbtn = new javax.swing.JPanel();
        whatsappdbbtn = new javax.swing.JPanel();
        hapusdatabarangbtn = new javax.swing.JPanel();
        hapusdatasupplierbtn = new javax.swing.JPanel();
        hapusdatalaporanpjbtn = new javax.swing.JPanel();
        hapusdatalaporansmbtn = new javax.swing.JPanel();
        settingpic1 = new javax.swing.JLabel();
        bgDatabase = new javax.swing.JLabel();
        LAPORANTOTAL = new javax.swing.JPanel();
        laporanpic = new javax.swing.JLabel();
        angkapenjualan1thn = new javax.swing.JLabel();
        textpenjualan1thn = new javax.swing.JLabel();
        angkabrterjual = new javax.swing.JLabel();
        textbrterjual = new javax.swing.JLabel();
        angkapembelian1thn = new javax.swing.JLabel();
        textpembelian1thn = new javax.swing.JLabel();
        angkadibeli = new javax.swing.JLabel();
        textdibeli = new javax.swing.JLabel();
        textgrafikthn = new javax.swing.JLabel();
        bgLaporantotal = new javax.swing.JLabel();
        TRANSAKSI = new javax.swing.JPanel();
        transaksipic = new javax.swing.JLabel();
        idtransaksitext = new javax.swing.JTextField();
        idtransaksitrfield = new javax.swing.JTextField();
        hargatrfield = new javax.swing.JTextField();
        jumlahtrfield = new javax.swing.JTextField();
        namapembelitrfield = new javax.swing.JTextField();
        tambahpembelibtn = new javax.swing.JPanel();
        resetbelanjaanbtn = new javax.swing.JPanel();
        tambahkantrbtn = new javax.swing.JPanel();
        totalhargatrfield = new javax.swing.JTextField();
        bayartrfield = new javax.swing.JTextField();
        kembaliantrfield = new javax.swing.JTextField();
        hitungtrbtn = new javax.swing.JPanel();
        cetakfakturtrbtn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbarangtr = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelkeranjang = new javax.swing.JTable();
        bgTransaksi = new javax.swing.JLabel();
        idbarangtrfield = new javax.swing.JTextField();
        idpembelitrfield = new javax.swing.JTextField();
        namabarangtrfield = new javax.swing.JTextField();
        totalbelanjafield = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BARANG = new javax.swing.JPanel();
        barangpic = new javax.swing.JLabel();
        idbarangfield = new javax.swing.JTextField();
        namabarangfield = new javax.swing.JTextField();
        hargajualfield = new javax.swing.JTextField();
        hargabelifield = new javax.swing.JTextField();
        stokfield = new javax.swing.JTextField();
        carifield = new javax.swing.JTextField();
        tambahkanbrbtn = new javax.swing.JPanel();
        updatebrbtn = new javax.swing.JPanel();
        hapusbrbtn = new javax.swing.JPanel();
        caribrbtn = new javax.swing.JPanel();
        exportbrbtn = new javax.swing.JPanel();
        jPane = new javax.swing.JScrollPane();
        tabelbarang = new javax.swing.JTable();
        bgBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vivace Music Application");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VivaceIcon.setBackground(new java.awt.Color(255, 255, 255));
        VivaceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VIVACEMUSIC 1.png"))); // NOI18N
        getContentPane().add(VivaceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 140));

        userinfo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        userinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/usericon.png"))); // NOI18N
        userinfo.setText("   Hai, Anonim");
        getContentPane().add(userinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, -1));

        dashboardmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        dashboardmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeicon.png"))); // NOI18N
        dashboardmenu.setText("     DASHBOARD");
        dashboardmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardmenuMouseClicked(evt);
            }
        });
        getContentPane().add(dashboardmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 60));

        barangmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        barangmenu.setForeground(new java.awt.Color(153, 153, 153));
        barangmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/barangicon.png"))); // NOI18N
        barangmenu.setText("     BARANG");
        barangmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangmenuMouseClicked(evt);
            }
        });
        getContentPane().add(barangmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 260, 60));

        produkmasukmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        produkmasukmenu.setForeground(new java.awt.Color(153, 153, 153));
        produkmasukmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/produkmasukicon.png"))); // NOI18N
        produkmasukmenu.setText("     PRODUK MASUK");
        produkmasukmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkmasukmenuMouseClicked(evt);
            }
        });
        getContentPane().add(produkmasukmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 260, 60));

        transaksimenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        transaksimenu.setForeground(new java.awt.Color(153, 153, 153));
        transaksimenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/creditcard.png"))); // NOI18N
        transaksimenu.setText("     TRANSAKSI");
        transaksimenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksimenuMouseClicked(evt);
            }
        });
        getContentPane().add(transaksimenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 260, 60));

        suppliermenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        suppliermenu.setForeground(new java.awt.Color(153, 153, 153));
        suppliermenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/suppliericon.icon.png"))); // NOI18N
        suppliermenu.setText("     SUPPLIER");
        suppliermenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliermenuMouseClicked(evt);
            }
        });
        getContentPane().add(suppliermenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 260, 60));

        laporanmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        laporanmenu.setForeground(new java.awt.Color(153, 153, 153));
        laporanmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporanicon.png"))); // NOI18N
        laporanmenu.setText("     LAPORAN");
        laporanmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanmenuMouseClicked(evt);
            }
        });
        getContentPane().add(laporanmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 260, 60));

        pengaturanmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        pengaturanmenu.setForeground(new java.awt.Color(153, 153, 153));
        pengaturanmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settingicon.png"))); // NOI18N
        pengaturanmenu.setText("     PENGATURAN");
        pengaturanmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengaturanmenuMouseClicked(evt);
            }
        });
        getContentPane().add(pengaturanmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 260, 60));

        dashboardbtn.setBackground(new java.awt.Color(194, 184, 156));

        javax.swing.GroupLayout dashboardbtnLayout = new javax.swing.GroupLayout(dashboardbtn);
        dashboardbtn.setLayout(dashboardbtnLayout);
        dashboardbtnLayout.setHorizontalGroup(
            dashboardbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        dashboardbtnLayout.setVerticalGroup(
            dashboardbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 60));

        barangbtn.setBackground(new java.awt.Color(244, 239, 224));
        barangbtn.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout barangbtnLayout = new javax.swing.GroupLayout(barangbtn);
        barangbtn.setLayout(barangbtnLayout);
        barangbtnLayout.setHorizontalGroup(
            barangbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        barangbtnLayout.setVerticalGroup(
            barangbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(barangbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        produkmasukbtn.setBackground(new java.awt.Color(244, 239, 224));

        javax.swing.GroupLayout produkmasukbtnLayout = new javax.swing.GroupLayout(produkmasukbtn);
        produkmasukbtn.setLayout(produkmasukbtnLayout);
        produkmasukbtnLayout.setHorizontalGroup(
            produkmasukbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        produkmasukbtnLayout.setVerticalGroup(
            produkmasukbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(produkmasukbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        transaksibtn.setBackground(new java.awt.Color(244, 239, 224));

        javax.swing.GroupLayout transaksibtnLayout = new javax.swing.GroupLayout(transaksibtn);
        transaksibtn.setLayout(transaksibtnLayout);
        transaksibtnLayout.setHorizontalGroup(
            transaksibtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        transaksibtnLayout.setVerticalGroup(
            transaksibtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(transaksibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        supplierbtn.setBackground(new java.awt.Color(244, 239, 224));

        javax.swing.GroupLayout supplierbtnLayout = new javax.swing.GroupLayout(supplierbtn);
        supplierbtn.setLayout(supplierbtnLayout);
        supplierbtnLayout.setHorizontalGroup(
            supplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        supplierbtnLayout.setVerticalGroup(
            supplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(supplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        laporanbtn.setBackground(new java.awt.Color(244, 239, 224));

        javax.swing.GroupLayout laporanbtnLayout = new javax.swing.GroupLayout(laporanbtn);
        laporanbtn.setLayout(laporanbtnLayout);
        laporanbtnLayout.setHorizontalGroup(
            laporanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        laporanbtnLayout.setVerticalGroup(
            laporanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(laporanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        pengaturanbtn.setBackground(new java.awt.Color(244, 239, 224));

        javax.swing.GroupLayout pengaturanbtnLayout = new javax.swing.GroupLayout(pengaturanbtn);
        pengaturanbtn.setLayout(pengaturanbtnLayout);
        pengaturanbtnLayout.setHorizontalGroup(
            pengaturanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pengaturanbtnLayout.setVerticalGroup(
            pengaturanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(pengaturanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        keluarbtn.setBackground(new java.awt.Color(244, 239, 224));

        keluarmenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        keluarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logouticon.png"))); // NOI18N
        keluarmenu.setText("     KELUAR");
        keluarmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarmenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout keluarbtnLayout = new javax.swing.GroupLayout(keluarbtn);
        keluarbtn.setLayout(keluarbtnLayout);
        keluarbtnLayout.setHorizontalGroup(
            keluarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keluarbtnLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(keluarmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        keluarbtnLayout.setVerticalGroup(
            keluarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(keluarmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        getContentPane().add(keluarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, -1, -1));

        LAPORANSELECT2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanpic2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        laporanpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporanpic.png"))); // NOI18N
        LAPORANSELECT2.add(laporanpic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        carilsmfield.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        carilsmfield.setBorder(null);
        carilsmfield.setOpaque(false);
        LAPORANSELECT2.add(carilsmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 150, 240, 40));

        tampilkanlpjbtn1.setOpaque(false);
        tampilkanlpjbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampilkanlpjbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tampilkanlpjbtn1Layout = new javax.swing.GroupLayout(tampilkanlpjbtn1);
        tampilkanlpjbtn1.setLayout(tampilkanlpjbtn1Layout);
        tampilkanlpjbtn1Layout.setHorizontalGroup(
            tampilkanlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        tampilkanlpjbtn1Layout.setVerticalGroup(
            tampilkanlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LAPORANSELECT2.add(tampilkanlpjbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 150, 40));

        carilpjbtn1.setOpaque(false);
        carilpjbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carilpjbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout carilpjbtn1Layout = new javax.swing.GroupLayout(carilpjbtn1);
        carilpjbtn1.setLayout(carilpjbtn1Layout);
        carilpjbtn1Layout.setHorizontalGroup(
            carilpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        carilpjbtn1Layout.setVerticalGroup(
            carilpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LAPORANSELECT2.add(carilpjbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 130, 40));

        exportlpjbtn1.setOpaque(false);
        exportlpjbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportlpjbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportlpjbtn1Layout = new javax.swing.GroupLayout(exportlpjbtn1);
        exportlpjbtn1.setLayout(exportlpjbtn1Layout);
        exportlpjbtn1Layout.setHorizontalGroup(
            exportlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        exportlpjbtn1Layout.setVerticalGroup(
            exportlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LAPORANSELECT2.add(exportlpjbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 880, 180, 70));

        laporansmtgl1field.setDateFormatString("yyyy-MM-dd");
        LAPORANSELECT2.add(laporansmtgl1field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 200, 30));

        laporansmtgl2field.setDateFormatString("yyyy-MM-dd");
        LAPORANSELECT2.add(laporansmtgl2field, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 200, 30));

        printlpjbtn1.setOpaque(false);
        printlpjbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printlpjbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout printlpjbtn1Layout = new javax.swing.GroupLayout(printlpjbtn1);
        printlpjbtn1.setLayout(printlpjbtn1Layout);
        printlpjbtn1Layout.setHorizontalGroup(
            printlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        printlpjbtn1Layout.setVerticalGroup(
            printlpjbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LAPORANSELECT2.add(printlpjbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 880, 180, 70));

        tabellaporansm.setBackground(new java.awt.Color(244, 239, 224));
        tabellaporansm.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabellaporansm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Transaksi", "ID Alat Musik", "Nama Alat Musik", "Harga", "Jumlah", "Total Harga", "Tanggal"
            }
        ));
        tabellaporansm.setGridColor(new java.awt.Color(255, 255, 255));
        tabellaporansm.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabellaporansm.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(tabellaporansm);
        if (tabellaporansm.getColumnModel().getColumnCount() > 0) {
            tabellaporansm.getColumnModel().getColumn(7).setHeaderValue("Tanggal");
        }

        LAPORANSELECT2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 1490, 650));

        bgLaporanselect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LS2.png"))); // NOI18N
        LAPORANSELECT2.add(bgLaporanselect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        getContentPane().add(LAPORANSELECT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LAPORANSELECT1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanpic1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        laporanpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporanpic.png"))); // NOI18N
        LAPORANSELECT1.add(laporanpic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        carilpjfield.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        carilpjfield.setBorder(null);
        carilpjfield.setOpaque(false);
        LAPORANSELECT1.add(carilpjfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 150, 240, 40));

        tampilkanlpjbtn.setOpaque(false);
        tampilkanlpjbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampilkanlpjbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tampilkanlpjbtnLayout = new javax.swing.GroupLayout(tampilkanlpjbtn);
        tampilkanlpjbtn.setLayout(tampilkanlpjbtnLayout);
        tampilkanlpjbtnLayout.setHorizontalGroup(
            tampilkanlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        tampilkanlpjbtnLayout.setVerticalGroup(
            tampilkanlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LAPORANSELECT1.add(tampilkanlpjbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 150, 40));

        laporanpjtgl2field.setDateFormatString("yyyy-MM-dd");
        LAPORANSELECT1.add(laporanpjtgl2field, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 160, 30));

        laporanpjtgl1field.setDateFormatString("yyyy-MM-dd");
        LAPORANSELECT1.add(laporanpjtgl1field, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 152, 160, 30));

        carilpjbtn.setOpaque(false);
        carilpjbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carilpjbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout carilpjbtnLayout = new javax.swing.GroupLayout(carilpjbtn);
        carilpjbtn.setLayout(carilpjbtnLayout);
        carilpjbtnLayout.setHorizontalGroup(
            carilpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        carilpjbtnLayout.setVerticalGroup(
            carilpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        LAPORANSELECT1.add(carilpjbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 130, 40));

        exportlpjbtn.setOpaque(false);
        exportlpjbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportlpjbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportlpjbtnLayout = new javax.swing.GroupLayout(exportlpjbtn);
        exportlpjbtn.setLayout(exportlpjbtnLayout);
        exportlpjbtnLayout.setHorizontalGroup(
            exportlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        exportlpjbtnLayout.setVerticalGroup(
            exportlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LAPORANSELECT1.add(exportlpjbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 880, 180, 70));

        printlpjbtn.setOpaque(false);
        printlpjbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printlpjbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout printlpjbtnLayout = new javax.swing.GroupLayout(printlpjbtn);
        printlpjbtn.setLayout(printlpjbtnLayout);
        printlpjbtnLayout.setHorizontalGroup(
            printlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        printlpjbtnLayout.setVerticalGroup(
            printlpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LAPORANSELECT1.add(printlpjbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 880, 180, 70));

        tabellaporanpj.setBackground(new java.awt.Color(244, 239, 224));
        tabellaporanpj.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabellaporanpj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Transaksi", "ID Alat Musik", "Nama Alat Musik", "Harga", "Jumlah", "Total Harga", "Tanggal"
            }
        ));
        tabellaporanpj.setGridColor(new java.awt.Color(255, 255, 255));
        tabellaporanpj.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabellaporanpj.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(tabellaporanpj);
        if (tabellaporanpj.getColumnModel().getColumnCount() > 0) {
            tabellaporanpj.getColumnModel().getColumn(7).setHeaderValue("Tanggal");
        }

        LAPORANSELECT1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 1490, 650));

        bgLaporanselect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LS2.png"))); // NOI18N
        LAPORANSELECT1.add(bgLaporanselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        getContentPane().add(LAPORANSELECT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SETTING.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idkaryawanstfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idkaryawanstfield.setBorder(null);
        SETTING.add(idkaryawanstfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 570, 30));

        namakaryawanstfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namakaryawanstfield.setBorder(null);
        SETTING.add(namakaryawanstfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 570, 30));

        passwordstfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordstfield.setText("jPasswordField1");
        passwordstfield.setBorder(null);
        SETTING.add(passwordstfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 530, 30));

        notelpstfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        notelpstfield.setBorder(null);
        SETTING.add(notelpstfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 730, 570, 40));

        carisettingfield.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        carisettingfield.setBorder(null);
        carisettingfield.setOpaque(false);
        SETTING.add(carisettingfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 100, 220, 30));

        hapusstbtn.setOpaque(false);
        hapusstbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusstbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusstbtnLayout = new javax.swing.GroupLayout(hapusstbtn);
        hapusstbtn.setLayout(hapusstbtnLayout);
        hapusstbtnLayout.setHorizontalGroup(
            hapusstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        hapusstbtnLayout.setVerticalGroup(
            hapusstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SETTING.add(hapusstbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 810, 180, 70));

        tglst.setDateFormatString("yyyy-MM-dd");
        tglst.setMaxSelectableDate(new java.util.Date(253370743310000L));
        SETTING.add(tglst, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, 160, 40));

        updatestbtn.setOpaque(false);
        updatestbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatestbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updatestbtnLayout = new javax.swing.GroupLayout(updatestbtn);
        updatestbtn.setLayout(updatestbtnLayout);
        updatestbtnLayout.setHorizontalGroup(
            updatestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        updatestbtnLayout.setVerticalGroup(
            updatestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SETTING.add(updatestbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 810, 180, 70));

        tambahkanstbtn.setOpaque(false);
        tambahkanstbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkanstbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahkanstbtnLayout = new javax.swing.GroupLayout(tambahkanstbtn);
        tambahkanstbtn.setLayout(tambahkanstbtnLayout);
        tambahkanstbtnLayout.setHorizontalGroup(
            tambahkanstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        tambahkanstbtnLayout.setVerticalGroup(
            tambahkanstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SETTING.add(tambahkanstbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, 180, 70));

        exportstbtn.setOpaque(false);
        exportstbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportstbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportstbtnLayout = new javax.swing.GroupLayout(exportstbtn);
        exportstbtn.setLayout(exportstbtnLayout);
        exportstbtnLayout.setHorizontalGroup(
            exportstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        exportstbtnLayout.setVerticalGroup(
            exportstbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        SETTING.add(exportstbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 150, 40));

        caristbtn.setOpaque(false);
        caristbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caristbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout caristbtnLayout = new javax.swing.GroupLayout(caristbtn);
        caristbtn.setLayout(caristbtnLayout);
        caristbtnLayout.setHorizontalGroup(
            caristbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        caristbtnLayout.setVerticalGroup(
            caristbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        SETTING.add(caristbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 100, 120, 40));

        eyehide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-hide-30.png"))); // NOI18N
        eyehide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyehideMouseClicked(evt);
            }
        });
        SETTING.add(eyehide, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 40, 30));

        eyeshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-eye-30.png"))); // NOI18N
        eyeshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeshowMouseClicked(evt);
            }
        });
        SETTING.add(eyeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 40, 30));

        hakaksescb.setBackground(new java.awt.Color(244, 239, 224));
        hakaksescb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hakaksescb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Akses --", "Pemilik", "Administrator", "Karyawan" }));
        hakaksescb.setBorder(null);
        hakaksescb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hakaksescbActionPerformed(evt);
            }
        });
        SETTING.add(hakaksescb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 280, 50));

        tabelsetting.setBackground(new java.awt.Color(244, 239, 224));
        tabelsetting.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelsetting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Karyawan", "Nama Karyawan", "Hak Akses", "No. Telepon"
            }
        ));
        tabelsetting.setGridColor(new java.awt.Color(255, 255, 255));
        tabelsetting.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelsetting.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsettingMouseClicked(evt);
            }
        });
        jPane2.setViewportView(tabelsetting);

        SETTING.add(jPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 780, 800));

        settingpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        settingpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settingpic.png"))); // NOI18N
        settingpic.setText("     Pengaturan");
        SETTING.add(settingpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        bgSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ST2.png"))); // NOI18N
        SETTING.add(bgSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(SETTING, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SUPPLIER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        supplierpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supplierpic.png"))); // NOI18N
        supplierpic.setText("     Supplier");
        SUPPLIER.add(supplierpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        idsupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idsupplierfield.setBorder(null);
        SUPPLIER.add(idsupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 570, 30));

        namasupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namasupplierfield.setBorder(null);
        SUPPLIER.add(namasupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 570, 30));

        alamatsupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alamatsupplierfield.setBorder(null);
        SUPPLIER.add(alamatsupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 570, 30));

        notelpsupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        notelpsupplierfield.setBorder(null);
        SUPPLIER.add(notelpsupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 570, 40));

        keterangansupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        keterangansupplierfield.setBorder(null);
        SUPPLIER.add(keterangansupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 570, 40));

        carisupplierfield.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        carisupplierfield.setBorder(null);
        carisupplierfield.setOpaque(false);
        SUPPLIER.add(carisupplierfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 100, 220, 30));

        hapusspbtn.setOpaque(false);
        hapusspbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusspbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusspbtnLayout = new javax.swing.GroupLayout(hapusspbtn);
        hapusspbtn.setLayout(hapusspbtnLayout);
        hapusspbtnLayout.setHorizontalGroup(
            hapusspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        hapusspbtnLayout.setVerticalGroup(
            hapusspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SUPPLIER.add(hapusspbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 810, 180, 70));

        updatespbtn.setOpaque(false);
        updatespbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatespbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updatespbtnLayout = new javax.swing.GroupLayout(updatespbtn);
        updatespbtn.setLayout(updatespbtnLayout);
        updatespbtnLayout.setHorizontalGroup(
            updatespbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        updatespbtnLayout.setVerticalGroup(
            updatespbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SUPPLIER.add(updatespbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 810, 180, 70));

        tambahkanspbtn.setOpaque(false);
        tambahkanspbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkanspbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahkanspbtnLayout = new javax.swing.GroupLayout(tambahkanspbtn);
        tambahkanspbtn.setLayout(tambahkanspbtnLayout);
        tambahkanspbtnLayout.setHorizontalGroup(
            tambahkanspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        tambahkanspbtnLayout.setVerticalGroup(
            tambahkanspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SUPPLIER.add(tambahkanspbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, 180, 70));

        exportspbtn.setOpaque(false);
        exportspbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportspbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportspbtnLayout = new javax.swing.GroupLayout(exportspbtn);
        exportspbtn.setLayout(exportspbtnLayout);
        exportspbtnLayout.setHorizontalGroup(
            exportspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        exportspbtnLayout.setVerticalGroup(
            exportspbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        SUPPLIER.add(exportspbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 150, 40));

        carispbtn.setOpaque(false);
        carispbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carispbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout carispbtnLayout = new javax.swing.GroupLayout(carispbtn);
        carispbtn.setLayout(carispbtnLayout);
        carispbtnLayout.setHorizontalGroup(
            carispbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        carispbtnLayout.setVerticalGroup(
            carispbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        SUPPLIER.add(carispbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 100, 120, 40));

        tabelsupplier.setBackground(new java.awt.Color(244, 239, 224));
        tabelsupplier.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Supplier", "Nama Supplier", "Alamat", "No. Telepon", "Keterangan"
            }
        ));
        tabelsupplier.setGridColor(new java.awt.Color(255, 255, 255));
        tabelsupplier.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelsupplier.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsupplierMouseClicked(evt);
            }
        });
        jPane1.setViewportView(tabelsupplier);
        if (tabelsupplier.getColumnModel().getColumnCount() > 0) {
            tabelsupplier.getColumnModel().getColumn(4).setHeaderValue("No. Telepon");
            tabelsupplier.getColumnModel().getColumn(5).setHeaderValue("Keterangan");
        }

        SUPPLIER.add(jPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 780, 790));

        bgSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SP2.png"))); // NOI18N
        SUPPLIER.add(bgSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        DASHBOARD.setOpaque(false);
        DASHBOARD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        dashboardpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboardpic1.png"))); // NOI18N
        dashboardpic.setText("     Dashboard");
        DASHBOARD.add(dashboardpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        angkapenjualan1hr.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkapenjualan1hr.setText("Rp.0,0");
        DASHBOARD.add(angkapenjualan1hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 410, 50));

        textpenjualan1hr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textpenjualan1hr.setForeground(new java.awt.Color(130, 130, 130));
        textpenjualan1hr.setText("Penjualan Selama Satu Hari");
        DASHBOARD.add(textpenjualan1hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 260, -1));

        angkastok.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkastok.setText("0");
        DASHBOARD.add(angkastok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 240, 410, 50));

        textstok.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textstok.setForeground(new java.awt.Color(130, 130, 130));
        textstok.setText("Stok Barang Total");
        DASHBOARD.add(textstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 260, -1));

        angkatotalpembelian.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkatotalpembelian.setText("0 ORANG");
        DASHBOARD.add(angkatotalpembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 410, 50));

        texttotalpembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        texttotalpembelian.setForeground(new java.awt.Color(130, 130, 130));
        texttotalpembelian.setText("Total Pembeli Hari Ini");
        DASHBOARD.add(texttotalpembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 260, -1));

        angkajumlah.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkajumlah.setText("0");
        DASHBOARD.add(angkajumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 480, 410, 50));

        textjumlah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textjumlah.setForeground(new java.awt.Color(130, 130, 130));
        textjumlah.setText("Jumlah Barang Masuk Hari Ini");
        DASHBOARD.add(textjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 540, 260, -1));

        textgrafik.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textgrafik.setText("Grafik Penjulan Selama Satu Minggu");
        DASHBOARD.add(textgrafik, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 740, 630, 50));

        bgDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DS1.png"))); // NOI18N
        DASHBOARD.add(bgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        getContentPane().add(DASHBOARD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));

        PRODUKMASUK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idprodukmasuktext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idprodukmasuktext.setText("ID Produk Masuk : ");
        idprodukmasuktext.setBorder(null);
        PRODUKMASUK.add(idprodukmasuktext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 150, -1, 30));

        idprodukmasukfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idprodukmasukfield.setText("PM0");
        idprodukmasukfield.setBorder(null);
        PRODUKMASUK.add(idprodukmasukfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 150, 510, 30));

        namasupplierpmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namasupplierpmfield.setBorder(null);
        namasupplierpmfield.setOpaque(false);
        PRODUKMASUK.add(namasupplierpmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 230, 410, 40));

        jumlahmasukpmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jumlahmasukpmfield.setBorder(null);
        jumlahmasukpmfield.setOpaque(false);
        PRODUKMASUK.add(jumlahmasukpmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 350, 240, 40));

        hargabelipmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargabelipmfield.setBorder(null);
        hargabelipmfield.setOpaque(false);
        PRODUKMASUK.add(hargabelipmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 350, 260, 40));

        totalhargapmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalhargapmfield.setBorder(null);
        totalhargapmfield.setOpaque(false);
        PRODUKMASUK.add(totalhargapmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 570, 480, 40));

        totalhargabelipmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalhargabelipmfield.setBorder(null);
        totalhargabelipmfield.setOpaque(false);
        PRODUKMASUK.add(totalhargabelipmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 680, 480, 50));

        kembalianpmfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembalianpmfield.setBorder(null);
        kembalianpmfield.setOpaque(false);
        PRODUKMASUK.add(kembalianpmfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 790, 480, 50));

        tambahsupplierbtn.setOpaque(false);
        tambahsupplierbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahsupplierbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahsupplierbtnLayout = new javax.swing.GroupLayout(tambahsupplierbtn);
        tambahsupplierbtn.setLayout(tambahsupplierbtnLayout);
        tambahsupplierbtnLayout.setHorizontalGroup(
            tambahsupplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        tambahsupplierbtnLayout.setVerticalGroup(
            tambahsupplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        PRODUKMASUK.add(tambahsupplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 230, 130, 40));

        tambahkanpmbtn.setOpaque(false);
        tambahkanpmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkanpmbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahkanpmbtnLayout = new javax.swing.GroupLayout(tambahkanpmbtn);
        tambahkanpmbtn.setLayout(tambahkanpmbtnLayout);
        tambahkanpmbtnLayout.setHorizontalGroup(
            tambahkanpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        tambahkanpmbtnLayout.setVerticalGroup(
            tambahkanpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PRODUKMASUK.add(tambahkanpmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 410, 260, 50));

        resetpmbtn.setOpaque(false);
        resetpmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetpmbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout resetpmbtnLayout = new javax.swing.GroupLayout(resetpmbtn);
        resetpmbtn.setLayout(resetpmbtnLayout);
        resetpmbtnLayout.setHorizontalGroup(
            resetpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        resetpmbtnLayout.setVerticalGroup(
            resetpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PRODUKMASUK.add(resetpmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 410, 260, 50));

        hitungpmbtn.setOpaque(false);
        hitungpmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungpmbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hitungpmbtnLayout = new javax.swing.GroupLayout(hitungpmbtn);
        hitungpmbtn.setLayout(hitungpmbtnLayout);
        hitungpmbtnLayout.setHorizontalGroup(
            hitungpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        hitungpmbtnLayout.setVerticalGroup(
            hitungpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        PRODUKMASUK.add(hitungpmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 900, 230, 70));

        cetakfakturpmbtn.setOpaque(false);
        cetakfakturpmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cetakfakturpmbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cetakfakturpmbtnLayout = new javax.swing.GroupLayout(cetakfakturpmbtn);
        cetakfakturpmbtn.setLayout(cetakfakturpmbtnLayout);
        cetakfakturpmbtnLayout.setHorizontalGroup(
            cetakfakturpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        cetakfakturpmbtnLayout.setVerticalGroup(
            cetakfakturpmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        PRODUKMASUK.add(cetakfakturpmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 900, 230, 70));

        daftarpmcb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        daftarpmcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAFTAR SUPPLIER", "DAFTAR BARANG" }));
        daftarpmcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarpmcbActionPerformed(evt);
            }
        });
        PRODUKMASUK.add(daftarpmcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 290, 30));

        tabelbarangpm.setBackground(new java.awt.Color(244, 239, 224));
        tabelbarangpm.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelbarangpm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Alat Musik", "Nama Alat Musik", "Harga", "Stok"
            }
        ));
        tabelbarangpm.setGridColor(new java.awt.Color(255, 255, 255));
        tabelbarangpm.setRequestFocusEnabled(false);
        tabelbarangpm.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelbarangpm.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelbarangpm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangpmMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelbarangpm);

        PRODUKMASUK.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 800, 300));

        tabelprodukmasuk.setBackground(new java.awt.Color(244, 239, 224));
        tabelprodukmasuk.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelprodukmasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Produk Masuk", "ID Alat Musik", "Nama Alat Musik", "Harga", "Jumlah", "Total Harga"
            }
        ));
        tabelprodukmasuk.setGridColor(new java.awt.Color(255, 255, 255));
        tabelprodukmasuk.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelprodukmasuk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(tabelprodukmasuk);

        PRODUKMASUK.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 970, 430));

        produkmasukpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        produkmasukpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/produkmasukpic.png"))); // NOI18N
        produkmasukpic.setText("     Produk Masuk");
        PRODUKMASUK.add(produkmasukpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        bgProdukmasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PM2.png"))); // NOI18N
        PRODUKMASUK.add(bgProdukmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        idbarangtrfield1.setText("jTextField1");
        PRODUKMASUK.add(idbarangtrfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, -1, -1));

        namabarangtrfield1.setText("jTextField1");
        PRODUKMASUK.add(namabarangtrfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, -1, -1));

        totalhargapm.setText("jTextField1");
        PRODUKMASUK.add(totalhargapm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 60, -1, -1));

        getContentPane().add(PRODUKMASUK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        settingcb.setBackground(new java.awt.Color(244, 239, 224));
        settingcb.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        settingcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pengaturan", "Database" }));
        settingcb.setBorder(null);
        settingcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingcbActionPerformed(evt);
            }
        });
        getContentPane().add(settingcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 350, 50));

        laporanselectcb.setBackground(new java.awt.Color(244, 239, 224));
        laporanselectcb.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        laporanselectcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laporan Total", "Laporan Penjualan", "Laporan Stok Masuk" }));
        laporanselectcb.setBorder(null);
        laporanselectcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanselectcbActionPerformed(evt);
            }
        });
        getContentPane().add(laporanselectcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 350, 50));

        idkaryawanfield.setText("jTextField1");
        getContentPane().add(idkaryawanfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        DATABASE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backuppathfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backuppathfield.setBorder(null);
        DATABASE.add(backuppathfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 550, 70));

        exportdbbtn.setOpaque(false);
        exportdbbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportdbbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportdbbtnLayout = new javax.swing.GroupLayout(exportdbbtn);
        exportdbbtn.setLayout(exportdbbtnLayout);
        exportdbbtnLayout.setHorizontalGroup(
            exportdbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        exportdbbtnLayout.setVerticalGroup(
            exportdbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        DATABASE.add(exportdbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 210, 50));

        browsedbbtn.setOpaque(false);
        browsedbbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browsedbbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout browsedbbtnLayout = new javax.swing.GroupLayout(browsedbbtn);
        browsedbbtn.setLayout(browsedbbtnLayout);
        browsedbbtnLayout.setHorizontalGroup(
            browsedbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        browsedbbtnLayout.setVerticalGroup(
            browsedbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        DATABASE.add(browsedbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 210, 50));

        emaildbbtn.setOpaque(false);
        emaildbbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emaildbbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout emaildbbtnLayout = new javax.swing.GroupLayout(emaildbbtn);
        emaildbbtn.setLayout(emaildbbtnLayout);
        emaildbbtnLayout.setHorizontalGroup(
            emaildbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        emaildbbtnLayout.setVerticalGroup(
            emaildbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        DATABASE.add(emaildbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 440, 210, 60));

        whatsappdbbtn.setOpaque(false);
        whatsappdbbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whatsappdbbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout whatsappdbbtnLayout = new javax.swing.GroupLayout(whatsappdbbtn);
        whatsappdbbtn.setLayout(whatsappdbbtnLayout);
        whatsappdbbtnLayout.setHorizontalGroup(
            whatsappdbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        whatsappdbbtnLayout.setVerticalGroup(
            whatsappdbbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        DATABASE.add(whatsappdbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 360, 210, 60));

        hapusdatabarangbtn.setOpaque(false);
        hapusdatabarangbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusdatabarangbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusdatabarangbtnLayout = new javax.swing.GroupLayout(hapusdatabarangbtn);
        hapusdatabarangbtn.setLayout(hapusdatabarangbtnLayout);
        hapusdatabarangbtnLayout.setHorizontalGroup(
            hapusdatabarangbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        hapusdatabarangbtnLayout.setVerticalGroup(
            hapusdatabarangbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DATABASE.add(hapusdatabarangbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 550, 40));

        hapusdatasupplierbtn.setOpaque(false);
        hapusdatasupplierbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusdatasupplierbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusdatasupplierbtnLayout = new javax.swing.GroupLayout(hapusdatasupplierbtn);
        hapusdatasupplierbtn.setLayout(hapusdatasupplierbtnLayout);
        hapusdatasupplierbtnLayout.setHorizontalGroup(
            hapusdatasupplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        hapusdatasupplierbtnLayout.setVerticalGroup(
            hapusdatasupplierbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        DATABASE.add(hapusdatasupplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 560, 50));

        hapusdatalaporanpjbtn.setOpaque(false);
        hapusdatalaporanpjbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusdatalaporanpjbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusdatalaporanpjbtnLayout = new javax.swing.GroupLayout(hapusdatalaporanpjbtn);
        hapusdatalaporanpjbtn.setLayout(hapusdatalaporanpjbtnLayout);
        hapusdatalaporanpjbtnLayout.setHorizontalGroup(
            hapusdatalaporanpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        hapusdatalaporanpjbtnLayout.setVerticalGroup(
            hapusdatalaporanpjbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DATABASE.add(hapusdatalaporanpjbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 710, 550, 40));

        hapusdatalaporansmbtn.setOpaque(false);
        hapusdatalaporansmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusdatalaporansmbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusdatalaporansmbtnLayout = new javax.swing.GroupLayout(hapusdatalaporansmbtn);
        hapusdatalaporansmbtn.setLayout(hapusdatalaporansmbtnLayout);
        hapusdatalaporansmbtnLayout.setHorizontalGroup(
            hapusdatalaporansmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        hapusdatalaporansmbtnLayout.setVerticalGroup(
            hapusdatalaporansmbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DATABASE.add(hapusdatalaporansmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 790, 560, -1));

        settingpic1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        settingpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settingpic.png"))); // NOI18N
        settingpic1.setText("     Pengaturan");
        DATABASE.add(settingpic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        bgDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DB2.png"))); // NOI18N
        DATABASE.add(bgDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(DATABASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LAPORANTOTAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        laporanpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporanpic.png"))); // NOI18N
        LAPORANTOTAL.add(laporanpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        angkapenjualan1thn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkapenjualan1thn.setText("Rp.0,0");
        LAPORANTOTAL.add(angkapenjualan1thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 410, 50));

        textpenjualan1thn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textpenjualan1thn.setForeground(new java.awt.Color(130, 130, 130));
        textpenjualan1thn.setText("Penjualan Selama Satu Tahun");
        LAPORANTOTAL.add(textpenjualan1thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 260, -1));

        angkabrterjual.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkabrterjual.setText("0");
        LAPORANTOTAL.add(angkabrterjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 240, 410, 50));

        textbrterjual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textbrterjual.setForeground(new java.awt.Color(130, 130, 130));
        textbrterjual.setText("Jumlah Barang Terjual");
        LAPORANTOTAL.add(textbrterjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 260, -1));

        angkapembelian1thn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkapembelian1thn.setText("Rp. 0,0");
        LAPORANTOTAL.add(angkapembelian1thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 410, 50));

        textpembelian1thn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textpembelian1thn.setForeground(new java.awt.Color(130, 130, 130));
        textpembelian1thn.setText("Pembelian Selama Satu Tahun");
        LAPORANTOTAL.add(textpembelian1thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 260, -1));

        angkadibeli.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkadibeli.setText("0");
        LAPORANTOTAL.add(angkadibeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 480, 410, 50));

        textdibeli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textdibeli.setForeground(new java.awt.Color(130, 130, 130));
        textdibeli.setText("Jumlah Barang Dibeli");
        LAPORANTOTAL.add(textdibeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 540, 260, -1));

        textgrafikthn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textgrafikthn.setText("Grafik Penjulan dari Tahun ke Tahun");
        LAPORANTOTAL.add(textgrafikthn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 740, 630, 50));

        bgLaporantotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DS1.png"))); // NOI18N
        LAPORANTOTAL.add(bgLaporantotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(LAPORANTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TRANSAKSI.setOpaque(false);
        TRANSAKSI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transaksipic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        transaksipic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/barangpic.png"))); // NOI18N
        transaksipic.setText("     Transaksi");
        TRANSAKSI.add(transaksipic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        idtransaksitext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idtransaksitext.setText("ID Transaksi : ");
        idtransaksitext.setBorder(null);
        TRANSAKSI.add(idtransaksitext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 150, -1, 30));

        idtransaksitrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idtransaksitrfield.setText("IT0");
        idtransaksitrfield.setBorder(null);
        TRANSAKSI.add(idtransaksitrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 150, 550, 30));

        hargatrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargatrfield.setBorder(null);
        hargatrfield.setOpaque(false);
        TRANSAKSI.add(hargatrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 350, 260, 40));

        jumlahtrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jumlahtrfield.setBorder(null);
        jumlahtrfield.setOpaque(false);
        TRANSAKSI.add(jumlahtrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 350, 240, 40));

        namapembelitrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namapembelitrfield.setBorder(null);
        namapembelitrfield.setOpaque(false);
        TRANSAKSI.add(namapembelitrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 230, 410, 40));

        tambahpembelibtn.setOpaque(false);
        tambahpembelibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahpembelibtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahpembelibtnLayout = new javax.swing.GroupLayout(tambahpembelibtn);
        tambahpembelibtn.setLayout(tambahpembelibtnLayout);
        tambahpembelibtnLayout.setHorizontalGroup(
            tambahpembelibtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        tambahpembelibtnLayout.setVerticalGroup(
            tambahpembelibtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        TRANSAKSI.add(tambahpembelibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 230, 130, 40));

        resetbelanjaanbtn.setOpaque(false);
        resetbelanjaanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbelanjaanbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout resetbelanjaanbtnLayout = new javax.swing.GroupLayout(resetbelanjaanbtn);
        resetbelanjaanbtn.setLayout(resetbelanjaanbtnLayout);
        resetbelanjaanbtnLayout.setHorizontalGroup(
            resetbelanjaanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        resetbelanjaanbtnLayout.setVerticalGroup(
            resetbelanjaanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        TRANSAKSI.add(resetbelanjaanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 410, 260, 50));

        tambahkantrbtn.setOpaque(false);
        tambahkantrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkantrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahkantrbtnLayout = new javax.swing.GroupLayout(tambahkantrbtn);
        tambahkantrbtn.setLayout(tambahkantrbtnLayout);
        tambahkantrbtnLayout.setHorizontalGroup(
            tambahkantrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        tambahkantrbtnLayout.setVerticalGroup(
            tambahkantrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        TRANSAKSI.add(tambahkantrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 410, 260, 50));

        totalhargatrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalhargatrfield.setBorder(null);
        totalhargatrfield.setOpaque(false);
        TRANSAKSI.add(totalhargatrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 570, 480, 40));

        bayartrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bayartrfield.setBorder(null);
        bayartrfield.setOpaque(false);
        TRANSAKSI.add(bayartrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 680, 480, 50));

        kembaliantrfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembaliantrfield.setBorder(null);
        kembaliantrfield.setOpaque(false);
        TRANSAKSI.add(kembaliantrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 790, 480, 50));

        hitungtrbtn.setOpaque(false);
        hitungtrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungtrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hitungtrbtnLayout = new javax.swing.GroupLayout(hitungtrbtn);
        hitungtrbtn.setLayout(hitungtrbtnLayout);
        hitungtrbtnLayout.setHorizontalGroup(
            hitungtrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        hitungtrbtnLayout.setVerticalGroup(
            hitungtrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        TRANSAKSI.add(hitungtrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 900, 230, 70));

        cetakfakturtrbtn.setOpaque(false);
        cetakfakturtrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cetakfakturtrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cetakfakturtrbtnLayout = new javax.swing.GroupLayout(cetakfakturtrbtn);
        cetakfakturtrbtn.setLayout(cetakfakturtrbtnLayout);
        cetakfakturtrbtnLayout.setHorizontalGroup(
            cetakfakturtrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        cetakfakturtrbtnLayout.setVerticalGroup(
            cetakfakturtrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        TRANSAKSI.add(cetakfakturtrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 900, 230, 70));

        tabelbarangtr.setBackground(new java.awt.Color(244, 239, 224));
        tabelbarangtr.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelbarangtr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Alat Musik", "Nama Alat Musik", "Harga", "Stok"
            }
        ));
        tabelbarangtr.setGridColor(new java.awt.Color(255, 255, 255));
        tabelbarangtr.setRequestFocusEnabled(false);
        tabelbarangtr.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelbarangtr.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelbarangtr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangtrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbarangtr);

        TRANSAKSI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 800, 300));

        tabelkeranjang.setBackground(new java.awt.Color(244, 239, 224));
        tabelkeranjang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelkeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Transaksi", "ID Alat Musik", "Nama Alat Musik", "Harga", "Jumlah", "Total Harga", "Tanggal"
            }
        ));
        tabelkeranjang.setGridColor(new java.awt.Color(255, 255, 255));
        tabelkeranjang.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelkeranjang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabelkeranjang);
        if (tabelkeranjang.getColumnModel().getColumnCount() > 0) {
            tabelkeranjang.getColumnModel().getColumn(7).setHeaderValue("Tanggal");
        }

        TRANSAKSI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 970, 430));

        bgTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TR2.png"))); // NOI18N
        TRANSAKSI.add(bgTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        idbarangtrfield.setText("jTextField1");
        TRANSAKSI.add(idbarangtrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, -1, -1));

        idpembelitrfield.setText("PB0");
        TRANSAKSI.add(idpembelitrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 80, -1));

        namabarangtrfield.setText("jTextField1");
        TRANSAKSI.add(namabarangtrfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, -1, -1));

        totalbelanjafield.setText("jTextField1");
        TRANSAKSI.add(totalbelanjafield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 60, -1, -1));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        TRANSAKSI.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 860, -1, -1));

        getContentPane().add(TRANSAKSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));

        BARANG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barangpic.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        barangpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/barangpic.png"))); // NOI18N
        barangpic.setText("     Barang");
        BARANG.add(barangpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        idbarangfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idbarangfield.setBorder(null);
        BARANG.add(idbarangfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 570, 30));

        namabarangfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namabarangfield.setBorder(null);
        BARANG.add(namabarangfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 570, 30));

        hargajualfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargajualfield.setBorder(null);
        BARANG.add(hargajualfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 570, 30));

        hargabelifield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargabelifield.setBorder(null);
        BARANG.add(hargabelifield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 570, 40));

        stokfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stokfield.setBorder(null);
        BARANG.add(stokfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 570, 40));

        carifield.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        carifield.setBorder(null);
        carifield.setOpaque(false);
        BARANG.add(carifield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 100, 220, 30));

        tambahkanbrbtn.setOpaque(false);
        tambahkanbrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkanbrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahkanbrbtnLayout = new javax.swing.GroupLayout(tambahkanbrbtn);
        tambahkanbrbtn.setLayout(tambahkanbrbtnLayout);
        tambahkanbrbtnLayout.setHorizontalGroup(
            tambahkanbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        tambahkanbrbtnLayout.setVerticalGroup(
            tambahkanbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BARANG.add(tambahkanbrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, 180, 70));

        updatebrbtn.setOpaque(false);
        updatebrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updatebrbtnLayout = new javax.swing.GroupLayout(updatebrbtn);
        updatebrbtn.setLayout(updatebrbtnLayout);
        updatebrbtnLayout.setHorizontalGroup(
            updatebrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        updatebrbtnLayout.setVerticalGroup(
            updatebrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BARANG.add(updatebrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 810, 180, 70));

        hapusbrbtn.setOpaque(false);
        hapusbrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusbrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapusbrbtnLayout = new javax.swing.GroupLayout(hapusbrbtn);
        hapusbrbtn.setLayout(hapusbrbtnLayout);
        hapusbrbtnLayout.setHorizontalGroup(
            hapusbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        hapusbrbtnLayout.setVerticalGroup(
            hapusbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BARANG.add(hapusbrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 810, 180, 70));

        caribrbtn.setOpaque(false);
        caribrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caribrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout caribrbtnLayout = new javax.swing.GroupLayout(caribrbtn);
        caribrbtn.setLayout(caribrbtnLayout);
        caribrbtnLayout.setHorizontalGroup(
            caribrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        caribrbtnLayout.setVerticalGroup(
            caribrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BARANG.add(caribrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 100, 120, 40));

        exportbrbtn.setOpaque(false);
        exportbrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportbrbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exportbrbtnLayout = new javax.swing.GroupLayout(exportbrbtn);
        exportbrbtn.setLayout(exportbrbtnLayout);
        exportbrbtnLayout.setHorizontalGroup(
            exportbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        exportbrbtnLayout.setVerticalGroup(
            exportbrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BARANG.add(exportbrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 150, 40));

        tabelbarang.setBackground(new java.awt.Color(244, 239, 224));
        tabelbarang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabelbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Alat Musik", "Nama Alat Musik", "Harga Jual", "Harga Beli", "Stok"
            }
        ));
        tabelbarang.setGridColor(new java.awt.Color(255, 255, 255));
        tabelbarang.setSelectionBackground(new java.awt.Color(194, 184, 156));
        tabelbarang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangMouseClicked(evt);
            }
        });
        jPane.setViewportView(tabelbarang);
        if (tabelbarang.getColumnModel().getColumnCount() > 0) {
            tabelbarang.getColumnModel().getColumn(4).setHeaderValue("No. Telepon");
            tabelbarang.getColumnModel().getColumn(5).setHeaderValue("Keterangan");
        }

        BARANG.add(jPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 780, 790));

        bgBarang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bgBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BR2.png"))); // NOI18N
        BARANG.add(bgBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(BARANG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardmenuMouseClicked
    DASHBOARD.setVisible(true);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(false);
    settingcb.setVisible(false);
    TampilkanJumlah();
    TampilkanOrang();
    TampilkanStok();
    TampilkanStokMasuk();
    dashboardshow();
    kosong();
    kosongsp();
    }//GEN-LAST:event_dashboardmenuMouseClicked

    private void barangmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangmenuMouseClicked
    DASHBOARD.setVisible(false);
    BARANG.setVisible(true);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(false);
    settingcb.setVisible(false);
    barangshow();
    kosong();
    kosongsp();
    auto_kode();
    load_tabelbarang();
    lebar_tabelbarang();
    }//GEN-LAST:event_barangmenuMouseClicked

    private void transaksimenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksimenuMouseClicked
    DASHBOARD.setVisible(false);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(true);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    idtransaksitext.disable();
    laporanselectcb.setVisible(false);
    settingcb.setVisible(false);
    idpembelitrfield.setVisible(false);
    idbarangtrfield.setVisible(false);
    namabarangtrfield.setVisible(false);
    totalbelanjafield.setVisible(false);
    transaksishow();
    load_tabelbarangtr();
    lebar_tabelbarangtr();
    load_tabelkeranjang();
    lebar_tabelkeranjang();
    }//GEN-LAST:event_transaksimenuMouseClicked

    private void suppliermenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliermenuMouseClicked
    DASHBOARD.setVisible(false);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(true);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(false);
    settingcb.setVisible(false);
    suppliershow();
    kosong();
    kosongsp();
    auto_kdSupp();
    load_tabelsupplier();
    lebar_tabelsupplier();
    }//GEN-LAST:event_suppliermenuMouseClicked

    private void laporanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanmenuMouseClicked
    DASHBOARD.setVisible(false);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(true);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(true);
    settingcb.setVisible(false);
    TampilkanJumlah1thn();
    TampilkanBeli1thn();
    TampilkanBarangterjual();
    TampilkanBarangdibeli();
    laporanshow();
    kosong();
    kosongsp();
    }//GEN-LAST:event_laporanmenuMouseClicked

    private void pengaturanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengaturanmenuMouseClicked
    DASHBOARD.setVisible(false);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(false);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(true);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(false);
    settingcb.setVisible(true);
    pengaturanshow();
    eyehide.setVisible(false);
    idkaryawanstfield.disable();
    kosong();
    kosongst();
    load_tabelsetting();
    lebar_tabelsetting();
    
    }//GEN-LAST:event_pengaturanmenuMouseClicked

    private void keluarmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarmenuMouseClicked
    this.setVisible(false);
    new LoginForm().setVisible(true);
    }//GEN-LAST:event_keluarmenuMouseClicked

    private void tabelbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangMouseClicked
    // Tampilan Barang
        int baris = tabelbarang.rowAtPoint(evt.getPoint());
        String idText = tabelbarang.getValueAt(baris, 1).toString();
        idbarangfield.setText(idText);
        idbarangfield.disable();

        if (tabelbarang.getValueAt(baris, 2)==null){
            namabarangfield.setText("");
        } else {
            namabarangfield.setText(tabelbarang.getValueAt(baris, 2).toString());
        }
        if (tabelbarang.getValueAt(baris, 3)==null){
            hargajualfield.setText("");
        } else {
            hargajualfield.setText(tabelbarang.getValueAt(baris, 3).toString());
        }
        if (tabelbarang.getValueAt(baris, 4)==null){
            hargabelifield.setText("");
        } else {
            hargabelifield.setText(tabelbarang.getValueAt(baris, 4).toString());
        }
        if (tabelbarang.getValueAt(baris, 5)==null){
            stokfield.setText("");
        } else {
            stokfield.setText(tabelbarang.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tabelbarangMouseClicked
      
    private void tambahkanbrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanbrbtnMouseClicked
        // Tampilan Barang
    try {
        String sql3 = "INSERT INTO alatmusik VALUES ('"+idbarangfield.getText()+"','"+namabarangfield.getText()+
                "',"+hargajualfield.getText()+","+hargabelifield.getText()+","+stokfield.getText()+")";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql3);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Penyimpanan Data Berhasil");
        DefaultTableModel model = (DefaultTableModel)tabelbarang.getModel();
        model.setRowCount(0);
        load_tabelbarang();
        lebar_tabelbarang();
        kosong();
        auto_kode();
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_tambahkanbrbtnMouseClicked

    private void updatebrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebrbtnMouseClicked
    // Tampilan Barang
    try {
        String sql = "UPDATE alatmusik "+"SET namaalatmusik = '"+namabarangfield.getText()+"', harga_jual = '"+hargajualfield.getText()
                +"', harga_beli = '"+hargabelifield.getText()
                +"', stok = '"+stokfield.getText()+"'"+
                " WHERE idalatmusik = '"+idbarangfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Perbarui");
        DefaultTableModel model = (DefaultTableModel)tabelbarang.getModel();
        model.setRowCount(0);
        load_tabelbarang();
        lebar_tabelbarang();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Perubahan Data Gagal!\n"+e.getMessage());
    }
    kosong();
    auto_kode();
    }//GEN-LAST:event_updatebrbtnMouseClicked

    private void caribrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caribrbtnMouseClicked
    // Tampilan Barang
    try {
        String sqls = "SELECT * FROM alatmusik WHERE idalatmusik LIKE '%"+carifield.getText()+
                    "%' OR namaalatmusik LIKE '%"+carifield.getText()+"%' OR harga_jual LIKE '"+carifield.getText()+"' OR harga_beli LIKE '"+carifield.getText()+
                    "' OR stok LIKE '"+carifield.getText()+"' ORDER BY idalatmusik";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sqls);
        java.sql.ResultSet ress = pst.executeQuery(sqls);
        DefaultTableModel model = (DefaultTableModel)tabelbarang.getModel();
        model.setRowCount(0);
            int no = 1;
            while (ress.next()){
                model.addRow (new Object[] {no++, ress.getString(1),
                    ress.getString(2), ress.getString(3), ress.getString(4), ress.getString(5)});
            }
        tabelbarang.setModel(model);
        } catch (SQLException ex) {
    }    
    }//GEN-LAST:event_caribrbtnMouseClicked

    private void exportbrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportbrbtnMouseClicked
    // Tampilan Barang
        DefaultTableModel model = (DefaultTableModel)tabelbarang.getModel();
        tabelbarang.setModel(model);
        try{
            WritableWorkbook write = Workbook.createWorkbook(new File("C:/Users/Maulana Akbar/Documents/All XLS/export-data-barang.xls"));
            WritableSheet sheet = write.createSheet("export-data",0);
            sheet.addCell(new Label(0,0,"Id Alat Musik"));
            sheet.addCell(new Label(1,0,"Nama Alat Musik"));
            sheet.addCell(new Label(2,0,"Harga Jual"));
            sheet.addCell(new Label(3,0,"Harga Beli"));
            sheet.addCell(new Label(4,0,"Stok"));
            for (int i = 0; i < model.getColumnCount(); i++) {
                Label column = new Label(i, 0, model.getColumnName(i));
                sheet.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    Label row = new Label(j, i + 1,
                        model.getValueAt(i, j).toString());
                    sheet.addCell(row);
                }
            }
            write.write();
            write.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan Ke Excel");
        }catch(HeadlessException | IOException | WriteException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!!!"+e.toString());
        }
    }//GEN-LAST:event_exportbrbtnMouseClicked

    private void hapusbrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusbrbtnMouseClicked
    // Tampilan Barang
    try {
        String sql = "DELETE FROM alatmusik WHERE idalatmusik ='"+idbarangfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
        DefaultTableModel model = (DefaultTableModel)tabelbarang.getModel();
        model.setRowCount(0);
        load_tabelbarang();
        lebar_tabelbarang();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    kosong();
    auto_kode();
    }//GEN-LAST:event_hapusbrbtnMouseClicked

    private void tabelsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsupplierMouseClicked
    // Tampilan Supplier
        int baris = tabelsupplier.rowAtPoint(evt.getPoint());
        String idText = tabelsupplier.getValueAt(baris, 1).toString();
        idsupplierfield.setText(idText);
        idsupplierfield.disable();

        if (tabelsupplier.getValueAt(baris, 2)==null){
            namasupplierfield.setText("");
        } else {
            namasupplierfield.setText(tabelsupplier.getValueAt(baris, 2).toString());
        }
        if (tabelsupplier.getValueAt(baris, 3)==null){
            alamatsupplierfield.setText("");
        } else {
            alamatsupplierfield.setText(tabelsupplier.getValueAt(baris, 3).toString());
        }
        if (tabelsupplier.getValueAt(baris, 4)==null){
            notelpsupplierfield.setText("");
        } else {
            notelpsupplierfield.setText(tabelsupplier.getValueAt(baris, 4).toString());
        }
        if (tabelsupplier.getValueAt(baris, 5)==null){
            keterangansupplierfield.setText("");
        } else {
            keterangansupplierfield.setText(tabelsupplier.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tabelsupplierMouseClicked

    private void tambahkanspbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanspbtnMouseClicked
    // Tampilan Supplier
    try {
        String sql3 = "INSERT INTO supplier VALUES ('"+idsupplierfield.getText()+"','"+namasupplierfield.getText()+
                "','"+alamatsupplierfield.getText()+"',"+notelpsupplierfield.getText()+",'"+keterangansupplierfield.getText()+"')";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql3);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Penyimpanan Data Berhasil");
        DefaultTableModel model = (DefaultTableModel)tabelsupplier.getModel();
        model.setRowCount(0);
        load_tabelsupplier();
        lebar_tabelsupplier();
        kosongsp();
        auto_kdSupp();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_tambahkanspbtnMouseClicked

    private void updatespbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatespbtnMouseClicked
    // Tampilan Supplier
    try {
        String sql = "UPDATE supplier "+"SET nama_supplier = '"+namasupplierfield.getText()+"', alamat = '"+alamatsupplierfield.getText()
                +"', no_telp = '"+notelpsupplierfield.getText()
                +"', keterangan = '"+keterangansupplierfield.getText()+"'"+
                " WHERE id_supplier = '"+idsupplierfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Perbarui");
        DefaultTableModel model = (DefaultTableModel)tabelsupplier.getModel();
        model.setRowCount(0);
        load_tabelsupplier();
        lebar_tabelsupplier();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Perubahan Data Gagal!\n"+e.getMessage());
    }
    kosongsp();
    auto_kdSupp();
    }//GEN-LAST:event_updatespbtnMouseClicked

    private void hapusspbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusspbtnMouseClicked
    // Tampilan Supplier
    try {
        String sql = "DELETE FROM supplier WHERE id_supplier ='"+idsupplierfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
        DefaultTableModel model = (DefaultTableModel)tabelsupplier.getModel();
        model.setRowCount(0);
        load_tabelsupplier();
        lebar_tabelsupplier();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    kosongsp();
    auto_kdSupp();
    }//GEN-LAST:event_hapusspbtnMouseClicked

    private void carispbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carispbtnMouseClicked
    // Tampilan Supplier
    try {
        String sqls = "SELECT * FROM supplier WHERE id_supplier LIKE '%"+carisupplierfield.getText()+
                    "%' OR nama_supplier LIKE '%"+carisupplierfield.getText()+"%' OR alamat LIKE '%"+carisupplierfield.getText()+
                    "%' OR no_telp LIKE '"+carisupplierfield.getText()+
                    "' OR keterangan LIKE '%"+carisupplierfield.getText()+"%' ORDER BY id_supplier";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sqls);
        java.sql.ResultSet ress = pst.executeQuery(sqls);
        DefaultTableModel model = (DefaultTableModel)tabelsupplier.getModel();
        model.setRowCount(0);
            int no = 1;
            while (ress.next()){
                model.addRow (new Object[] {no++, ress.getString(1),
                    ress.getString(2), ress.getString(3), ress.getString(4), ress.getString(5)});
            }
        tabelsupplier.setModel(model);
        } catch (SQLException ex) {
    }   
    }//GEN-LAST:event_carispbtnMouseClicked

    private void exportspbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportspbtnMouseClicked
    // Tampilan Supplier
    DefaultTableModel model = (DefaultTableModel)tabelsupplier.getModel();
        tabelsupplier.setModel(model);
        try{
            WritableWorkbook write = Workbook.createWorkbook(new File("C:/Users/Maulana Akbar/Documents/All XLS/export-data-supplier.xls"));
            WritableSheet sheet = write.createSheet("export-data",0);
            sheet.addCell(new Label(0,0,"Id Supplier"));
            sheet.addCell(new Label(1,0,"Nama Supplier"));
            sheet.addCell(new Label(2,0,"Alamat"));
            sheet.addCell(new Label(3,0,"No. Telepon"));
            sheet.addCell(new Label(4,0,"Keterangan"));
            for (int i = 0; i < model.getColumnCount(); i++) {
                Label column = new Label(i, 0, model.getColumnName(i));
                sheet.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    Label row = new Label(j, i + 1,
                        model.getValueAt(i, j).toString());
                    sheet.addCell(row);
                }
            }
            write.write();
            write.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan Ke Excel");
        }catch(HeadlessException | IOException | WriteException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!!!"+e.toString());
        }
    }//GEN-LAST:event_exportspbtnMouseClicked

    private void hapusstbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusstbtnMouseClicked
    // Tampilan Setting
    try {        
        String sql1 = "DELETE FROM user WHERE idkaryawan ='"+idkaryawanstfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        pst1.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
        DefaultTableModel model = (DefaultTableModel)tabelsetting.getModel();
        model.setRowCount(0);
        load_tabelsetting();
        lebar_tabelsetting();
        kosongst();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_hapusstbtnMouseClicked

    private void updatestbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestbtnMouseClicked
    // Tampilan Setting
    String tanggal = ((JTextField)tglst.getDateEditor().getUiComponent()).getText();
    
    try {        
        String sql2 = "SELECT * FROM user";
        String sql3 = "UPDATE user SET nama_karyawan = '"+namakaryawanstfield.getText()+"', telepon = "+notelpstfield.getText()+" WHERE idkaryawan = '" + idkaryawanstfield.getText()+"'";
//        String sql4 = "UPDATE user SET password = '" + passwordstfield.getText() + "' WHERE idkaryawan = '" + idkaryawanstfield.getText() + "'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
        java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
        pst3.execute();
        java.sql.ResultSet rs1 = pst2.executeQuery(sql2);
//        if (rs1.next()){
//            if (tanggal.equals(rs1.getString("tgl_lahir")) && idkaryawanstfield.getText().equals(rs1.getString("idkaryawan")) && namakaryawanstfield.getText().equals(rs1.getString("nama_karyawan"))){
//                pst4.execute();
//            }
//        }
        JOptionPane.showMessageDialog(null,"Data Berhasil di Perbarui");
        DefaultTableModel model = (DefaultTableModel)tabelsetting.getModel();
        model.setRowCount(0);
        load_tabelsetting();
        lebar_tabelsetting();
        kosongst();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_updatestbtnMouseClicked

    private void tambahkanstbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanstbtnMouseClicked
    // Tampilan Setting
    try {        
        String sql1 = "INSERT INTO user VALUES('"+idkaryawanstfield.getText()+"','"+namakaryawanstfield.getText()+
                "','"+passwordstfield.getText()+"','"+hakaksescb.getSelectedItem()+"','"+tgl+"','"+notelpstfield.getText()+"')";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        pst1.execute();
        
        JOptionPane.showMessageDialog(null,"Penyimpanan Data Berhasil");
        DefaultTableModel model = (DefaultTableModel)tabelsetting.getModel();
        model.setRowCount(0);
        load_tabelsetting();
        lebar_tabelsetting();
        kosongst();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_tambahkanstbtnMouseClicked

    private void exportstbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportstbtnMouseClicked
    // Tampilan Setting
    DefaultTableModel model = (DefaultTableModel)tabelsetting.getModel();
        tabelsetting.setModel(model);
        try{
            WritableWorkbook write = Workbook.createWorkbook(new File("C:/Users/Maulana Akbar/Documents/All XLS/export-data-setting.xls"));
            WritableSheet sheet = write.createSheet("export-data",0);
            sheet.addCell(new Label(0,0,"Id Karyawan"));
            sheet.addCell(new Label(1,0,"Nama Karyawan"));
            sheet.addCell(new Label(2,0,"Hak Akses"));
            sheet.addCell(new Label(3,0,"No. Telepon"));
            for (int i = 0; i < model.getColumnCount(); i++) {
                Label column = new Label(i, 0, model.getColumnName(i));
                sheet.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    Label row = new Label(j, i + 1,
                        model.getValueAt(i, j).toString());
                    sheet.addCell(row);
                }
            }
            write.write();
            write.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan Ke Excel");
        }catch(HeadlessException | IOException | WriteException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!!!"+e.toString());
        }
    }//GEN-LAST:event_exportstbtnMouseClicked

    private void caristbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caristbtnMouseClicked
    // Tampilan Setting
    try {
        String sqls = "SELECT * FROM user WHERE idkaryawan LIKE '%"+carisettingfield.getText()+
                    "%' OR nama_karyawan LIKE '%"+carisettingfield.getText()+
                    "%' OR user_parameter LIKE '%"+carisettingfield.getText()+"%' OR telepon LIKE '"+carisettingfield.getText()+"' ORDER BY idkaryawan";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sqls);
        java.sql.ResultSet ress = pst.executeQuery(sqls);
        DefaultTableModel model = (DefaultTableModel)tabelsetting.getModel();
        model.setRowCount(0);
            int no = 1;
            while (ress.next()){
                model.addRow (new Object[] {no++, ress.getString(1),
                    ress.getString(2), ress.getString(3), ress.getString(4)});
            }
        tabelsetting.setModel(model);
        } catch (SQLException ex) {
    }    
    }//GEN-LAST:event_caristbtnMouseClicked

    private void tabelsettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsettingMouseClicked
    // Tampilan Setting
        int baris = tabelsetting.rowAtPoint(evt.getPoint());
        String idText = tabelsetting.getValueAt(baris, 1).toString();
        idkaryawanstfield.setText(idText);
        idkaryawanstfield.disable();
        passwordstfield.setText(null);

        if (tabelsetting.getValueAt(baris, 2)==null){
            namakaryawanstfield.setText("");
        } else {
            namakaryawanstfield.setText(tabelsetting.getValueAt(baris, 2).toString());
        }
        if (tabelsetting.getValueAt(baris, 4)==null){
            notelpstfield.setText("");
        } else {
            notelpstfield.setText(tabelsetting.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_tabelsettingMouseClicked

    private void eyehideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyehideMouseClicked
        // Tampilan Setting
        passwordstfield.setEchoChar('•');
        eyeshow.setVisible(true);
        eyehide.setVisible(false);
    }//GEN-LAST:event_eyehideMouseClicked

    private void eyeshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeshowMouseClicked
        // Tampilan Setting
        passwordstfield.setEchoChar((char)0);
        passwordstfield.setFont(new java.awt.Font("Segoe UI Bold", 2, 18));
        eyeshow.setVisible(false);
        eyehide.setVisible(true);
    }//GEN-LAST:event_eyeshowMouseClicked

    private void hapusdatabarangbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusdatabarangbtnMouseClicked
        // Tampilan Setting
    }//GEN-LAST:event_hapusdatabarangbtnMouseClicked

    private void hapusdatasupplierbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusdatasupplierbtnMouseClicked
        // Tampilan Setting
    }//GEN-LAST:event_hapusdatasupplierbtnMouseClicked

    private void hapusdatalaporanpjbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusdatalaporanpjbtnMouseClicked
        // Tampilan Setting
    }//GEN-LAST:event_hapusdatalaporanpjbtnMouseClicked

    private void hapusdatalaporansmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusdatalaporansmbtnMouseClicked
        // Tampilan Setting
    }//GEN-LAST:event_hapusdatalaporansmbtnMouseClicked

    private void tabelbarangtrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangtrMouseClicked
        // Tampilan Transaksi
        int baris = tabelbarangtr.rowAtPoint(evt.getPoint());
        if (tabelbarangtr.getValueAt(baris, 1)==null){
            idbarangtrfield.setText("");
        } else {
            idbarangtrfield.setText(tabelbarangtr.getValueAt(baris, 1).toString());
        }
        if (tabelbarangtr.getValueAt(baris, 2)==null){
            namabarangtrfield.setText("");
        } else {
            namabarangtrfield.setText(tabelbarangtr.getValueAt(baris, 2).toString());
        }
        if (tabelbarangtr.getValueAt(baris, 3)==null){
            hargatrfield.setText("");
        } else {
            hargatrfield.setText(tabelbarangtr.getValueAt(baris, 3).toString());
        }
    }//GEN-LAST:event_tabelbarangtrMouseClicked

    private void tambahkantrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkantrbtnMouseClicked
        // Tampilan Transaksi
        String harga = hargatrfield.getText();
        String jumlah = jumlahtrfield.getText();
        int hargaa = Integer.parseInt(harga);
        
        try {
            int jumlahh = Integer.parseInt(jumlah);
            int totalh = hargaa * jumlahh;
            String totalhrg = Integer.toString(totalh);
            totalbelanjafield.setText(totalhrg);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka!!!");
            jumlahtrfield.setText(null);
        }
        
        try {        
        String sql3 = "INSERT INTO detail_transaksi VALUES ('"+idtransaksitrfield.getText()+"','"+idbarangtrfield.getText()+"',"+hargatrfield.getText()+","+jumlahtrfield.getText()+","+totalbelanjafield.getText()+", CURRENT_TIMESTAMP)";
        String sql4 = "SELECT SUM(totalharga) AS total FROM detail_transaksi WHERE idtransaksi = '"+idtransaksitrfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
        java.sql.PreparedStatement pst4 = conn.prepareStatement(sql4);
        pst3.execute();
        java.sql.ResultSet rs= pst4.executeQuery(sql4);
        while(rs.next()){
        String data = rs.getString("total");
            if(data == null){
                totalhargatrfield.setText("Rp. 0");   
            } else {
                totalhargatrfield.setText(data);   
            }
       
//        JOptionPane.showMessageDialog(null,"Barang Ditambahkan Ke Keranjang");
        DefaultTableModel model = (DefaultTableModel)tabelkeranjang.getModel();
        model.setRowCount(0);
        load_tabelbarangtr();
        lebar_tabelbarangtr();
        load_tabelkeranjang();
        lebar_tabelkeranjang();
        jumlahtrfield.setText(null);
        }
    } catch (Exception e){
        JOptionPane.showMessageDialog(this, "Tidak dapat menambahkan barang ke dalam keranjang!\n\nMohon tambahkan Nama Pembeli terlebih dahulu dengan mengetik pada field 'Nama Pembeli' dan klik tombol 'Tambah'");
    }
        
        
        
//    String procedures = "CALL `total_belanja`()";
//        
//        try{
//            java.sql.Connection conn = (Connection)Config.configDB();
//            java.sql.PreparedStatement pst = conn.prepareStatement(procedures);
//            java.sql.ResultSet ress = pst.executeQuery(procedures);
//        while(ress.next()){
//            totalhargatrfield.setText("Rp. "+ress.getString(1));
//        }
//                
//        } catch(SQLException e){
//            System.out.println(e);
//        }
        
      
    }//GEN-LAST:event_tambahkantrbtnMouseClicked

    private void tambahpembelibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahpembelibtnMouseClicked
        // Tampilan Transaksi
        try {        
        String sql1 = "INSERT INTO pembeli VALUES('"+idpembelitrfield.getText()+"','"+namapembelitrfield.getText()+"')";
        String sql2 = "INSERT INTO transaksi VALUES ('"+idtransaksitrfield.getText()+"','"+idpembelitrfield.getText()+"', CURRENT_TIMESTAMP)";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
        pst1.execute();
        pst2.execute();
        JOptionPane.showMessageDialog(null,"Data Pembeli dan Transaksi Berhasil Ditambahkan");
        DefaultTableModel model = (DefaultTableModel)tabelkeranjang.getModel();
        model.setRowCount(0);
        load_tabelkeranjang();
        lebar_tabelkeranjang();
        totalhargatrfield.setText(null);
        bayartrfield.setText(null);
        kembaliantrfield.setText(null);
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_tambahpembelibtnMouseClicked

    private void resetbelanjaanbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbelanjaanbtnMouseClicked
    // Tampilan Transaksi
    try {        
        String sql1 = "DELETE FROM detail_transaksi WHERE idtransaksi = '"+idtransaksitrfield.getText()+"'";
        String sql2 = "DELETE FROM pembeli WHERE idpembeli = '"+idpembelitrfield.getText()+"'";
        String sql3 = "DELETE FROM transaksi WHERE idpembeli = '"+idpembelitrfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
        java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
        pst1.execute();
        pst3.execute();
        pst2.execute();
        JOptionPane.showMessageDialog(null,"Data Keranjang Berhasil di Reset");
        DefaultTableModel model = (DefaultTableModel)tabelkeranjang.getModel();
        model.setRowCount(0);
        load_tabelkeranjang();
        lebar_tabelkeranjang();
        hargatrfield.setText(null);
        jumlahtrfield.setText(null);
        totalhargatrfield.setText(null);
        auto_kdTransaksi();
        auto_kdPB();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_resetbelanjaanbtnMouseClicked

    private void hitungtrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungtrbtnMouseClicked
    // Tampilan Transaksi
        String total = totalhargatrfield.getText();
        String uang = bayartrfield.getText();
        
        int totals = Integer.parseInt(total);
        int uangs = Integer.parseInt(uang);
        
        try{
            if (uangs < totals){
            JOptionPane.showMessageDialog(null, "Pembayaran Kurang atau Tidak Sah!");
            bayartrfield.setText(null);
        } else {
            int kembali = (uangs - totals);
            String fix = Integer.toString(kembali);
            kembaliantrfield.setText(fix);
            try {
                DefaultTableModel model = (DefaultTableModel)tabelkeranjang.getModel();
                int baris = tabelkeranjang.getRowCount();
                for (int a = 0; a< baris; a++){
                    model.removeRow(0);
                }
                
                hargatrfield.setText(null);
                jumlahtrfield.setText(null);
            } catch (HeadlessException e){
            }
            auto_kdTransaksi();
            auto_kdPB();
            JOptionPane.showMessageDialog(null, "Pembayaran Berhasil!");
            }
        }catch(NumberFormatException | HeadlessException e){  
        }
    }//GEN-LAST:event_hitungtrbtnMouseClicked

    private void cetakfakturtrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cetakfakturtrbtnMouseClicked
    // Tampilan Transaksi
    }//GEN-LAST:event_cetakfakturtrbtnMouseClicked

    private void produkmasukmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkmasukmenuMouseClicked
    // Tampilan Produk Masuk
    DASHBOARD.setVisible(false);
    BARANG.setVisible(false);
    PRODUKMASUK.setVisible(true);
    TRANSAKSI.setVisible(false);
    SUPPLIER.setVisible(false);
    LAPORANTOTAL.setVisible(false);
    LAPORANSELECT1.setVisible(false);
    LAPORANSELECT2.setVisible(false);
    SETTING.setVisible(false);
    DATABASE.setVisible(false);
    laporanselectcb.setVisible(false);
    settingcb.setVisible(false);
    idprodukmasuktext.disable();
    idbarangtrfield1.setVisible(false);
    namabarangtrfield1.setVisible(false);
    totalhargapm.setVisible(false);
    produkmasukshow();
    load_tabelsupplierpm();
    lebar_tabelsupplierpm();
    }//GEN-LAST:event_produkmasukmenuMouseClicked

    private void daftarpmcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarpmcbActionPerformed
    // Tampilan Produk Masuk
    if (daftarpmcb.getSelectedIndex()==0){
        load_tabelsupplierpm();
        lebar_tabelsupplierpm();
    }
    if (daftarpmcb.getSelectedIndex()==1){
        load_tabelbarangpm();
        lebar_tabelbarangpm();
    }
    }//GEN-LAST:event_daftarpmcbActionPerformed

    private void tabelbarangpmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangpmMouseClicked
    // Tampilan Produk Masuk
    int baris = tabelbarangpm.rowAtPoint(evt.getPoint());
        if (tabelbarangpm.getValueAt(baris, 1)==null){
            idbarangtrfield1.setText("");
        } else {
            idbarangtrfield1.setText(tabelbarangpm.getValueAt(baris, 1).toString());
        }
        if (tabelbarangpm.getValueAt(baris, 2)==null){
            namabarangtrfield1.setText("");
        } else {
            if (daftarpmcb.getSelectedIndex()==0){
                namasupplierpmfield.setText(tabelbarangpm.getValueAt(baris, 2).toString());
            } if (daftarpmcb.getSelectedIndex()==1){
                namabarangtrfield1.setText(tabelbarangpm.getValueAt(baris, 2).toString());
            }
        }
        if (tabelbarangpm.getValueAt(baris, 3)==null){
            hargabelipmfield.setText("");
        } else {
            if (daftarpmcb.getSelectedIndex()==0){
                hargabelipmfield.setText("");
            } if (daftarpmcb.getSelectedIndex()==1){
                hargabelipmfield.setText(tabelbarangpm.getValueAt(baris, 3).toString());
            }
        }
    }//GEN-LAST:event_tabelbarangpmMouseClicked

    private void tambahsupplierbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahsupplierbtnMouseClicked
    // Tampilan Produk Masuk
    try {        
        String sql1 = "INSERT INTO produkmasuk VALUES('"+idprodukmasukfield.getText()+"','"+idbarangtrfield1.getText()+"', CURRENT_TIMESTAMP)";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        pst1.execute();
        JOptionPane.showMessageDialog(null,"Data Supplier Berhasil Ditambahkan");
        DefaultTableModel model = (DefaultTableModel)tabelbarangpm.getModel();
        model.setRowCount(0);
        load_tabelsupplierpm();
        lebar_tabelsupplierpm();
        jumlahmasukpmfield.setText(null);
//        kelas.autoidbarang();
        
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_tambahsupplierbtnMouseClicked

    private void tambahkanpmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanpmbtnMouseClicked
    // Tampilan Produk Masuk
        String harga = hargabelipmfield.getText();
        String jumlah = jumlahmasukpmfield.getText();
        int hargaa = Integer.parseInt(harga);
        
        try {
            int jumlahh = Integer.parseInt(jumlah);
            int totalh = hargaa * jumlahh;
            String totalhrg = Integer.toString(totalh);
            totalhargapm.setText(totalhrg);
        } catch(NumberFormatException e){
            jumlahmasukpmfield.setText(null);
        }
        
        try {        
        String sql3 = "INSERT INTO detail_produkmasuk VALUES('"+idprodukmasukfield.getText()+"','"+idbarangtrfield1.getText()+"',"+hargabelipmfield.getText()+","+jumlahmasukpmfield.getText()+","+totalhargapm.getText()+", CURRENT_TIMESTAMP)";
        String sql4 = "SELECT SUM(harga_total) AS total FROM detail_produkmasuk WHERE id_produkmasuk = '"+idprodukmasukfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
        java.sql.PreparedStatement pst4 = conn.prepareStatement(sql4);
        pst3.execute();
        java.sql.ResultSet rs= pst4.executeQuery(sql4);
        while(rs.next()){
        String data = rs.getString("total");
            if(data == null){
                totalhargapmfield.setText("Rp. 0");   
            } else {
                totalhargapmfield.setText(data );   
            }
       
//        JOptionPane.showMessageDialog(null,"Barang Ditambahkan Ke Keranjang");
        DefaultTableModel model = (DefaultTableModel)tabelprodukmasuk.getModel();
        model.setRowCount(0);
        load_tabelprodukmasuk(); 
        lebar_tabelprodukmasuk();
        jumlahmasukpmfield.setText(null);

        }
    } catch (Exception e){
        JOptionPane.showMessageDialog(this, "Tidak dapat menambahkan barang ke dalam Daftar Barang Masuk!\n\nMohon tambahkan Supplier terlebih dahulu.\natau\nMohon ketik 'Jumlah Masuk' lalu tekan tombol tambahkan");
    }
    }//GEN-LAST:event_tambahkanpmbtnMouseClicked

    private void hitungpmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungpmbtnMouseClicked
    // Tampilan Produk Masuk
        String total = totalhargapmfield.getText();
        String uang = totalhargabelipmfield.getText();
        
        int totals = Integer.parseInt(total);
        int uangs = Integer.parseInt(uang);
        
        try{
            if (uangs < totals){
            JOptionPane.showMessageDialog(null, "Pembayaran Kurang atau Tidak Sah!");
            totalhargabelipmfield.setText(null);
        } else {
            int kembali = (uangs - totals);
            String fix = Integer.toString(kembali);
            kembalianpmfield.setText(fix);
            try {
                DefaultTableModel model = (DefaultTableModel)tabelprodukmasuk.getModel();
                int baris = tabelprodukmasuk.getRowCount();
                for (int a = 0; a< baris; a++){
                    model.removeRow(0);
                }
                namasupplierpmfield.setText(null);
                hargabelipmfield.setText(null);
                jumlahmasukpmfield.setText(null);
            } catch (HeadlessException e){
            }
            auto_kdProdukMasuk();
            JOptionPane.showMessageDialog(null, "Pembayaran Berhasil!");
            }
        }catch(NumberFormatException | HeadlessException e){  
        }
    }//GEN-LAST:event_hitungpmbtnMouseClicked

    private void cetakfakturpmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cetakfakturpmbtnMouseClicked
    // Tampilan Produk Masuk
    }//GEN-LAST:event_cetakfakturpmbtnMouseClicked

    private void resetpmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetpmbtnMouseClicked
    // Tampilan Produk Masuk
    try {        
        String sql1 = "DELETE FROM detail_produkmasuk WHERE id_produkmasuk = '"+idprodukmasukfield.getText()+"'";
        String sql2 = "DELETE FROM produkmasuk WHERE id_produkmasuk = '"+idprodukmasukfield.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
        pst1.execute();
        pst2.execute();
        JOptionPane.showMessageDialog(null,"Data Daftar Barang Masuk Berhasil di Reset");
        DefaultTableModel model = (DefaultTableModel)tabelprodukmasuk.getModel();
        model.setRowCount(0);
        load_tabelkeranjang();
        lebar_tabelkeranjang();
        hargabelipmfield.setText(null);
        jumlahmasukpmfield.setText(null);
        totalhargapmfield.setText(null);
        auto_kdProdukMasuk();
    } catch (HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_resetpmbtnMouseClicked

    private void laporanselectcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanselectcbActionPerformed
    // Tampilan Laporan
    if (laporanselectcb.getSelectedIndex()==0){
        LAPORANTOTAL.setVisible(true);
        LAPORANSELECT1.setVisible(false);
        LAPORANSELECT2.setVisible(false);
    }
    if (laporanselectcb.getSelectedIndex()==1){
        LAPORANTOTAL.setVisible(false);
        LAPORANSELECT1.setVisible(true);
        LAPORANSELECT2.setVisible(false);
        load_tabellpj();
        lebar_tabellpj();
    }
    if (laporanselectcb.getSelectedIndex()==2){
        LAPORANTOTAL.setVisible(false);
        LAPORANSELECT1.setVisible(false);
        LAPORANSELECT2.setVisible(true);
        load_tabellsm();
        lebar_tabellsm();
    }
    }//GEN-LAST:event_laporanselectcbActionPerformed

    private void carilpjbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carilpjbtnMouseClicked
        // Tampilan Laporan Penjualan
        try {
        String sql1 = "SELECT transaksi.idtransaksi, pembeli.idpembeli, pembeli.namapembeli, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_transaksi.harga, detail_transaksi.jumlah, detail_transaksi.totalharga, detail_transaksi.tanggal\n" +
                      "FROM transaksi JOIN detail_transaksi ON transaksi.idtransaksi = detail_transaksi.idtransaksi\n" +
                      "JOIN pembeli ON pembeli.idpembeli = transaksi.idpembeli\n" +
                      "JOIN alatmusik ON alatmusik.idalatmusik = detail_transaksi.idalatmusik WHERE transaksi.idtransaksi LIKE '%"+carilpjfield.getText()+"%' OR pembeli.idpembeli LIKE '%"+carilpjfield.getText()+"%' \n" +
                      "OR pembeli.namapembeli LIKE '%"+carilpjfield.getText()+"%' OR alatmusik.idalatmusik LIKE '%"+carilpjfield.getText()+"%' OR alatmusik.namaalatmusik LIKE '%"+carilpjfield.getText()+"%' OR detail_transaksi.harga LIKE '%"+carilpjfield.getText()+"%' \n" +
                      "OR detail_transaksi.jumlah LIKE '%"+carilpjfield.getText()+"%' OR detail_transaksi.totalharga LIKE '%"+carilpjfield.getText()+"%' OR detail_transaksi.tanggal LIKE '%"+carilpjfield.getText()+"%' ORDER BY transaksi.idtransaksi";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.ResultSet res1 = pst1.executeQuery(sql1);
        DefaultTableModel model = (DefaultTableModel)tabellaporanpj.getModel();
        model.setRowCount(0);
            int no = 1;
            while (res1.next()){
                model.addRow (new Object[] {no++, res1.getString(1),res1.getString(2), res1.getString(3), 
                    res1.getString(4), res1.getString(5),res1.getString(6), ("- " +res1.getString(7)),res1.getString(8), res1.getString(9)});
            }
        tabellaporanpj.setModel(model);
        } catch (SQLException ex) {
    }    
    }//GEN-LAST:event_carilpjbtnMouseClicked

    private void tampilkanlpjbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tampilkanlpjbtnMouseClicked
        // Tampilan Laporan Penjualan
    load_tabellpjtampil();
      
    }//GEN-LAST:event_tampilkanlpjbtnMouseClicked

    private void printlpjbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printlpjbtnMouseClicked
        // Tampilan Laporan Penjualan
    }//GEN-LAST:event_printlpjbtnMouseClicked

    private void exportlpjbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportlpjbtnMouseClicked
        // Tampilan Laporan Penjualan
    }//GEN-LAST:event_exportlpjbtnMouseClicked

    private void tampilkanlpjbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tampilkanlpjbtn1MouseClicked
        // Tampilan Laporan Stok Masuk
        load_tabellsmtampil();
    }//GEN-LAST:event_tampilkanlpjbtn1MouseClicked

    private void carilpjbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carilpjbtn1MouseClicked
        // Tampilan Laporan Stok Masuk
        try {
        String sql1 = "SELECT produkmasuk.id_produkmasuk, supplier.id_supplier, supplier.nama_supplier, alatmusik.idalatmusik, alatmusik.namaalatmusik, detail_produkmasuk.harga_beli, detail_produkmasuk.stok_masuk, detail_produkmasuk.harga_total, produkmasuk.tgl_pembelian\n" +
                      "FROM produkmasuk JOIN detail_produkmasuk ON produkmasuk.id_produkmasuk = detail_produkmasuk.id_produkmasuk\n" +
                      "JOIN supplier ON supplier.id_supplier = produkmasuk.id_supplier\n" +
                      "JOIN alatmusik ON alatmusik.idalatmusik = detail_produkmasuk.idalatmusik WHERE produkmasuk.id_produkmasuk LIKE '%"+carilsmfield.getText()+"%' OR supplier.id_supplier LIKE '%"+carilsmfield.getText()+"%' \n" +
                      "OR supplier.nama_supplier LIKE '%"+carilsmfield.getText()+"%' OR alatmusik.idalatmusik LIKE '%"+carilsmfield.getText()+"%' OR alatmusik.namaalatmusik LIKE '%"+carilpjfield.getText()+"%' OR detail_produkmasuk.harga_beli LIKE '%"+carilsmfield.getText()+"%' \n" +
                      "OR detail_produkmasuk.stok_masuk LIKE '%"+carilsmfield.getText()+"%' OR detail_produkmasuk.harga_total LIKE '%"+carilsmfield.getText()+"%' OR produkmasuk.tgl_pembelian LIKE '%"+carilsmfield.getText()+"%' ORDER BY produkmasuk.id_produkmasuk";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.ResultSet res1 = pst1.executeQuery(sql1);
        DefaultTableModel model = (DefaultTableModel)tabellaporansm.getModel();
        model.setRowCount(0);
            int no = 1;
            while (res1.next()){
                model.addRow (new Object[] {no++, res1.getString(1),res1.getString(2), res1.getString(3), 
                    res1.getString(4), res1.getString(5),res1.getString(6), ("+ " +res1.getString(7)),res1.getString(8), res1.getString(9)});
            }
        tabellaporansm.setModel(model);
        } catch (SQLException ex) {
    }
    }//GEN-LAST:event_carilpjbtn1MouseClicked

    private void exportlpjbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportlpjbtn1MouseClicked
        // Tampilan Laporan Stok Masuk
    }//GEN-LAST:event_exportlpjbtn1MouseClicked

    private void printlpjbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printlpjbtn1MouseClicked
        // Tampilan Laporan Stok Masuk
    }//GEN-LAST:event_printlpjbtn1MouseClicked

    private void hakaksescbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hakaksescbActionPerformed
    // Tampilan Setting
        if (hakaksescb.getSelectedIndex()==0){
            idkaryawanstfield.setText(null);
        }
        if (hakaksescb.getSelectedIndex()==1){
            idkaryawanstfield.disable();
            try{
                String sql = "SELECT MAX(RIGHT(idkaryawan,4)) FROM user";
                java.sql.Connection con = (Connection) Config.configDB();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rst = st.executeQuery(sql);
            if(rst.next()) {
                String auto_kdPM, tambah;
                int kdb;
                auto_kdPM = Integer.toString(rst.getInt(1)+1);
                kdb = auto_kdPM.length();
                tambah = "";
                for (int i = 1; i <= 4 - kdb; i++ ){
                    tambah = tambah + "0";
                }
                idkaryawanstfield.setText("PM"+tambah+auto_kdPM);
                }
            }
            catch (Exception e) {
                idkaryawanstfield.setText("PM0001");
            }
            }
        if (hakaksescb.getSelectedIndex()==2){
            idkaryawanstfield.disable();
            try{
                String sql = "SELECT MAX(RIGHT(idkaryawan,4)) FROM user";
                java.sql.Connection con = (Connection) Config.configDB();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rst = st.executeQuery(sql);
            if(rst.next()) {
                String auto_kdPM, tambah;
                int kdb;
                auto_kdPM = Integer.toString(rst.getInt(1)+1);
                kdb = auto_kdPM.length();
                tambah = "";
                for (int i = 1; i <= 4 - kdb; i++ ){
                    tambah = tambah + "0";
                }
                idkaryawanstfield.setText("AD"+tambah+auto_kdPM);
                }
            }
            catch (Exception e) {
                idkaryawanstfield.setText("AD0001");
            }
        }
        if (hakaksescb.getSelectedIndex()==3){
            idkaryawanstfield.disable();
            try{
                String sql = "SELECT MAX(RIGHT(idkaryawan,4)) FROM user";
                java.sql.Connection con = (Connection) Config.configDB();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rst = st.executeQuery(sql);
            if(rst.next()) {
                String auto_kdPM, tambah;
                int kdb;
                auto_kdPM = Integer.toString(rst.getInt(1)+1);
                kdb = auto_kdPM.length();
                tambah = "";
                for (int i = 1; i <= 4 - kdb; i++ ){
                    tambah = tambah + "0";
                }
                idkaryawanstfield.setText("KR"+tambah+auto_kdPM);
                }
            }
            catch (Exception e) {
                idkaryawanstfield.setText("KR0001");
            }
        }
    }//GEN-LAST:event_hakaksescbActionPerformed

    private void tglstPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglstPropertyChange
    // Tampilan Setting
    if (tglst.getDate()!=null){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        tgl = formatter.format(tglst.getDate());
    }
    }//GEN-LAST:event_tglstPropertyChange

    private void whatsappdbbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsappdbbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_whatsappdbbtnMouseClicked

    private void emaildbbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emaildbbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emaildbbtnMouseClicked

    private void browsedbbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsedbbtnMouseClicked
        // Tampilan Database
        JFileChooser path = new JFileChooser();
        path.showOpenDialog(this);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        try{
                File f = path.getSelectedFile();
                location = f.getAbsolutePath();
                filename = location + "_" + date +".sql";
                backuppathfield.setText(filename);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_browsedbbtnMouseClicked

    private void exportdbbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportdbbtnMouseClicked
        // Tampilan Database
        DatabaseBackup();
    }//GEN-LAST:event_exportdbbtnMouseClicked

    private void settingcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingcbActionPerformed
        if (settingcb.getSelectedIndex()==0){
            SETTING.setVisible(true);
            DATABASE.setVisible(false);
        }
        if (settingcb.getSelectedIndex()==1){
            SETTING.setVisible(false);
            DATABASE.setVisible(true);
        }
    }//GEN-LAST:event_settingcbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BARANG;
    private javax.swing.JPanel DASHBOARD;
    private javax.swing.JPanel DATABASE;
    private javax.swing.JPanel LAPORANSELECT1;
    private javax.swing.JPanel LAPORANSELECT2;
    private javax.swing.JPanel LAPORANTOTAL;
    private javax.swing.JPanel PRODUKMASUK;
    private javax.swing.JPanel SETTING;
    private javax.swing.JPanel SUPPLIER;
    private javax.swing.JPanel TRANSAKSI;
    private javax.swing.JLabel VivaceIcon;
    private javax.swing.JTextField alamatsupplierfield;
    private javax.swing.JLabel angkabrterjual;
    private javax.swing.JLabel angkadibeli;
    private javax.swing.JLabel angkajumlah;
    private javax.swing.JLabel angkapembelian1thn;
    private javax.swing.JLabel angkapenjualan1hr;
    private javax.swing.JLabel angkapenjualan1thn;
    private javax.swing.JLabel angkastok;
    private javax.swing.JLabel angkatotalpembelian;
    private javax.swing.JTextField backuppathfield;
    public javax.swing.JPanel barangbtn;
    public javax.swing.JLabel barangmenu;
    private javax.swing.JLabel barangpic;
    private javax.swing.JTextField bayartrfield;
    private javax.swing.JLabel bgBarang;
    private javax.swing.JLabel bgDashboard;
    private javax.swing.JLabel bgDatabase;
    private javax.swing.JLabel bgLaporanselect;
    private javax.swing.JLabel bgLaporanselect2;
    private javax.swing.JLabel bgLaporantotal;
    private javax.swing.JLabel bgProdukmasuk;
    private javax.swing.JLabel bgSetting;
    private javax.swing.JLabel bgSupplier;
    private javax.swing.JLabel bgTransaksi;
    private javax.swing.JPanel browsedbbtn;
    private javax.swing.JPanel caribrbtn;
    private javax.swing.JTextField carifield;
    private javax.swing.JPanel carilpjbtn;
    private javax.swing.JPanel carilpjbtn1;
    private javax.swing.JTextField carilpjfield;
    private javax.swing.JTextField carilsmfield;
    private javax.swing.JTextField carisettingfield;
    private javax.swing.JPanel carispbtn;
    private javax.swing.JPanel caristbtn;
    private javax.swing.JTextField carisupplierfield;
    private javax.swing.JPanel cetakfakturpmbtn;
    private javax.swing.JPanel cetakfakturtrbtn;
    private javax.swing.JComboBox<String> daftarpmcb;
    public javax.swing.JPanel dashboardbtn;
    public javax.swing.JLabel dashboardmenu;
    private javax.swing.JLabel dashboardpic;
    private javax.swing.JPanel emaildbbtn;
    private javax.swing.JPanel exportbrbtn;
    private javax.swing.JPanel exportdbbtn;
    private javax.swing.JPanel exportlpjbtn;
    private javax.swing.JPanel exportlpjbtn1;
    private javax.swing.JPanel exportspbtn;
    private javax.swing.JPanel exportstbtn;
    private javax.swing.JLabel eyehide;
    private javax.swing.JLabel eyeshow;
    private javax.swing.JComboBox<String> hakaksescb;
    private javax.swing.JPanel hapusbrbtn;
    private javax.swing.JPanel hapusdatabarangbtn;
    private javax.swing.JPanel hapusdatalaporanpjbtn;
    private javax.swing.JPanel hapusdatalaporansmbtn;
    private javax.swing.JPanel hapusdatasupplierbtn;
    private javax.swing.JPanel hapusspbtn;
    private javax.swing.JPanel hapusstbtn;
    private javax.swing.JTextField hargabelifield;
    private javax.swing.JTextField hargabelipmfield;
    private javax.swing.JTextField hargajualfield;
    private javax.swing.JTextField hargatrfield;
    private javax.swing.JPanel hitungpmbtn;
    private javax.swing.JPanel hitungtrbtn;
    public javax.swing.JTextField idbarangfield;
    private javax.swing.JTextField idbarangtrfield;
    private javax.swing.JTextField idbarangtrfield1;
    public static final javax.swing.JTextField idkaryawanfield = new javax.swing.JTextField();
    private javax.swing.JTextField idkaryawanstfield;
    private javax.swing.JTextField idpembelitrfield;
    private javax.swing.JTextField idprodukmasukfield;
    private javax.swing.JTextField idprodukmasuktext;
    private javax.swing.JTextField idsupplierfield;
    private javax.swing.JTextField idtransaksitext;
    private javax.swing.JTextField idtransaksitrfield;
    private javax.swing.JScrollPane jPane;
    private javax.swing.JScrollPane jPane1;
    private javax.swing.JScrollPane jPane2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jumlahmasukpmfield;
    private javax.swing.JTextField jumlahtrfield;
    public javax.swing.JPanel keluarbtn;
    public javax.swing.JLabel keluarmenu;
    private javax.swing.JTextField kembalianpmfield;
    private javax.swing.JTextField kembaliantrfield;
    private javax.swing.JTextField keterangansupplierfield;
    public javax.swing.JPanel laporanbtn;
    public javax.swing.JLabel laporanmenu;
    private javax.swing.JLabel laporanpic;
    private javax.swing.JLabel laporanpic1;
    private javax.swing.JLabel laporanpic2;
    private com.toedter.calendar.JDateChooser laporanpjtgl1field;
    private com.toedter.calendar.JDateChooser laporanpjtgl2field;
    private javax.swing.JComboBox<String> laporanselectcb;
    private com.toedter.calendar.JDateChooser laporansmtgl1field;
    private com.toedter.calendar.JDateChooser laporansmtgl2field;
    private javax.swing.JTextField namabarangfield;
    private javax.swing.JTextField namabarangtrfield;
    private javax.swing.JTextField namabarangtrfield1;
    private javax.swing.JTextField namakaryawanstfield;
    private javax.swing.JTextField namapembelitrfield;
    private javax.swing.JTextField namasupplierfield;
    private javax.swing.JTextField namasupplierpmfield;
    private javax.swing.JTextField notelpstfield;
    private javax.swing.JTextField notelpsupplierfield;
    private javax.swing.JPasswordField passwordstfield;
    public javax.swing.JPanel pengaturanbtn;
    public javax.swing.JLabel pengaturanmenu;
    private javax.swing.JPanel printlpjbtn;
    private javax.swing.JPanel printlpjbtn1;
    public javax.swing.JPanel produkmasukbtn;
    public javax.swing.JLabel produkmasukmenu;
    private javax.swing.JLabel produkmasukpic;
    private javax.swing.JPanel resetbelanjaanbtn;
    private javax.swing.JPanel resetpmbtn;
    private javax.swing.JComboBox<String> settingcb;
    private javax.swing.JLabel settingpic;
    private javax.swing.JLabel settingpic1;
    private javax.swing.JTextField stokfield;
    public javax.swing.JPanel supplierbtn;
    public javax.swing.JLabel suppliermenu;
    private javax.swing.JLabel supplierpic;
    private javax.swing.JTable tabelbarang;
    private javax.swing.JTable tabelbarangpm;
    private javax.swing.JTable tabelbarangtr;
    private javax.swing.JTable tabelkeranjang;
    private javax.swing.JTable tabellaporanpj;
    private javax.swing.JTable tabellaporansm;
    private javax.swing.JTable tabelprodukmasuk;
    private javax.swing.JTable tabelsetting;
    private javax.swing.JTable tabelsupplier;
    private javax.swing.JPanel tambahkanbrbtn;
    private javax.swing.JPanel tambahkanpmbtn;
    private javax.swing.JPanel tambahkanspbtn;
    private javax.swing.JPanel tambahkanstbtn;
    private javax.swing.JPanel tambahkantrbtn;
    private javax.swing.JPanel tambahpembelibtn;
    private javax.swing.JPanel tambahsupplierbtn;
    private javax.swing.JPanel tampilkanlpjbtn;
    private javax.swing.JPanel tampilkanlpjbtn1;
    private javax.swing.JLabel textbrterjual;
    private javax.swing.JLabel textdibeli;
    private javax.swing.JLabel textgrafik;
    private javax.swing.JLabel textgrafikthn;
    private javax.swing.JLabel textjumlah;
    private javax.swing.JLabel textpembelian1thn;
    private javax.swing.JLabel textpenjualan1hr;
    private javax.swing.JLabel textpenjualan1thn;
    private javax.swing.JLabel textstok;
    private javax.swing.JLabel texttotalpembelian;
    private com.toedter.calendar.JDateChooser tglst;
    private javax.swing.JTextField totalbelanjafield;
    private javax.swing.JTextField totalhargabelipmfield;
    private javax.swing.JTextField totalhargapm;
    private javax.swing.JTextField totalhargapmfield;
    private javax.swing.JTextField totalhargatrfield;
    public javax.swing.JPanel transaksibtn;
    public javax.swing.JLabel transaksimenu;
    private javax.swing.JLabel transaksipic;
    private javax.swing.JPanel updatebrbtn;
    private javax.swing.JPanel updatespbtn;
    private javax.swing.JPanel updatestbtn;
    public static final javax.swing.JLabel userinfo = new javax.swing.JLabel();
    private javax.swing.JPanel whatsappdbbtn;
    // End of variables declaration//GEN-END:variables
}
