package training.Lambda;

/*
It is possible to make a reference on constructor;
 */
class SimpleClassForReferenceMainClass {
	public static void main(String[] args) {
		SimpleClassForReferenceBuilder builder = SimpleClassForReference::new;
		SimpleClassForReference simpleClassForReference = builder.create("Tom", 45);
		System.out.println("Name & Age : " + simpleClassForReference.getName() + " " + simpleClassForReference.getAge());
	}
}
