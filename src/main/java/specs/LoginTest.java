package specs;

import models.Login;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    Login login;

    @Before
    public void before() {
        login = new Login("test@login.com", "password");
    }

    @Test
    public void canHaveEmail() {
        assertEquals("test@login.com", login.getEmail());
    }

    @Test
    public void canSetEmail() {
        login.setEmail("login@login.com");
        assertEquals("login@login.com", login.getEmail());
    }

    @Test
    public void canHavePassword() {
        assertEquals("password", login.getPassword());
    }

    @Test
    public void canSetPassword() {
        login.setPassword("1234");
        assertEquals("1234", login.getPassword());
    }


}
