/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.View;

import erp.DAO.ClientesDAO;
import erp.DAO.ProdutoDAO;
import erp.OBJECTS.Cliente;
import erp.OBJECTS.Produto;
import erp.exceptions.ClienteException;
import erp.servico.ClienteServico;
import erp.servico.ProdutoServico;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deyvid
 */
public class Produtofrm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Produtofrm() {
        initComponents();
        restaurarDadosComboBoxFornecedor();
    }

    public void limparCampos() {
        tfCodigo.setText("");
        tfNome.setText("");
        tfESTOQUE.setText("");
        //  tfFORNECEDOR.setText("");
        ftPRECODECOMPRA.setText("");
        tfPRECODEVENDA.setText("");
        tfUNIDADE.setText("");
        tfPORCENTAGEM.setText("");
    }

    public void listar() {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProduto();
        DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
        dados.setNumRows(0);
        for (Produto c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getPrecoDeCompra(),
                c.getPrecoDeVenda(),
                c.getEstoque(),
                c.getFornecedor(),
                c.getUnidade(),
                c.getPorcentagem(),
                c.getTipo()
            });

        }
    }

    Vector<Integer> id_fornecedor = new Vector<Integer>();

    public void restaurarDadosComboBoxFornecedor() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            ResultSet rs = dao.listarFornecedor();
            while (rs.next()) {
                id_fornecedor.add(rs.getInt(1));
                cbFORNECEDOR.addItem(rs.getString(2));
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "CARREGAR FORNECEDORES FORMULARIO" + e);
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

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ftPRECODECOMPRA = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfESTOQUE = new javax.swing.JTextField();
        tfPRECODEVENDA = new javax.swing.JTextField();
        cbFORNECEDOR = new javax.swing.JComboBox<>();
        tfUNIDADE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPORCENTAGEM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbTIPO = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btNOVO = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEDITAR = new javax.swing.JButton();
        btEXCLUIR = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome");

        jLabel2.setText("Preço de compra");

        jLabel3.setText("Preço de Venda");

        jLabel4.setText("Fornecedor");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel10.setText("Código");

        ftPRECODECOMPRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftPRECODECOMPRAKeyPressed(evt);
            }
        });

        jLabel5.setText("Estoque");

        tfPRECODEVENDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPRECODEVENDAActionPerformed(evt);
            }
        });
        tfPRECODEVENDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPRECODEVENDAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPRECODEVENDAKeyReleased(evt);
            }
        });

        cbFORNECEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFORNECEDORActionPerformed(evt);
            }
        });

        tfUNIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUNIDADEActionPerformed(evt);
            }
        });

        jLabel6.setText("Unidade");

        tfPORCENTAGEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPORCENTAGEMActionPerformed(evt);
            }
        });
        tfPORCENTAGEM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPORCENTAGEMKeyPressed(evt);
            }
        });

        jLabel7.setText("Porcentagem de lucro");

        cbTIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Unidade", "Grama", "Kilo", "Tonelada", "Ml", "Litro", "Metro", "Centimetros", "Unidade", "Metro Cúbico" }));

        jLabel8.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNome)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(ftPRECODECOMPRA, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(tfESTOQUE))
                            .addComponent(jLabel6)
                            .addComponent(tfUNIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfPRECODEVENDA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPORCENTAGEM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFORNECEDOR, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 153, Short.MAX_VALUE)))
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftPRECODECOMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPORCENTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfESTOQUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUNIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPRECODEVENDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel11.setText("Nome");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço de compra", "Preço de venda", "Estoque", "Fornecedor", "Unidade", "Porcentagem de lucro", "Tipo"
            }
        ));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);
        tabelaProduto.getAccessibleContext().setAccessibleName("");

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
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

        jButton2.setText("Calcular Venda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEXCLUIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNOVO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNOVOActionPerformed
        limparCampos();
    }//GEN-LAST:event_btNOVOActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Produto obj = new Produto();
            int codfornecedor;

            obj.setNome(tfNome.getText());
            obj.setPrecoDeCompra(Double.parseDouble(ftPRECODECOMPRA.getText()));
            obj.setPrecoDeVenda(Double.parseDouble(tfPRECODEVENDA.getText()));
            obj.setEstoque(tfESTOQUE.getText());
            codfornecedor = id_fornecedor.get(cbFORNECEDOR.getSelectedIndex());
            obj.setFornecedor(codfornecedor);
            obj.setUnidade(tfUNIDADE.getText());
            obj.setPorcentagem(Double.parseDouble(tfPORCENTAGEM.getText()));
            obj.setTipo( cbTIPO.getSelectedItem().toString());
            //obj.setFornecedor(Integer.parseInt(tfFORNECEDOR.getText()));
//ProdutoServico ps = new ProdutoServico();
//ps.adicionarProduto(obj);
            ProdutoDAO pd = new ProdutoDAO();
            pd.adicionarProduto(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO FORMULARIO" + e);
        }
