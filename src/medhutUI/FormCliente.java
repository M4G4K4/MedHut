/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medhutUI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import medhut.Cliente;
import medhut.Admin;
import medhut.Dono;
import medhut.Repositorio;

public class FormCliente extends javax.swing.JPanel {
    
    
    public FormCliente() {
	initComponents();
	
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextNCC = new javax.swing.JTextField();
        jTextNIF = new javax.swing.JTextField();
        jTextTelemovel = new javax.swing.JTextField();
        jTextMorada = new javax.swing.JTextField();
        jTextLocalidade = new javax.swing.JTextField();
        jTextDataNascimento = new javax.swing.JTextField();
        jTextLogin = new javax.swing.JTextField();
        botaoComfirmar = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        jLabel1.setText("Registar Cliente");

        jLabel2.setText("Nome");

        jLabel3.setText("Morada");

        jLabel4.setText("Numero Cartao Cidadao");

        jLabel5.setText("NIF");

        jLabel6.setText("Telemovel");

        jLabel7.setText("Localidade");

        jLabel8.setText("Data Nascimento (DD/MM/YYYY)");

        jLabel9.setText("Username");

        jLabel10.setText("Password");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNCCActionPerformed(evt);
            }
        });

        jTextNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNIFActionPerformed(evt);
            }
        });

        jTextTelemovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelemovelActionPerformed(evt);
            }
        });

        jTextLocalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLocalidadeActionPerformed(evt);
            }
        });

        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });

        botaoComfirmar.setText("Confirmar");
        botaoComfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComfirmarActionPerformed(evt);
            }
        });

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(jTextLocalidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMorada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextTelemovel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(botaoComfirmar))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1033, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTelemovel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(botaoComfirmar)
                .addContainerGap(455, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNCCActionPerformed

    private void jTextNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNIFActionPerformed

    private void jTextTelemovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelemovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelemovelActionPerformed

    private void jTextLocalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLocalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLocalidadeActionPerformed

    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    // AO clickar Botão de confirmar
    private void botaoComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComfirmarActionPerformed
	
        Cliente cliente = new Cliente();
	
	cliente.setNome(this.jTextNome.getText());
	cliente.setnCC(this.jTextNCC.getText());
	cliente.setNIF(this.jTextNIF.getText());
	cliente.setTelefone(this.jTextTelemovel.getText());
	cliente.setMorada(this.jTextMorada.getText());
	cliente.setLocalidade(this.jTextLocalidade.getText());
	cliente.setDataNascimento(this.jTextDataNascimento.getText());
	cliente.setLogin(this.jTextLogin.getText());
	cliente.setPassword(this.jPassword.getText());
	
	int cont = 0;
	for(Cliente c : Repositorio.getInstance().getClientes()){
	    cont++;
	}
	cont = cont +1;
	cliente.setIdCliente(cont);
	
	// Verificar se login ainda não existe
	String aux = null;
	aux = this.jTextLogin.getText();
	boolean existe = false;
	
	for(Cliente c : Repositorio.getInstance().getClientes()){
	    if(c.getLogin().equals(aux) == true){
		JOptionPane.showMessageDialog(null, "Login já existente");
		existe =true;
	    }
	}
	
	for(Admin a : Repositorio.getInstance().getAdmins()){
	    if(a.getLogin().equals(aux) == true){
		JOptionPane.showMessageDialog(null, "Login já existente");
		existe =true;
	    }
	}
	
	for(Dono d: Repositorio.getInstance().getDonos()){
	    if(d.getLogin().equals(aux) == true){
		JOptionPane.showMessageDialog(null, "Login já existente");
		existe =true;
	    }
	}
	
	if(existe == false ){
	    Repositorio.getInstance().novoCliente(cliente);
	    JOptionPane.showMessageDialog(null, "Cliente criado com sucesso");
	    this.jTextNome.setText(null);
            this.jTextNCC.setText(null);
            this.jTextNIF.setText(null);
            this.jTextTelemovel.setText(null);
            this.jTextLocalidade.setText(null);
            this.jTextLogin.setText(null);
            this.jTextDataNascimento.setText(null);
            this.jTextMorada.setText(null);
            this.jPassword.setText(null);
			
	}
	
    }//GEN-LAST:event_botaoComfirmarActionPerformed

    
    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
    }//GEN-LAST:event_jPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoComfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextDataNascimento;
    private javax.swing.JTextField jTextLocalidade;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextMorada;
    private javax.swing.JTextField jTextNCC;
    private javax.swing.JTextField jTextNIF;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelemovel;
    // End of variables declaration//GEN-END:variables
}
