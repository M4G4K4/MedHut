package medhutUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import medhut.Consultorio;
import medhut.Cliente;
import medhut.Consulta;
import medhut.Repositorio;
import medhut.Especialidade;
import medhut.EstadoConsulta;


public class DonoPanel extends javax.swing.JPanel {
    
    private List<Especialidade> especialidadeComboBox;
    private List<Consultorio> consultorioComboBox;
    private List<Especialidade> especialidadeComboBox2;
    private List<Consultorio> consultorioComboBox2;
    private List<Consulta> consultaComboBox; 

    public DonoPanel(int idDono) {
	initComponents();
	
	this.jTextFieldIDdono.setText("" + idDono);
	this.jTextFieldValorItems.setText(""+0);
	
	// Preenche a combbox com as especialidades existentes Registar
	this.especialidadeComboBox = new ArrayList<>();
	for(Especialidade es: Repositorio.getInstance().getEspecialidade()){
	    this.especialidadeComboBox.add(es);
	    this.jComboBoxRegistaEsp.addItem(es.getEspecialidade());
	}
	
	// Preenche a combbox com os consultorios existentes
	this.consultorioComboBox = new ArrayList<>();
	for(Consultorio c : Repositorio.getInstance().getConsultorios()){
            if (c.getIdDono() == idDono){
                this.consultorioComboBox.add(c);
                this.jComboBoxSelecionarConsultorio.addItem(c.getNome());
            }
        }
	
	// Preenche a combbox com as especialidades existentes Editar
	this.especialidadeComboBox2 = new ArrayList<>();
	for(Especialidade es: Repositorio.getInstance().getEspecialidade()){
	    this.especialidadeComboBox2.add(es);
	    this.jComboBoxEditarEspecialidade.addItem(es.getEspecialidade());
	}
	
	// Preenche a combBox com Consultorio Existentes 
	this.consultorioComboBox2 = new ArrayList<>();
	for(Consultorio co : Repositorio.getInstance().getConsultorios()){
            if (co.getIdDono() == idDono){
                this.consultorioComboBox2.add(co);
                this.jComboBoxListarConsultas.addItem(co.getNome());
            }
	}
        
        // Preenche  a tabela com os consultorios 
        DefaultTableModel tm2 = (DefaultTableModel)this.jTableConsultorios.getModel();
        for(Consultorio cons : Repositorio.getInstance().getConsultorios()){
               if(cons.getIdDono() == idDono){
                tm2.addRow(new Object[]{
                    cons.getIdConsultorio(),
                    cons.getNome(),
                    cons.getMorada(),
                    cons.getLocalidade(),
		    cons.getEspecialidade(),
                   });
               }
        }
        
	
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxRegistaEsp = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextNomeRegistar = new javax.swing.JTextField();
        jTextMoradaRegistar = new javax.swing.JTextField();
        jTextLocalidadeRegistar = new javax.swing.JTextField();
        jButtonRegistar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextNomeEditar = new javax.swing.JTextField();
        jTextFieldMoradaEditar = new javax.swing.JTextField();
        jTextFieldLodalidadeEditar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxSelecionarConsultorio = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxEditarEspecialidade = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultas = new javax.swing.JTable();
        jComboBoxListarConsultas = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CombboxSelecionarConsultaConfirmarAnular = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldIDdono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultorios = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldValorItems = new javax.swing.JTextField();
        jTextFieldItems = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        jLabel1.setText("Painel Dono");

        jLabel2.setText("Regista Consultorio");

        jLabel3.setText("Nome");

        jLabel4.setText("Morada");

        jLabel5.setText("Localidade");

        jComboBoxRegistaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistaEspActionPerformed(evt);
            }
        });

        jLabel6.setText("Especialidade");

        jTextNomeRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeRegistarActionPerformed(evt);
            }
        });

        jTextMoradaRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMoradaRegistarActionPerformed(evt);
            }
        });

        jButtonRegistar.setText("Confirmar");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });

        jLabel7.setText("Editar Consultorio");

        jTextFieldMoradaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoradaEditarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome");

        jLabel9.setText("Morada");

        jLabel10.setText("Localidade");

        jButtonEditar.setText("Confirmar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabel11.setText("Selecionar consultorio");

        jComboBoxSelecionarConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarConsultorioActionPerformed(evt);
            }
        });

        jLabel12.setText("Especialidade");

        jComboBoxEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEditarEspecialidadeActionPerformed(evt);
            }
        });

        jTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Consulta","Data","Hora","Estado","ID Cliente","Valor","Valor Itens","Itens"
            }
        ));
        jScrollPane1.setViewportView(jTableConsultas);

        jComboBoxListarConsultas.setToolTipText("");
        jComboBoxListarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListarConsultasActionPerformed(evt);
            }
        });

        jLabel13.setText("Listar consultas");

        jLabel14.setText("Consultorio");

        jLabel15.setText("Alterar estado da consulta");

        CombboxSelecionarConsultaConfirmarAnular.setToolTipText("");
        CombboxSelecionarConsultaConfirmarAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombboxSelecionarConsultaConfirmarAnularActionPerformed(evt);
            }
        });

        jLabel16.setText("Selecionar Consulta");

        jLabel17.setText("ID dono");

        jTextFieldIDdono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDdonoActionPerformed(evt);
            }
        });

        jTableConsultorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID","Nome","Morada","Localidade","Especialidade"
            }
        ));
        jScrollPane2.setViewportView(jTableConsultorios);

        jLabel18.setText("Consultar Consultorios");

        jLabel19.setText("Items");

        jLabel20.setText("Valor Items");

        jToggleButton1.setText("Confirmar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Anular");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(CombboxSelecionarConsultaConfirmarAnular, 0, 121, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldItems)
                                                    .addComponent(jTextFieldValorItems)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jToggleButton1)
                                                .addGap(38, 38, 38)
                                                .addComponent(jToggleButton2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxSelecionarConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldMoradaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldLodalidadeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButtonEditar)
                                                .addComponent(jComboBoxEditarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxListarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNomeRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextMoradaRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextLocalidadeRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxRegistaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButtonRegistar, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIDdono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldIDdono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextNomeRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBoxSelecionarConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMoradaRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addComponent(jTextNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextLocalidadeRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldMoradaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxRegistaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldLodalidadeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonRegistar)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEditarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEditar)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jComboBoxListarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CombboxSelecionarConsultaConfirmarAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValorItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton2))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeRegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeRegistarActionPerformed

    private void jTextMoradaRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMoradaRegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMoradaRegistarActionPerformed

    
    // Registar novo consultorio 
    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
	Consultorio cons = new Consultorio ();
	// ID dono 
        int i = 0;
	i = Integer.parseInt(this.jTextFieldIDdono.getText());
	
	cons.setIdDono(i);
	cons.setNome(this.jTextNomeRegistar.getText());
	cons.setMorada(this.jTextMoradaRegistar.getText());
	cons.setLocalidade(this.jTextLocalidadeRegistar.getText());
	cons.setEspecialidade(this.jComboBoxRegistaEsp.getSelectedItem().toString());
	
	// ID consultorio
	int cont = 0;
	for(Consultorio co : Repositorio.getInstance().getConsultorios()){
	    cont++;
	}
	cont = cont + 1;
	cons.setIdConsultorio(cont);
	
	Repositorio.getInstance().novoConsultorio(cons);
	JOptionPane.showMessageDialog(null, "Consultório registado com sucesso");
	this.jTextNomeRegistar.setText(null);
        this.jTextMoradaRegistar.setText(null);
        this.jTextLocalidadeRegistar.setText(null);
        
        // Preenche  a tabela com os consultorios 
        DefaultTableModel tm2 = (DefaultTableModel)this.jTableConsultorios.getModel();
	tm2.setRowCount(0);
        for(Consultorio co : Repositorio.getInstance().getConsultorios()){
               if(co.getIdDono() == i){
                tm2.addRow(new Object[]{
                    co.getIdConsultorio(),
                    co.getNome(),
                    co.getMorada(),
                    co.getLocalidade(),
                    co.getEspecialidade()
                   });
               }
        }
        
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    
    private void jTextFieldMoradaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoradaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoradaEditarActionPerformed

    
    // Botao confirmar Editar Consultorio
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
	for(Consultorio c: Repositorio.getInstance().getConsultorios()){
	    if(c.getNome().equals(this.jComboBoxListarConsultas.getSelectedItem())){
		if(!this.jTextNomeEditar.getText().equals("")){
		    c.setNome(this.jTextNomeEditar.getText());
		}
		if(!this.jTextFieldMoradaEditar.getText().equals("")){
		    c.setMorada(this.jTextFieldMoradaEditar.getText());
		}
		if(!this.jTextFieldLodalidadeEditar.getText().equals("")){
		    c.setLocalidade(this.jTextFieldLodalidadeEditar.getText());
		}
		//se algum item foi selecionado 
		if(this.jComboBoxEditarEspecialidade.getSelectedIndex() != -1){
		    c.setEspecialidade(this.jComboBoxEditarEspecialidade.getSelectedItem().toString());
		}
	    }
	}
	
	
	this.jTextNomeEditar.setText(null);
        this.jTextFieldMoradaEditar.setText(null);
        this.jTextFieldLodalidadeEditar.setText(null);
	
	// Update Preenche  a tabela com os consultorios 
        DefaultTableModel tm2 = (DefaultTableModel)this.jTableConsultorios.getModel();
	int i = 0;
	i = Integer.parseInt(this.jTextFieldIDdono.getText());
	tm2.setRowCount(0);
        for(Consultorio cons : Repositorio.getInstance().getConsultorios()){
               if(cons.getIdDono() == i ){
                tm2.addRow(new Object[]{
                    cons.getIdConsultorio(),
                    cons.getNome(),
                    cons.getMorada(),
                    cons.getLocalidade(),
		    cons.getEspecialidade(),
                   });
               }
        }
	
    }//GEN-LAST:event_jButtonEditarActionPerformed

    
    
    
    private void jComboBoxRegistaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistaEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistaEspActionPerformed

    
    //Selecionar conultorio para listar consultas
    private void jComboBoxListarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListarConsultasActionPerformed
	Consultorio aux = this.consultorioComboBox2.get(jComboBoxListarConsultas.getSelectedIndex());
		
	DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
        tmConsultas.setRowCount(0);
	for(Consulta co : Repositorio.getInstance().getConsultas()){
	    if(co.getConsultorio().equals(aux)){
		tmConsultas.addRow(new Object[]{
		    co.getIdConsulta(),
		    co.getDataHora(),
		    co.getHora(),
		    co.getEstado(),
		    co.getIdCliente(),
		    co.getValor(),
		    co.getValorItens(),
		    co.getItensExtra()
                    });
                }
            }
        
        this.consultaComboBox = new ArrayList<>();
	String nomeIDconsulta= null;
        this.CombboxSelecionarConsultaConfirmarAnular.removeAllItems();
	for(Consulta co: Repositorio.getInstance().getConsultas()){ 
	    if((co.getConsultorio().equals(aux) && co.getEstado().equals(EstadoConsulta.REGISTADA)) || (co.getEstado().equals(EstadoConsulta.PAGA)) ){
		this.consultaComboBox.add(co);
		nomeIDconsulta = Integer.toString(co.getIdConsulta());
		this.CombboxSelecionarConsultaConfirmarAnular.addItem(nomeIDconsulta);
	    }
	}
	
    }//GEN-LAST:event_jComboBoxListarConsultasActionPerformed

    
    private void jComboBoxEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEditarEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEditarEspecialidadeActionPerformed

    private void jComboBoxSelecionarConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarConsultorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelecionarConsultorioActionPerformed

    private void CombboxSelecionarConsultaConfirmarAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombboxSelecionarConsultaConfirmarAnularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombboxSelecionarConsultaConfirmarAnularActionPerformed

    private void jTextFieldIDdonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDdonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDdonoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
	Consulta aux = this.consultaComboBox.get(CombboxSelecionarConsultaConfirmarAnular.getSelectedIndex());
	int i =0;
	
	int a = 0;
	
	a = Integer.parseInt(this.jTextFieldValorItems.getText());
	
	for(Consulta c : Repositorio.getInstance().getConsultas() ){
	    if(c.getIdConsulta() == aux.getIdConsulta()){
		if(c.getEstado().equals(EstadoConsulta.REGISTADA)){
		    c.setEstado(EstadoConsulta.CONFIRMADA);
		    i = c.getIdCliente();
		    c.setItensExtra(this.jTextFieldItems.getText());
		    c.setValorItens(a);
		    c.setValor((int) (c.getValor() + c.getValorItens()));
		    for(Cliente cli : Repositorio.getInstance().getClientes()){
			if(c.getIdCliente() == i){
			    i = cli.getPontosAtuais() + 100;
			    cli.setPontosAtuais(i);
			    i = cli.getPontosGanhos() + 100;
			    cli.setPontosGanhos(i);
			}
		    }
		}else{
		    JOptionPane.showMessageDialog(null, "Consulta já se encontra confirmada");
		}
	    }
	}
	
	this.jTextFieldItems.setText(null);
        this.jTextFieldValorItems.setText(null);

	
	// Update tabela das consultas 
        Consultorio aux2 = this.consultorioComboBox2.get(jComboBoxListarConsultas.getSelectedIndex());
		
	DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
        tmConsultas.setRowCount(0);
	for(Consulta co : Repositorio.getInstance().getConsultas()){
	    if(co.getConsultorio().equals(aux2)){
		tmConsultas.addRow(new Object[]{
		    co.getIdConsulta(),
		    co.getDataHora(),
		    co.getHora(),
		    co.getEstado(),
		    co.getIdCliente(),
		    co.getValor(),
		    co.getValorItens(),
		    co.getItensExtra()
                    });
                }
            }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
	Consulta aux = this.consultaComboBox.get(CombboxSelecionarConsultaConfirmarAnular.getSelectedIndex());
	
	for(Consulta c : Repositorio.getInstance().getConsultas() ){
	    if(c.getIdConsulta() == aux.getIdConsulta()){
		c.setEstado(EstadoConsulta.ANULADA);
	    }
	}
        
        Consultorio aux2 = this.consultorioComboBox2.get(jComboBoxListarConsultas.getSelectedIndex());
		
	// Update tabela das consultas 
	DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
        tmConsultas.setRowCount(0);
	for(Consulta co : Repositorio.getInstance().getConsultas()){
	    if(co.getConsultorio().equals(aux2)){
		tmConsultas.addRow(new Object[]{
		    co.getIdConsulta(),
		    co.getDataHora(),
		    co.getHora(),
		    co.getEstado(),
		    co.getIdCliente(),
		    co.getValor(),
		    co.getValorItens(),
		    co.getItensExtra()
                    });
                }
            }
	
    }//GEN-LAST:event_jToggleButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombboxSelecionarConsultaConfirmarAnular;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JComboBox<String> jComboBoxEditarEspecialidade;
    private javax.swing.JComboBox<String> jComboBoxListarConsultas;
    private javax.swing.JComboBox<String> jComboBoxRegistaEsp;
    private javax.swing.JComboBox<String> jComboBoxSelecionarConsultorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultas;
    private javax.swing.JTable jTableConsultorios;
    private javax.swing.JTextField jTextFieldIDdono;
    private javax.swing.JTextField jTextFieldItems;
    private javax.swing.JTextField jTextFieldLodalidadeEditar;
    private javax.swing.JTextField jTextFieldMoradaEditar;
    private javax.swing.JTextField jTextFieldValorItems;
    private javax.swing.JTextField jTextLocalidadeRegistar;
    private javax.swing.JTextField jTextMoradaRegistar;
    private javax.swing.JTextField jTextNomeEditar;
    private javax.swing.JTextField jTextNomeRegistar;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
