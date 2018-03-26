package training.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmbaddedFunctionalInterfacesMainClass {
	public static void main(String[] args) {
		Predicate<Integer> isNegative;
		isNegative = (a) -> a < 0;
		Function<Integer, String> function;
		function = (x) -> x.toString() + " !! ";
		Consumer<Double> consumer = (x) -> {
			x = x / 2.0;
			System.out.println("New value" + x);
			return;
		};
		Supplier<SimpleClassForReference> supplier;
		supplier = () -> {
			SimpleClassForReferenceBuilder simpleClassForReferenceBuilder = SimpleClassForReference::new;
			SimpleClassForReference simpleClassForReference = simpleClassForReferenceBuilder.create("Tamara", 18);
			return simpleClassForReference;
		};
		System.out.println("Predicate: " + isNegative.test(4));
		System.out.println("Function: " + function.apply(555));
		System.out.println("Consumer: ");
		consumer.accept(18.6);
		System.out.println("Supplier : " + supplier.get());
	}
}


