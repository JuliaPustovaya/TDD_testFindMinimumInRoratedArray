import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {

	@Test
	public void testFindMinimumInRoratedArray() {
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {3, 4, 5, 6, 7, 1, 2}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {6, 7, 1, 2, 3, 4, 5}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {2, 3, 4, 5, 6, 7, 1}));

		Assert.assertEquals(82.5, Utils.calculateTimeAngle(12, 15), 0.1);
		Assert.assertEquals(82.5, Utils.calculateTimeAngle(0, 15), 0.1);
		Assert.assertEquals(157.5, Utils.calculateTimeAngle(15, 45), 0.1);
		Assert.assertEquals(157.5, Utils.calculateTimeAngle(3, 45), 0.1);
		Assert.assertEquals(105, Utils.calculateTimeAngle(21, 30), 0.1);
		Assert.assertEquals(105, Utils.calculateTimeAngle(9, 30), 0.1);
		Assert.assertEquals(0, Utils.calculateTimeAngle(0, 0), 0.1);
		Assert.assertEquals(0, Utils.calculateTimeAngle(12, 0), 0.1);
	}
}