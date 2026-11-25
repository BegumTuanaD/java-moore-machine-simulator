
package mooremakinesi;

public class MooreEkrani extends javax.swing.JFrame {
    
    private int durumsayisi;
    private String[] girdisembolleri;
    private String[] ciktisembolleri;
    private String[] durumlar;
    private javax.swing.table.DefaultTableModel gecismodeli;
    private javax.swing.table.DefaultTableModel ciktimodeli;
    private boolean tablolarhazir = false;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MooreEkrani.class.getName());

   
    public MooreEkrani() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdurumsayisi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtgirdialfabesi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtciktialfabesi = new javax.swing.JTextField();
        btntabloolustur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgecis = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcikti = new javax.swing.JTable();
        lblgirdikelimesi = new javax.swing.JLabel();
        txtgirdikelimesi = new javax.swing.JTextField();
        btnsimulasyonubaslat = new javax.swing.JButton();
        lbldurumgecisleri = new javax.swing.JLabel();
        txtdurumgecisleri = new javax.swing.JTextField();
        lbluretilencikti = new javax.swing.JLabel();
        txturetilencikti = new javax.swing.JTextField();
        btntemizle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moore Makinesi Simülatörü");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("MOORE MAKİNESİ SİMÜLATÖRÜ");

        jLabel2.setText("Durum Sayısı:");

        jLabel3.setText("Girdi Alfabesi:");

        jLabel4.setText("Çıktı Alfabesi:");

        btntabloolustur.setText("Tabloları Oluştur");
        btntabloolustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntabloolusturActionPerformed(evt);
            }
        });

        tblgecis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Durum", "Girdi 1", "Girdi 2", "Girdi 3"
            }
        ));
        jScrollPane1.setViewportView(tblgecis);

        jLabel5.setText("Geçiş Tablosu");

        jLabel6.setText("Çıktı Tablosu");

        tblcikti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Durum", "Çıktı", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblcikti);

        lblgirdikelimesi.setText("Girdi Kelimesi:");

        btnsimulasyonubaslat.setText("Simülasyonu Başlat");
        btnsimulasyonubaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimulasyonubaslatActionPerformed(evt);
            }
        });

        lbldurumgecisleri.setText("Durum Geçişleri:");

        lbluretilencikti.setText("Üretilecek Çıktı:");

        btntemizle.setText("Temizle");
        btntemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtciktialfabesi))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtgirdialfabesi))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtdurumsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btntabloolustur)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntemizle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblgirdikelimesi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldurumgecisleri, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lbluretilencikti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtgirdikelimesi, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnsimulasyonubaslat))
                            .addComponent(txtdurumgecisleri)
                            .addComponent(txturetilencikti))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdurumsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgirdialfabesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtciktialfabesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntabloolustur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgirdikelimesi)
                    .addComponent(txtgirdikelimesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimulasyonubaslat))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldurumgecisleri)
                    .addComponent(txtdurumgecisleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluretilencikti)
                    .addComponent(txturetilencikti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btntemizle)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntabloolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntabloolusturActionPerformed
        try{
            durumsayisi = Integer.parseInt(txtdurumsayisi.getText().trim());
            String girdialfabesi = txtgirdialfabesi.getText().trim();
            String ciktialfabesi = txtciktialfabesi.getText().trim();
            if(durumsayisi<=0 || girdialfabesi.isEmpty() || ciktialfabesi.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Lutfen tum alanlari dogru doldurunuz!");
                return;
            }
            girdisembolleri = girdialfabesi.split(",");
            ciktisembolleri = ciktialfabesi.split(",");
            for(int i=0; i<girdisembolleri.length;i++){
                girdisembolleri[i] = girdisembolleri[i].trim();
            }
            for(int i=0;i<ciktisembolleri.length;i++){
                ciktisembolleri[i] = ciktisembolleri[i].trim();
            }
            for(String sembol:girdisembolleri){
                if(sembol.isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(this,"Girdi alfabesini virgulle dogru ayiriniz!");
                    return;
                }
            }
            durumlar = new String[durumsayisi];
            for(int i=0;i<durumsayisi;i++){
                durumlar[i]="q" + i;
            }
            String[] gecissutunlari = new String[girdisembolleri.length + 1];
            gecissutunlari[0] = "Durum";
            for(int i=0;i<girdisembolleri.length;i++){
                gecissutunlari[i+1] = girdisembolleri[i];
            }
            Object[][] gecisverileri = new Object[durumsayisi][gecissutunlari.length];
            for(int i=0;i<durumsayisi;i++){
                gecisverileri[i][0] = durumlar[i]; //her satırın ilk sütununa durum adı 
            }
            gecismodeli = new javax.swing.table.DefaultTableModel(gecisverileri, gecissutunlari){
                @Override
                public boolean isCellEditable(int satir,int sutun){
                    return sutun!=0; //kullanıcı durum isimlerini değiştiremez 
                }
            };
            tblgecis.setModel(gecismodeli);
            String[] ciktisutunlari = {"Durum","Cikti"};
            Object[][] ciktiverileri = new Object[durumsayisi][2];
            for(int i=0;i<durumsayisi;i++){
                ciktiverileri[i][0] = durumlar[i];
                ciktiverileri[i][1] = ciktisembolleri[0];
                //ilk sütuna durum isimleri ikinic sütuna çıktı alfabesinin ilk elemanı yerşesltirilr.
            }
            ciktimodeli = new javax.swing.table.DefaultTableModel(ciktiverileri, ciktisutunlari){
                @Override
                public boolean isCellEditable(int satir,int sutun){
                    return sutun == 1;
                }
            };
            tblcikti.setModel(ciktimodeli);
            tablolarhazir = true;
            javax.swing.JOptionPane.showMessageDialog(this, "Tablolar basariyla olusturuldu!");

        } catch (NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Durum sayisi sayisal bir deger olmalidir!");
        }
    }
    private boolean tablolarikontrolet(){
            if(!tablolarhazir){
                javax.swing.JOptionPane.showMessageDialog(this, "Once tablolari olusturunuz.");
                return false;
            }
            for(int i=0;i<durumsayisi;i++){
                for(int j=1;j<gecismodeli.getColumnCount();j++){
                    Object deger = gecismodeli.getValueAt(i, j);
                    if(deger==null || deger.toString().trim().isEmpty()){
                        javax.swing.JOptionPane.showMessageDialog(this, "Gecis tablosunda bos hucre var.");
                        return false;
                    }
                    boolean bulundu = false; //geçerli değer mi
                    for(int k=0;k<durumlar.length;k++){
                        if(deger.toString().trim().equals(durumlar[k])){
                            bulundu = true;
                            break;
                        }
                    }
                    if(!bulundu){
                        javax.swing.JOptionPane.showMessageDialog(this, "Gecis tablosunda gecersiz durum var.");
                        return false;
                    }
                }
            }
            for(int i=0;i<durumsayisi;i++){
                Object deger = ciktimodeli.getValueAt(i, 1);
                if(deger==null || deger.toString().trim().isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(this, "Cikti tablosunda bos hucre var.");
                    return false;
                }
                boolean bulundu = false;
                for(int j=0;j<ciktisembolleri.length;j++){
                    if(deger.toString().trim().equals(ciktisembolleri[j])){
                        bulundu = true;
                    }
                }
                if(!bulundu){
                    javax.swing.JOptionPane.showMessageDialog(this, "Cikti tablosunda alfabede olmayan sembol var.");
                    return false;         
                }
            }
            return true;
        }
    
    private void simulasyonucalistir(){
            if(!tablolarikontrolet()) return;
            String girdi = txtgirdikelimesi.getText().trim();
            if(girdi.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Lutfen bir girdi kelimesi giriniz.");
                return;
            }
            int mevcutdurum=0; //q0
            StringBuilder durumyolu = new StringBuilder("q0"); //durum geçişlerini saklamk
            StringBuilder uretilencikti = new StringBuilder(); //çıktı saklamak
            uretilencikti.append(ciktimodeli.getValueAt(mevcutdurum, 1).toString().trim());
            for(int i=0;i<girdi.length();i++){
                String sembol = String.valueOf(girdi.charAt(i));
                int sutun = -1; //okunan sembolün alfabede olup olmadığını bulma  e
                for(int j=0;j<girdi.length();j++){
                    if(girdisembolleri[j].equals(sembol)){
                        sutun =j+1;
                        break;
                    }
                }
                if(sutun==-1){
                    javax.swing.JOptionPane.showMessageDialog(this, "Girilen alfabede bulunmayan bir sembol var: " + sembol);
                    return;
                }
                //geçiş işlemi , mevcut durumun satırına okunan sembolün sütununa bakar
                String yenidurum = gecismodeli.getValueAt(mevcutdurum, sutun).toString().trim();
                int yenidurumno = -1;
                for(int j=0;j<durumlar.length;j++){
                    if(durumlar[j].equals(yenidurum)){
                        yenidurumno = j;
                        break;
                    }
                }
                if(yenidurumno == -1){
                    javax.swing.JOptionPane.showMessageDialog(this ,"Gecis tablosunda gecersiz bir durum var.");
                    return;
                }
                mevcutdurum = yenidurumno;
                durumyolu.append(" -> ").append(durumlar[mevcutdurum]);
                uretilencikti.append(ciktimodeli.getValueAt(mevcutdurum, 1).toString().trim());
            }
           txtdurumgecisleri.setText(durumyolu.toString());
           txturetilencikti.setText(uretilencikti.toString());
           
    }//GEN-LAST:event_btntabloolusturActionPerformed

    private void btnsimulasyonubaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimulasyonubaslatActionPerformed
        simulasyonucalistir();
    }//GEN-LAST:event_btnsimulasyonubaslatActionPerformed

    private void btntemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntemizleActionPerformed
        txtgirdikelimesi.setText("");
        txtdurumgecisleri.setText("");
        txturetilencikti.setText("");
    }//GEN-LAST:event_btntemizleActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MooreEkrani().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsimulasyonubaslat;
    private javax.swing.JButton btntabloolustur;
    private javax.swing.JButton btntemizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldurumgecisleri;
    private javax.swing.JLabel lblgirdikelimesi;
    private javax.swing.JLabel lbluretilencikti;
    private javax.swing.JTable tblcikti;
    private javax.swing.JTable tblgecis;
    private javax.swing.JTextField txtciktialfabesi;
    private javax.swing.JTextField txtdurumgecisleri;
    private javax.swing.JTextField txtdurumsayisi;
    private javax.swing.JTextField txtgirdialfabesi;
    private javax.swing.JTextField txtgirdikelimesi;
    private javax.swing.JTextField txturetilencikti;
    // End of variables declaration//GEN-END:variables
}
