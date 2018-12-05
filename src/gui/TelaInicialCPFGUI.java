/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import pst.SenhaPST;
import pst.UltCarregPST;
import to.DadosCarregTO;
import to.UltViagemTO;

/**
 *
 * @author anderson
 */
public class TelaInicialCPFGUI extends javax.swing.JFrame {

    private String textoCPF;
    private int qtde = 0;
//    private int produto;

    private UltViagemTO ultViagemTO;
    private DadosCarregTO dadosCarregTO;

    private TelaCameraGUI telaCameraGUI;
    private TelaDadosNEncGUI telaDadosNEncGUI;
    private TelaDadosUltCarregGUI telaDadosUltCarregGUI;
    private TelaImprimirSenhaGUI telaImprimirSenhaGUI;
    private TelaPlacaGUI telaPlacaGUI;
    private TelaProdutoUltCarregGUI telaProdutoUltCarregGUI;
    private TelaTranspUltCarreg telaTranspUltCarreg;
    private TelaVeicUltCarregGUI telaVeicUltCarregGUI;
    private TelaWhatsappGUI telaWhatsappGUI;
    private TelaProdutoCarregGUI telaProdutoCarregGUI;
    private TelaClassifProdCarregGUI telaClassifProdCarregGUI;
    private TelaCamCPreOrdem telaCamCPreOrdem;
    private TelaClienteUltCarreg telaClienteUltCarreg;
    private JDialogDefault jDialogDefault;
    private boolean statusMSG;

    /**
     * Creates new form TelaInicalGUI
     */
    public TelaInicialCPFGUI() {
        initComponents();

//        getContentPane().setBackground(Color.WHITE);
        
        telaCameraGUI = new TelaCameraGUI(this);
        telaDadosNEncGUI = new TelaDadosNEncGUI(this);
        telaDadosUltCarregGUI = new TelaDadosUltCarregGUI(this);
        telaImprimirSenhaGUI = new TelaImprimirSenhaGUI(this);
        telaPlacaGUI = new TelaPlacaGUI(this);
        telaProdutoUltCarregGUI = new TelaProdutoUltCarregGUI(this);
        telaTranspUltCarreg = new TelaTranspUltCarreg(this);
        telaVeicUltCarregGUI = new TelaVeicUltCarregGUI(this);
        telaWhatsappGUI = new TelaWhatsappGUI(this);
        telaProdutoCarregGUI = new TelaProdutoCarregGUI(this);
        telaClassifProdCarregGUI = new TelaClassifProdCarregGUI(this);
        telaCamCPreOrdem = new TelaCamCPreOrdem(this);
        telaClienteUltCarreg = new TelaClienteUltCarreg(this);
        jDialogDefault = new JDialogDefault(new javax.swing.JFrame(), true, this);
        statusMSG = true;

        textoCPF = "";

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
        jButtonSair = new javax.swing.JButton();
        jLabelMsg = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonCorrigePCF = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonOkCPF = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("AUTOATENDIMENTO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabelTitulo, gridBagConstraints);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonSair.setText("X");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        getContentPane().add(jButtonSair, gridBagConstraints);

        jLabelMsg.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabelMsg.setText("Por Favor, digite seu CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        getContentPane().add(jLabelMsg, gridBagConstraints);

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabelCPF.setText("___.___.___-__");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        getContentPane().add(jLabelCPF, gridBagConstraints);

        jButtonNum1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum1.setText("1");
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum1, gridBagConstraints);

        jButtonNum2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum2.setText("2");
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum2, gridBagConstraints);

        jButtonNum3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum3.setText("3");
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum3, gridBagConstraints);

