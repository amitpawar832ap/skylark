import java.util.HashMap;  
import java.util.Map;  
import java.util.Set;  
   
public class DuplicateCharFinder {  
    public void findIt(String str) {  
    	
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }  
   
    public static void main(String a[]) {  
        DuplicateCharFinder dcf = new DuplicateCharFinder();  
        dcf.findIt("India is my country");  
    }  
}  

/*Map<Character, Integer> map = new HashMap<Character, Integer>();
		
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
				System.out.println(ch+" "+"is"+map.get(ch+"times"));
			}
		}*/