
package br.senai.sc.sistloja;

import br.senai.sc.sistloja.dao.ClienteDao;
import br.senai.sc.sistloja.modelo.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SisLoj {
    
    public static void main(String[] args) throws SQLException{
        ClienteDao c = new ClienteDao();
        List <Cliente> clientes = c.listarClientes();
        
        for (int i = 0; i < clientes.size(); i++){
            Cliente cli = clientes.get(i);
            System.out.println(cli.getNomeCliente()+" | "+cli.getEnderecoCliente());
        }
        
    }
    
}
