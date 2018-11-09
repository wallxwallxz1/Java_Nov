package JavaMaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> htable = new Hashtable<>();
		htable.put(1, "A");
		htable.put(2, "B");
		htable.put(3, "c");
		System.out.println(htable);
		
		System.out.println(htable.get(1));
		
		
		htable.remove(3);
		
		Iterator<Integer> itr = htable.keySet().iterator();

		while(itr.hasNext()){
			Integer key = itr.next();
			String value = htable.get(key);
			System.out.println("Key: "+key +" "+"Value: "+value);
			if (key==null){
				break;
			}
		}
		

	}

}
