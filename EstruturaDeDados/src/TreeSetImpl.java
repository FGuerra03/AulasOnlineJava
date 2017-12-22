import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet();
		
		tree.add(10);
		tree.add(21);
		tree.add(31);
		tree.add(41);
		
		System.out.println(tree);
		
		Iterator<Integer> iterator = tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(tree.pollFirst());
		System.out.println(tree.pollLast());
		System.out.println(tree.isEmpty());
		
	}

}
