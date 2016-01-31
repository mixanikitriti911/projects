package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogInTest {

	@Test
	public void testMain() {
		LogIn window = new LogIn();
		window.frmStaffReport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testLogIn() {
		LogIn window = new LogIn();
		window.frmStaffReport.setVisible(true);
		assertNotNull(window);
	}

}
