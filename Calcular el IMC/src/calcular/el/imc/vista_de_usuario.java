/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular.el.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Baruch Reyes Sanchez
 */
public class vista_de_usuario extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    
    PERSONA e=new OPERACIONES();
    /**
     * Creates new form vista_de_usuario
     */
    public vista_de_usuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Inserte su nombre ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        jLabel2.setText("Ingrese su edad ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setText("Ingrese su sexo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setText("Ingrese su peso en KG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("Ingrese su altura en MT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, -1));
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));
        getContentPane().add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, -1));
        getContentPane().add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, -1));
        getContentPane().add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
     
        String nombre;
        int  edad;
        String sexo;
        float peso;
        float altura;
        
       
        
    nombre=txtnombre.getText();
    edad=Integer.parseInt(txtedad.getText());
     sexo = txtsexo.getText();
    peso=Float.parseFloat(txtpeso.getText());
     altura=Float.parseFloat(txtaltura.getText());
    
    
    //OPERACIONES
     altura = altura* altura;
    //OPERACION FINAL
    peso =  peso / altura;
  
    
    JOptionPane.showMessageDialog(null,"Hola\n" +nombre +"\nTu edad es:\n"+edad +"\nSu sexo es:\n"+sexo+ "\nSu Indice de masa corporal es :\n"+peso);   
    
    
    }//GEN-LAST:event_jButton1ActionPerformed


    
        
        
       
        
        
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
            java.util.logging.Logger.getLogger(vista_de_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_de_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_de_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_de_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_de_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txtaltura;
    public javax.swing.JTextField txtedad;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtpeso;
    public javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
