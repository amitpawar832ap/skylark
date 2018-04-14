import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name amit";
		//String str1 = str.toLowerCase();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char charArray[] = str.toCharArray();
		
		for(Character ch :  charArray) {
		if(map.containsKey(ch)) {
			map.put(ch,map.get(ch)+1);
		}
		else
		{
			map.put(ch,1);
		}
		
		}
		Set <Character> keyset = map.keySet();
		for (Character ch : keyset)
		{
			if(map.get(ch)>1) {
				System.out.println(ch+" "+"is "+map.get(ch)+" times duplicate");
			}
		}

	}

}
