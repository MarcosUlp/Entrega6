/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Views;

import ejercicio6.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class Precio extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    public boolean isCellEditable(int f, int c){
        return false;
    }
    /**
     * Creates new form Precio
     */
    public Precio() {
        initComponents();
        armarTabla();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtPrecioMin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jteTable = new javax.swing.JTable();
        jtPrecioMax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Listado por Precio");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Y");

        jLabel1.setText("Entre");

        jtPrecioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMinKeyReleased(evt);
            }
        });

        jteTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jteTable);

        jtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMaxKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMinKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        try {
            double pMin, pMax;
            if (jtPrecioMin.getText().trim().equals("") || jtPrecioMax.getText().trim().equals("")) {
                pMin = 0;
                pMax = 0;
            } else {
                pMin = Double.parseDouble(jtPrecioMin.getText().trim());
                pMax = Double.parseDouble(jtPrecioMax.getText().trim());
            }

            for (Producto prod : MenuGeneral.listaProductos) {
                if (prod.getPrecio() >= pMin && prod.getPrecio() <= pMax) {
                    modelo.addRow(new Object[]{
                        prod.getCodigo(),
                        prod.getDescripcion(),
                        prod.getPrecio(),
                        prod.getStock()
                    });
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos: deben ingresar numeros");
            borrarFilas();
            jtPrecioMin.setText("");
            jtPrecioMax.setText("");
        }
    
    }//GEN-LAST:event_jtPrecioMinKeyReleased

    private void jtPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMaxKeyReleased
        // TODO add your handling code here:
        try {
            double pMin, pMax;
            if (jtPrecioMin.getText().trim().equals("") || jtPrecioMax.getText().trim().equals("")) {
                pMin = 0;
                pMax = 0;
            } else {
                pMin = Double.parseDouble(jtPrecioMin.getText().trim());
                pMax = Double.parseDouble(jtPrecioMax.getText().trim());
            }

            for (Producto elem : MenuGeneral.listaProductos) {
                if (elem.getPrecio() >= pMin && elem.getPrecio() <= pMax) {
                    modelo.addRow(new Object[]{
                        elem.getCodigo(),
                        elem.getDescripcion(),
                        elem.getPrecio(),
                        elem.getStock()
                    });
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos: deben ser numeros");
            borrarFilas();
            jtPrecioMin.setText("");
            jtPrecioMax.setText("");
        }
          
    }//GEN-LAST:event_jtPrecioMaxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtPrecioMax;
    private javax.swing.JTextField jtPrecioMin;
    private javax.swing.JTable jteTable;
    // End of variables declaration//GEN-END:variables
    public void armarTabla(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jteTable.setModel(modelo);
    }
    private void borrarFilas(){
        int indice=modelo.getRowCount()-1;
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
}
