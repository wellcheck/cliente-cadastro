import java.util.List;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAOFactory;
import com.curso.algarworks.curso.modulo.Cliente;

public class BuscarTodosClientes {
	public static void main(String[] args) {

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for(Cliente cliente : clientes) {
			System.out.println("----------Cliente-----------");
			System.out.printf("Codigo: %d\n" , cliente.getCodigo());
			System.out.printf("Nome: %s\n" , cliente.getNome());
			System.out.println();
		}
	}
}
