/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josia
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
        initComponents();
        Pesquisarcliente();
        LimparCampos();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtContato1Cliente = new javax.swing.JTextField();
        txtContato2Cliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        txtPesquisarCliDesc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnSairCliente = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 235, 175));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel4.setText("CONTATO 1");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel5.setText("E-MAIL");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("CONTATO 2");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel7.setText("CPF");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel8.setText("ENDEREÇO");

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtContato1Cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContato1Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContato1ClienteActionPerformed(evt);
            }
        });

        txtContato2Cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCpfCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        txtEnderecoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
            }
        });

        txtEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO DO CLIENTE", "NOME", "CONTATO1", "CONTATO2", "CPF", "ENDEREÇO", "E-MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        txtPesquisarCliDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel10.setText("CÓDIGO DO CLIENTE");

        txtIdCliente.setEditable(false);
        txtIdCliente.setEnabled(false);
        txtIdCliente.setPreferredSize(null);
        txtIdCliente.setVerifyInputWhenFocusTarget(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        btnBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesq cópia.PNG"))); // NOI18N
        btnBuscarCli.setText("BUSCAR");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(519, 519, 519)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEnderecoCliente))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(202, 202, 202))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtContato1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtContato2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(txtPesquisarCliDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarCli)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisarCliDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContato1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContato2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtNomeCliente.getAccessibleContext().setAccessibleName("");
        txtNomeCliente.getAccessibleContext().setAccessibleDescription("");
        txtContato1Cliente.getAccessibleContext().setAccessibleName("");
        txtContato1Cliente.getAccessibleContext().setAccessibleDescription("38");
        txtContato2Cliente.getAccessibleContext().setAccessibleName("");
        txtContato2Cliente.getAccessibleContext().setAccessibleDescription("");
        txtCpfCliente.getAccessibleContext().setAccessibleName("");
        txtCpfCliente.getAccessibleContext().setAccessibleDescription("38");
        txtEnderecoCliente.getAccessibleContext().setAccessibleName("");
        txtEnderecoCliente.getAccessibleContext().setAccessibleDescription("38");
        txtEmailCliente.getAccessibleContext().setAccessibleName("");
        txtEmailCliente.getAccessibleContext().setAccessibleDescription("38");
        txtIdCliente.getAccessibleContext().setAccessibleName("");
        txtIdCliente.getAccessibleContext().setAccessibleDescription("38");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 62, 1140, 608));

        jPanel3.setBackground(new java.awt.Color(255, 235, 175));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/JV - SISTAMASCADAST.png"))); // NOI18N

        btnCadastrarCliente.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastrarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarCliente.setText("CADASTRAR");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterarCliente.setText("ALTERAR");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluirCliente.setText("EXCLUIR");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnSairCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSairCliente.setText("SAIR");
        btnSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairClienteActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSairCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSairCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnCadastrarCliente.getAccessibleContext().setAccessibleName("");
        btnAlterarCliente.getAccessibleContext().setAccessibleName("");
        btnExcluirCliente.getAccessibleContext().setAccessibleName("");
        btnSairCliente.getAccessibleContext().setAccessibleName("");
        btnLimpar.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, -1, 608));

        jPanel4.setBackground(new java.awt.Color(255, 235, 175));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE CLIENTES");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("38");

        setBounds(0, 0, 1387, 709);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed

       CadastrarCliente();
       Pesquisarcliente();
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoClienteActionPerformed

    private void txtContato1ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContato1ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContato1ClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        AlterarCliente();
        Pesquisarcliente();
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked

        if (tabelaCliente.getSelectedRow() != -1) {
            txtIdCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
            txtNomeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
            txtContato1Cliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
            txtContato2Cliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
            txtCpfCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString());
            txtEnderecoCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(),5).toString());
            txtEmailCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseReleased

        if (tabelaCliente.getSelectedRow() != -1) {
            txtIdCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
            txtNomeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
            txtContato1Cliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
            txtContato2Cliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
            txtCpfCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(),4).toString());
            txtEnderecoCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString());
            txtEmailCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_tabelaClienteMouseReleased

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        //Botão de excluir cliente
        ExcluirCliente();
        Pesquisarcliente();
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairClienteActionPerformed
        TelaMenu telamenu = new TelaMenu();
        telamenu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnSairClienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        // TODO add your handling code here:
        pesquisarclienteDesc(txtPesquisarCliDesc.getText());
    }//GEN-LAST:event_btnBuscarCliActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
    }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtContato1Cliente;
    private javax.swing.JTextField txtContato2Cliente;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPesquisarCliDesc;
    // End of variables declaration//GEN-END:variables

   //CADASTRAR CLIENTE
    private void CadastrarCliente(){
     
        String  nome, contato1, contato2, cpf, endereco, email;
        //int id;
        
       // id = Integer.parseInt(txtIdCliente.getText());
        nome = txtNomeCliente.getText();
        contato1 = txtContato1Cliente.getText();
        contato2 = txtContato2Cliente.getText();
        cpf = txtCpfCliente.getText();
        endereco = txtEnderecoCliente.getText();
        email = txtEmailCliente.getText();

        ClienteDTO objclientedto = new ClienteDTO();

        
        objclientedto.setNome(nome);
        objclientedto.setContato1(contato1);
        objclientedto.setContato2(contato2);
        objclientedto.setCpf(cpf);
        objclientedto.setEndereco(endereco);
        objclientedto.setEmail(email);
       // objclientedto.setIdcliente(id);
        
        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.CadastrarCliente(objclientedto);

    
    }
    
    
    private void Pesquisarcliente() {

        try {

            ClienteDAO objclientedao = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> listacliente = objclientedao.PesquisarCliente();

            for (int num = 0; num < listacliente.size(); num++) {
                model.addRow(new Object[]{
                    listacliente.get(num).getIdcliente(),
                    listacliente.get(num).getNome(),
                    listacliente.get(num).getContato1(),
                    listacliente.get(num).getContato2(),
                    listacliente.get(num).getCpf(),
                    listacliente.get(num).getEndereco(),
                    listacliente.get(num).getEmail(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listar valores VIEW: " + erro);

        }

    }
    
    //ALTERAR CLIENTE
     private void AlterarCliente() {

        String  nome, contato1, contato2, cpf, endereco, email;     
        int idcliente;

        nome = txtNomeCliente.getText();
        contato1 = txtContato1Cliente.getText();
        contato2 = txtContato2Cliente.getText();
        cpf = txtCpfCliente.getText();
        endereco = txtEmailCliente.getText();
        email = txtEmailCliente.getText();
        idcliente = Integer.parseInt(txtIdCliente.getText());

        ClienteDTO objclientedto = new ClienteDTO();
        
        objclientedto.setNome(nome);
        objclientedto.setContato1(contato1);
        objclientedto.setContato2(contato2);
        objclientedto.setCpf(cpf);
        objclientedto.setEndereco(endereco);
        objclientedto.setEmail(email);
        objclientedto.setIdcliente(idcliente);
        

        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.alterarCliente(objclientedto);

    }

    //EXCLUIR CLIENTE
    private void ExcluirCliente() {
        int id;

        id = Integer.parseInt(txtIdCliente.getText());

        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setIdcliente(id);

        ClienteDAO objprodutodao = new ClienteDAO();
        objprodutodao.ExcluirCliente(objclientedto);

     }

    //LIMPAR CAMPOS
     private void LimparCampos() {
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtCpfCliente.setText("");
        txtContato1Cliente.setText("");
        txtContato2Cliente.setText("");
        txtEmailCliente.setText("");
        txtPesquisarCliDesc.setText("");

        txtNomeCliente.requestFocus();

}
     //pesquisar cliente por descrição
      private void pesquisarclienteDesc(String desc) {

        try {

            ClienteDAO objclientedao = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> listacliente = objclientedao.PesquisarClienteDesc(desc);

            for (int num = 0; num < listacliente.size(); num++) {
                model.addRow(new Object[]{
                    listacliente.get(num).getIdcliente(),
                    listacliente.get(num).getNome(),
                    listacliente.get(num).getContato1(),
                    listacliente.get(num).getContato2(),
                    listacliente.get(num).getCpf(),
                    listacliente.get(num).getEndereco(),
                    listacliente.get(num).getEmail(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listar valores VIEW: " + erro);

        }

    }

}