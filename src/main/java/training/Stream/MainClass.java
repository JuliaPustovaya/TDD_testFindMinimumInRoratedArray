package training.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList();
		cities.addAll(Arrays.asList(new String[] {"Париж", "Лондон", "Мадрид"}));
		Stream<User> userStream = Stream.of(new User("Peter", 18), new User("Hola", 10), new User("Marina", 5),
				new User("Mark", 35), new User("Robert", 5));
	/*	userStream.filter(p -> p.getPrice() > 2)
				.map(p -> "Name: " + p.getName())
				.skip(2)
				.forEach(s -> System.out.println(s)); */
		Optional<User> allNmaesInsentance = userStream.reduce((x, y) -> {
			if (x.getName().length() < 5) {
				return x;
			} else {
				return y;
			}
		});
		System.out.println(allNmaesInsentance.get().getName());
		Stream<String> listStrings = Stream.of("Victoe", "Holanf", "Antob");
		Optional<String> optional = listStrings.reduce((x, y) -> x + " love " + y);
		System.out.println(optional.get());
		Stream<User> stream = Stream.of(new User("A", 1), new User("B", 2));
	//	ArrayList<User> sr = new ArrayList<>();
	//	sr.addAll(stream.collect(Collectors.toCollection(ArrayList::new)));
		stream.collect(Collectors.toMap(p -> p.getName(), k -> k.getPrice()));
		//stream.forEach(a-> System.out.println(a));
	}
}