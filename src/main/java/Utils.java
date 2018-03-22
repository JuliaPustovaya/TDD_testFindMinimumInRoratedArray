import java.util.HashSet;

public class Utils {

	public static int findMinimumInRoratedArray(int[] arr) {
		int temp, j;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				j = i;
				while (j > 0 && temp < arr[j - 1]) {
					arr[j] = arr[j - 1];
					j--;
				}
				arr[j] = temp;
			}
		}
		return arr[0];
	}

	public static double calculateTimeAngle(int hour, int min) {
		double degreePerMinute = 360.0 / 60.0;
		double partsPerHour = ((hour >= 12) ? hour - 12 : hour) * 5.0;
		double getDegreesMinutes = min * degreePerMinute;
		double getDegreesPerHours = (partsPerHour + (min / 12.0)) * degreePerMinute;
		double getResultDegree = Math.abs(getDegreesPerHours - getDegreesMinutes);
		return getResultDegree;
	}

	public static boolean IsAllCharsUnique(String str) {
		boolean isUnique = true;
		String strWithoutSymbol;
		for (int i = 0; i < str.length(); i++) {
			strWithoutSymbol = str.substring(i + 1, str.length());
			String symbol = String.valueOf(str.charAt(i));
			if (strWithoutSymbol.contains(symbol)) {
				isUnique = false;
				return isUnique;
			}
		}
		return isUnique;
	}
}