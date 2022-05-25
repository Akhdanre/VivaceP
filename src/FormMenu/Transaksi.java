/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormMenu;

import static com.barcodelib.barcode.a.f.e.E;
import com.sun.glass.events.KeyEvent;
import static com.sun.javafx.scene.CameraHelper.project;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author WINDOWS 10
 */
public class Transaksi extends javax.swing.JPanel {

    /**
     * Creates new form Transaksi
     */

    DefaultTableModel model = new DefaultTableModel();
    private void load_tabelbarangtr() {
        
        model.addColumn("No");
        model.addColumn("ID Alat Musik");
        model.addColumn("Nama Alat Musik");
        model.addColumn("Harga");
        model.addColumn("Stok");
        
        try { 
            int no = 1;
            String sql = "SELECT idalatmusik, namaalatmusik, harga_jual, stok FROM alatmusik ORDER BY idalatmusik";
            java.sql.Connection conn = (Connection) koneksi.configDB();
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
    

    
    private void lebar_tabelkeranjang(){
        TableColumn kolom;
        tabelkeranjang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN); 
       
        kolom = tabelkeranjang.getColumnModel().getColumn(0); 
        kolom.setPreferredWidth(50);
        kolom = tabelkeranjang.getColumnModel().getColumn(1); 
        kolom.setPreferredWidth(50);
        kolom = tabelkeranjang.getColumnModel().getColumn(2); 
        kolom.setPreferredWidth(150);
        kolom = tabelkeranjang.getColumnModel().getColumn(3); 
        kolom.setPreferredWidth(100);
        kolom = tabelkeranjang.getColumnModel().getColumn(4); 
        kolom.setPreferredWidth(20);
        kolom = tabelkeranjang.getColumnModel().getColumn(5); 
        kolom.setPreferredWidth(100);
        kolom = tabelkeranjang.getColumnModel().getColumn(6); 
        kolom.setPreferredWidth(150);
    }
    
    DefaultTableModel model2 = new DefaultTableModel();
    private void tablekeranjang(){

           model2.addColumn("ID Transaksi");
           model2.addColumn("ID Alat Musik ");
           model2.addColumn("Nama Alat Musik");
           model2.addColumn("Harga");
           model2.addColumn("Jumlah");
           model2.addColumn("Harga Total");
           model2.addColumn("Tanggal");
          


           tabelkeranjang.setModel(model2);
       }
    private void auto_kodePembeli(){
        txtPembeli.disable();
        try{
            String sql = "SELECT MAX(right(idpembeli,8)) from pembeli";
            Connection conn = (Connection) koneksi.configDB();
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery(sql);
            if(rst.next()){
                String auto_kode,tambah;int kdb;
                auto_kode = Integer.toString(rst.getInt(1)+1);
                kdb = auto_kode.length();
                tambah = "";
                for (int i = 1; i <= 8 - kdb; i++ ){
                    tambah = tambah + "0";
                }
             txtPembeli.setText("PB"+tambah +auto_kode);
            }
            
        }catch(Exception e){
            txtPembeli.setText("PB00000001");
        }
    }
    
    public Transaksi() {
        initComponents();
        load_tabelbarangtr();
        tablekeranjang();
        auto_kodePembeli();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbarangtr = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelkeranjang = new javax.swing.JTable();
        txtharga = new javax.swing.JTextField();
        txtPencarian = new javax.swing.JTextField();
        txtPembeli = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        txtUangDibayar = new javax.swing.JTextField();
        btnTambahpbl = new javax.swing.JPanel();
        Simpan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        percobaan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelbarangtr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelbarangtr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangtrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbarangtr);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 800, 290));

        tabelkeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Alat Musik", "Nama Alat Musik", "Title 4"
            }
        ));
        tabelkeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkeranjangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelkeranjang);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 970, 400));

        txtharga.setBorder(null);
        txtharga.setOpaque(false);
        add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 350, 240, 30));

        txtPencarian.setBorder(null);
        txtPencarian.setOpaque(false);
        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });
        add(txtPencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 137, 230, 30));

        txtPembeli.setBorder(null);
        txtPembeli.setOpaque(false);
        add(txtPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 410, 30));

        txtKembalian.setBorder(null);
        txtKembalian.setOpaque(false);
        add(txtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 799, 470, 40));

        txtJumlah.setBorder(null);
        txtJumlah.setOpaque(false);
        add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 240, 30));

        txtTotalHarga.setBorder(null);
        txtTotalHarga.setOpaque(false);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });
        add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 470, 40));

        txtUangDibayar.setBorder(null);
        txtUangDibayar.setOpaque(false);
        txtUangDibayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUangDibayarKeyPressed(evt);
            }
        });
        add(txtUangDibayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 684, 470, 40));

        btnTambahpbl.setOpaque(false);
        btnTambahpbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahpblMouseClicked(evt);
            }
        });
        add(btnTambahpbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1365, 238, 138, 37));

        Simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SimpanMouseClicked(evt);
            }
        });
        add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 240, 68));

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 875, 238, 68));
        add(percobaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 180, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tambahkan1.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 300, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Frame 1578.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void btnTambahpblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahpblMouseClicked
        try {        
            String nama = "";
            String sql1 = "INSERT INTO pembeli VALUES('"+txtPembeli.getText()+"','"+nama+"')";
            
            Connection conn = (Connection) koneksi.configDB();
            PreparedStatement pst1 = conn.prepareStatement(sql1);
           
            pst1.execute();
           
            JOptionPane.showMessageDialog(null,"Data Pembeli dan Transaksi Berhasil Ditambahkan");
          
        
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahpblMouseClicked

    private void tabelbarangtrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangtrMouseClicked
        int x = tabelbarangtr.getSelectedRow();
        String id = model.getValueAt(x, 1).toString();
        String nama = model.getValueAt(x,2).toString();
        String harga = model.getValueAt(x, 3).toString();
        
        idbr = id;
        namabr = nama;
        hargabr = harga;
        
    }//GEN-LAST:event_tabelbarangtrMouseClicked

    public String idbr;
    public String namabr;
    public String hargabr;
    
    private void tabelkeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkeranjangMouseClicked
        int mct = tabelkeranjang.getSelectedRow();
      
        mctp = mct;
        
    }//GEN-LAST:event_tabelkeranjangMouseClicked
    public int mctp;
    private void txtUangDibayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUangDibayarKeyPressed
        int bayar = Integer.parseInt(txtUangDibayar.getText());
        int totalharga = Integer.parseInt(txtTotalHarga.getText());
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int kembalian = totalharga - bayar;
            if(bayar>=totalharga){
                txtKembalian.setText(String.valueOf(kembalian));
            }else{
                JOptionPane.showMessageDialog(null,"Uang yang di bayarkan kurang sebesar RP."+kembalian);
            }
            
        }
    }//GEN-LAST:event_txtUangDibayarKeyPressed

    private void SimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimpanMouseClicked
          try{
              
              JasperDesign jessp = JRXmlLoader.load("E:\\project java\\PercobaanProjek\\src\\FormMenu\\report1.jrxml");
              
              String sql = "SELECT\n" +
"     transaksi.`idtransaksi` AS transaksi_idtransaksi,\n" +
"     transaksi.`idpembeli` AS transaksi_idpembeli,\n" +
"     transaksi.`tanggal` AS transaksi_tanggal,\n" +
"     detail_transaksi.`idtransaksi` AS detail_transaksi_idtransaksi,\n" +
"     detail_transaksi.`idalatmusik` AS detail_transaksi_idalatmusik,\n" +
"     detail_transaksi.`harga` AS detail_transaksi_harga,\n" +
"     detail_transaksi.`jumlah` AS detail_transaksi_jumlah,\n" +
"     detail_transaksi.`totalharga` AS detail_transaksi_totalharga,\n" +
"     detail_transaksi.`tanggal` AS detail_transaksi_tanggal,\n" +
"     alatmusik.`idalatmusik` AS alatmusik_idalatmusik,\n" +
"     alatmusik.`namaalatmusik` AS alatmusik_namaalatmusik,\n" +
"     alatmusik.`harga_jual` AS alatmusik_harga_jual,\n" +
"     alatmusik.`harga_beli` AS alatmusik_harga_beli,\n" +
"     alatmusik.`stok` AS alatmusik_stok\n" +
"     \n" +
"	 FROM `transaksi` transaksi INNER JOIN `detail_transaksi` detail_transaksi\n" +
"     ON transaksi.`idtransaksi` = detail_transaksi.`idtransaksi`\n" +
"     INNER JOIN `alatmusik` alatmusik \n" +
"     ON detail_transaksi.`idalatmusik` = alatmusik.`idalatmusik`\n" +
"     WHERE transaksi.idtransaksi = '"+percobaan.getText()+"'";
              
               Connection con = (Connection) koneksi.configDB();
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jessp.setQuery(newQuery);
                JasperReport js = JasperCompileManager.compileReport(jessp);
                JasperPrint jp = JasperFillManager.fillReport(js, null, con);
              
                JasperViewer.viewReport(jp);
              
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
    }//GEN-LAST:event_SimpanMouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tambahkan1.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tambahkan2.png")));
   
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String jumlah = txtJumlah.getText();
        int jumlah1 = Integer.parseInt(jumlah);
        int harga1 = Integer.parseInt(hargabr);
        int total = jumlah1 * harga1;
        
        txtharga.setText(String.valueOf(total));
        
        Date date = new Date();
        DateFormat formattanggal = new SimpleDateFormat("YYYY-MM-dd");
        String sekarang = formattanggal.format(date);
        String code = null;
        try{
            String sql = "SELECT MAX(right(idtransaksi,8)) from transaksi";
            Connection conn = (Connection) koneksi.configDB();
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery(sql);
            if(rst.next()){
                String auto_kode,tambah;int kdb;
                auto_kode = Integer.toString(rst.getInt(1)+1);
                kdb = auto_kode.length();
                tambah = "";
                for (int i = 1; i <= 8 - kdb; i++ ){
                    tambah = tambah + "0";
                }
              code = "IT"+tambah+auto_kode;
            }
            
        }catch(Exception e){
            code ="IT00000001";
        }
        model2.addRow (new Object[] {code, idbr, namabr, hargabr, jumlah, total, sekarang});
        
        tambahtotalkeranjang();
        txtJumlah.setText(null);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
                Date date = new Date();
        DateFormat formattanggal = new SimpleDateFormat("YYYY-MM-dd");
        String sekarang = formattanggal.format(date);
        try{
            String sql0 = "INSERT INTO transaksi VALUE('"+model2.getValueAt(0, 0)+"','"+txtPembeli.getText()+"','"+sekarang+"')";
            Connection con = (Connection) koneksi.configDB();
            PreparedStatement pst0 = con.prepareStatement(sql0);
            pst0.execute();
            
            for(int i = 0; i < model2.getRowCount(); i++){
                String sql = "INSERT INTO detail_transaksi VALUE('"+model2.getValueAt(i, 0)+"',"
                        + " '"+model2.getValueAt(i, 1)+"', '"+model2.getValueAt(i, 3)+"', "
                        + "'"+model2.getValueAt(i, 4)+"', '"+model2.getValueAt(i, 5)+"', '"+model2.getValueAt(i, 6)+"')";
                
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    public void tambahtotalkeranjang(){
        int hasil = 0 ;
        for(int i = 0; i < model2.getRowCount();i++){
            String hht = model2.getValueAt(i, 5).toString();
            if("".equals(hht)){
                hht = "0";
            }
            int ht1 = Integer.parseInt(hht);
             hasil +=  ht1;
        }
        txtTotalHarga.setText(String.valueOf(hasil));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Simpan;
    private javax.swing.JLabel background;
    private javax.swing.JPanel btnTambahpbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField percobaan;
    private javax.swing.JTable tabelbarangtr;
    public javax.swing.JTable tabelkeranjang;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtPembeli;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtUangDibayar;
    private javax.swing.JTextField txtharga;
    // End of variables declaration//GEN-END:variables
}
