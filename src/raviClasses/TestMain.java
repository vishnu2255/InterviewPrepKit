package raviClasses;

public class TestMain {

	public static void main(String[] args) {
		
		Queue q = new Queue(2);
		
		q.enqueue(123);
		q.enqueue(12);
		q.dequeue();
		q.enqueue(12);


	}

}
