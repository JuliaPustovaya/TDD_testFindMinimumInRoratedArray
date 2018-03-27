package training.Stream;

import java.util.stream.Stream;

public class CollectGroupingBy {
	public static void main(String[] args) {
		Stream<Mobile> mobileStream = Stream.of(new Mobile("Nokia", 25, 2000),
				new Mobile("Sumsung", 75, 2009),
				new Mobile("Nokia", 45, 2007),
				new Mobile("Nokia", 83, 2004),
				new Mobile("Nokia", 745, 2007),
				new Mobile("Simens", 13, 2004)
		);
		/*
			mobileStream.sorted(new Comparator<Mobile>() {
			@Override
			public int compare(Mobile o1, Mobile o2) {
				if (o1.getYear() < o2.getYear()) {
					return -1;
				} else if (o1.getYear() > o2.getYear()) {
					return 1;
				} else {
					return 0;
				}
			}
		})
		 '
		 '
		 ' the same only with lambda instead of anonumus class implemented Comporator

		 */
		mobileStream.sorted((o1, o2) -> {
			if (o1.getYear() < o2.getYear()) {
				return -1;
			} else if (o1.getYear() > o2.getYear()) {
				return 1;
			} else {
				return 0;
			}
		})
				.forEach(p -> System.out.println(p.getYear()));
	/*	Map<String, List<Mobile>> phonesByCompany=mobileStream.collect(Collectors.groupingBy(Mobile::getModel));
		for(Map.Entry<String, List<Mobile>> item : phonesByCompany.entrySet()){

			System.out.println(item.getKey());
			for(Mobile phone : item.getValue()){

				System.out.println(phone.getPrice());
			}
			System.out.println("");
		} */
		//		List names = new ArrayList();
		//	names.addAll(mobileStream.collect(Collectors.toCollection(ArrayList::new)));
		//	names.forEach(o -> System.out.println(o + "ghgh!!!"));
		//	names.stream().forEach(x -> System.out.println(x));
	}
}

class Mobile {
	String model;
	int price;
	int year;

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public Mobile(String model, int price, int year) {
		this.model = model;
		this.price = price;
		this.year = year;
	}
}
