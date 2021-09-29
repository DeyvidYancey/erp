/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.View;

import erp.DAO.ClientesDAO;
import erp.DAO.FuncionarioDAO;
import erp.OBJECTS.Cliente;
import erp.OBJECTS.Funcionario;
import erp.exceptions.ClienteException;
import erp.servico.ClienteServico;
import erp.servico.FuncionarioServico;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deyvid
 */
public class Funcionariofrm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Funcionariofrm() {
        initComponents();
    }
    
    public void limparCampos() {
        tfCodigo.setText("");
        tfNome.setText("");
        tfRG.setText("");
        tfCIDADE.setText("");
        ftCEP.setText("");
        tfENDERECO.setText("");
        ftCPF.setText("");
        tfNUMERO.setText("");
        tfBAIRRO.setText("");
        
    }
    
    public void listar() {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.listarFuncionario();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);
        for (Funcionario c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEndereco(),
                c.getCidade(),
                c.getUf(),
                c.getCep(),
                c.getBairro(),
                c.getNumero(),
                c.getLogin(),
                c.getSenha(),
                c.getNivelDeAcesso()
            });
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfRG = new javax.swing.JTextField();
        tfENDERECO = new javax.swing.JTextField();
        tfCIDADE = new javax.swing.JTextField();
        tfBAIRRO = new javax.swing.JTextField();
        ftCPF = new javax.swing.JFormattedTextField();
        tfNUMERO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        ftCEP = new javax.swing.JFormattedTextField();
        tfLOGIN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfSENHA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbACESSO = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btNOVO = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEDITAR = new javax.swing.JButton();
        btEXCLUIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfENDERECOActionPerformed(evt);
            }
        });

        tfCIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCIDADEActionPerformed(evt);
            }
        });

        try {
            ftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Nome");

        jLabel2.setText("RG");

        jLabel3.setText("CPF");

        jLabel4.setText("Endereço");

        jLabel5.setText("Cidade");

        jLabel6.setText("UF");

        jLabel7.setText("CEP");

        jLabel8.setText("Bairro");

        jLabel9.setText("Número");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel10.setText("Código");

        cbUF.setEditable(true);
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO", " " }));
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });

        try {
            ftCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("Login");

        jLabel13.setText("Senha");

        cbACESSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Administrador", " " }));

        jLabel14.setText("Nível de Acesso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(ftCPF)))
                        .addComponent(tfENDERECO)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(122, 122, 122))
                                        .addComponent(ftCEP)))))
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(198, 198, 198)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(tfSENHA)))
                                .addComponent(tfBAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(cbACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel11.setText("Nome");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Rg", "Cpf", "Endereço", "Cidade", "Uf", "Cep", "Bairro", "Numero", "Login", "Senha", "Nivel De acesso"
            }
        ));
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNOVO.setText("Novo");
        btNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNOVOActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEDITAR.setText("Editar");
        btEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEDITARActionPerformed(evt);
            }
        });

        btEXCLUIR.setText("Excluir");
        btEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEXCLUIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEXCLUIR, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(btEDITAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNOVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btNOVO)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btEDITAR)
                .addGap(18, 18, 18)
                .addComponent(btEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfENDERECOActionPerformed

    private void tfCIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCIDADEActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUFActionPerformed

    private void btNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNOVOActionPerformed
        limparCampos();
    }//GEN-LAST:event_btNOVOActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Funcionario obj = new Funcionario();
            obj.setNome(tfNome.getText());
            obj.setRg(tfRG.getText());
            obj.setCidade(tfCIDADE.getText());
            obj.setBairro(tfBAIRRO.getText());
            obj.setCpf(ftCPF.getText());
            obj.setEndereco(tfENDERECO.getText());
            obj.setUf(cbUF.getSelectedItem().toString());
            obj.setNumero(tfNUMERO.getText());
            obj.setCep(ftCEP.getText());
            obj.setLogin(tfLOGIN.getText());
            obj.setSenha(tfSENHA.getText());
            obj.setNivelDeAcesso(cbACESSO.getSelectedItem().toString());
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.adicionarFuncionario(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO FORMULARIO" + e);
        }
// ClientesDAO dao = new ClientesDAO();
        //dao.adicionarCliente(obj);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEXCLUIRActionPerformed
        
        Funcionario obj = new Funcionario();
        obj.setId(Integer.parseInt(tfCodigo.getText()));
       FuncionarioDAO objdao = new FuncionarioDAO();
        objdao.deletarFuncionario(obj);
    }//GEN-LAST:event_btEXCLUIRActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        tfCodigo.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString());
        tfNome.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1).toString());
        tfRG.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2).toString());
        ftCPF.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3).toString());
        tfENDERECO.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4).toString());
        tfCIDADE.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 5).toString());
        cbUF.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 6).toString());
        ftCEP.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 7).toString());
        tfBAIRRO.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 8).toString());
        tfNUMERO.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 9).toString());
        tfLOGIN.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 10).toString());
        tfSENHA.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 11).toString());
        cbACESSO.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 12).toString());
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void btEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEDITARActionPerformed
        try {
        Funcionario obj = new Funcionario();
        
        obj.setNome(tfNome.getText());
        obj.setRg(tfENDERECO.getText());
        obj.setCidade(tfCIDADE.getText());
        obj.setBairro(tfBAIRRO.getText());
        obj.setCpf(ftCPF.getText());
        obj.setEndereco(tfENDERECO.getText());
        obj.setUf(cbUF.getSelectedItem().toString());
        obj.setNumero(tfNUMERO.getText());
        obj.setCep(ftCEP.getText());
        obj.setLogin(tfLOGIN.getText());
        obj.setSenha(tfSENHA.getText());
        obj.setNivelDeAcesso(cbACESSO.getSelectedItem().toString());
        obj.setId(Integer.parseInt(tfCodigo.getText()));
        FuncionarioServico fs = new FuncionarioServico();
        fs.adicionarFuncionario(obj);
// FuncionarioDAO dao = new FuncionarioDAO();
        //dao.updateFuncionario(obj);
        } catch (Exception e) {
        }
       
      
    }//GEN-LAST:event_btEDITARActionPerformed

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        try {
            String nome = "%" + tfPesquisar.getText() + "%";
            FuncionarioDAO dao = new FuncionarioDAO();
            List<Funcionario> lista = dao.buscarFuncionarioPorNome(nome);
            DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
            dados.setNumRows(0);
            for (Funcionario c : lista) {
                dados.addRow(new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getRg(),
                    c.getCpf(),
                    c.getEndereco(),
                    c.getCidade(),
                    c.getUf(),
                    c.getCep(),
                    c.getBairro(),
                    c.getNumero(),
                    c.getLogin(),
                    c.getSenha(),
                    c.getNivelDeAcesso()
                });
                
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Erro no formulario pesquisar" + e);
        }
        

    }//GEN-LAST:event_tfPesquisarKeyPressed

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
            java.util.logging.Logger.getLogger(Funcionariofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionariofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionariofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionariofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionariofrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEDITAR;
    private javax.swing.JButton btEXCLUIR;
    private javax.swing.JButton btNOVO;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbACESSO;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JFormattedTextField ftCEP;
    private javax.swing.JFormattedTextField ftCPF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField tfBAIRRO;
    private javax.swing.JTextField tfCIDADE;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfENDERECO;
    private javax.swing.JTextField tfLOGIN;
    private javax.swing.JTextField tfNUMERO;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfSENHA;
    // End of variables declaration//GEN-END:variables
}
