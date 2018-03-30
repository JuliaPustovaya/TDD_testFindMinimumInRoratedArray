package Tdd;

import java.util.Arrays;
import java.util.HashSet;

public class Utils {

	public static int findMinimumInRoratedArray(int[] arr) {
		return getMinimum(arr, 0, arr.length - 1);
	}

	private static int getMinimum(int[] arrTemp, int left, int right) {
		if (left == right) {
			return arrTemp[left];
		}
		int mid = (left + right) / 2;
		if (arrTemp[left] > arrTemp[mid]) {
			return getMinimum(arrTemp, left, mid);
		} else if (arrTemp[mid] > arrTemp[right]) {
			return getMinimum(arrTemp, mid + 1, right);
		} else {
			return arrTemp[left];
		}
	}

	public static double calculateTimeAngle(int hour, int min) {
		int degreePerMinute = 360 / 60;
		int hourClockDivisionsForMinutues = 5;
		double partsPerHour = ((hour >= 12) ? hour - 12 : hour) * hourClockDivisionsForMinutues;
		double getDegreesMinutes = min * degreePerMinute;
		double getDegreesPerHours = (partsPerHour + (min / 12.0)) * degreePerMinute;
		return Math.abs(getDegreesPerHours - getDegreesMinutes);
	}

	public static boolean isAllCharsUnique(String str) {
		char symbols[] = str.toCharArray();
		int lengthSymbols = symbols.length;
		boolean isUnique = true;
		Arrays.sort(symbols);
		for (int i = 0; i < lengthSymbols - 1; i++) {
			if (symbols[i] == symbols[i + 1]) {
				isUnique = false;
				break;
			}
		}
		return isUnique;
	}

	public static String reverseString(String str) {
		char symbols[] = str.toCharArray();
		int lengthSymbols = symbols.length;
		for (int i = 0; i < lengthSymbols / 2; i++) {
			char temp = symbols[i];
			symbols[i] = symbols[lengthSymbols - 1 - i];
			symbols[lengthSymbols - 1 - i] = temp;
		}
		return new String(symbols);
	}

	public static int getFactorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return getFactorial(n - 1) * n;
	}

	public static HashSet<String> hashSet = new HashSet<>();

	public static HashSet<String> getNewStrings(String str) {
		change("", str);
		return hashSet;
	}

	private static void change(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			hashSet.add(prefix);
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				String tem1 = str.substring(0, i);
				String tem2 = str.substring(i + 1, n);
				change(prefix + str.charAt(i), tem1 + tem2);
			}
		}
	}
}