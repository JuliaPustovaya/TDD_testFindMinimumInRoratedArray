import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

	@Test
	public void testCalculateTimeAngle() {
		assertEquals(82.5, Utils.calculateTimeAngle(12, 15), 0.1);
		assertEquals(82.5, Utils.calculateTimeAngle(0, 15), 0.1);
		assertEquals(157.5, Utils.calculateTimeAngle(15, 45), 0.1);
		assertEquals(157.5, Utils.calculateTimeAngle(3, 45), 0.1);
		assertEquals(105, Utils.calculateTimeAngle(21, 30), 0.1);
		assertEquals(105, Utils.calculateTimeAngle(9, 30), 0.1);
		assertEquals(0, Utils.calculateTimeAngle(0, 0), 0.1);
		assertEquals(0, Utils.calculateTimeAngle(12, 0), 0.1);
	}

	@Test
	public void testIsAllCharsUnique_2() {
		Assert.assertTrue(Utils.isAllCharsUnique("asdfvie,"));
		Assert.assertFalse(Utils.isAllCharsUnique("asdfviea"));
	}

	@Test
	public void testReverseString() {
		assertEquals("dcba", Utils.reverseString("abcd"));
		assertEquals("_UzYX", Utils.reverseString("XYzU_"));
	}

	@Test
	public void testFindMinimumInRoratedArray() {
		assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {3, 4, 5, 6, 7, 1, 2}));
		assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {6, 7, 1, 2, 3, 4, 5}));
		assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {2, 3, 4, 5, 6, 7, 1}));
	}
}