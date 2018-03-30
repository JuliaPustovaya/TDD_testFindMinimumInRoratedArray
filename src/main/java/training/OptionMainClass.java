package training;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionMainClass {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Johng");
		if (optional.isPresent()) {
		}
		optional.ifPresent(val -> System.out.println(val)); //условие выполнится и мы увидим John

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> result = list
				.stream().parallel()
				.filter(num -> num < 4).findAny();

	}
}
