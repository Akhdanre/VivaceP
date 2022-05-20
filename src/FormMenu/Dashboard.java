/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author WINDOWS 10
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    private void gej(){
        try{
            //tanggal
            Date date = new Date();
            DateFormat formattanggal = new SimpleDateFormat("YYYY-MM-dd");
            Calendar cal =Calendar.getInstance();
            cal.add(Calendar.DATE, -7);
            String sekarang = formattanggal.format(date);
            String tujuhHariLalu = formattanggal.format(cal.getTime());
            //query
            String query = "SELECT tanggal, COUNT(tanggal) AS total FROM transaksi WHERE tanggal BETWEEN '"+tujuhHariLalu+"' AND '"+sekarang+"' GROUP BY tanggal";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(koneksi.configDB(), query);
            JFreeChart grafik = ChartFactory.createLineChart("", "Tanggal", "Jumlah", dataset, PlotOrientation.VERTICAL, false, true, true);
            //set warna background
            Color au = new Color(244, 239, 239);
            grafik.getPlot().setBackgroundPaint(au);
            grafik.setBackgroundPaint(au);
            //ganti warna garis
            CategoryPlot plot = (CategoryPlot) grafik.getPlot();
            plot.getRenderer().setSeriesPaint(0, Color.DARK_GRAY);
            //set grafik di panel 
            ChartPanel panel = new ChartPanel(grafik);
            jPanel1.add(panel);
            panel.setPreferredSize(new Dimension(1445, 174));
            panel.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }}
   
     private void TampilkanJumlah() {
        try {
 
        String sql = "SELECT SUM(totalharga) AS total FROM detail_transaksi WHERE tanggal = CURDATE()";    
        java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);                             
        while(rs.next()){
        String data = rs.getString("total");
             if(data == null){
                angkapenjualan1hr.setText("Rp. 0");   
            }else{
                angkapenjualan1hr.setText("Rp. "+data );   
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     private void TampilkanOrang() {
        try {
 
            String sql = "SELECT COUNT(idpembeli) AS total FROM transaksi WHERE tanggal = CURDATE()";      
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs= pst.executeQuery(sql);
            
        while(rs.next()){
            String data = rs.getString("total");
             if(data == null){
                txtjumlahpmbl.setText("0 Orang");   
            }else{
                txtjumlahpmbl.setText(data+" Orang" );   
            }                                        
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        }
      private void TampilkanStok() {
        try {
 
            String sql = "SELECT SUM(stok) AS total FROM alatmusik";      
            java.sql.Connection conn = (Connection) koneksi.configDB();
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
        java.sql.Connection conn = (Connection) koneksi.configDB();
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
     
    public Dashboard() {
        initComponents();
        gej();
        TampilkanJumlah();
        TampilkanOrang();
        TampilkanStok();
        TampilkanStokMasuk();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textpenjualan1hr = new javax.swing.JLabel();
        txtjumlahpmbl = new javax.swing.JLabel();
        texttotalpembelian = new javax.swing.JLabel();
        angkapenjualan1hr = new javax.swing.JLabel();
        angkastok = new javax.swing.JLabel();
        textstok = new javax.swing.JLabel();
        angkajumlah = new javax.swing.JLabel();
        textjumlah = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 751, 1445, 174));

        textpenjualan1hr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textpenjualan1hr.setForeground(new java.awt.Color(130, 130, 130));
        textpenjualan1hr.setText("Penjualan Selama Satu Hari");
        add(textpenjualan1hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 260, -1));

        txtjumlahpmbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtjumlahpmbl.setText("0 ORANG");
        add(txtjumlahpmbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 410, 50));

        texttotalpembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        texttotalpembelian.setForeground(new java.awt.Color(130, 130, 130));
        texttotalpembelian.setText("Total Pembeli Hari Ini");
        add(texttotalpembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 260, -1));

        angkapenjualan1hr.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkapenjualan1hr.setText("Rp.0,0");
        add(angkapenjualan1hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 410, 80));
        angkapenjualan1hr.getAccessibleContext().setAccessibleName("Rp.0,0");

        angkastok.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkastok.setText("0");
        add(angkastok, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 410, 50));

        textstok.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textstok.setForeground(new java.awt.Color(130, 130, 130));
        textstok.setText("Stok Barang Total");
        add(textstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 260, -1));

        angkajumlah.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        angkajumlah.setText("0");
        add(angkajumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 410, 50));

        textjumlah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textjumlah.setForeground(new java.awt.Color(130, 130, 130));
        textjumlah.setText("Jumlah Barang Masuk Hari Ini");
        add(textjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 260, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TampilanDashboard.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angkajumlah;
    private javax.swing.JLabel angkapenjualan1hr;
    private javax.swing.JLabel angkastok;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textjumlah;
    private javax.swing.JLabel textpenjualan1hr;
    private javax.swing.JLabel textstok;
    private javax.swing.JLabel texttotalpembelian;
    private javax.swing.JLabel txtjumlahpmbl;
    // End of variables declaration//GEN-END:variables
}
