/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.management.StringValueExp;

/**
 *
 * @author MiguelGz
 */
public class TiendaClaro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TiendaClaro() {
        initComponents();
        jbttcomprar.disable();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Prototaip");
        plancombo.disable();
         bttnsd.disable();  
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plancombo = new javax.swing.JComboBox<>();
        lbl7 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaequipos = new javax.swing.JList<>();
        textito1 = new javax.swing.JLabel();
        bttnsd = new javax.swing.JButton();
        lblogo = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jbttcomprar = new javax.swing.JButton();
        lblpantalla = new javax.swing.JLabel();
        lblcamara = new javax.swing.JLabel();
        lblprocesador = new javax.swing.JLabel();
        lblmjpl = new javax.swing.JLabel();
        lblpan = new javax.swing.JLabel();
        lblcam = new javax.swing.JLabel();
        lblpro = new javax.swing.JLabel();
        lblcamera = new javax.swing.JLabel();
        lblpant = new javax.swing.JLabel();
        etc = new javax.swing.JLabel();
        lblprocesa = new javax.swing.JLabel();
        lbledispo = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lblprais = new javax.swing.JLabel();
        lblprecio1 = new javax.swing.JLabel();
        lblinvisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.gray);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        plancombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    Selecciona el Plan", "   Claro Max 99", "   Claro Max 149", "   Claro Max 189", "   Prepago" }));
        plancombo.setBorder(null);
        plancombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plancomboActionPerformed(evt);
            }
        });
        getContentPane().add(plancombo);
        plancombo.setBounds(290, 390, 190, 57);

        lbl7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(lbl7);
        lbl7.setBounds(780, 470, 110, 30);

        lbl6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(lbl6);
        lbl6.setBounds(780, 420, 110, 30);

        lbl3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(lbl3);
        lbl3.setBounds(630, 470, 110, 30);

        listaequipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaequipos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Samsung Galaxy S6\t", "Iphone 6 Plus", "Huawey P8 Lte" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaequipos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaequiposAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(listaequipos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 180, 310);

        textito1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        textito1.setText("  TELEFONO MOVIL");
        textito1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(textito1);
        textito1.setBounds(290, 70, 530, 47);

        bttnsd.setText("Seleccionar Dispositivo");
        bttnsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsdActionPerformed(evt);
            }
        });
        getContentPane().add(bttnsd);
        bttnsd.setBounds(40, 520, 180, 50);

        lblogo.setFont(new java.awt.Font("Dialog", 2, 40)); // NOI18N
        lblogo.setText("Tienda Claro");
        getContentPane().add(lblogo);
        lblogo.setBounds(20, 10, 270, 80);

        lbl5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(lbl5);
        lbl5.setBounds(780, 390, 110, 30);

        jbttcomprar.setText("Comprar");
        jbttcomprar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbttcomprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttcomprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbttcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttcomprarActionPerformed(evt);
            }
        });
        getContentPane().add(jbttcomprar);
        jbttcomprar.setBounds(800, 560, 110, 60);

        lblpantalla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpantalla.setText("   -");
        getContentPane().add(lblpantalla);
        lblpantalla.setBounds(380, 180, 46, 45);

        lblcamara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcamara.setText("     -");
        getContentPane().add(lblcamara);
        lblcamara.setBounds(530, 180, 69, 46);

        lblprocesador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblprocesador.setText("    -");
        getContentPane().add(lblprocesador);
        lblprocesador.setBounds(700, 180, 55, 46);

        lblmjpl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblmjpl.setText("¡ELIGE EL MEJOR PLAN PARA TI !");
        getContentPane().add(lblmjpl);
        lblmjpl.setBounds(350, 300, 360, 29);

        lblpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpan.setText("Pantalla");
        getContentPane().add(lblpan);
        lblpan.setBounds(330, 240, 61, 22);

        lblcam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcam.setText("Camara");
        getContentPane().add(lblcam);
        lblcam.setBounds(500, 240, 59, 22);

        lblpro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpro.setText("Procesador");
        getContentPane().add(lblpro);
        lblpro.setBounds(660, 240, 86, 22);

        lblcamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-camara.png"))); // NOI18N
        getContentPane().add(lblcamera);
        lblcamera.setBounds(460, 170, 60, 63);

        lblpant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-pantalla.png"))); // NOI18N
        getContentPane().add(lblpant);
        lblpant.setBounds(310, 160, 60, 75);
        getContentPane().add(etc);
        etc.setBounds(600, 150, 0, 0);

        lblprocesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-procesador.png"))); // NOI18N
        getContentPane().add(lblprocesa);
        lblprocesa.setBounds(640, 170, 70, 60);

        lbledispo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbledispo.setText("Equipos Disponibles");
        getContentPane().add(lbledispo);
        lbledispo.setBounds(30, 120, 210, 20);

        lbl1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(lbl1);
        lbl1.setBounds(630, 390, 110, 30);

        lbl2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(lbl2);
        lbl2.setBounds(630, 420, 110, 30);

        lbl4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(lbl4);
        lbl4.setBounds(630, 500, 110, 30);

        lbl8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(lbl8);
        lbl8.setBounds(780, 500, 110, 30);

        lblprais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblprais);
        lblprais.setBounds(375, 530, 69, 30);
        getContentPane().add(lblprecio1);
        lblprecio1.setBounds(440, 530, 80, 30);

        lblinvisi.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(lblinvisi);
        lblinvisi.setBounds(290, 520, 60, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plancomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plancomboActionPerformed
        int item =plancombo.getSelectedIndex();
      
    switch (item){
         case 0:
            lbl1.setText("");
            lbl2.setText("");
            lbl3.setText("");
            lbl4.setText("");
            lbl5.setText("");
            lbl6.setText("");
            lbl7.setText("");
            lbl8.setText("");
           
     
        int item4=listaequipos.getSelectedIndex();
          switch (item4){ 
              
              case 0:
                 
                  lblprecio1.setText("  ");
                  lblprais.setText("  ");
              break;
              case 1:
                   
                  lblprecio1.setText("  ");
                   lblprais.setText("  ");
                  break;
                  case 2:
                      
                  lblprecio1.setText("  ");
                   lblprais.setText("  ");
                  break;
                  
                  case 4:
                       lblprecio1.setText("  ");
                        lblprais.setText("  ");
                  break;
        
            
          }
          
                
            break;
           
                 case 1:
       
            lbl1.setText("    1000");
            lbl2.setText("   MINUTOS");
            lbl3.setText("   10000");
            lbl4.setText("      RPC ");
            lbl5.setText("   500 MB");
            lbl6.setText("  INTERNET");
            lbl7.setText("     500 ");
            lbl8.setText("      SMS ");
            lblinvisi.setText("Claro Control 99 ");
            
            int item2=listaequipos.getSelectedIndex();
          switch (item2){ 
              
              case 0:
                   lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/2.200");
              break;
              case 1:
                      lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/1.800");
                  break;
                  case 2:
                        lblprais.setText("Precio :");  
                  lblprecio1.setText("S/500");
                  break;
         
        
            
          }
          
                
            break;
           
                
          
         case 2:
               lbl1.setText("    3000");
            lbl2.setText("   MINUTOS");
            lbl3.setText(" ILIMITADO");
            lbl4.setText("      RPC ");
            lbl5.setText("   1000 MB");
            lbl6.setText("    INTERNET");
            lbl7.setText("     1000 ");
            lbl8.setText("       SMS ");
            lblinvisi.setText("Claro Control 149 ");
          
             int item3=listaequipos.getSelectedIndex();
          switch (item3){ 
              
              case 0:
                    lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/1.600");
              break;
              case 1:
                        lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/999");
                  break;
                  case 2:
                        lblprais.setText("Precio :");    
                  lblprecio1.setText("S/220");
                  break;
         
        
            
          }
          
                
            break;
           
          case 3:
              lbl1.setText(" ILIMITADO");
            lbl2.setText("  MINUTOS");
            lbl3.setText("ILIMITADO");
            lbl4.setText("    RPC ");
            lbl5.setText("   3000 MB");
            lbl6.setText("   INTERNET");
            lbl7.setText(" ILIMITADO ");
            lbl8.setText("      SMS ");
            lblinvisi.setText("Claro Control 189 ");
           int item5=listaequipos.getSelectedIndex();
          switch (item5){ 
              
              case 0:
                    lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/899");
              break;
              case 1:
                        lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/499");
                  break;
                  case 2:
                        lblprais.setText("Precio :");    
                  lblprecio1.setText("S/99");
                  break;
         
        
            
          }
          
                
            break;
             case 4:
            lbl1.setText("");
            lbl2.setText("");
            lbl3.setText("");
            lbl4.setText("");
            lbl5.setText("");
            lbl6.setText("");
            lbl7.setText("");
            lbl8.setText("");
       int item6=listaequipos.getSelectedIndex();
          switch (item6){ 
              
              case 0:
                    lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/3.200");
              break;
              case 1:
                        lblprais.setText("Precio :"); 
                  lblprecio1.setText("S/2.850");
                  break;
                  case 2:
                        lblprais.setText("Precio :");    
                  lblprecio1.setText("S/980");
                  break;
          }
    }
    
    
    

  


    }//GEN-LAST:event_plancomboActionPerformed

    private void listaequiposAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaequiposAncestorAdded
    
           
    
   
        
    }//GEN-LAST:event_listaequiposAncestorAdded

    private void bttnsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsdActionPerformed
         bttnsd.enable();
        plancombo.enable();
        int item =listaequipos.getSelectedIndex();
        textito1.setText(String.valueOf(listaequipos.getSelectedValue()));
        
        switch (item){
            case 0:
                lblcamara.setText("8 MP");
                lblpantalla.setText("8.3");
                lblprocesador.setText("4 GB");
              
                break;
                case 1:
                lblcamara.setText("7 MP");
                 lblpantalla.setText("7.3");
                lblprocesador.setText("3 GB");
                      
                break;
                case 2:
                lblcamara.setText("6 MP");
                 lblpantalla.setText("6.3");
                lblprocesador.setText("2 GB");
                       
                break;
            
        }
     
