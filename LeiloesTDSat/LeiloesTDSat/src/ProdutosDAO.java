/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        try {
        conn = new conectaDAO().connectDB();
        String sql = "INSERT INTO uc11 (nome,valor,status) VALUES (?,?,?)";
        
        prep = this.conn.prepareStatement(sql);
        prep.setString(1, produto.getNome());
        prep.setInt(2, produto.getValor());
        prep.setString(0, produto.getStatus());
        
        prep.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao incluir o produto. Tente novamente");
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
}

