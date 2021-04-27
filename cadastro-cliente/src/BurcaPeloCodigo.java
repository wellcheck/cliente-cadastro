import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAOFactory;
import com.curso.algarworks.curso.modulo.Cliente;

public class BurcaPeloCodigo {

	public static void main(String[] args) {

		ClienteDAO clienteDAO = DAOFactory.getDAoFactory().getClienteDAO();

		Cliente cliente = ClienteDAO.buscarPeloCodigo(1L);

		if (cliente != null) {
			System.out.println("----------Cliente Encontrado-----------");
			System.out.println("Codigo: %d\n" + cliente.getCodigo());
			System.out.println("Nome: %d\\n" + cliente.getNome());
			System.out.println();

		} else {
			System.out.println("Nenhum cliente não encontrado!");
		}

	}

}
