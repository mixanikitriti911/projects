package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkListTest {

	@Test
	public void testMain() {
		MarkList window = new MarkList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testMarkList() {
		MarkList window = new MarkList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
