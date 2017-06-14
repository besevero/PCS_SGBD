package View;

import Controle.ControleEstoque;
import javax.swing.DefaultListModel;
import DAO.ProdutoDAO;
import Model.Bebida;
import Model.Molho;
import Model.Prato_Favorito;
import Model.Prato_Promocao;
import Model.Produto_Extra;
import Model.Produto_Ingrediente;
import Model.Produto_Massa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author labccet
 */
public class TelaVisualizarEstoque extends javax.swing.JFrame {

    private DefaultListModel modeloEstoque = new DefaultListModel();  
    private ControleEstoque controleEstoque;
    private String nome;
    private TelaAtendente atendente;
    private TelaEstoque estoque;
    private boolean reposicao = false;
    private ArrayList produto = new ArrayList();
    
    public void AdicionaEstoque(String nomes) throws ClassNotFoundException{
        
        ProdutoDAO persistencia = new ProdutoDAO();
                
        modeloEstoque.clear();

        if(nomes.equals("Bebida.xml")){
            Bebida bebida = new Bebida();
            try {
                bebida.setIdBebida(persistencia.consultarProdutoTipo("bebida"));
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i = 0 ; i<bebida.getIdBebida().size();i++){
                modeloEstoque.addElement(bebida.getIdBebida().get(i).getNome()
                        + " ------ " + bebida.getIdBebida().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                setReposicao(false);
                persistencia.atualizarQuantidadeProduto("bebida");
            }
            
            
        }
         if(nomes.equals("Molho.xml")){
            Molho molho= new Molho();
            try {
                molho.setMolho(persistencia.consultarProdutoTipo("molho"));
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i = 0 ; i<molho.getMolho().size();i++){
                modeloEstoque.addElement(molho.getMolho().get(i).getNome()
                        + " ------ " + molho.getMolho().get(i).getQuantidade());
            }
            if(isReposicao() == true){
               persistencia.atualizarQuantidadeProduto("molho");
                setReposicao(false);
               
            }
            
        }
          if(nomes.equals("Favorito.xml")){
            Prato_Favorito favorito= new Prato_Favorito();
            try {
                favorito.setfavorito(persistencia.consultarProdutoTipo("favorito"));
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i = 0 ; i<favorito.getFavorito().size();i++){
                modeloEstoque.addElement(favorito.getFavorito().get(i).getNome()
                        + " ------ " + favorito.getFavorito().get(i).getQuantidade());
            }
            if(isReposicao() == true){
              persistencia.atualizarQuantidadeProduto("favorito");
                setReposicao(false);
            }
            
        }
           if(nomes.equals("Promocao.xml")){
            Prato_Promocao promocao = new Prato_Promocao();
            try {
                promocao.setPromoc(persistencia.consultarProdutoTipo("promocao"));
            } catch (SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i = 0 ; i<promocao.getPromoc().size();i++){
                modeloEstoque.addElement(promocao.getPromoc().get(i).getNome()
                        + " ------ " + promocao.getPromoc().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                persistencia.atualizarQuantidadeProduto("bebida");
                setReposicao(false);
            }
            
        }
            if(nomes.equals("Extra.xml")){
               Produto_Extra extra = new Produto_Extra();
            try {
                extra.setProdExtra(persistencia.consultarProdutoTipo("extra"));
            } catch (SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
                for(int i = 0 ; i<extra.getProdExtra().size();i++){
                    modeloEstoque.addElement(extra.getProdExtra().get(i).getNome()
                        + " ------ " + extra.getProdExtra().get(i).getQuantidade());
            }
                if(isReposicao() == true){
                    persistencia.atualizarQuantidadeProduto("extra");
                    setReposicao(false);
                }
        }
            if(nomes.equals("Ingrediente.xml")){
                Produto_Ingrediente ingrediente = new Produto_Ingrediente();
            try {
                ingrediente.setIdIngrediente(persistencia.consultarProdutoTipo("ingrediente"));
            } catch (SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
                for(int i = 0 ; i<ingrediente.getIdIngrediente().size();i++){
                    modeloEstoque.addElement(ingrediente.getIdIngrediente().get(i).getNome()
                            + " ------ " + ingrediente.getIdIngrediente().get(i).getQuantidade());
            }
                if(isReposicao() == true){
                    persistencia.atualizarQuantidadeProduto("ingrediente");
                    setReposicao(false);
            }
            if(nomes.equals("Massa.xml")){
                Produto_Massa massa = new Produto_Massa();
                    try {
                        massa.setIdMassa(persistencia.consultarProdutoTipo("massa"));
                    } catch (SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                for(int i = 0 ; i<massa.getIdMassa().size();i++){
                modeloEstoque.addElement(massa.getIdMassa().get(i).getNome()
                        + " ------ " + massa.getIdMassa().get(i).getQuantidade());
                
            }
                if(isReposicao() == true){
                    persistencia.atualizarQuantidadeProduto("massa");
                    setReposicao(false);
                }   
        }
        }
            
    }
    public TelaVisualizarEstoque(String nome, TelaAtendente atendente, TelaEstoque estoque) {
        this.nome = nome;
        this.atendente = atendente;
        this.estoque = estoque;
        initComponents();        
        if(nome.equals("Promocao.xml")){
                titulo.setText("Pratos Promoção");
        }
        else    titulo.setText(nome.substring(0, (nome.length()-4)));
        if(nome.equals("Massa.xml")){
            
        }
        AdicionaEstoque(nome);
        listaDoEstoque.setModel(modeloEstoque);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        repor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDoEstoque = new javax.swing.JList<>();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizando Estoque");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(196, 239, 196));

        voltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_estoque_voltar.png"))); // NOI18N
        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_ok.png"))); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        repor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_estoque_carrinho.png"))); // NOI18N
        repor.setText("REPOR ESTOQUE");
        repor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporActionPerformed(evt);
            }
        });

        listaDoEstoque.setBackground(new java.awt.Color(204, 255, 204));
        listaDoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaDoEstoque);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_estoque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(569, 569, 569)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(repor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
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

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
      estoque.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      atendente.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void reporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporActionPerformed
        setReposicao(true);
        AdicionaEstoque(nome);
        this.setVisible(false);
        this.setVisible(true);
        
    }//GEN-LAST:event_reporActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new TelaVisualizarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDoEstoque;
    private javax.swing.JButton ok;
    private javax.swing.JButton repor;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the reposicao
     */
    public boolean isReposicao() {
        return reposicao;
    }

    /**
     * @param reposicao the reposicao to set
     */
    public void setReposicao(boolean reposicao) {
        this.reposicao = reposicao;
    }
}
