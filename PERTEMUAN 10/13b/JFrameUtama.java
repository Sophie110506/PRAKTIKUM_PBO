package jdbc.program;
import javax.swing.*;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import javax.swing.DefaultListModel;
import java.sql.SQLException;




public class JFrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonTambahkan = new javax.swing.JButton();
        jTextFieldEditID = new javax.swing.JTextField();
        jTextFieldHapusID = new javax.swing.JTextField();
        jTextFieldEditNama = new javax.swing.JTextField();
        jTextFieldHapusNama = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonResetIndeks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("ID");

        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Kelola Data Mahasiswa");

        jButtonAmbilSemuaData.setText("Ambil Semua Data");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jLabel4.setText("nama :");

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jTextFieldEditID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditIDActionPerformed(evt);
            }
        });

        jTextFieldHapusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHapusIDActionPerformed(evt);
            }
        });

        jTextFieldEditNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditNamaActionPerformed(evt);
            }
        });

        jTextFieldHapusNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHapusNamaActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonResetIndeks.setText("Reset Indeks");
        jButtonResetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndeksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAmbilSemuaData)
                                    .addComponent(jLabel4)
                                    .addComponent(jButtonTambahkan)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEditID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldHapusID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEditNama)
                                            .addComponent(jTextFieldHapusNama, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonEdit)
                                            .addComponent(jButtonHapus)))
                                    .addComponent(jButtonResetIndeks))
                                .addGap(0, 3, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAmbilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTambahkan)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHapusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHapusNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButtonResetIndeks)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldEditNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditNamaActionPerformed
        System.out.println("input:" + jTextFieldEditNama.getText());
    }//GEN-LAST:event_jTextFieldEditNamaActionPerformed

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        try {
            MysqlMahasiswaService service = new MysqlMahasiswaService();
            List<Mahasiswa> daftarMahasiswa = service.getAll();

            // Fixed: Menggunakan JList bukan JTable
            DefaultListModel<String> modelId = new DefaultListModel<>();
            DefaultListModel<String> modelNama = new DefaultListModel<>();

            for (Mahasiswa mhs : daftarMahasiswa) {
                modelId.addElement(String.valueOf(mhs.getId()));
                modelNama.addElement(mhs.getNama());
            }

            jList1.setModel(modelId);
            jList2.setModel(modelNama);

            System.out.println("Data berhasil dimuat.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengambil data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        try {
            String nama = jTextFieldNama.getText();
            if (nama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
                return;
            }

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(nama);

            MysqlMahasiswaService service = new MysqlMahasiswaService();
            service.add(mhs);

            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
            jTextFieldNama.setText("");
            jButtonAmbilSemuaDataActionPerformed(null); // refresh list
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try {
            int id = Integer.parseInt(jTextFieldEditID.getText());
            String nama = jTextFieldEditNama.getText();

            Mahasiswa mhs = new Mahasiswa();
            mhs.setId(id);
            mhs.setNama(nama);

            MysqlMahasiswaService service = new MysqlMahasiswaService();
            Mahasiswa mhsUpdate = new Mahasiswa(); // BUAT OBJECT BARU
            mhsUpdate.setNama("nama baru"); // Sekarang aman

            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            jTextFieldEditID.setText("");
            jTextFieldEditNama.setText("");
            jButtonAmbilSemuaDataActionPerformed(null); // refresh list
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengedit data: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldEditIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditIDActionPerformed
        System.out.println("input:" + jTextFieldEditID.getText());

    }//GEN-LAST:event_jTextFieldEditIDActionPerformed

    private void jTextFieldHapusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHapusIDActionPerformed
        try {
            String idText = jTextFieldHapusID.getText().trim();
            if (!idText.isEmpty()) {
                int id = Integer.parseInt(idText);

                MysqlMahasiswaService service = new MysqlMahasiswaService();
                Mahasiswa mhs = service.getById(id);

                if (mhs != null) {
                    jTextFieldHapusNama.setText(mhs.getNama()); // auto-fill nama
                } else {
                    jTextFieldHapusNama.setText("");
                    JOptionPane.showMessageDialog(this, "Mahasiswa dengan ID " + id + " tidak ditemukan.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
            jTextFieldHapusNama.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            jTextFieldHapusNama.setText("");
        }
    }//GEN-LAST:event_jTextFieldHapusIDActionPerformed

    private void jTextFieldHapusNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHapusNamaActionPerformed
        System.out.println("Nama untuk dihapus: " + jTextFieldHapusNama.getText());
    }//GEN-LAST:event_jTextFieldHapusNamaActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        try {
            String idText = jTextFieldHapusID.getText().trim();
            String namaText = jTextFieldHapusNama.getText().trim();

            MysqlMahasiswaService service = new MysqlMahasiswaService();

            // Prioritas: jika ID diisi, hapus berdasarkan ID
            if (!idText.isEmpty()) {
                int id = Integer.parseInt(idText);

                Mahasiswa mhs = service.getById(id);
                if (mhs == null) {
                    JOptionPane.showMessageDialog(this, "Mahasiswa dengan ID " + id + " tidak ditemukan.");
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(this,
                        "Yakin ingin menghapus mahasiswa:\nID: " + id + "\nNama: " + mhs.getNama(),
                        "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    service.delete(id);
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    jTextFieldHapusID.setText("");
                    jTextFieldHapusNama.setText("");
                    jButtonAmbilSemuaDataActionPerformed(null); // refresh list
                }

            // Jika ID kosong tapi nama diisi, hapus berdasarkan nama
            } else if (!namaText.isEmpty()) {
                List<Mahasiswa> list = service.getMahasiswaByNama(namaText);

                if (list.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tidak ada mahasiswa dengan nama '" + namaText + "'.");
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(this,
                        "Yakin ingin menghapus semua mahasiswa bernama: " + namaText + " (" + list.size() + " data)?",
                        "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    for (Mahasiswa mhs : list) {
                        service.delete(mhs.getId());
                    }
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    jTextFieldHapusID.setText("");
                    jTextFieldHapusNama.setText("");
                    jButtonAmbilSemuaDataActionPerformed(null); // refresh list
                }

            } else {
                JOptionPane.showMessageDialog(this, "Masukkan ID atau Nama yang ingin dihapus.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed



    private void jButtonResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndeksActionPerformed
        try {
            // Konfirmasi dulu sebelum reset
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Apakah Anda yakin ingin mereset indeks AUTO_INCREMENT?\n" +
                    "Tindakan ini akan membuat ID baru dimulai dari 1 lagi.",
                    "Konfirmasi Reset Indeks", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                MysqlMahasiswaService service = new MysqlMahasiswaService();
                service.resetAutoIncrement();

                JOptionPane.showMessageDialog(this, 
                    "Indeks AUTO_INCREMENT berhasil direset!\n" +
                    "ID mahasiswa baru akan dimulai dari 1.");

                // Refresh tampilan data
                jButtonAmbilSemuaDataActionPerformed(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Gagal mereset indeks: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonResetIndeksActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonResetIndeks;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldEditID;
    private javax.swing.JTextField jTextFieldEditNama;
    private javax.swing.JTextField jTextFieldHapusID;
    private javax.swing.JTextField jTextFieldHapusNama;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
