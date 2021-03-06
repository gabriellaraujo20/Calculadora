/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.views;

import Calculo.Divisao;
import Calculo.Multiplicacao;
import Calculo.Porcentagem;
import Calculo.Soma;
import Calculo.Subtracao;

/**
 *
 * @author lucio
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValUm = new javax.swing.JTextField();
        txtValDois = new javax.swing.JTextField();
        lblResposta = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSubitracao = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnMultplica = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        lblResposta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Calculadora");

        txtValUm.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        txtValDois.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtValDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValDoisActionPerformed(evt);
            }
        });

        lblResposta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblResposta.setForeground(new java.awt.Color(102, 102, 102));
        lblResposta.setText("00");

        lblOperador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblOperador.setForeground(new java.awt.Color(102, 102, 102));
        lblOperador.setText("+");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operadores"));

        btnSubitracao.setBackground(new java.awt.Color(0, 204, 204));
        btnSubitracao.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnSubitracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubitracao.setText("-");
        btnSubitracao.setBorder(null);
        btnSubitracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubitracaoActionPerformed(evt);
            }
        });

        btnAdicao.setBackground(new java.awt.Color(0, 204, 204));
        btnAdicao.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnAdicao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicao.setText("+");
        btnAdicao.setBorder(null);
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnMultplica.setBackground(new java.awt.Color(0, 204, 204));
        btnMultplica.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMultplica.setForeground(new java.awt.Color(255, 255, 255));
        btnMultplica.setText("X");
        btnMultplica.setBorder(null);
        btnMultplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultplicaActionPerformed(evt);
            }
        });

        btnPorcentagem.setBackground(new java.awt.Color(0, 204, 204));
        btnPorcentagem.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcentagem.setText("%");
        btnPorcentagem.setBorder(null);
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(0, 204, 204));
        btnDivisao.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("/");
        btnDivisao.setBorder(null);
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnSubitracao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMultplica, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(440, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSubitracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultplica, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblResposta2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblResposta2.setForeground(new java.awt.Color(102, 102, 102));
        lblResposta2.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtValUm, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValDois, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblResposta2)
                        .addGap(31, 31, 31)
                        .addComponent(lblResposta))
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblResposta)
                    .addComponent(lblResposta2)
                    .addComponent(txtValDois, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperador)
                    .addComponent(txtValUm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValDoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValDoisActionPerformed

    private void btnSubitracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubitracaoActionPerformed
        // TODO add your handling code here:
        Subtracao subtracao = new Subtracao();
        lblResposta.setText(String.valueOf(subtracao.subtracao(Double.valueOf(txtValUm.getText()), Double.valueOf(txtValDois.getText()))));
        lblOperador.setText("-");
    }//GEN-LAST:event_btnSubitracaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        // TODO add your handling code here:
        Soma somar = new Soma();
        lblResposta.setText(String.valueOf(somar.somar(Double.valueOf(txtValUm.getText()), Double.valueOf(txtValDois.getText()))));
        lblOperador.setText("+");
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnMultplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultplicaActionPerformed
        // TODO add your handling code here:
        Multiplicacao multiplicar = new Multiplicacao();
        lblResposta.setText(String.valueOf(multiplicar.multiplicar(Double.valueOf(txtValUm.getText()), Double.valueOf(txtValDois.getText()))));
        lblOperador.setText("x");
    }//GEN-LAST:event_btnMultplicaActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        // TODO add your handling code here:
        Porcentagem porcentagem = new Porcentagem();
        lblResposta.setText(String.valueOf(porcentagem.porcentagem(Double.valueOf(txtValUm.getText()), Double.valueOf(txtValDois.getText()))));
        lblOperador.setText("%");
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        // TODO add your handling code here:
        Divisao divisao = new Divisao();
        lblResposta.setText(String.valueOf(divisao.divide(Double.valueOf(txtValUm.getText()), Double.valueOf(txtValDois.getText()))));
        lblOperador.setText("/");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultplica;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnSubitracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblResposta2;
    private javax.swing.JTextField txtValDois;
    private javax.swing.JTextField txtValUm;
    // End of variables declaration//GEN-END:variables
}
