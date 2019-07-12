package medhutUI;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import medhut.Consultorio;
import medhut.Repositorio;
import medhut.Consulta;
import medhut.Cliente;
import javax.swing.table.DefaultTableModel;
import medhut.EstadoConsulta;

public class ClientePanel extends javax.swing.JPanel {
    
    private List <Consultorio> consultorioComboBox;
    private List<Consulta> consultaComboboxPagar;
    
    
    public  ClientePanel(int id){
	initComponents();
	this.jTextFieldIdCliente.setText("" + id);
	
	// Preencher combobox Consultorios , criar consulta 
	this.consultorioComboBox = new ArrayList<>();
	for(Consultorio co: Repositorio.getInstance().getConsultorios()){
	    this.consultorioComboBox.add(co);
	    this.jComboBoxConsultorios.addItem(co.getNome());
	}
        
	//Tabela consultas 
	DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
	int i = 0;
	i = Integer.parseInt(this.jTextFieldIdCliente.getText());
	
	String moradaConsultorio = null;
	for(Consulta c : Repositorio.getInstance().getConsultas()){
	    if(c.getIdCliente() == i){
		for(Consultorio g: Repositorio.getInstance().getConsultorios()){
		   if(g.getIdConsultorio() == c.getIdConsultorio()){
		       moradaConsultorio = g.getNome(); 
		   }
		}
		tmConsultas.addRow(new Object[]{
		    c.getIdConsulta(),
		    c.getDataHora(),
		    c.getHora(),
		    c.getEstado(),
		    moradaConsultorio,
		    c.getValor(),
		    c.getValorItens(),
		    c.getItensExtra()
		});
	    }
	}

	
	// Apresentar pontos e vales
	int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
	i = Integer.parseInt(this.jTextFieldIdCliente.getText());
	
	for(Cliente c : Repositorio.getInstance().getClientes()){
	    if(c.getIdCliente() == i){
		aux = c.getPontosAtuais();
                aux2 = c.getPontosGanhos();
                aux3 = c.getPontosUtilizados();
                aux4 = c.getVales();
	    }
	}
	this.jTextFieldPontosAtuais.setText("" + aux);
	this.jTextFieldPontosGanhos.setText("" + aux2);
        this.jTextFieldPontosUtilizados.setText("" + aux3);
        this.jTextVales.setText("" + aux4);
	
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaConsultorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxConsultorios = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        BotaoConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextHora = new javax.swing.JTextField();
        tipoConsultaComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        valorTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jBotaoPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonPagar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableConsultas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPontosAtuais = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPontosGanhos = new javax.swing.JTextField();
        jTextFieldPontosUtilizados = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldIDPagarConsulta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextVales = new javax.swing.JTextField();
        jCheckBoxUsarVale = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel1.setText("Painel Cliente");

        TabelaConsultorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nome","Morada","Localidade","Especialidade"
            }
        ));
        jScrollPane1.setViewportView(TabelaConsultorio);

        jLabel2.setText("Consultorios");

        jTextFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiltroActionPerformed(evt);
            }
        });

        jLabel3.setText("Filtro");

        jLabel4.setText("Criar Consulta");

        jComboBoxConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsultoriosActionPerformed(evt);
            }
        });

        jLabel5.setText("Consultorio");

        jLabel6.setText("Data (DD/MM/YYYY)");

        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });

        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        jLabel8.setText("Hora");

        tipoConsultaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeira_Normal", "Primeira_Urgente", "Outra_Normal", "Outra_Urgente" }));
        tipoConsultaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoConsultaComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo");

        valorTextField.setEditable(false);
        valorTextField.setColumns(3);
        valorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Valor a pagar");

        jTextFieldIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdClienteActionPerformed(evt);
            }
        });

        jBotaoPesquisar.setText("Pesquisar");
        jBotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setText("Pagar Consulta");

        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Id Consulta","Data","Hora","Estado","Nome Consultorio","Valor","Valor Itens","Itens"
            }
        ));
        jScrollPane6.setViewportView(jTableConsultas);

        jLabel11.setText("Consultar Consultas");

        jLabel12.setText("Pontos atuais");

        jTextFieldPontosAtuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPontosAtuaisActionPerformed(evt);
            }
        });

        jLabel13.setText("Pontos ganhos");

        jLabel14.setText("Pontos utilizados");

        jLabel15.setText("ID");

        jLabel16.setText("Nº vales disponíveis");

        jTextVales.setText("0");
        jTextVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValesActionPerformed(evt);
            }
        });

        jCheckBoxUsarVale.setText("Usar vale");
        jCheckBoxUsarVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUsarValeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldPontosGanhos, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPontosAtuais)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel16))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextVales, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPontosUtilizados))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPagar)
                                    .addComponent(jCheckBoxUsarVale)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIDPagarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jBotaoPesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoConsultaComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoConfirmar))
                            .addComponent(jComboBoxConsultorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextData)
                            .addComponent(jTextHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jBotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxConsultorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoConsultaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(BotaoConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(72, 72, 72)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldIDPagarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxUsarVale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPagar)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldPontosAtuais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldPontosGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldPontosUtilizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextVales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void ListarConsultorios (){
	initComponents();
	
	//Tabela consultas 
	DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
	int i = 0;
	i = Integer.parseInt(this.jTextFieldIdCliente.getText());
	
	String a = null;
	for(Consulta c : Repositorio.getInstance().getConsultas()){
	    if(c.getIdCliente() == i){
		for(Consultorio g: Repositorio.getInstance().getConsultorios()){
		   if(g.getIdConsultorio() == c.getIdConsultorio()){
		       a = g.getNome(); 
		   }
		}
		tmConsultas.addRow(new Object[]{
		    c.getDataHora(),
		    c.getHora(),
		    c.getEstado(),
		    a,
		    c.getValor()
		});
	    }
	}

    }
    
    private void jTextFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiltroActionPerformed

    private void jComboBoxConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsultoriosActionPerformed

    }//GEN-LAST:event_jComboBoxConsultoriosActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

    // Quando pressionado botao comfirmar 
    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed
	
	Consultorio cons = new Consultorio();
        cons = this.consultorioComboBox.get(jComboBoxConsultorios.getSelectedIndex());
	Consulta co = new Consulta();
	
        co.setDataHora(this.jTextData.getText());
        co.setHora(this.jTextHora.getText());
	co.setConsultorio(cons);
        co.setValor(tipoConsultaComboBox.getSelectedIndex());
        co.setEstado(EstadoConsulta.REGISTADA);
        co.setIdConsultorio(cons.getIdConsultorio());
	
	// ID cliente 
	int i = 0;
	i = Integer.parseInt(this.jTextFieldIdCliente.getText());
        co.setIdCliente(i);
	
	// ID consulta
	int cont=0;
	for(Consulta c : Repositorio.getInstance().getConsultas()){
	    cont++;
	}
	cont  = cont +1;
	co.setIdConsulta(cont);
	
        valorTextField.setText("" + co.getValor());
        
	
	
        //Iterador para adicionar a consulta ao consultorio
	boolean existe = false;
	Iterator itConsultorio = Repositorio.getInstance().getConsultorios().iterator();
	while(itConsultorio.hasNext() && !existe){
	    Consultorio a = (Consultorio)itConsultorio.next();
	    if(a.equals(cons)){
		a.getConsultas().add(co);
		existe = true;
	    }
	}
        JOptionPane.showMessageDialog(null, "Consulta registada.");
        Repositorio.getInstance().novaConsulta(co);
	this.jTextData.setText(null);
        this.jTextHora.setText(null);
        
	
	
        // Atualiza tabela de consultas com a consulta introduzida 
        DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
	tmConsultas.setRowCount(0);
	String moradaConsultorio = null;
	for(Consulta c : Repositorio.getInstance().getConsultas()){
	    if(c.getIdCliente() == i){
		for(Consultorio g: Repositorio.getInstance().getConsultorios()){
		   if(g.getIdConsultorio() == c.getIdConsultorio()){
		       moradaConsultorio = g.getNome(); 
		   }
		}
		tmConsultas.addRow(new Object[]{
		    c.getIdConsulta(),
		    c.getDataHora(),
		    c.getHora(),
		    c.getEstado(),
		    moradaConsultorio,
		    c.getValor(),
		    c.getValorItens(),
		    c.getItensExtra()
		});
	    }
	}
	
    }//GEN-LAST:event_BotaoConfirmarActionPerformed



    private void tipoConsultaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoConsultaComboBoxActionPerformed
    }//GEN-LAST:event_tipoConsultaComboBoxActionPerformed

    private void valorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTextFieldActionPerformed
    }//GEN-LAST:event_valorTextFieldActionPerformed

    private void jTextFieldIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdClienteActionPerformed
    }//GEN-LAST:event_jTextFieldIdClienteActionPerformed

    private void jBotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoPesquisarActionPerformed
	
	DefaultTableModel tmConsultorios = (DefaultTableModel)this.TabelaConsultorio.getModel();
	String aux = null;
	aux = this.jTextFiltro.getText();
	tmConsultorios.setRowCount(0);
	for(Consultorio co : Repositorio.getInstance().getConsultorios()){
	    if(co.getNome().equals(aux) || co.getLocalidade().equals(aux) || co.getEspecialidade().equals(aux)){
		   tmConsultorios.addRow(new Object[]{
                    co.getNome(),
                    co.getMorada(),
                    co.getLocalidade(),
		    co.getEspecialidade()
                    });
	    }
	}
	
    }//GEN-LAST:event_jBotaoPesquisarActionPerformed

    
    // Botao Pagar 
    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
	int aux = 0;
	aux = Integer.parseInt(this.jTextFieldIDPagarConsulta.getText());
	
        boolean vales = false;
	int s = 0;
        
        if (jCheckBoxUsarVale.isSelected()){
            for(Cliente f : Repositorio.getInstance().getClientes()){
		if(f.getIdCliente() == Integer.parseInt(this.jTextFieldIdCliente.getText())){
		    s = f.getVales();
		}
	    }
	    
	    if(s >= 1){ // se tiver vales
		int i = 0;
		i = Integer.parseInt(this.jTextFieldIdCliente.getText());

		int t = 0;
		for(Cliente c : Repositorio.getInstance().getClientes()){
		    if(c.getIdCliente() == i){
			if(c.getVales() > 0){
			    t = c.getVales() -1 ;
			    c.setVales(t);
			    c.setPontosUtilizados(c.getPontosUtilizados() + 1000);
			    vales = true;
			}
		    }
		}


		// Atualizar valor da consulta 
		int r = 0;
		for(Consulta co : Repositorio.getInstance().getConsultas()){
		    if(co.getIdConsulta() == aux){
			r = co.getValor();
			r = r - 10;
			co.setValor(r);
		    }	    
		}
	    }
	    else{
		JOptionPane.showMessageDialog(null, "Não tem vales !");
	    }
	    
        }
        
       
        // Apresentar pontos e vales
	int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
	int i=0;
	i = Integer.parseInt(this.jTextFieldIdCliente.getText());
	
	for(Cliente c : Repositorio.getInstance().getClientes()){
	    if(c.getIdCliente() == i){
		aux1 = c.getPontosAtuais();
                aux2 = c.getPontosGanhos();
                aux3 = c.getPontosUtilizados();
                aux4 = c.getVales();
	    }
	}
	this.jTextFieldPontosAtuais.setText("" + aux1);
	this.jTextFieldPontosGanhos.setText("" + aux2);
        this.jTextFieldPontosUtilizados.setText("" + aux3);
        this.jTextVales.setText("" + aux4);
        this.jTextFieldIDPagarConsulta.setText(null);
        
        
	for(Consulta co : Repositorio.getInstance().getConsultas()){
	    if(co.getIdConsulta() == aux){
                if(co.getEstado().equals(EstadoConsulta.CONFIRMADA)){
                    co.setEstado(EstadoConsulta.PAGA);
                }else{
                    JOptionPane.showMessageDialog(null, "Não é possivel pagar consulta");
                }
            }	    
	}

        
        
        //Volta a desenhar a tabela para atualizar a consulta que foi paga 
        DefaultTableModel tmConsultas = (DefaultTableModel)this.jTableConsultas.getModel();
	int f = 0;
	f = Integer.parseInt(this.jTextFieldIdCliente.getText());
	// "Id Consulta","Data","Hora","Estado","Nome Consultorio","Valor"
	String moradaConsultorio = null;
        tmConsultas.setRowCount(0);
		for(Consulta c : Repositorio.getInstance().getConsultas()){
	    if(c.getIdCliente() == f){
		for(Consultorio g: Repositorio.getInstance().getConsultorios()){
		   if(g.getIdConsultorio() == c.getIdConsultorio()){
		       moradaConsultorio = g.getNome(); 
		   }
		}
		tmConsultas.addRow(new Object[]{
		    c.getIdConsulta(),
		    c.getDataHora(),
		    c.getHora(),
		    c.getEstado(),
		    moradaConsultorio,
		    c.getValor(),
		    c.getValorItens(),
		    c.getItensExtra()
		});
	    }
	}

    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jTextFieldPontosAtuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPontosAtuaisActionPerformed
    }//GEN-LAST:event_jTextFieldPontosAtuaisActionPerformed

    private void jTextValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValesActionPerformed

    }//GEN-LAST:event_jTextValesActionPerformed

    private void jCheckBoxUsarValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUsarValeActionPerformed

    }//GEN-LAST:event_jCheckBoxUsarValeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmar;
    private javax.swing.JTable TabelaConsultorio;
    private javax.swing.JButton jBotaoPesquisar;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JCheckBox jCheckBoxUsarVale;
    private javax.swing.JComboBox<String> jComboBoxConsultorios;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTableConsultas;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextFieldIDPagarConsulta;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldPontosAtuais;
    private javax.swing.JTextField jTextFieldPontosGanhos;
    private javax.swing.JTextField jTextFieldPontosUtilizados;
    private javax.swing.JTextField jTextFiltro;
    private javax.swing.JTextField jTextHora;
    private javax.swing.JTextField jTextVales;
    private javax.swing.JComboBox<String> tipoConsultaComboBox;
    private javax.swing.JTextField valorTextField;
    // End of variables declaration//GEN-END:variables
}
