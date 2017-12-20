import java.util.Vector;

public class VectorImpl {
	public static void main(String[] args) {
		
		//arr tem 10 níveis do tipo inteiro
		//int[] arr = new int[10];
		//exemplo
		//arr[0] = 1;
		//arr[1] = "5"; erro pois só aceita inteiros
		
		//Totalmente dinâmico
		Vector v = new Vector<>(2, 3);
		System.out.println(v.capacity());
		
		v.addElement(1);
		v.addElement("a");
		
		System.out.println(v.size());
		
		v.addElement("ab");
		System.out.println(v.capacity());
		
		
		//v.remove(0);
		//System.out.println(v.size());
		
		//while (v.iterator().hasNext()) {
			//System.out.println(v.iterator().next());
			
		//}
	}
}
