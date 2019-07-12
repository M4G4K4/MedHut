
package medhutUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medhut.Cliente;
import medhut.Especialidade;
import medhut.Consultorio;
import medhut.Dono;
import medhut.Repositorio;
import medhut.Admin;


public class AdminPanel extends javax.swing.JPanel {
    

    private List <Cliente> clientesValesCombobox;
    
    public AdminPanel() {
	initComponents();
        
        
	// Tabela Clientes 
	DefaultTableModel tmCliente = (DefaultTableModel)this.jTableClientes.getModel();
	
	for(Cliente cli : Repositorio.getInstance().getClientes()){
	    tmCliente.addRow(new Object[]{
		cli.getIdCliente(),
		cli.getLogin(),
		cli.getPassword(),
		cli.getNome(),
		cli.getnCC(),
		cli.getNIF(),
		cli.getTelefone(),
		cli.getMorada(),
		cli.getLocalidade(),
		cli.getDataNascimento(),
	    });
	}
	
	// Tabela Donos
	DefaultTableModel tmDonos = (DefaultTableModel)this.jTableDonos.getModel();
	
	for(Dono d: Repositorio.getInstance().getDonos()){
	    tmDonos.addRow(new Object[]{
		d.getIdDono(),
		d.getLogin(),
		d.getPassword(),
		d.getNome(),
		d.getnCC(),
		d.getNIF(),
		d.getTelefone(),
		d.getMorada(),
		d.getLocalidade(),
		d.getDataNascimento(),
	    });
	}
	
	
	//Tabela Consultorio
	DefaultTableModel tmConsultorio = (DefaultTableModel)this.jTableConsultiorios.getModel();
	for(Consultorio co: Repositorio.getInstance().getConsultorios()){
	    tmConsultorio.addRow(new Object []{
	    co.getIdConsultorio(),
	    co.getIdDono(),
	    co.getNome(),
	    co.getMorada(),
	    co.getLocalidade(),
	    co.getEspecialidade()
	    });
	}
        
        //Tabela Especialidades
        DefaultTableModel tmEspecialidades = (DefaultTableModel)this.jTableEspecialidades.getModel();
	for(Especialidade esp: Repositorio.getInstance().getEspecialidade()){
	    tmEspecialidades.addRow(new Object []{
	    esp.getEspecialidade()
	    });
	}
        
        //Preencher comboBox Clientes Vales
        this.clientesValesCombobox = new ArrayList<>();
	for(Cliente clt : Repositorio.getInstance().getClientes()){
            if (clt.getPontosAtuais() >= 1000){
                this.clientesValesCombobox.add(clt);
                this.jComboBoxVales.addItem("" + clt.getIdCliente());
            }
        }
	
	// Preencher tabela admins 
	DefaultTableModel tmAdmins = (DefaultTableModel)this.jTableAdmins.getModel();
	for(Admin a : Repositorio.getInstance().getAdmins()){
	    tmAdmins.addRow(new Object []{
		a.getIdAdmin(),
		a.getLogin(),
		a.getPassword()
	    });
	}
	
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDonos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableConsultiorios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCriarEspecialidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();
        jTextRemoveEspecialidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextAlteraEspecialidade = new javax.swing.JTextField();
        jTextEspecialidadeAlterada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BotaoComfirmarAlteracaoEspecialidade = new javax.swing.JButton();
        BotaoCriarEspecialidade = new javax.swing.JButton();
        BotaoRemoverEspecialidade = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextCriarAdminUsername = new javax.swing.JTextField();
        jTextCriarAdminPassword = new javax.swing.JTextField();
        BotaoCriarAdmin = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxVales = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAdmins = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEliminarAdmin = new javax.swing.JTextField();
        jToggleButtonEliminarAdmin = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Cliente", "Login", "Password", "Nome","nCC","NIF","Telemovel","Morada","Localidade","Data Nascimento"
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        jTableDonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Dono","Login","Password","Nome","nCC","NIF","Telefone","Morada","Localidade","Data Nascimento"
            }
        ));
        jScrollPane3.setViewportView(jTableDonos);

        jTableConsultiorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Consultorio", "ID Dono", "Nome", "Morada","Localidade","Especialidade"
            }
        ));
        jScrollPane4.setViewportView(jTableConsultiorios);

        jLabel1.setText("Donos");

        jLabel2.setText("Clientes");

        jLabel3.setText("Consultorios");

        jLabel5.setText("Painel de Administração");

        jLabel4.setText("Controlar Especialidades");

        jLabel6.setText("Criar especialidade");

        jTextCriarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCriarEspecialidadeActionPerformed(evt);
            }
        });

        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nome Especialidade"
            }
        ));
        jScrollPane1.setViewportView(jTableEspecialidades);

        jTextRemoveEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRemoveEspecialidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Remove especialidade");

        jLabel8.setText("Especialidade a alterar");

        jTextAlteraEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlteraEspecialidadeActionPerformed(evt);
            }
        });

        jTextEspecialidadeAlterada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEspecialidadeAlteradaActionPerformed(evt);
            }
        });

        jLabel9.setText("Alteração");

        BotaoComfirmarAlteracaoEspecialidade.setText("Confirmar");
        BotaoComfirmarAlteracaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoComfirmarAlteracaoEspecialidadeActionPerformed(evt);
            }
        });

        BotaoCriarEspecialidade.setText("Confirmar");
        BotaoCriarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCriarEspecialidadeActionPerformed(evt);
            }
        });

        BotaoRemoverEspecialidade.setText("Confirmar");
        BotaoRemoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverEspecialidadeActionPerformed(evt);
            }
        });

        jLabel10.setText("Criar Admin");

        jLabel11.setText("Username");

        jLabel12.setText("Password");

        BotaoCriarAdmin.setText("Confirmar");
        BotaoCriarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCriarAdminActionPerformed(evt);
            }
        });

        jLabel13.setText("Atribuir vales");

        jComboBoxVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValesActionPerformed(evt);
            }
        });

        jButton1.setText("Atribuir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("ID Cliente");

        jTableAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID","Username","Password"
            }
        ));
        jScrollPane5.setViewportView(jTableAdmins);

        jLabel15.setText("Eliminar Admin");

        jToggleButtonEliminarAdmin.setText("Eliminar");
        jToggleButtonEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEliminarAdminActionPerformed(evt);
            }
        });

        jLabel16.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextCriarAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextCriarAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BotaoCriarAdmin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonEliminarAdmin))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(361, 361, 361)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCriarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoCriarEspecialidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 41, Short.MAX_VALUE)
                                .addComponent(jTextRemoveEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoRemoverEspecialidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAlteraEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextEspecialidadeAlterada, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoComfirmarAlteracaoEspecialidade))))))
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxVales, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextCriarAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextCriarAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoCriarAdmin)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonEliminarAdmin)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCriarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoCriarEspecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRemoveEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(BotaoRemoverEspecialidade))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextAlteraEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEspecialidadeAlterada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoComfirmarAlteracaoEspecialidade)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxVales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

 
    private void jTextCriarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCriarEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCriarEspecialidadeActionPerformed

    private void jTextAlteraEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlteraEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlteraEspecialidadeActionPerformed

    private void jTextEspecialidadeAlteradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEspecialidadeAlteradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEspecialidadeAlteradaActionPerformed

    
    // Editar Especialidade
    private void BotaoComfirmarAlteracaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoComfirmarAlteracaoEspecialidadeActionPerformed
	// se encontrar especialidade atribuimos outro valor 
        boolean existe = false;
	for(Especialidade e: Repositorio.getInstance().getEspecialidade()){
	    if(e.getEspecialidade().equals(this.jTextAlteraEspecialidade.getText())){
		e.setEspecialidade(this.jTextEspecialidadeAlterada.getText());
                existe = true;
	    }
	}
        if (existe == false){
            JOptionPane.showMessageDialog(null, "Especialidade não encontrada.");
        }
	// Fazer update a tabela de especialidades depois de fazer update 
	DefaultTableModel tmEspecialidades = (DefaultTableModel)this.jTableEspecialidades.getModel();
	tmEspecialidades.setRowCount(0);
	for(Especialidade esp: Repositorio.getInstance().getEspecialidade()){
	    tmEspecialidades.addRow(new Object []{
	    esp.getEspecialidade()
	    });
	}
        this.jTextAlteraEspecialidade.setText("");
        this.jTextEspecialidadeAlterada.setText("");
	
    }//GEN-LAST:event_BotaoComfirmarAlteracaoEspecialidadeActionPerformed

    
    // Criar Especialidade
    private void BotaoCriarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCriarEspecialidadeActionPerformed
        Especialidade esp = new Especialidade();
	
	esp.setEspecialidade(this.jTextCriarEspecialidade.getText());
	Repositorio.getInstance().novoEspecialidade(esp);
	
	// Atualizar a tabela de especialidades
	DefaultTableModel tmEspecialidades = (DefaultTableModel)this.jTableEspecialidades.getModel();
	tmEspecialidades.setRowCount(0);
	for(Especialidade asd: Repositorio.getInstance().getEspecialidade()){
		tmEspecialidades.addRow(new Object []{
		    asd.getEspecialidade()
		});
	}
        this.jTextCriarEspecialidade.setText(null);
	
    }//GEN-LAST:event_BotaoCriarEspecialidadeActionPerformed

    // Remove Especialidade 
    private void BotaoRemoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverEspecialidadeActionPerformed
	
	
        boolean existe = false;
        
        for(Consultorio co: Repositorio.getInstance().getConsultorios()){
                if(co.getEspecialidade().equals(this.jTextRemoveEspecialidade.getText())){
                    existe = true;
                }   
        }
	
        if (existe == false) {
	    Especialidade e = new Especialidade();
            for(Especialidade es: Repositorio.getInstance().getEspecialidade()){
                if(es.getEspecialidade().equals(this.jTextRemoveEspecialidade.getText())){
		    e = es;

		}
            }
	    Repositorio.getInstance().removeEspecialidade(e);
	    
            DefaultTableModel tmEspecialidades = (DefaultTableModel)this.jTableEspecialidades.getModel();
            tmEspecialidades.setRowCount(0);
            for(Especialidade esp: Repositorio.getInstance().getEspecialidade()){
                tmEspecialidades.addRow(new Object []{
                    esp.getEspecialidade()
                });
            }
	    this.jTextRemoveEspecialidade.setText(null);
        }
	else {
            JOptionPane.showMessageDialog(null, "Especialidade em consultórios, não é permitido apagar.");
        }
	
    }//GEN-LAST:event_BotaoRemoverEspecialidadeActionPerformed

    
    // Criar Admin
    private void BotaoCriarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCriarAdminActionPerformed
        boolean existe = false;
	
	Admin ad = new Admin();
	
	int cont = 0;
	for(Admin a: Repositorio.getInstance().getAdmins()){
	    cont ++;
	}
	cont = cont +1 ;
	
	ad.setLogin(this.jTextCriarAdminUsername.getText());
	ad.setPassword(this.jTextCriarAdminPassword.getText());
	ad.setIdAdmin(cont);
	
	for(Admin a: Repositorio.getInstance().getAdmins()){
	    if(a.getLogin().equals(this.jTextCriarAdminUsername.getText())){
		JOptionPane.showMessageDialog(null, "Login já existente");
		existe = true;
	    }
	}
	
	if(existe == false){
	    Repositorio.getInstance().novoAdmin(ad);
	    JOptionPane.showMessageDialog(null, "Admin criado com sucesso");
	    this.jTextCriarAdminUsername.setText(null);
	    this.jTextCriarAdminPassword.setText(null);
	}
	
	// Update table admins 
	DefaultTableModel tmAdmins = (DefaultTableModel)this.jTableAdmins.getModel();
	tmAdmins.setRowCount(0);
	for(Admin a : Repositorio.getInstance().getAdmins()){
	    tmAdmins.addRow(new Object []{
		a.getIdAdmin(),
		a.getLogin(),
		a.getPassword()
	    });
	}
	
    }//GEN-LAST:event_BotaoCriarAdminActionPerformed

    //Combobox lista de clientes para atribuição de vale
    private void jComboBoxValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValesActionPerformed

    }//GEN-LAST:event_jComboBoxValesActionPerformed

    //Botão atribuir vale
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int teste = Integer.parseInt((String)jComboBoxVales.getSelectedItem());
        
        for(Cliente clt : Repositorio.getInstance().getClientes()){
            if(clt.getIdCliente() == teste){
                clt.setVales(clt.getVales() + 1) ;
                clt.setPontosAtuais(clt.getPontosAtuais() - 1000);
                clt.setPontosUtilizados(clt.getPontosUtilizados() + 1000);
                
                JOptionPane.showMessageDialog(null, "Vale atribuido ao cliente selecionado.");
            }
        }
        jComboBoxVales.removeAllItems();
        this.clientesValesCombobox = new ArrayList<>();
	for(Cliente clt : Repositorio.getInstance().getClientes()){
            if (clt.getPontosAtuais() >= 1000){
                this.clientesValesCombobox.add(clt);
                this.jComboBoxVales.addItem("" + clt.getIdCliente());
            }
        }
	
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextRemoveEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRemoveEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRemoveEspecialidadeActionPerformed

    private void jToggleButtonEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEliminarAdminActionPerformed
        // TODO add your handling code here:
	boolean existe = false;
	
	for(Admin a : Repositorio.getInstance().getAdmins()){
	    if(a.getLogin().equals(this.jTextFieldEliminarAdmin.getText())){
		Repositorio.getInstance().removeAdmin(a);
		existe = true;
	    }
	}
	
	if(existe == true){
	    JOptionPane.showMessageDialog(null, "Admin removido com sucesso");
	    this.jTextFieldEliminarAdmin.setText(null);
	}else{
	    JOptionPane.showMessageDialog(null, "Nenhum admin encontrado");
	}
	
	// Update table admins 
	DefaultTableModel tmAdmins = (DefaultTableModel)this.jTableAdmins.getModel();
	tmAdmins.setRowCount(0);
	for(Admin a : Repositorio.getInstance().getAdmins()){
	    tmAdmins.addRow(new Object []{
		a.getIdAdmin(),
		a.getLogin(),
		a.getPassword()
	    });
	}
	
    }//GEN-LAST:event_jToggleButtonEliminarAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoComfirmarAlteracaoEspecialidade;
    private javax.swing.JButton BotaoCriarAdmin;
    private javax.swing.JButton BotaoCriarEspecialidade;
    private javax.swing.JButton BotaoRemoverEspecialidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxVales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableAdmins;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableConsultiorios;
    private javax.swing.JTable jTableDonos;
    private javax.swing.JTable jTableEspecialidades;
    private javax.swing.JTextField jTextAlteraEspecialidade;
    private javax.swing.JTextField jTextCriarAdminPassword;
    private javax.swing.JTextField jTextCriarAdminUsername;
    private javax.swing.JTextField jTextCriarEspecialidade;
    private javax.swing.JTextField jTextEspecialidadeAlterada;
    private javax.swing.JTextField jTextFieldEliminarAdmin;
    private javax.swing.JTextField jTextRemoveEspecialidade;
    private javax.swing.JToggleButton jToggleButtonEliminarAdmin;
    // End of variables declaration//GEN-END:variables
}
