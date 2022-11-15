package HashMap;

public class RansomNote {
	 public boolean canConstruct(String ransomNote, String magazine) {
	        int[]checktable=new int[26];
	        char[]note = ransomNote.toCharArray();
	        char[]mag = magazine.toCharArray();
	        for(char m: mag) {
	        	checktable[m-'a']++;
	        }
	        for(char c: note) {
	        	checktable[c-'a']--;
	        }
	        for(int i =0;i<26;i++) {
	        	if(checktable[i]<0) {
	        		return false;
	        	}
	        }
	        return true;
	    }
}
