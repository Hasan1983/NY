package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String>names=new ArrayList<>();
		names.add("sajol");
		names.add("rana");
		names.add("adnan");
		names.add("arif");
		//names.remove("sajol");
		//names.remove(2);
		//System.out.println(names);
		   for(String name: names){
			System.out.println(name);

			Iterator it= names.listIterator();
			while (it.hasNext()){
				System.out.println(it.next());
			}
		}


	}

}
