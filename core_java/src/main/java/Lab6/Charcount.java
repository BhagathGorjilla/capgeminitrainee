package Lab6;

import java.util.HashMap;
import java.util.Map;

public class Charcount {
	
	
	public static void countChar(char[] charArray) {
		 Map<Character, Integer> map = new HashMap<>();
		    for (Character ch : charArray) {
		        Integer chCount = map.get(ch);
		        if(chCount == null) {
		            chCount = 0;
		        }
		        chCount++;
		        map.put(ch, chCount);
		    }
		    System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		char[] arr= new char[]{'a' , 'b' , 'c' , 'a' , 'd' , 'b'};
			countChar(arr);
	}
}