package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String>cityofIndia=new ArrayList<>();
		cityofIndia.add("kolkata");
		cityofIndia.add("mumbi");
		cityofIndia.add("deli");

		List<String>cityofBangladesh=new ArrayList<>();
		cityofBangladesh.add("Dhaka");
		cityofBangladesh.add("comilla");
		cityofBangladesh.add("chandpur");

		Map<String,List<String>>cityofworld=new LinkedHashMap<>();
		cityofworld.put("india",cityofIndia);
		cityofworld.put("Bangladesh",cityofBangladesh);

		for(Map.Entry city:cityofworld.entrySet()){
			System.out.println(city.getKey()+" "+city.getValue());
		}




	}

}

