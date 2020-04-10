package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String>queueNames=new LinkedList<>();
		queueNames.add("arif");
		queueNames.add("sajal");
		queueNames.add("evan");
		queueNames.add("adnan");


		//System.out.println("who's next: " + queueNames.poll());
		//System.out.println("who's next: " + queueNames.peek());
		//String next=queueNames.remove();
		//System.out.println(next);


		for(String name:queueNames){
			System.out.println(name);
		}

	}

}
