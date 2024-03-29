import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAOFactory;
import com.curso.algarworks.curso.modulo.Cliente;

public class BurcaPeloCodigo {

	public static void main(String[] args) {

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

		Cliente cliente = clienteDAO.buscarPeloCodigo(2L);

		if (cliente != null) {
			System.out.println("----------Cliente Encontrado-----------");
			System.out.printf("Codigo: %d\n" , cliente.getCodigo());
			System.out.printf("Nome: %s\n" , cliente.getNome());
			System.out.println();

		} else {
			System.out.println("Nenhum cliente n�o encontrado!");
		}

	}

}
