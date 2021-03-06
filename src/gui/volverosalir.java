
package gui;

import javax.swing.JLabel;
import cliente.Cliente;
import metodos.Metodos;
/**
 *
 * @author MiguelGz
 */
public class volverosalir extends javax.swing.JFrame {

  Cliente cliente=new Cliente();
  Metodos metodos=new Metodos();
    
    public volverosalir() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
     seebtn.disable();

        setTitle("Atencion!");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitbtn = new javax.swing.JButton();
        lbltextaso = new javax.swing.JLabel();
        seebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitbtn.setText("Salir");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        lbltextaso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltextaso.setText("¿Antes de abandonar la pestaña , desea guardar los datos de su compra?");

        seebtn.setText("Ver Datos de Compra");
        seebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seebtnActionPerformed(evt);
            }
        });

        savebtn.setText("Guardar");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(savebtn)
                .addGap(82, 82, 82)
                .addComponent(seebtn)
                .addGap(65, 65, 65)
                .addComponent(exitbtn))
            .addComponent(lbltextaso, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltextaso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seebtn)
                    .addComponent(exitbtn)
                    .addComponent(savebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void seebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seebtnActionPerformed




        // TODO add your handling code here:
        datocompra dc=new datocompra();
        dc.setVisible(true);
        dispose();
        
        seebtn.enable();
        
    }//GEN-LAST:event_seebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
            String nombre=Pago.txt1.getText();
            String numtarjeta=Pago.txt2.getText();
            String fechacaduca=Pago.txt4.getText();
            String ciudad = Pago.txt5.getText();
            String equipo =TiendaClaro.textito1.getText();
            String pantalla =TiendaClaro.lblpantalla.getText();
            String camara =TiendaClaro.lblcamara.getText();
            String procesa =TiendaClaro.lblprocesador.getText();
            String plan =TiendaClaro.lblinvisi.getText();
            String precio =TiendaClaro.lblprecio1.getText();
            
            cliente.setNombre(nombre);
            cliente.setNumtarjet(numtarjeta);
            cliente.setFechacaduca(fechacaduca);
            cliente.setCiudad(ciudad);
            cliente.setEquipo(equipo);
            cliente.setPantalla(pantalla);
            cliente.setCamara(camara);
            cliente.setProcesa(procesa);
            cliente.setPlan(plan);
            cliente.setPrecio(precio);
            
              metodos.guardar(cliente);
            metodos.guardarArchivo(cliente);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed

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
            java.util.logging.Logger.getLogger(volverosalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(volverosalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(volverosalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(volverosalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new volverosalir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel lbltextaso;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton seebtn;
    // End of variables declaration//GEN-END:variables
}
