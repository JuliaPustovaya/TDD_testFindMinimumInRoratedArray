package training.SingleTon;

/*
2.1 Почему не работает без volatile?

Проблема идиомы Double Checked Lock заключается в модели памяти Java, точнее в порядке создания объектов. Можно условно представить этот
порядок следующими этапами [2, 3]:

Пусть мы создаем нового студента: Student s = new Student(), тогда

1) local_ptr = malloc(sizeof(Student)) // выделение памяти под сам объект;
2) s = local_ptr // инициализация указателя;
3) Student::ctor(s); // конструирование объекта (инициализация полей);

Таким образом, между вторым и третьим этапом возможна ситуация, при которой другой поток может получить и начать использовать (на основании
условия, что указатель не нулевой) не полностью сконструированный объект. На самом деле, эта проблема была частично решена в JDK 1.5 [5],
однако авторы JSR-133 [5] рекомендуют использовать voloatile для Double Cheсked Lock. Более того, их отношение к подобным вещам легко
прослеживается из коментария к спецификации:


Таким образом, хотя проблема и решена, использовать Double Checked Lock без volatile крайне опасно. В некоторых случаях, зависящих от
реализации JVM, операционной среды, планировщика и т.д., такой подход может не работать. Однако, серией опытов сопровождаемых просмотром
ассемблерного кода, генерированного JIT’ом автору, такой случай вопросизвести не удалось.

Наконец, Double Checked Lock можно использовать без исключений с immutable объектами (String, Integer, Float, и т.д.).
*/
public class DBLCHECKEDLOCking {
	private static volatile DBLCHECKEDLOCking instance;

	public static DBLCHECKEDLOCking getInstance() {
		DBLCHECKEDLOCking localInstance = instance;
		if (localInstance == null) {
			synchronized (DBLCHECKEDLOCking.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new DBLCHECKEDLOCking();
				}
			}
		}
		return localInstance;
	}
}