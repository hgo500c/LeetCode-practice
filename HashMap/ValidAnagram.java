package HashMap;

public class ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        int[] check = new int[26];
	        char[] ss =s.toCharArray();
	        char[] tt = t.toCharArray();
	        for(char o: ss) {
	        	check[o-'a']+=1;
	        }
	        for(char o: tt) {
	        	check[o-'a']-=1;
	        }
	        for(int i = 0;i<26;i++) {	
	            if(check[i]!=0) {return false;}
	        	}
	        return true;
	        }
	        
}
