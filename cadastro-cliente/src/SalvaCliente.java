import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAOFactory;
import com.curso.algarworks.curso.modulo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		Cliente cliente = new Cliente();

		String nome = JOptionPane.showInputDialog(null, "Nome Cliente", "Cadastro Cliente",
				JOptionPane.QUESTION_MESSAGE);

		if (cliente != null) {
			cliente.setNome(nome);

			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvarCliente(cliente);
			JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!!!");
		}
	}

}
