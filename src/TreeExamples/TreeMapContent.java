package TreeExamples;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeMapContent.createSubTreeMap();
		
		TreeMapContent.findBy();
		

	}
	
	
	public static void createSubTreeMap(){
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		SortedMap<Integer, String> subTree = new TreeMap<>();
		
		tmap.put(10, "Red");
		tmap.put(20, "Green");
		tmap.put(30, "Black");
		tmap.put(40, "White");
		tmap.put(50, "Pink");
		tmap.put(60, "Green_Black");
		
		System.out.println("The Original Tree is:	"+tmap +"\n");
		subTree = tmap.subMap(20, 40);
		System.out.println(" The Sub tree is: "+subTree);
	}
	
	
public static void findBy(){
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		//SortedMap<Integer, String> subTree = new TreeMap<>();
		tmap.put(10, "Red");
		tmap.put(20, "Green");
		tmap.put(30, "Black");
		tmap.put(40, "White");
		tmap.put(50, "Pink");
		tmap.put(60, "Green_Black");
		
	//	Integer maxKey = tmap.size();
		
		SortedMap<Integer,String> range = tmap.tailMap(30);
		
		System.out.println("The Original Tree is: "+tmap);
		
	   System.out.println("Key >= "+range);
		
		



}

}
