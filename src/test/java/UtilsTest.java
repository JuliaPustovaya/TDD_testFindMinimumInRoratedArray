import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {

	@Test
	public void testFindMinimumInRoratedArray() {
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {3, 4, 5, 6, 7, 1, 2}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {6, 7, 1, 2, 3, 4, 5}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {2, 3, 4, 5, 6, 7, 1}));
	}
}