
package medhutUI;

import javax.swing.JOptionPane;
import medhut.Repositorio;
import medhut.Cliente;
import medhut.Dono;
import medhut.Admin;
import javax.swing.JPanel;



public class medhutMain extends javax.swing.JFrame {

    private JPanel painelVisivel;
    public medhutMain() {
        Repositorio.desserializar("repositorio.file");
	initComponents();
	this.painelVisivel = this.jPanel1;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLoginUsername = new javax.swing.JTextField();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        BotaoConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemRegistarCliente = new javax.swing.JMenuItem();
        jMenuItemRegistarDono = new javax.swing.JMenuItem();
        jMenuIemLogin = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        jLabel2.setText("Login");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medhutUI/medhut.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(582, 582, 582)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)
                                    .addComponent(jTextFieldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoConfirmar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoConfirmar)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenu3.setText("Registar");

        jMenuItemRegistarCliente.setText("Registar Cliente");
        jMenuItemRegistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemRegistarCliente);

        jMenuItemRegistarDono.setText("Registar Dono");
        jMenuItemRegistarDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistarDonoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemRegistarDono);

        jMenu1.add(jMenu3);

        jMenuIemLogin.setText("Login");
        jMenuIemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIemLoginActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuIemLogin);

        jMenuItemSave.setText("Save");
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistarClienteActionPerformed
	FormCliente cli = new FormCliente();
        this.painelVisivel.setVisible(false);
        this.painelVisivel = cli;
        this.setContentPane(this.painelVisivel);
        this.painelVisivel.setVisible(true);
	
    }//GEN-LAST:event_jMenuItemRegistarClienteActionPerformed

    private void jMenuItemRegistarDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistarDonoActionPerformed
	FormDono d = new FormDono();
	this.painelVisivel.setVisible(false);
	this.painelVisivel = d;
	this.setContentPane(this.painelVisivel);
	this.painelVisivel.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistarDonoActionPerformed

    private void jMenuIemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIemLoginActionPerformed
        this.painelVisivel.setVisible(false);
        jTextFieldLoginUsername.setText("");
        jPasswordFieldLogin.setText("");
	this.painelVisivel = jPanel1;
	this.setContentPane(this.painelVisivel);
	this.painelVisivel.setVisible(true);
		
    }//GEN-LAST:event_jMenuIemLoginActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
	Repositorio.serializar("repositorio.file");
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

    // Botao confirmar login 
    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed

        String username;
        String pass;
        int aux = 5;

        username = this.jTextFieldLoginUsername.getText();
        pass = this.jPasswordFieldLogin.getText();

        boolean existe = false;

        for(Cliente cli : Repositorio.getInstance().getClientes()){
            if(cli.getLogin().equals(username) && cli.getPassword().equals(pass) ){
                existe = true;
                ClientePanel cliPan = new ClientePanel(cli.getIdCliente());
                this.painelVisivel.setVisible(false);
                this.painelVisivel = cliPan;
                this.setContentPane(this.painelVisivel);
                this.painelVisivel.setVisible(true);
            }
        }

        // Admin , login standart
        if(username.equals("admin") && pass.equals("admin")){
            existe = true;
            AdminPanel adPan = new AdminPanel();
            this.painelVisivel.setVisible(false);
            this.painelVisivel = adPan;
            this.setContentPane(this.painelVisivel);
            this.painelVisivel.setVisible(true);
        }
	// Admin login criado pelo painel
        for(Admin ad : Repositorio.getInstance().getAdmins()){
            if(ad.getLogin().equals(username) && ad.getPassword().equals(pass) ){
                existe = true;
                AdminPanel adPan = new AdminPanel();
                this.painelVisivel.setVisible(false);
                this.painelVisivel = adPan;
                this.setContentPane(this.painelVisivel);
                this.painelVisivel.setVisible(true);
            }
        }

        for(Dono dono : Repositorio.getInstance().getDonos()){
            if(dono.getLogin().equals(username) && dono.getPassword().equals(pass) ){
                existe = true;
                DonoPanel doPan = new DonoPanel(dono.getIdDono());
                this.painelVisivel.setVisible(false);
                this.painelVisivel = doPan;
                this.setContentPane(this.painelVisivel);
                this.painelVisivel.setVisible(true);
            }
        }

        if(existe == false){
            JOptionPane.showMessageDialog(null, "Username ou Password errados!!");
        }

    }//GEN-LAST:event_BotaoConfirmarActionPerformed

    
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
	    java.util.logging.Logger.getLogger(medhutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(medhutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(medhutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(medhutMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new medhutMain().setVisible(true);
	    }
	});
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIemLogin;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemRegistarCliente;
    private javax.swing.JMenuItem jMenuItemRegistarDono;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JTextField jTextFieldLoginUsername;
    // End of variables declaration//GEN-END:variables
}