// TODO add your handling code here:
    }//GEN-LAST:event_bttnsdActionPerformed

    private void jbttcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttcomprarActionPerformed
   
        Pago paga= new Pago();
     paga.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_jbttcomprarActionPerformed

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
            java.util.logging.Logger.getLogger(TiendaClaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaClaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaClaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaClaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run() {
                new TiendaClaro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bttnsd;
    private javax.swing.JLabel etc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbttcomprar;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbl3;
    public static javax.swing.JLabel lbl4;
    public static javax.swing.JLabel lbl5;
    public static javax.swing.JLabel lbl6;
    public static javax.swing.JLabel lbl7;
    public static javax.swing.JLabel lbl8;
    private javax.swing.JLabel lblcam;
    public static javax.swing.JLabel lblcamara;
    private javax.swing.JLabel lblcamera;
    private javax.swing.JLabel lbledispo;
    public static javax.swing.JLabel lblinvisi;
    private javax.swing.JLabel lblmjpl;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel lblpan;
    private javax.swing.JLabel lblpant;
    public static javax.swing.JLabel lblpantalla;
    public static javax.swing.JLabel lblprais;
    public static javax.swing.JLabel lblprecio1;
    private javax.swing.JLabel lblpro;
    private javax.swing.JLabel lblprocesa;
    public static javax.swing.JLabel lblprocesador;
    private javax.swing.JList<String> listaequipos;
    public static javax.swing.JComboBox<String> plancombo;
    public static javax.swing.JLabel textito1;
    // End of variables declaration//GEN-END:variables

    
}