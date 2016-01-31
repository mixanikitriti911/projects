package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewWorkerTest {

	@Test
	public void testMain() {
		NewWorker window = new NewWorker(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testNewWorker() {
		NewWorker window = new NewWorker(100, 301, "boss");
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
