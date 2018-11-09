package TreeExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
	//	TreeMapExample.treeMapInfo();
		TreeMapExample.treeMapExamples3();
		TreeMapExample.findTheLargestSmallestValue();
		
		
	}
	
	public static void treeMapInfo(){
		TreeMap<Integer, String>tmap = new TreeMap<>();
		tmap.put(23, "Data23");
		tmap.put(3, "Dat3");
		tmap.put(3, "Dat3");
		tmap.put(2, "Data2");
		tmap.put(34, "Dat34");
		tmap.put(67, "Data67");
		tmap.put(98, "Dat98");
		
		Set set = tmap.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()){
			Map.Entry entry = (Entry) itr.next();
			System.out.println("This is the Keys: "+entry.getKey() +" "+"This the value: "+entry.getValue());
		}
		
	}
	
	public static void treeMapExamples3(){
		
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>();
		
		tree_map1.put("c1", "Red");
		tree_map1.put("c2", "Green");
		tree_map1.put("c3", "Black");
		tree_map1.put("c4", "White");
		tree_map1.put("c5", "Pink");
		
		
//		Iterator<String> itr = tree_map1.keySet().iterator();
//		
//		while (itr.hasNext()){
//			String key = itr.next();
//			String value = tree_map1.get(key);
////			if (value.equalsIgnoreCase("Green")){
////				System.out.println("The tree contians the value Green");
////				break;
////			}else {
////				System.out.println("The tree does not contians the value Pink");
////			}
//		
//		
//		
//		}
	}
	
	public static void findTheLargestSmallestValue(){
TreeMap<String, String> tree_map1 = new TreeMap<String, String>();
		
		tree_map1.put("c1", "Red");
		tree_map1.put("c2", "Green");
		tree_map1.put("c3", "Black");
		tree_map1.put("c4", "White");
		tree_map1.put("c5", "Pink");
		
		System.out.println(tree_map1.firstKey());
		System.out.println(tree_map1.lastKey());
		System.out.println(tree_map1.higherEntry(""));  // Check if the value is greater than null 
	}
}
