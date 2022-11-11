import java.util.PriorityQueue;
import java.util.Queue;

public class sira {

	public static void main(String[] args) {
		
		Queue<String>kuyruk= new PriorityQueue<String>();
		
		kuyruk.add("selim");
		kuyruk.add("seynep");
		kuyruk.add("fatih");
		kuyruk.add("selin");
		kuyruk.add("aykut");
		
		System.out.println(kuyruk.peek());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.peek());
		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.peek());
	}	

}
