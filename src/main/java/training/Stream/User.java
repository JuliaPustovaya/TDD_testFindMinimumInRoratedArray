package training.Stream;

public class User {
	String name;
	int price;

	public String getName() {
		return name;
	}


	public int getPrice() {

		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public User(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
