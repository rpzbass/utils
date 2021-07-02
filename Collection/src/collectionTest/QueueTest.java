package collectionTest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import collectionClasse.Celular;

class ComparableName  implements  Comparator<Celular>{

	@Override
	public int compare(Celular o1, Celular o2) {
		return o1.getIMEI().compareTo(o2.getIMEI());
	}
}
public class QueueTest {

	public static void main(String[] args) {
		
		
		Queue<Celular> queue = new PriorityQueue<>(new ComparableName());
		
	/*	
		queue.add("C");
		queue.add("D");
		queue.add("A");
		queue.add("B");		
	*/
		queue.add(new Celular("Samsung","232"));
		queue.add(new Celular("LG","123"));
		queue.add(new Celular("HAUEI","456"));
		queue.add(new Celular("Motorola","235"));
		
		System.out.println(queue);
		
		System.out.println(queue.remove());
		
		System.out.println(queue);
	}

}
