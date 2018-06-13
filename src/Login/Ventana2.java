package Login;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    String ruta = "";
    URL url = null;
    ImageIcon icon = null;

    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        freVentana2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblOpcion = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        BtnO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("freVentana2"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        freVentana2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        freVentana2.setText("Acceso Correcto");
        jPanel1.add(freVentana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        lblOpcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblOpcion.setText("Selecciona Una Opción:");
        lblOpcion.setName(""); // NOI18N
        jPanel1.add(lblOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, -1));

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excel", "Chrome", "Word" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        lblImagen.setText("Imagen Representativa");
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 90, 90));

        BtnO.setText("Opcion");
        BtnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOActionPerformed(evt);
            }
        });
        jPanel1.add(BtnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
        int op = jcbOpciones.getSelectedIndex();
        String cadena =jcbOpciones.getSelectedItem().toString();
        switch (op) {
            
            case 0:this.mostrarImagen("/Imagenes/logo excel.png", op+1, cadena);
              /*  lblImagen.setText("");
                ruta = "/Imagenes/enamorado.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblImagen.setIcon(icon);
                JOptionPane.showMessageDialog(null, "Número 1", "Opción Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona La Opción 1");
                */
                break;
            case 1:this.mostrarImagen("/Imagenes/logo chrome.png", op+1, cadena);
               /* lblImagen.setText("");
                ruta = "/Imagenes/enojado.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblImagen.setIcon(icon);
                JOptionPane.showMessageDialog(null, "Número 2", "Opción Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona La Opción 2");
                */
                break;
            case 2:this.mostrarImagen("/Imagenes/logo word.png", op+1,cadena);
                /*lblImagen.setText("");
                ruta = "/Imagenes/muerto.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblImagen.setIcon(icon);
                JOptionPane.showMessageDialog(null, "Número 3", "Opción Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona La Opción 3");
                */
                break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

    private void BtnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOActionPerformed
        // TODO add your handling code here:
        int opc =Lista.getSelectedIndex();
        switch (opc){
            case -1: JOptionPane.showMessageDialog(null,"No has seleccionado nada ",
                                      "Opcion seleccionada",
                                      JOptionPane.INFORMATION_MESSAGE);
            break;
            case 0:
            
            case 1:
            
            case 2:
            
            case 3:
            
            case 4: mostrarTexto (opc+1);
            break;
            
        }
            /*case -1:this.mostrarTexto()
        JOptionPane.showMessageDialog(null,"Opcion No: "+ opc,
                                      "Opcion seleccionada",
                                      JOptionPane.INFORMATION_MESSAGE);*/
        
    }//GEN-LAST:event_BtnOActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    } 
    
    public void mostrarImagen (String urlImagen,int opcion, String cad){
                //ruta = urlImagen;
                url = this.getClass().getResource(urlImagen);
                icon = new ImageIcon(url);
                lblImagen.setIcon(icon); 
                lblImagen.setText("Opcion: "+ opcion + "Texto: "+ cad);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnO;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel freVentana2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblOpcion;
    // End of variables declaration//GEN-END:variables

    private void mostrarTexto(int opc) {
         JOptionPane.showMessageDialog(null,
                    "Opcion no: "+ opc,
                    "Opcion seleccionada",
                    JOptionPane.INFORMATION_MESSAGE);
                    
    }

    
}
