import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Tdd.Utils;

public class UtilsTest {

	@Test
	public void testFindMinimumInRoratedArray() {
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {3, 4, 5, 6, 7, 1, 2}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {6, 7, 1, 2, 3, 4, 5}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {2, 3, 4, 5, 6, 7, 1}));
		Assert.assertEquals(1, Utils.findMinimumInRoratedArray(new int[] {1, 2, 3, 4, 5, 6, 7}));
		Assert.assertEquals(82.5, Utils.calculateTimeAngle(12, 15), 0.1);
		Assert.assertEquals(82.5, Utils.calculateTimeAngle(0, 15), 0.1);
		Assert.assertEquals(157.5, Utils.calculateTimeAngle(15, 45), 0.1);
		Assert.assertEquals(157.5, Utils.calculateTimeAngle(3, 45), 0.1);
		Assert.assertEquals(105, Utils.calculateTimeAngle(21, 30), 0.1);
		Assert.assertEquals(105, Utils.calculateTimeAngle(9, 30), 0.1);
		Assert.assertEquals(0, Utils.calculateTimeAngle(0, 0), 0.1);
		Assert.assertEquals(0, Utils.calculateTimeAngle(12, 0), 0.1);
	}

	@Test
	public void testIsAllCharsUnique_2() {
		Assert.assertTrue(Utils.isAllCharsUnique("asdfvie,"));
		Assert.assertFalse(Utils.isAllCharsUnique("asdfviea"));
		Assert.assertFalse(Utils.isAllCharsUnique("yabcdaz"));
	}

	@Test
	public void testReverseString() {
		Assert.assertEquals("dcba", Utils.reverseString("abcd"));
		Assert.assertEquals("_UzYX", Utils.reverseString("XYzU_"));
		Assert.assertEquals("AB", Utils.reverseString("BA"));
	}

	@Test
	public void testFactorial() {
		Assert.assertEquals(1, Utils.getFactorial(-5));
		Assert.assertEquals(1, Utils.getFactorial(0));
		Assert.assertEquals(1, Utils.getFactorial(1));
		Assert.assertEquals(6, Utils.getFactorial(3));
		Assert.assertEquals(720, Utils.getFactorial(6));
	}

	@Test
	public void testGeneratePermutations() {
		Assertions.assertEquals(new HashSet<>(Collections.singletonList("a")) // 1
				, Utils.getNewStrings("a"));
		Utils.hashSet.clear();
		Assertions.assertEquals(new HashSet<>(Arrays.asList("ab", "ba")) // 2
				, Utils.getNewStrings("ab"));
		Utils.hashSet.clear();
		Assertions.assertEquals(new HashSet<>(Arrays.asList("abc", "cab", "acb", "bac", "bca", "cba")) // 6
				, Utils.getNewStrings("abc"));
		Utils.hashSet.clear();
		Assertions.assertEquals(new HashSet<>(Arrays.asList("abcd", "abdc", "adbc", "dabc",
				"cabd", "cadb", "cdab", "dcab", "acbd", "acdb", "adcb", "dacb", "bacd", "badc", "bdac", "dbac", "bcad",
				"bcda", "bdca", "dbca", "cbad", "cbda", "cdba", "dcba")) // 24
				, Utils.getNewStrings("abcd"));
		Utils.hashSet.clear();
		Assertions.assertEquals(120, Utils.getNewStrings("abcde").size());
		Utils.hashSet.clear();
		Assertions.assertEquals(720, Utils.getNewStrings("abcdef").size());
	}
}