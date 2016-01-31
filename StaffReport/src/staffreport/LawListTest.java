package staffreport;

import static org.junit.Assert.*;

import org.junit.Test;

public class LawListTest {

	@Test
	public void testMain() {
		LawList window = new LawList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

	@Test
	public void testLawList() {
		LawList window = new LawList("boss", 100);
		window.frmStaffreport.setVisible(true);
		assertNotNull(window);
	}

}
