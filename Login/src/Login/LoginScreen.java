package Login;

//Imports necessários
import java.util.HashMap;
import java.util.Map;


/**
 * Um simples teste de autenticação de usuário
 */
public class LoginScreen {

	private Map<String, String> userDatabase;
	
	/**
     * Construtor da classe LoginScreen.
     * Inicializa a base de dados de usuários com alguns valores de exemplo.
     */
	
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	
	/**
     * Método para autenticar um usuário com base no nome de usuário e senha.
     *
     * @param username O nome de usuário fornecido pelo usuário.
     * @param password A senha fornecida pelo usuário.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true; // Retorna verdadeiro se a senha for correta.
			}
		}
		return false; // Retorna falso se a autenticação falhar.
	}
	
	/**
     * Método para adicionar um novo usuário à base de dados.
     *
     * @param username O nome de usuário do novo usuário a ser adicionado.
     * @param password A senha do novo usuário a ser adicionado.
     */
	
	public void addUser(String username, String password) {	
		userDatabase.put(username, password);
	}
	
}
