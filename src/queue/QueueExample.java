package queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Employee> quene = new PriorityQueue<>();
		quene.add(new Employee(12L, "Steve", LocalDate.now()));
		quene.add(new Employee(11L, "Mike", 	LocalDate.now()));
		quene.add(new Employee(124L, "Paul", LocalDate.now()));
		quene.add(new Employee(110L, "Smith",LocalDate.now()));
		quene.add(new Employee(110L, "Josh", LocalDate.now()));
		
		while(true){
			Employee e = quene.poll();
			System.out.println(e);
			if (e==null){
				break;
			}
		}
		

	}

}