// ClientesDAO dao = new ClientesDAO();
        //dao.adicionarCliente(obj);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEXCLUIRActionPerformed

        Produto obj = new Produto();
        obj.setId(Integer.parseInt(tfCodigo.getText()));
        ProdutoDAO objdao = new ProdutoDAO();
        objdao.deletarProduto(obj);
    }//GEN-LAST:event_btEXCLUIRActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        tfCodigo.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0).toString());
        tfNome.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1).toString());
        ftPRECODECOMPRA.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 2).toString());
        tfPRECODEVENDA.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 3).toString());
        tfESTOQUE.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 4).toString());
        cbFORNECEDOR.setSelectedItem(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 5).toString());
        tfUNIDADE.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 6).toString());
        tfPORCENTAGEM.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 7).toString());
        cbTIPO.setSelectedItem(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void btEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEDITARActionPerformed
        try {
           Produto obj = new Produto();
        int codfornecedor;
        obj.setNome(tfNome.getText());
        obj.setPrecoDeCompra(Double.parseDouble(ftPRECODECOMPRA.getText()));
        obj.setPrecoDeVenda(Double.parseDouble(tfPRECODEVENDA.getText()));
        obj.setEstoque(tfESTOQUE.getText());
        codfornecedor = id_fornecedor.get(cbFORNECEDOR.getSelectedIndex());
        obj.setUnidade(tfUNIDADE.getText());
        obj.setFornecedor(codfornecedor);
        obj.setPorcentagem(Double.parseDouble(tfPORCENTAGEM.getText()));
        obj.setTipo(cbTIPO.getSelectedItem().toString());
        obj.setId(Integer.parseInt(tfCodigo.getText()));
       // ProdutoServico ps = new ProdutoServico();
        //ps.updateProduto(obj);
        
 ProdutoDAO pd = new ProdutoDAO();
       pd.updateProduto(obj); 
        } catch (Exception e) {
        }
  

    }//GEN-LAST:event_btEDITARActionPerformed

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        try {
            String nome = "%" + tfPesquisar.getText() + "%";
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> lista = dao.buscarProdutoPorNome(nome);
            DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
            dados.setNumRows(0);
            for (Produto c : lista) {
                dados.addRow(new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getPrecoDeCompra(),
                    c.getPrecoDeVenda(),
                    c.getEstoque(),
                    c.getFornecedor(),
                    c.getUnidade(),
                    c.getPorcentagem(),
                    c.getTipo()
                });

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Erro no formulario pesquisar" + e);
        }


    }//GEN-LAST:event_tfPesquisarKeyPressed

    private void tfPRECODEVENDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPRECODEVENDAKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPRECODEVENDAKeyReleased

    private void tfUNIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUNIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUNIDADEActionPerformed

    private void ftPRECODECOMPRAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftPRECODECOMPRAKeyPressed
       /* ProdutoDAO dao = new ProdutoDAO();
        double valorDeCompra,porcentagem;
        valorDeCompra= Double.parseDouble(ftPRECODECOMPRA.getText());
        porcentagem=
        dao.valorDeVenda(valorDeCompra, PROPERTIES);*/
    }//GEN-LAST:event_ftPRECODECOMPRAKeyPressed

    private void tfPORCENTAGEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPORCENTAGEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPORCENTAGEMActionPerformed

    private void tfPRECODEVENDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPRECODEVENDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPRECODEVENDAActionPerformed

    private void cbFORNECEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFORNECEDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFORNECEDORActionPerformed

    private void tfPRECODEVENDAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPRECODEVENDAKeyPressed
     
    }//GEN-LAST:event_tfPRECODEVENDAKeyPressed

    private void tfPORCENTAGEMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPORCENTAGEMKeyPressed
    
    }//GEN-LAST:event_tfPORCENTAGEMKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   double precoDeCompra,porcentagem, resultado1,resultado2;
   String rs;
   precoDeCompra =Double.parseDouble(ftPRECODECOMPRA.getText()) ;  
   porcentagem = Double.parseDouble(tfPORCENTAGEM.getText());
   resultado1 = (precoDeCompra*porcentagem)/100;
   resultado2= resultado1 +precoDeCompra;
  
  /* double preco1,preco2,preco3,preco4;
   
   preco1= Double.parseDouble(ftPRECODECOMPRA.getText()) ;
    preco2= Double.parseDouble(tfPORCENTAGEM.getText()) ;
   preco3 = (preco1*preco2)/100;
   preco4= preco3+preco1;*/
   tfPRECODEVENDA.setText((""+resultado2));
   
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Produtofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtofrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEDITAR;
    private javax.swing.JButton btEXCLUIR;
    private javax.swing.JButton btNOVO;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbFORNECEDOR;
    private javax.swing.JComboBox<String> cbTIPO;
    private javax.swing.JFormattedTextField ftPRECODECOMPRA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfESTOQUE;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPORCENTAGEM;
    private javax.swing.JTextField tfPRECODEVENDA;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfUNIDADE;
    // End of variables declaration//GEN-END:variables
}
