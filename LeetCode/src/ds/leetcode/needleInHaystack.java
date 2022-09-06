package ds.leetcode;

public class needleInHaystack {
	public static int strStr(String haystack, String needle) {
		int subLen = needle.length();
		if (subLen > haystack.length()) {
			return -1;
		}
		for (int i = 0; i < (haystack.length() - subLen+1); i++) {
			String sub = haystack.substring(i, i + subLen);
			if (sub.equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("a","a"));
		System.out.println(strStr("hello","aa"));
	}

}
