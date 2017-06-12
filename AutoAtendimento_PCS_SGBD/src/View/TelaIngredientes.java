/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ControleTelaIngredientes;
import Model.Pedido;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Diagramar
 */
public class TelaIngredientes extends javax.swing.JFrame {
    ArrayList<JButton> escolhasIngredientes = new ArrayList();
    ArrayList<JButton> escolhasExtras = new ArrayList();
    ControleTelaIngredientes novo;
    
    /**
     * Creates new form TelaMassas
     */
    public TelaIngredientes(Pedido p, TelaAtendente atendente) {
        initComponents();
        this.setLocationRelativeTo(null);
        novo = new ControleTelaIngredientes(this, atendente);
        novo.setPedido(p);
        proximo.setEnabled(false);
        
        escolhasIngredientes.add(escolha01);
        escolhasIngredientes.add(escolha02);
        escolhasIngredientes.add(escolha03);
        escolhasIngredientes.add(escolha04);
        escolhasIngredientes.add(escolha05);
        escolhasIngredientes.add(escolha06);
        escolhasIngredientes.add(escolha07);
        escolhasIngredientes.add(escolha08);
        
        escolhasExtras.add(escolhaExtra01);
        escolhasExtras.add(escolhaExtra02);
        escolhasExtras.add(escolhaExtra03);
        escolhasExtras.add(escolhaExtra04);
    }
    