        jButtonNum4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum4.setText("4");
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum4, gridBagConstraints);

        jButtonNum5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum5.setText("5");
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum5, gridBagConstraints);

        jButtonNum6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum6.setText("6");
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum6, gridBagConstraints);

        jButtonNum7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum7.setText("7");
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum7, gridBagConstraints);

        jButtonNum8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum8.setText("8");
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum8, gridBagConstraints);

        jButtonNum9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum9.setText("9");
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum9, gridBagConstraints);

        jButtonCorrigePCF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCorrigePCF.setText("CORRIGE");
        jButtonCorrigePCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorrigePCFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 80;
        getContentPane().add(jButtonCorrigePCF, gridBagConstraints);

        jButtonNum0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum0.setText("0");
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        getContentPane().add(jButtonNum0, gridBagConstraints);

        jButtonOkCPF.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonOkCPF.setText("OK");
        jButtonOkCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkCPFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 55;
        getContentPane().add(jButtonOkCPF, gridBagConstraints);

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo2.setText("SISTEMA DE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        getContentPane().add(jLabelTitulo2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        // TODO add your handling code here:
        preencherLabelCPF("1");

    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("2");

    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("3");

    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("4");

    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("5");

    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("6");

    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("7");

    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("8");

    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("9");

    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        // TODO add your handling code here:

        preencherLabelCPF("0");

    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonOkCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkCPFActionPerformed
        // TODO add your handling code here:

        if (qtde == 11) {
            UltCarregPST carregPST = new UltCarregPST();
            ultViagemTO = carregPST.retUltViagem(textoCPF.replace(".", "").replace("-", ""));
            dadosCarregTO = new DadosCarregTO();
            dadosCarregTO.setCpf(textoCPF.replace(".", "").replace("-", ""));
            dadosCarregTO.setNomeMotorista(ultViagemTO.getNomeMotorista());
            if (ultViagemTO.getNomeMotorista().equals("0")) {
                if (ultViagemTO.getMsgErro().equals("0")) {
                    dadosCarregTO.setConfirmaDados(0);
                    dadosCarregTO.setRgMotorista(null);
                    dadosCarregTO.setCnhMotorista(null);
                    dadosCarregTO.setValCnhMotorista(null);
                    dadosCarregTO.setIdCliente(null);
                    telaDadosNEncGUI.preenche();
                    telaDadosNEncGUI.setVisible(true);
                    this.setVisible(false);
                } else {
                    dadosCarregTO.setMsgErro(ultViagemTO.getMsgErro());
                    telaCamCPreOrdem.preencher();
                    telaCamCPreOrdem.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                dadosCarregTO.setConfirmaDados(1);
                dadosCarregTO.setCapacidade(ultViagemTO.getCapacidade());
                dadosCarregTO.setCnhMotorista(ultViagemTO.getCnhMotorista());
                dadosCarregTO.setDescrProdCarreg(ultViagemTO.getDescrProdCarreg());
                dadosCarregTO.setIdProdCarreg(ultViagemTO.getIdProdCarreg());
                dadosCarregTO.setIdTercTransp(ultViagemTO.getIdTercTransp());
                dadosCarregTO.setNomeTransp(ultViagemTO.getNomeTransp());
                dadosCarregTO.setPlaca1(ultViagemTO.getPlaca1());
                dadosCarregTO.setPlaca2(ultViagemTO.getPlaca2());
                dadosCarregTO.setPlaca3(ultViagemTO.getPlaca3());
                dadosCarregTO.setRgMotorista(ultViagemTO.getRgMotorista());
                dadosCarregTO.setValCnhMotorista(ultViagemTO.getValCnhMotorista());
                dadosCarregTO.setIdCliente(ultViagemTO.getIdCliente());
                dadosCarregTO.setDescrCliente(ultViagemTO.getDescrCliente());
                dadosCarregTO.setRuaCliente(ultViagemTO.getRuaCliente());
                dadosCarregTO.setNumCliente(ultViagemTO.getNumCliente());
                dadosCarregTO.setBairroCliente(ultViagemTO.getBairroCliente());
                dadosCarregTO.setComplCliente(ultViagemTO.getComplCliente());
                dadosCarregTO.setCidadeCliente(ultViagemTO.getCidadeCliente());
                dadosCarregTO.setEstadoCliente(ultViagemTO.getEstadoCliente());
                telaDadosUltCarregGUI.carreg();
                telaDadosUltCarregGUI.setVisible(true);
                this.setVisible(false);
            }
        } else {
            jDialogDefault.setTxtMsg("Por Favor, termine de digitar o CPF.");
            Timer timer = new Timer(4000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jDialogDefault.setVisible(false);
                }
            });
            timer.setRepeats(false);
            timer.start();
            jDialogDefault.setVisible(true);
        }

    }//GEN-LAST:event_jButtonOkCPFActionPerformed

    private void jButtonCorrigePCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorrigePCFActionPerformed
        // TODO add your handling code here:

        apagarLabelCPF();
