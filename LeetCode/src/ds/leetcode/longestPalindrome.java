package ds.leetcode;

public class longestPalindrome {
	public int longestPalindrome(String s) {
        int[] counterLower=new int[26];//counter for lowercase characters
		int[] counterUpper=new int[26];//counter for uppercase characters
		//Ascii val of A-Z is 65-90
		//Ascii val of a-z is 97-122
		for(int i=0;i<s.length();i++) {
			int index=(int)s.charAt(i);
			if(index-65 <26) {
				counterUpper[index-65]=counterUpper[index-65]+1;
			}else {
				counterLower[index-97]=counterLower[index-97]+1;
			}
		}
		
		//use both counter arrays. Sum all characters occurring even times.
		//Pick the one with odd counter occuring maximum times.
		int op=0,isOdd=0;
		for(int i=0;i<26;i++) {
			int j=counterUpper[i];
			int k=counterLower[i];
			if(j%2==0) {
				//if J is even
				op+=j;
			}else {
				//in case j is 5 or 7, 4/6 of them can be used to generate palindromes.
                //So, add j-1 to op. isOdd can be 0 when no odd counters are there. 1 if any odd counter is there
                // as even part of them is already counted.
				op+=j-1;
				isOdd=1;
			}
			if(k%2==0) {
				//if k is even
				op+=k;
			}
			else {
				op+=k-1;
				isOdd=1;
			}
		}
		return op+isOdd;
    }
}
