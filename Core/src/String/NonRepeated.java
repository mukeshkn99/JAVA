package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeated {

	public static void main(String[] args) {
		String input = "AABCDEFAB";
		for (int i = 0; i < input.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				} 
			}
			if (unique) {
				System.out.println(input.charAt(i));
			}
		}

		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue()==1){
        	   System.out.println(entry.getKey());
           }
		}
	}

}
