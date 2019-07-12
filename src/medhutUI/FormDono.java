package medhutUI;

import javax.swing.JOptionPane;
import medhut.Dono;
import medhut.Cliente;
import medhut.Admin;
import medhut.Repositorio;


public class FormDono extends javax.swing.JPanel {

    public FormDono() {
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
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextUsername = new javax.swing.JTextField();
        jTextDataNascimento = new javax.swing.JTextField();
        jTextLocalidade = new javax.swing.JTextField();
        jTextMorada = new javax.swing.JTextField();
        jTextTelemovel = new javax.swing.JTextField();
        jTextNCC = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        BotaoConfirmar = new javax.swing.JButton();
        jTextNIF = new javax.swing.JTextField();

        jLabel1.setText("Registar Dono");

        jLabel2.setText("Nome");

        jLabel3.setText("Numero Cartao Cidadao");

        jLabel4.setText("Telemovel");

        jLabel5.setText("Morada");

        jLabel6.setText("Localidade");

        jLabel7.setText("Data Nascimentos (DD/MM/YYYY)");

        jLabel8.setText("NIF");

        jLabel9.setText("Username");

        jLabel10.setText("Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });

        jTextDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataNascimentoActionPerformed(evt);
            }
        });

        jTextMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMoradaActionPerformed(evt);
            }
        });

        jTextTelemovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelemovelActionPerformed(evt);
            }
        });

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        jTextNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNIFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BotaoConfirmar)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextTelemovel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextNCC)
                                .addComponent(jTextNome)
                                .addComponent(jTextDataNascimento)))))
                .addGap(102, 920, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jTextTelemovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BotaoConfirmar)
                .addContainerGap(408, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextTelemovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelemovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelemovelActionPerformed

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jTextDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataNascimentoActionPerformed

    private void jTextMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMoradaActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    
    // Ao clickar no botao confirmar
    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed
	boolean existe = false;
	Dono dono = new Dono();
	
	dono.setNome(this.jTextNome.getText());
	dono.setnCC(this.jTextNCC.getText());
	dono.setNIF(this.jTextNIF.getText());
	dono.setTelefone(this.jTextTelemovel.getText());
	dono.setMorada(this.jTextMorada.getText());
	dono.setLocalidade(this.jTextLocalidade.getText());
	dono.setDataNascimento(this.jTextDataNascimento.getText());
	dono.setLogin(this.jTextUsername.getText());
	dono.setPassword(this.jPasswordField1.getText());
	
	int cont = 0;
	for(Dono d : Repositorio.getInstance().getDonos()){
	    cont ++;
	}
	cont = cont +1 ;
	dono.setIdDono(cont);
	
	// verificar se já existe login
	String aux = null;
	aux = this.jTextUsername.getText();
	
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
	    Repositorio.getInstance().novoDono(dono);
	    JOptionPane.showMessageDialog(null, "Dono criado com sucesso");
	    this.jTextDataNascimento.setText(null);
            this.jPasswordField1.setText(null);
            this.jTextLocalidade.setText(null);
            this.jTextMorada.setText(null);
            this.jTextNCC.setText(null);
            this.jTextNIF.setText(null);
            this.jTextNome.setText(null);
            this.jTextTelemovel.setText(null);
            this.jTextUsername.setText(null);
	}
	
    }//GEN-LAST:event_BotaoConfirmarActionPerformed

    
    private void jTextNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNIFActionPerformed
    }//GEN-LAST:event_jTextNIFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmar;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextDataNascimento;
    private javax.swing.JTextField jTextLocalidade;
    private javax.swing.JTextField jTextMorada;
    private javax.swing.JTextField jTextNCC;
    private javax.swing.JTextField jTextNIF;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelemovel;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
