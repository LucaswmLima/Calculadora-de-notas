
package br.unisal.aula.view;

import br.unisal.aula.exceptions.NotaCampoInvalidoException;
import br.unisal.aula.exceptions.NotaNumeroInvalidoException;
import br.unisal.aula.model.Pessoa;
import br.unisal.aula.utils.Mensagem;
import br.unisal.aula.utils.MédiaGeométrica;
import br.unisal.aula.utils.MédiaPonderada;
import br.unisal.aula.utils.PessoaHelper;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class PrincipalFrame extends javax.swing.JFrame {

    private static final String TEXTO_VAZIO = "";
    private Pessoa pessoa = null;
    
    public PrincipalFrame() {
        initComponents();
        
        pessoa = new Pessoa(0,0,0,0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        prova1TextField = new javax.swing.JTextField();
        pesoprova1TextField = new javax.swing.JTextField();
        prova2TextField = new javax.swing.JTextField();
        pesoprova2TextField = new javax.swing.JTextField();
        prova1Label = new javax.swing.JLabel();
        entradasLabel = new javax.swing.JLabel();
        pesoprova2Label = new javax.swing.JLabel();
        prova2Label = new javax.swing.JLabel();
        pesoprova1Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelEntradas = new javax.swing.JPanel();
        TituloLabel = new javax.swing.JLabel();
        jPanelTitulo1 = new javax.swing.JPanel();
        mediaponderadaTextField = new javax.swing.JTextField();
        mediageometricaTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        limparButton = new javax.swing.JButton();
        calcularButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Notas");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        pesoprova2TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesoprova2TextFieldKeyPressed(evt);
            }
        });

        prova1Label.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        prova1Label.setText("Prova 1");

        entradasLabel.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        entradasLabel.setText("Entradas");

        pesoprova2Label.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        pesoprova2Label.setText("Peso 2");

        prova2Label.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        prova2Label.setText("Prova 2");

        pesoprova1Label.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        pesoprova1Label.setText("Peso 1");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                                .addComponent(prova1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prova1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                                .addComponent(pesoprova1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesoprova1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                                .addComponent(prova2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prova2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                                .addComponent(pesoprova2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(pesoprova2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(entradasLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addComponent(entradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prova1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prova1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoprova1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoprova1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prova2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prova2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoprova2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoprova2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanelEntradas.setBackground(new java.awt.Color(140, 195, 179));
        jPanelEntradas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jPanelEntradas.setForeground(new java.awt.Color(145, 215, 193));

        TituloLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TituloLabel.setText("Calculadora De Notas");

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelTitulo1.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTitulo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jPanelTitulo1.setForeground(new java.awt.Color(0, 153, 153));

        mediaponderadaTextField.setEditable(false);

        mediageometricaTextField.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel7.setText("Média Geométrica");

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel8.setText("Média Ponderada");

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel10.setText("Saidas");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelTitulo1Layout = new javax.swing.GroupLayout(jPanelTitulo1);
        jPanelTitulo1.setLayout(jPanelTitulo1Layout);
        jPanelTitulo1Layout.setHorizontalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanelTitulo1Layout.createSequentialGroup()
                        .addGroup(jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(mediageometricaTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                                .addGap(0, 71, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mediaponderadaTextField))
                        .addContainerGap())))
        );
        jPanelTitulo1Layout.setVerticalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediageometricaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediaponderadaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        limparButton.setBackground(new java.awt.Color(255, 102, 102));
        limparButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        calcularButton.setBackground(new java.awt.Color(64, 153, 35));
        calcularButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(calcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparTexto(JTextField textField) {
        textField.setText(TEXTO_VAZIO);
    }
    
    private void limparTela() {
        limparTexto(prova1TextField);
        limparTexto(prova2TextField);
        limparTexto(pesoprova1TextField);
        limparTexto(pesoprova2TextField);
        
    }
   
    
    private void limparPessoa() {
        pessoa.setProva1(0);
        pessoa.setProva2(0);
        pessoa.setPesoprova1(0);
        pessoa.setPesoprova2(0);
    }

     private void calculaTudo() {
        
        
        String prova1Str = prova1TextField.getText();
        String pesoprova1Str = pesoprova1TextField.getText();
        String prova2Str = prova2TextField.getText();
        String pesoprova2Str = pesoprova2TextField.getText();

        try {
            Pessoa pessoa = PessoaHelper.criarPessoa(prova1Str, pesoprova1Str, prova2Str, pesoprova2Str);

            String resultado1 = MédiaGeométrica.getResultadoFormatado(pessoa);
            mediageometricaTextField.setText(resultado1);
            String resultado2 = MédiaPonderada.getResultadoFormatado(pessoa);
            mediaponderadaTextField.setText(resultado2);

        } catch (NotaCampoInvalidoException | NotaNumeroInvalidoException ex) {
            Mensagem.erro(ex.getMessage());
        }
    }      
    
    
    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        calculaTudo();
    }//GEN-LAST:event_calcularButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparTela();
        limparPessoa();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void pesoprova2TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoprova2TextFieldKeyPressed
        
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularButton.doClick();
        }
        
    }//GEN-LAST:event_pesoprova2TextFieldKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
       
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton calcularButton;
    private javax.swing.JLabel entradasLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField mediageometricaTextField;
    private javax.swing.JTextField mediaponderadaTextField;
    private javax.swing.JLabel pesoprova1Label;
    private javax.swing.JTextField pesoprova1TextField;
    private javax.swing.JLabel pesoprova2Label;
    private javax.swing.JTextField pesoprova2TextField;
    private javax.swing.JLabel prova1Label;
    private javax.swing.JTextField prova1TextField;
    private javax.swing.JLabel prova2Label;
    private javax.swing.JTextField prova2TextField;
    // End of variables declaration//GEN-END:variables
}