    public void desativar(){
        alcaparra.setEnabled(false);
        alho.setEnabled(false);
        alhoPoro.setEnabled(false);
        azeitona.setEnabled(false);        
        bacon.setEnabled(false);
        brocolis.setEnabled(false);
        camarao.setEnabled(false);
        carneSol.setEnabled(false);
        cebola.setEnabled(false);
        cenoura.setEnabled(false);
        champignon.setEnabled(false);
        ervilha.setEnabled(false);
        frango.setEnabled(false);
        gorgonzola.setEnabled(false);
        linguica.setEnabled(false);        
        milho.setEnabled(false);
        mussarela.setEnabled(false);
        palmito.setEnabled(false);
        peitoPeru.setEnabled(false);
        presunto.setEnabled(false);
        salmao.setEnabled(false);
        tomateSeco.setEnabled(false);
        tomate.setEnabled(false);
        uvaPassa.setEnabled(false);
        ovoCodorna.setEnabled(false);
        coalho.setEnabled(false);
        minas.setEnabled(false);        
        proximo.setEnabled(true);
    }
    public void ativar(){
        alcaparra.setEnabled(true);
        alho.setEnabled(true);
        alhoPoro.setEnabled(true);
        azeitona.setEnabled(true);        
        bacon.setEnabled(true);
        brocolis.setEnabled(true);
        camarao.setEnabled(true);
        carneSol.setEnabled(true);
        cebola.setEnabled(true);
        cenoura.setEnabled(true);
        champignon.setEnabled(true);
        ervilha.setEnabled(true);
        frango.setEnabled(true);
        gorgonzola.setEnabled(true);
        linguica.setEnabled(true);        
        milho.setEnabled(true);
        mussarela.setEnabled(true);
        palmito.setEnabled(true);
        peitoPeru.setEnabled(true);
        presunto.setEnabled(true);
        salmao.setEnabled(true);
        tomateSeco.setEnabled(true);
        tomate.setEnabled(true);
        uvaPassa.setEnabled(true);
        ovoCodorna.setEnabled(true);
        coalho.setEnabled(true);
        minas.setEnabled(true);            
        proximo.setEnabled(false);
    }
    public void MostrarBotaoEscolha(String ingrediente){
        int aux = 0;
        for(int i = 0; i<escolhasIngredientes.size(); i++){
           if(escolhasIngredientes.get(i).getText().equals("")){
               escolhasIngredientes.get(i).setText(ingrediente);
               break;
           } 
        }
        for(int i = 0; i<escolhasIngredientes.size(); i++){            
            if(!(escolhasIngredientes.get(i).getText().equals(""))){
                aux++;
            }
        }
        if(aux == escolhasIngredientes.size()){
            boolean radio = RadioSim.isSelected();
            if(radio == true){
            for(int i = 0; i<escolhasExtras.size(); i++){
                    if(escolhasExtras.get(i).getText().equals("")){
                        escolhasExtras.get(i).setText(ingrediente);
                        break;
                    } 
                } 
            }
            else
                desativar();
        }        
    }      
    public void AtivarBotaoExtras (){
        for(int i = 0; i<escolhasExtras.size();i++){            
            escolhasExtras.get(i).setEnabled(true);
            
        }
        ativar();
        proximo.setEnabled(true);
    }
    public void DesativarBotaoExtras (){
        for(int i = 0; i<escolhasExtras.size();i++){
            escolhasExtras.get(i).setText("");
            escolhasExtras.get(i).setEnabled(false);
            
        }
        desativar();
    }
    //Os métodos acima foram mantidos na View pois eles regem a ativação de botões
    //e inserção de textos nos mesmo
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        escolha01 = new javax.swing.JButton();
        escolha06 = new javax.swing.JButton();
        escolha02 = new javax.swing.JButton();
        escolha03 = new javax.swing.JButton();
        escolha04 = new javax.swing.JButton();
        escolha05 = new javax.swing.JButton();
        escolha08 = new javax.swing.JButton();
        escolha07 = new javax.swing.JButton();
        escolhaExtra03 = new javax.swing.JButton();
        escolhaExtra02 = new javax.swing.JButton();
        escolhaExtra01 = new javax.swing.JButton();
        escolhaExtra04 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RadioSim = new javax.swing.JRadioButton();
        RadioNao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        alcaparra = new javax.swing.JButton();
        azeitona = new javax.swing.JButton();
        brocolis = new javax.swing.JButton();
        bacon = new javax.swing.JButton();
        cebola = new javax.swing.JButton();
        cenoura = new javax.swing.JButton();
        alhoPoro = new javax.swing.JButton();
        carneSol = new javax.swing.JButton();
        ervilha = new javax.swing.JButton();
        alho = new javax.swing.JButton();
        frango = new javax.swing.JButton();
        camarao = new javax.swing.JButton();
        presunto = new javax.swing.JButton();
        peitoPeru = new javax.swing.JButton();
        palmito = new javax.swing.JButton();
        salmao = new javax.swing.JButton();
        linguica = new javax.swing.JButton();
        mussarela = new javax.swing.JButton();
        milho = new javax.swing.JButton();
        gorgonzola = new javax.swing.JButton();
        champignon = new javax.swing.JButton();
        tomateSeco = new javax.swing.JButton();
        uvaPassa = new javax.swing.JButton();
        minas = new javax.swing.JButton();
        coalho = new javax.swing.JButton();
        ovoCodorna = new javax.swing.JButton();
        tomate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingredientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 224, 182));

        jPanel2.setBackground(new java.awt.Color(252, 207, 132));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sua(s) Escolha(s) :");

        proximo.setBackground(new java.awt.Color(252, 207, 132));
        proximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proximo.setText("Próximo");
        proximo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(252, 207, 132));
        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cancelar.setBackground(new java.awt.Color(252, 207, 132));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        escolha01.setBackground(new java.awt.Color(245, 156, 97));
        escolha01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha01ActionPerformed(evt);
            }
        });

        escolha06.setBackground(new java.awt.Color(245, 156, 97));
        escolha06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha06ActionPerformed(evt);
            }
        });

        escolha02.setBackground(new java.awt.Color(245, 156, 97));
        escolha02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha02ActionPerformed(evt);
            }
        });

        escolha03.setBackground(new java.awt.Color(245, 156, 97));
        escolha03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha03ActionPerformed(evt);
            }
        });

        escolha04.setBackground(new java.awt.Color(245, 156, 97));
        escolha04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha04ActionPerformed(evt);
            }
        });

        escolha05.setBackground(new java.awt.Color(245, 156, 97));
        escolha05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha05ActionPerformed(evt);
            }
        });

        escolha08.setBackground(new java.awt.Color(245, 156, 97));
        escolha08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha08ActionPerformed(evt);
            }
        });

        escolha07.setBackground(new java.awt.Color(245, 156, 97));
        escolha07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha07ActionPerformed(evt);
            }
        });

        escolhaExtra03.setBackground(new java.awt.Color(245, 156, 97));
        escolhaExtra03.setEnabled(false);
        escolhaExtra03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaExtra03ActionPerformed(evt);
            }
        });

        escolhaExtra02.setBackground(new java.awt.Color(245, 156, 97));
        escolhaExtra02.setEnabled(false);
        escolhaExtra02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaExtra02ActionPerformed(evt);
            }
        });

        escolhaExtra01.setBackground(new java.awt.Color(245, 156, 97));
        escolhaExtra01.setEnabled(false);
        escolhaExtra01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaExtra01ActionPerformed(evt);
            }
        });

        escolhaExtra04.setBackground(new java.awt.Color(245, 156, 97));
        escolhaExtra04.setEnabled(false);
        escolhaExtra04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaExtra04ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Adicionar Ingredientes Extras :");

        grupoRadio.add(RadioSim);
        RadioSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioSim.setText("Sim");
        RadioSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSimActionPerformed(evt);
            }
        });

        grupoRadio.add(RadioNao);
        RadioNao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioNao.setText("Não");
        RadioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(escolha01, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha03, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha04, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha05, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha06, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolha07, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escolha08, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(escolhaExtra01, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolhaExtra02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolhaExtra03, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escolhaExtra04, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioSim)
                                .addGap(18, 18, 18)
                                .addComponent(RadioNao)))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(RadioSim)
                    .addComponent(RadioNao))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escolha07, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha08, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha01, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha05, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha04, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha03, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha06, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolhaExtra03, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolhaExtra02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolhaExtra04, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolhaExtra01, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/titulo_ingrediente.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(247, 224, 182));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        alcaparra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_alcaparra.png"))); // NOI18N
        alcaparra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcaparraActionPerformed(evt);
            }
        });

        azeitona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_azeitona.png"))); // NOI18N
        azeitona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azeitonaActionPerformed(evt);
            }
        });

        brocolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_brocolis.png"))); // NOI18N
        brocolis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brocolisActionPerformed(evt);
            }
        });

        bacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_bacon.png"))); // NOI18N
        bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconActionPerformed(evt);
            }
        });

        cebola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_cebola.png"))); // NOI18N
        cebola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cebolaActionPerformed(evt);
            }
        });

        cenoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_cenoura.png"))); // NOI18N
        cenoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenouraActionPerformed(evt);
            }
        });

        alhoPoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_alho_poro.png"))); // NOI18N
        alhoPoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alhoPoroActionPerformed(evt);
            }
        });

        carneSol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_carne_sol.png"))); // NOI18N
        carneSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carneSolActionPerformed(evt);
            }
        });

        ervilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_ervilha.png"))); // NOI18N
        ervilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ervilhaActionPerformed(evt);
            }
        });

        alho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_alho.png"))); // NOI18N
        alho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alhoActionPerformed(evt);
            }
        });

        frango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_frango.png"))); // NOI18N
        frango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangoActionPerformed(evt);
            }
        });

        camarao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_camarao.png"))); // NOI18N
        camarao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camaraoActionPerformed(evt);
            }
        });

        presunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_presunto.png"))); // NOI18N
        presunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presuntoActionPerformed(evt);
            }
        });

        peitoPeru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_peru.png"))); // NOI18N
        peitoPeru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peitoPeruActionPerformed(evt);
            }
        });

        palmito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_palmito.png"))); // NOI18N
        palmito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palmitoActionPerformed(evt);
            }
        });

        salmao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_salmao.png"))); // NOI18N
        salmao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salmaoActionPerformed(evt);
            }
        });

        linguica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_linguica.png"))); // NOI18N
        linguica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linguicaActionPerformed(evt);
            }
        });

        mussarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_mussarela.png"))); // NOI18N
        mussarela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mussarelaActionPerformed(evt);
            }
        });

        milho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_milho.png"))); // NOI18N
        milho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milhoActionPerformed(evt);
            }
        });

        gorgonzola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_gorgonzola.png"))); // NOI18N
        gorgonzola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorgonzolaActionPerformed(evt);
            }
        });

        champignon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_champignon.png"))); // NOI18N
        champignon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champignonActionPerformed(evt);
            }
        });

        tomateSeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_tomate_seco.png"))); // NOI18N
        tomateSeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomateSecoActionPerformed(evt);
            }
        });

        uvaPassa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_uva.png"))); // NOI18N
        uvaPassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvaPassaActionPerformed(evt);
            }
        });

        minas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_minas.png"))); // NOI18N
        minas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minasActionPerformed(evt);
            }
        });

        coalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_coalho.png"))); // NOI18N
        coalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coalhoActionPerformed(evt);
            }
        });

        ovoCodorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_codorna.png"))); // NOI18N
        ovoCodorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovoCodornaActionPerformed(evt);
            }
        });

        tomate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_tomate.png"))); // NOI18N
        tomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(alcaparra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alho, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alhoPoro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(azeitona, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bacon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brocolis, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(camarao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carneSol, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cebola, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cenoura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(ervilha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frango, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gorgonzola, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linguica, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(milho, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mussarela, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(palmito, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peitoPeru, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(presunto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salmao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(champignon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tomateSeco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(uvaPassa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tomate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ovoCodorna, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coalho, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alho)
                            .addComponent(alcaparra)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alhoPoro)
                                .addComponent(azeitona)
                                .addComponent(bacon)
                                .addComponent(brocolis)
                                .addComponent(camarao)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carneSol)
                            .addComponent(cebola)
                            .addComponent(cenoura)))
                    .addComponent(champignon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ervilha)
                    .addComponent(frango)
                    .addComponent(salmao)
                    .addComponent(presunto)
                    .addComponent(peitoPeru)
                    .addComponent(palmito)
                    .addComponent(mussarela)
                    .addComponent(milho)
                    .addComponent(linguica)
                    .addComponent(gorgonzola)
                    .addComponent(tomateSeco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uvaPassa)
                    .addComponent(tomate)
                    .addComponent(ovoCodorna)
                    .addComponent(coalho)
                    .addComponent(minas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alcaparraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcaparraActionPerformed
        MostrarBotaoEscolha("Alcaparra");
    }//GEN-LAST:event_alcaparraActionPerformed

    private void azeitonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azeitonaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Azeitona Preta");
    }//GEN-LAST:event_azeitonaActionPerformed

    private void brocolisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brocolisActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Brócolis");
    }//GEN-LAST:event_brocolisActionPerformed

    private void baconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Bacon");
    }//GEN-LAST:event_baconActionPerformed

    private void cebolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebolaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Cebola");
    }//GEN-LAST:event_cebolaActionPerformed

    private void cenouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenouraActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Cenoura");
    }//GEN-LAST:event_cenouraActionPerformed

    private void alhoPoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alhoPoroActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Alho Poró");
    }//GEN-LAST:event_alhoPoroActionPerformed

    private void carneSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carneSolActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Carne de Sol");
    }//GEN-LAST:event_carneSolActionPerformed

    private void alhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alhoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Alho");
    }//GEN-LAST:event_alhoActionPerformed

    private void frangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Frango");
    }//GEN-LAST:event_frangoActionPerformed

    private void camaraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camaraoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Camarão");
    }//GEN-LAST:event_camaraoActionPerformed

    private void presuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presuntoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Presunto");
    }//GEN-LAST:event_presuntoActionPerformed

    private void peitoPeruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peitoPeruActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Peito de Peru");
    }//GEN-LAST:event_peitoPeruActionPerformed

    private void palmitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palmitoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Palmito");
    }//GEN-LAST:event_palmitoActionPerformed

    private void salmaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salmaoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Salmão");
    }//GEN-LAST:event_salmaoActionPerformed

    private void linguicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linguicaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Linguiça Calabresa");
    }//GEN-LAST:event_linguicaActionPerformed

    private void mussarelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mussarelaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Mussarela");
    }//GEN-LAST:event_mussarelaActionPerformed

    private void milhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milhoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Milho");
    }//GEN-LAST:event_milhoActionPerformed

    private void gorgonzolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorgonzolaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Gorgonzola");
    }//GEN-LAST:event_gorgonzolaActionPerformed

    private void champignonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champignonActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Champignon");
    }//GEN-LAST:event_champignonActionPerformed

    private void tomateSecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomateSecoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Tomate Seco");
    }//GEN-LAST:event_tomateSecoActionPerformed

    private void uvaPassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvaPassaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Passas");
    }//GEN-LAST:event_uvaPassaActionPerformed

    private void minasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minasActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Queijo Minas");
    }//GEN-LAST:event_minasActionPerformed

    private void coalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coalhoActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Queijo Coalho");
    }//GEN-LAST:event_coalhoActionPerformed

    private void ovoCodornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovoCodornaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Ovo de Codorna");
    }//GEN-LAST:event_ovoCodornaActionPerformed

    private void tomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomateActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Tomate");
    }//GEN-LAST:event_tomateActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        novo.proximo(escolhasIngredientes, escolhasExtras);
    }//GEN-LAST:event_proximoActionPerformed

    private void escolha01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha01ActionPerformed
        escolha01.setText("");
        ativar();
    }//GEN-LAST:event_escolha01ActionPerformed

    private void escolha02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha02ActionPerformed
        // TODO add your handling code here:
        escolha02.setText("");
        ativar();
    }//GEN-LAST:event_escolha02ActionPerformed

    private void escolha03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha03ActionPerformed
        // TODO add your handling code here:
        escolha03.setText("");
        ativar();
    }//GEN-LAST:event_escolha03ActionPerformed

    private void escolha04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha04ActionPerformed
        // TODO add your handling code here:
        escolha04.setText("");
        ativar();
    }//GEN-LAST:event_escolha04ActionPerformed

    private void escolha05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha05ActionPerformed
        // TODO add your handling code here:
        escolha05.setText("");
        ativar();
    }//GEN-LAST:event_escolha05ActionPerformed

    private void escolha06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha06ActionPerformed
        // TODO add your handling code here:
        escolha06.setText("");
        ativar();
    }//GEN-LAST:event_escolha06ActionPerformed

    private void escolha07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha07ActionPerformed
        // TODO add your handling code here:
        escolha07.setText("");
        ativar();
    }//GEN-LAST:event_escolha07ActionPerformed

    private void escolha08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha08ActionPerformed
        // TODO add your handling code here:
        escolha08.setText("");
        ativar();
    }//GEN-LAST:event_escolha08ActionPerformed

    private void RadioSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSimActionPerformed
        // TODO add your handling code here:
        boolean radio = RadioSim.isSelected();
        if(radio == true){
            AtivarBotaoExtras();
        }        
    }//GEN-LAST:event_RadioSimActionPerformed

    private void RadioNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNaoActionPerformed
        // TODO add your handling code here:
        boolean radio = RadioNao.isSelected();
        if(radio == true){
            DesativarBotaoExtras();
        } 
    }//GEN-LAST:event_RadioNaoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        novo.cancelar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void ervilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ervilhaActionPerformed
        // TODO add your handling code here:
        MostrarBotaoEscolha("Ervilha");
    }//GEN-LAST:event_ervilhaActionPerformed

    private void escolhaExtra01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaExtra01ActionPerformed
      escolhaExtra01.setText("");
        ativar();    // TODO add your handling code here:
    }//GEN-LAST:event_escolhaExtra01ActionPerformed

    private void escolhaExtra03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaExtra03ActionPerformed
              escolhaExtra03.setText("");
        ativar();    // TODO add your handling code here:
    }//GEN-LAST:event_escolhaExtra03ActionPerformed

    private void escolhaExtra04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaExtra04ActionPerformed
              escolhaExtra04.setText("");
        ativar();    // TODO add your handling code here:
    }//GEN-LAST:event_escolhaExtra04ActionPerformed

    private void escolhaExtra02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaExtra02ActionPerformed
        escolhaExtra02.setText("");
        ativar();    // TODO add your handling code here:
    }//GEN-LAST:event_escolhaExtra02ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaIngredientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioNao;
    private javax.swing.JRadioButton RadioSim;
    private javax.swing.JButton alcaparra;
    private javax.swing.JButton alho;
    private javax.swing.JButton alhoPoro;
    private javax.swing.JButton azeitona;
    private javax.swing.JButton bacon;
    private javax.swing.JButton brocolis;
    private javax.swing.JButton camarao;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton carneSol;
    private javax.swing.JButton cebola;
    private javax.swing.JButton cenoura;
    private javax.swing.JButton champignon;
    private javax.swing.JButton coalho;
    private javax.swing.JButton ervilha;
    private javax.swing.JButton escolha01;
    private javax.swing.JButton escolha02;
    private javax.swing.JButton escolha03;
    private javax.swing.JButton escolha04;
    private javax.swing.JButton escolha05;
    private javax.swing.JButton escolha06;
    private javax.swing.JButton escolha07;
    private javax.swing.JButton escolha08;
    private javax.swing.JButton escolhaExtra01;
    private javax.swing.JButton escolhaExtra02;
    private javax.swing.JButton escolhaExtra03;
    private javax.swing.JButton escolhaExtra04;
    private javax.swing.JButton frango;
    private javax.swing.JButton gorgonzola;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton linguica;
    private javax.swing.JButton milho;
    private javax.swing.JButton minas;
    private javax.swing.JButton mussarela;
    private javax.swing.JButton ovoCodorna;
    private javax.swing.JButton palmito;
    private javax.swing.JButton peitoPeru;
    private javax.swing.JButton presunto;
    private javax.swing.JButton proximo;
    private javax.swing.JButton salmao;
    private javax.swing.JButton tomate;
    private javax.swing.JButton tomateSeco;
    private javax.swing.JButton uvaPassa;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
