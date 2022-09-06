package ds.leetcode;

public class ransonNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] ransom = new int[26];
		int[] mag = new int[26];
		for(int i=0;i<ransomNote.length();i++) {
			int index = (int)ransomNote.charAt(i)-97;
			if(index<26) {
				ransom[index]+=1;
			}
		}
		for(int i=0;i<magazine.length();i++) {
			int index = (int)magazine.charAt(i)-97;
			if(index<26) {
				mag[index]+=1;
			}
		}
		for(int i=0;i<26;i++) {
			if(!(mag[i]>=ransom[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
