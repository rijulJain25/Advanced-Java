package Queues;

public class QueuesArrClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrClass q = new QueueArrClass();
		for(int i = 0; i<= 12; i++) {
			q.enqueue(i);
		}
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}
}
