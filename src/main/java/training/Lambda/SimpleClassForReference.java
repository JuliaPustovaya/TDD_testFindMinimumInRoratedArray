package training.Lambda;

public class SimpleClassForReference {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public SimpleClassForReference(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SimpleClassForReference{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

