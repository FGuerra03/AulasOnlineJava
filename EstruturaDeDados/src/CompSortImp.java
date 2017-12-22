import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImp {
	public static void main(String[] args) {
		List<Person> arr = new ArrayList<Person>();
		arr.add(new Person("Guerra", 20));
		arr.add(new Person("Elen", 43));
		arr.add(new Person("Felipe", 25));
		arr.add(new Person("Thaina", 27));
		
		for (Person p : arr) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		
		System.out.println("----------------------------------");
		//Collections.sort((List) arr, new Person());
		Collections.sort((List) arr);
		
		for (Person p : arr) {
			System.out.println(p.getName() + " " + p.getAge());
		}
	}
}
