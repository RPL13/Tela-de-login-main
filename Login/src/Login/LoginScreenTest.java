package Login;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {

	@Test
	public void testSuccesfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john", "password123"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john", "wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser", "testsenha");
		assertTrue(loginScreen.login("testuser", "testsenha"));
	}
	
}
