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
		for (int i = 0; i < lengthSymbols - 1; i++) {
			if (symbols[i] > symbols[i + 1]) {
				char temp = symbols[i];
				symbols[i] = symbols[i + 1];
				symbols[i + 1] = temp;
				i = 0;
			}
			if (symbols[i] == symbols[i + 1]) {
				isUnique = false;
				return isUnique;
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

	private static int getFactorial(int n) {
		int result;
		if (n == 1) {
			return 1;
		}
		result = getFactorial(n - 1) * n;
		return result;
	}
}