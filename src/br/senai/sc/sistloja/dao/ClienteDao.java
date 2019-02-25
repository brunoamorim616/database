
package br.senai.sc.sistloja.dao;

import br.senai.sc.sistloja.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao extends ConnectionFactory {
    private Connection con;
    
    public ClienteDao (){
        this.con = this.getConnection();
    }
    
    public List<Cliente> listarClientes() throws SQLException{
        String sql = "select * from cliente";
        
        try (PreparedStatement st = this.con.prepareStatement(sql)){ 
            ResultSet rs = st.executeQuery();
            
            List <Cliente> clientes = new ArrayList<Cliente>();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNomeCliente(rs.getString("nomeCliente"));
                c.setEnderecoCliente(rs.getString("enderecoCliente"));
                c.setBairroCliente(rs.getString("bairroCliente"));
                c.setComplemento(rs.getString("complemento"));
                c.setCepCliente(rs.getInt("cepCliente"));
                c.setCelularCliente(rs.getInt("celularCliente"));
                
                clientes.add(c);
            }
            rs.close();
            st.close();
            this.con.close();
            
            return clientes;
        }
    }
}
