/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.Timer;
import pst.SenhaPST;

/**
 *
 * @author anderson
 */
public class TelaDadosNEncGUI extends javax.swing.JFrame {

    private TelaInicialCPFGUI telaInicialCPFGUI;

    /**
     * Creates new form TelaDadosNEncGUI
     */
    public TelaDadosNEncGUI(TelaInicialCPFGUI telaInicialCPFGUI) {
        initComponents();
        this.telaInicialCPFGUI = telaInicialCPFGUI;
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelTitulo = new javax.swing.JLabel();
        jButtonCanc = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelPergProdUltCarreg = new javax.swing.JLabel();
        jButtonNaoDadosNEnc = new javax.swing.JButton();
        jButtonSimDadosNEnc = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("AUTOATENDIMENTO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabelTitulo, gridBagConstraints);

        jButtonCanc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCanc.setText("Cancelar");
        jButtonCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 65;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        getContentPane().add(jButtonCanc, gridBagConstraints);

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonFechar.setText("X");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jButtonFechar, gridBagConstraints);

        jLabelPergProdUltCarreg.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelPergProdUltCarreg.setText("O numero do seu CPF é 123.546.789-00?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(160, 0, 160, 0);
        getContentPane().add(jLabelPergProdUltCarreg, gridBagConstraints);

        jButtonNaoDadosNEnc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonNaoDadosNEnc.setText("Não");
        jButtonNaoDadosNEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoDadosNEncActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.insets = new java.awt.Insets(60, 150, 20, 50);
        getContentPane().add(jButtonNaoDadosNEnc, gridBagConstraints);

        jButtonSimDadosNEnc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonSimDadosNEnc.setText("Sim");
        jButtonSimDadosNEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimDadosNEncActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.insets = new java.awt.Insets(60, 50, 20, 150);
        getContentPane().add(jButtonSimDadosNEnc, gridBagConstraints);

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo2.setText("SISTEMA DE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        getContentPane().add(jLabelTitulo2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancActionPerformed
        // TODO add your handling code here:

        this.telaInicialCPFGUI.limpaCPF();
        this.telaInicialCPFGUI.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCancActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:

        JLabel label = new JLabel("Digite a senha:");
        JPasswordField jpf = new JPasswordField();
        JOptionPane msg = new JOptionPane(new Object[]{label, jpf}, JOptionPane.OK_CANCEL_OPTION);
        JDialog dlg = msg.createDialog("Password");
        dlg.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);
                final Timer t = new Timer(10000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dlg.setVisible(false);
                    }
                });
                t.start();
            }
        });
        dlg.setVisible(true);

        String senha = new String(jpf.getPassword());
        SenhaPST senhaPST = new SenhaPST();

        if (senha.equals(senhaPST.retornaSenha())) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonSimDadosNEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimDadosNEncActionPerformed
        // TODO add your handling code here:

        this.telaInicialCPFGUI.getTelaWhatsappGUI().limpaCelular();
        this.telaInicialCPFGUI.getTelaWhatsappGUI().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonSimDadosNEncActionPerformed

    private void jButtonNaoDadosNEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoDadosNEncActionPerformed
        // TODO add your handling code here:

        this.telaInicialCPFGUI.limpaCPF();
        this.telaInicialCPFGUI.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonNaoDadosNEncActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaDadosNEncGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaDadosNEncGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaDadosNEncGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaDadosNEncGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaDadosNEncGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCanc;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNaoDadosNEnc;
    private javax.swing.JButton jButtonSimDadosNEnc;
    private javax.swing.JLabel jLabelPergProdUltCarreg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo2;
    // End of variables declaration//GEN-END:variables

    public void preenche() {
        jLabelPergProdUltCarreg.setText("O numero do seu CPF é " + this.telaInicialCPFGUI.getTextoCPF() + "?");
    }

}