//        Document document = new Document();
//        try {
//            Desktop desktop = Desktop.getDesktop();
//            PdfWriter.getInstance(document, new FileOutputStream("K:\\carreg\\impressao.pdf"));
//            document.open();
//            File file = new File("K:\\carreg\\impressao.pdf");
//            desktop.print(file);
//            // adicionando um parágrafo no documento
//            document.add(new Paragraph("Gerando PDF - Java"));
//        } catch (DocumentException de) {
//            System.err.println(de.getMessage());
//        } catch (IOException ioe) {
//            System.err.println(ioe.getMessage());
//        }
//        document.close();


    }//GEN-LAST:event_jButtonCorrigePCFActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
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

    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialCPFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialCPFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialCPFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialCPFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialCPFGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCorrigePCF;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonOkCPF;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo2;
    // End of variables declaration//GEN-END:variables

    public void preencherLabelCPF(String texto) {

        switch (qtde) {
            case 0:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + "__.___.___-__");
                break;
            case 1:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + "_.___.___-__");
                break;
            case 2:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + ".___.___-__");
                break;
            case 3:
                qtde++;
                textoCPF = textoCPF + '.' + texto;
                jLabelCPF.setText(textoCPF + "__.___-__");
                break;
            case 4:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + "_.___-__");
                break;
            case 5:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + ".___-__");
                break;
            case 6:
                qtde++;
                textoCPF = textoCPF + '.' + texto;
                jLabelCPF.setText(textoCPF + "__-__");
                break;
            case 7:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + "_-__");
                break;
            case 8:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF + "-__");
                break;
            case 9:
                qtde++;
                textoCPF = textoCPF + '-' + texto;
                jLabelCPF.setText(textoCPF + "_");
                break;
            case 10:
                qtde++;
                textoCPF = textoCPF + texto;
                jLabelCPF.setText(textoCPF);
                break;
            default:
                break;
        }
    }

    public void apagarLabelCPF() {
        switch (qtde) {
            case 1:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "___.___.___-__");
                qtde = qtde - 1;
                break;
            case 2:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "__.___.___-__");
                qtde = qtde - 1;
                break;
            case 3:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "_.___.___-__");
                qtde = qtde - 1;
                break;
            case 4:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 2);
                jLabelCPF.setText(textoCPF + ".___.___-__");
                qtde = qtde - 1;
                break;
            case 5:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "__.___-__");
                qtde = qtde - 1;
                break;
            case 6:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "_.___-__");
                qtde = qtde - 1;
                break;
            case 7:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 2);
                jLabelCPF.setText(textoCPF + ".___-__");
                qtde = qtde - 1;
                break;
            case 8:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "__-__");
                qtde = qtde - 1;
                break;
            case 9:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "_-__");
                qtde = qtde - 1;
                break;
            case 10:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 2);
                jLabelCPF.setText(textoCPF + "-__");
                qtde = qtde - 1;
                break;
            case 11:
                textoCPF = textoCPF.substring(0, textoCPF.length() - 1);
                jLabelCPF.setText(textoCPF + "_");
                qtde = qtde - 1;
                break;
            default:
                break;
        }
    }

    public TelaCameraGUI getTelaCameraGUI() {
        return telaCameraGUI;
    }

    public void setTelaCameraGUI(TelaCameraGUI telaCameraGUI) {
        this.telaCameraGUI = telaCameraGUI;
    }

    public TelaDadosNEncGUI getTelaDadosNEncGUI() {
        return telaDadosNEncGUI;
    }

    public void setTelaDadosNEncGUI(TelaDadosNEncGUI telaDadosNEncGUI) {
        this.telaDadosNEncGUI = telaDadosNEncGUI;
    }

    public TelaDadosUltCarregGUI getTelaDadosUltCarregGUI() {
        return telaDadosUltCarregGUI;
    }

    public void setTelaDadosUltCarregGUI(TelaDadosUltCarregGUI telaDadosUltCarregGUI) {
        this.telaDadosUltCarregGUI = telaDadosUltCarregGUI;
    }

    public TelaImprimirSenhaGUI getTelaImprimirSenhaGUI() {
        return telaImprimirSenhaGUI;
    }

    public void setTelaImprimirSenhaGUI(TelaImprimirSenhaGUI telaImprimirSenhaGUI) {
        this.telaImprimirSenhaGUI = telaImprimirSenhaGUI;
    }

    public TelaPlacaGUI getTelaPlacaGUI() {
        return telaPlacaGUI;
    }

    public void setTelaPlacaGUI(TelaPlacaGUI telaPlacaGUI) {
        this.telaPlacaGUI = telaPlacaGUI;
    }

    public TelaProdutoUltCarregGUI getTelaProdutoUltCarregGUI() {
        return telaProdutoUltCarregGUI;
    }

    public void setTelaProdutoUltCarregGUI(TelaProdutoUltCarregGUI telaProdutoUltCarregGUI) {
        this.telaProdutoUltCarregGUI = telaProdutoUltCarregGUI;
    }

    public TelaTranspUltCarreg getTelaTranspUltCarreg() {
        return telaTranspUltCarreg;
    }

    public void setTelaTranspUltCarreg(TelaTranspUltCarreg telaTranspUltCarreg) {
        this.telaTranspUltCarreg = telaTranspUltCarreg;
    }

    public TelaVeicUltCarregGUI getTelaVeicUltCarregGUI() {
        return telaVeicUltCarregGUI;
    }

    public void setTelaVeicUltCarregGUI(TelaVeicUltCarregGUI telaVeicUltCarregGUI) {
        this.telaVeicUltCarregGUI = telaVeicUltCarregGUI;
    }

    public TelaWhatsappGUI getTelaWhatsappGUI() {
        return telaWhatsappGUI;
    }

    public void setTelaWhatsappGUI(TelaWhatsappGUI telaWhatsappGUI) {
        this.telaWhatsappGUI = telaWhatsappGUI;
    }

    public TelaProdutoCarregGUI getTelaProdutoCarregGUI() {
        return telaProdutoCarregGUI;
    }

    public void setTelaProdutoCarregGUI(TelaProdutoCarregGUI telaProdutoCarregGUI) {
        this.telaProdutoCarregGUI = telaProdutoCarregGUI;
    }

    public TelaClassifProdCarregGUI getTelaClassifProdCarregGUI() {
        return telaClassifProdCarregGUI;
    }

    public void setTelaClassifProdCarregGUI(TelaClassifProdCarregGUI telaClassifProdCarregGUI) {
        this.telaClassifProdCarregGUI = telaClassifProdCarregGUI;
    }

    public TelaClienteUltCarreg getTelaClienteUltCarreg() {
        return telaClienteUltCarreg;
    }

    public void setTelaClienteUltCarreg(TelaClienteUltCarreg telaClienteUltCarreg) {
        this.telaClienteUltCarreg = telaClienteUltCarreg;
    }

    public DadosCarregTO getDadosCarregTO() {
        return dadosCarregTO;
    }

    public void setDadosCarregTO(DadosCarregTO dadosCarregTO) {
        this.dadosCarregTO = dadosCarregTO;
    }

    public void limpaCPF() {
        jLabelCPF.setText("___.___.___-__");
        qtde = 0;
        dadosCarregTO.setCpf("");
        textoCPF = "";
    }

    public boolean isStatusMSG() {
        return statusMSG;
    }

    public void setStatusMSG(boolean statusMSG) {
        this.statusMSG = statusMSG;
    }

    public JDialogDefault getjDialogDefault() {
        return jDialogDefault;
    }

    public String getTextoCPF() {
        return textoCPF;
    }

}
