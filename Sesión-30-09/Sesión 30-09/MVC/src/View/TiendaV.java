/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TiendaC;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class TiendaV extends javax.swing.JFrame {
    TiendaC tiendaC = new TiendaC();
    /**
     * Creates new form TiendaV
     */
    public TiendaV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTittulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIncremento = new javax.swing.JLabel();
        jpInputData = new javax.swing.JPanel();
        lblCompra = new javax.swing.JLabel();
        txtCompra = new javax.swing.JTextField();
        lblValorIncremento = new javax.swing.JLabel();
        txtIncremento = new javax.swing.JTextField();
        lblTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jpBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("TIENDAD DE PEPITO");

        lblIncremento.setText("Incremnto por compra 10%");

        javax.swing.GroupLayout jpTittuloLayout = new javax.swing.GroupLayout(jpTittulo);
        jpTittulo.setLayout(jpTittuloLayout);
        jpTittuloLayout.setHorizontalGroup(
            jpTittuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTittuloLayout.createSequentialGroup()
                .addGroup(jpTittuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTittuloLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblTitulo))
                    .addGroup(jpTittuloLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblIncremento)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jpTittuloLayout.setVerticalGroup(
            jpTittuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTittuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIncremento))
        );

        lblCompra.setText("Compra");

        lblValorIncremento.setText("Incremento");

        txtIncremento.setEditable(false);

        lblTotalPagar.setText("Total Pagar");

        txtTotalPagar.setEditable(false);

        javax.swing.GroupLayout jpInputDataLayout = new javax.swing.GroupLayout(jpInputData);
        jpInputData.setLayout(jpInputDataLayout);
        jpInputDataLayout.setHorizontalGroup(
            jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInputDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInputDataLayout.createSequentialGroup()
                        .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorIncremento)
                            .addComponent(lblCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpInputDataLayout.createSequentialGroup()
                        .addComponent(lblTotalPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInputDataLayout.setVerticalGroup(
            jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInputDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompra)
                    .addComponent(txtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorIncremento)
                    .addComponent(txtIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Consultar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAgregar)
                .addGap(31, 31, 31)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpInputData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTittulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTittulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        double Compra;
        
        try {
            Compra = Double.parseDouble(txtCompra.getText());
            tiendaC.AgregarC(Compra);             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        double data[] = new double[2];
        
        data = tiendaC.Mostrar();
        System.out.println(data[0]);
        txtIncremento.setText(String.valueOf(data[0]));
        txtTotalPagar.setText(String.valueOf(data[1]));
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(TiendaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpInputData;
    private javax.swing.JPanel jpTittulo;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblIncremento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JLabel lblValorIncremento;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtIncremento;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
