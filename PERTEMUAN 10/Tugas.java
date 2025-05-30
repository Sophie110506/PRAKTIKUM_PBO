import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Tugas extends javax.swing.JFrame {

    DefaultListModel<String> dlm = new DefaultListModel<>();
    List<String> dataList = new ArrayList<>();
    Set<String> dataSet = new HashSet<>();
    Map<Integer, String> dataMap = new HashMap<>();
    int mapCounter =1;
          
    public Tugas() {
        initComponents();
        dlm = new DefaultListModel<>();
        jListItem.setModel(dlm);
        
        for (String data : dataList){
            dlm.addElement(data);
            updateJumDataTersimpan();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonSaveToList = new javax.swing.JButton();
        jButtonInsertDataList = new javax.swing.JButton();
        jButtonSaveToSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jButtonSaveToMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jLabelDataTersimpan4 = new javax.swing.JLabel();
        jLabelDataTersimpan = new javax.swing.JLabel();
        jLabelDataTersimpan2 = new javax.swing.JLabel();
        jLabelDataTersimpan3 = new javax.swing.JLabel();
        jButtonClearAll = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonSaveToList.setText("save to list");
        jButtonSaveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToListActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setText("<- insert data list");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jButtonSaveToSet.setText("save to set ->");
        jButtonSaveToSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- insert data set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jButtonSaveToMap.setText("save to Map ->");
        jButtonSaveToMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jTextFieldNamaItem.setText("jTextField1");

        jLabelDataTersimpan4.setText("item name:");

        jLabelDataTersimpan.setText("Data tersimpan");

        jLabelDataTersimpan2.setText("Data tersimpan");

        jLabelDataTersimpan3.setText("Data tersimpan");

        jButtonClearAll.setText("clear all");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSaveToList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveToSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveToMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataTersimpan4)
                            .addComponent(jTextFieldNamaItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDataTersimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabelDataTersimpan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataTersimpan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDelete)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToList)
                            .addComponent(jLabelDataTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToSet)
                            .addComponent(jLabelDataTersimpan2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataSet)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToMap)
                            .addComponent(jLabelDataTersimpan3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataMap)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelDataTersimpan4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAdd)
                        .addComponent(jButtonUpdate)
                        .addComponent(jButtonDelete))
                    .addComponent(jButtonClearAll))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void updateJumDataTersimpan() {
        jLabelDataTersimpan.setText("Data tersimpan = " + dataList.size());
        jLabelDataTersimpan2.setText("Data tersimpan = " + dataSet.size());
        jLabelDataTersimpan3.setText("Data tersimpan = " + dataMap.size());
    }
    
    private void jButtonSaveToMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToMapActionPerformed
        dataMap.clear();
        mapCounter = 1;
        for (int i=0; i < dlm.getSize(); i++){
            dataMap.put(mapCounter++, dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveToMapActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        
        jTextFieldNamaItem.setText("");        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldNamaItem.getText());
        
        jTextFieldNamaItem.setText("");        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

        
    private void jButtonSaveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToListActionPerformed
        dataList.clear();
        for (int i=0; i < dlm.getSize(); i++){
            dataList.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveToListActionPerformed


    private void jButtonSaveToSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToSetActionPerformed
        dataSet.clear();
        for (int i=0; i < dlm.getSize(); i++){
            dataSet.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveToSetActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
        dataList.addAll(Arrays.asList("Apple", "Banana", "Cherry","Papaya"));
        for (String item : dataList){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        dataSet.addAll(Arrays.asList("Bag", "Pencil", "Pen","Book"));
        for (String item : dataSet){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        dataMap.put(mapCounter++, "Sugar");
        dataMap.put(mapCounter++, "Salt");
        dataMap.put(mapCounter++, "Oil");
        dataMap.put(mapCounter++, "Chili Oil");
        for (Map.Entry<Integer, String>entry : dataMap.entrySet()){
            dlm.addElement(entry.getKey()+ ": " + entry.getValue());
        }
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed


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
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveToList;
    private javax.swing.JButton jButtonSaveToMap;
    private javax.swing.JButton jButtonSaveToSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDataTersimpan;
    private javax.swing.JLabel jLabelDataTersimpan2;
    private javax.swing.JLabel jLabelDataTersimpan3;
    private javax.swing.JLabel jLabelDataTersimpan4;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
