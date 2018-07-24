package map.test.my;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("a",1);
		m1.put("b", 2);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		System.out.println(m2.get(m1.get("a")));

		
	}

}
