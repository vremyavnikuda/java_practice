package java_offer_task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Find_avarageTest {

	private static final double DELTA = 1e-15;

	@Test
	public void find_average() {
		assertEquals(1, Find_avarage.find_average(new int[]{1, 1, 1}), DELTA);
		assertEquals(2, Find_avarage.find_average(new int[]{1, 2, 3}), DELTA);
	}
}
