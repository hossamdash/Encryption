import EncryptionAlgorithms.CaesarCipher;
import EncryptionAlgorithms.GFG;
import EncryptionAlgorithms.PlayFair;
import EncryptionAlgorithms.XOREncryption;

import javax.swing.*;

public class NewJFrame extends javax.swing.JFrame
{

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> algoBox;
    private javax.swing.JTextArea cipheredText;
    private javax.swing.JButton decButton;
    private javax.swing.JButton encButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField keyText;
    private JTextArea plainText;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame()
    {
        initComponents();
        plainText.setLineWrap(true);
        cipheredText.setLineWrap(true);
        setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        algoBox = new javax.swing.JComboBox<>();
        keyText = new javax.swing.JTextField();
        plainText = new javax.swing.JTextArea();
        cipheredText = new javax.swing.JTextArea();
        encButton = new javax.swing.JButton();
        decButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("APP"); // NOI18N

        jLabel1.setText("Select Encryption Algorithm");

        jLabel2.setText("Key");

        algoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Caesar Cipher", "Xor Cipher", "Null Cipher", "PlayFair Cipher"}));
        algoBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                algoBoxActionPerformed(evt);
            }
        });

        encButton.setText("Encrypt-->");
        encButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                encButtonActionPerformed(evt);
            }
        });

        decButton.setText("<--Decrypt");
        decButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(plainText)
                                        .addComponent(algoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cipheredText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(75, 75, 75))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(encButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decButton)
                                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(algoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(plainText, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(cipheredText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(encButton)
                                        .addComponent(decButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void algoBoxActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_algoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_algoBoxActionPerformed

    private void encButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_encButtonActionPerformed
        switch (algoBox.getSelectedIndex())
        {
            case 0:
                cipheredText.setText(CaesarCipher.encrypt(plainText.getText(),Integer.parseInt(keyText.getText())));
                break;
            case 1:
                cipheredText.setText(XOREncryption.encryptDecrypt(plainText.getText(),keyText.getText()));
                break;
            case 2:
                cipheredText.setText(GFG.decode(plainText.getText()));
                break;
            case 3:
                cipheredText.setText(PlayFair.encrypt(plainText.getText(), keyText.getText() ) );
                break;
        }
    }//GEN-LAST:event_encButtonActionPerformed

    private void decButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_encButtonActionPerformed
        switch (algoBox.getSelectedIndex())
        {
            case 0:
                plainText.setText(CaesarCipher.encrypt(cipheredText.getText(),-1 * Integer.parseInt(keyText.getText())));
                break;
            case 1:
                plainText.setText(XOREncryption.encryptDecrypt(cipheredText.getText(),keyText.getText()));
                break;
            case 2:
                plainText.setText("this can not be decrypted !!!");
                break;
            case 3:
                plainText.setText(PlayFair.decrypt(cipheredText.getText(), keyText.getText()  ) );
                break;
        }

    }//GEN-LAST:event_encButtonActionPerformed
    // End of variables declaration//GEN-END:variables
}
