package ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> output = new ArrayList<List<String>>();
		for (int i = 0; i < strs.length; i++) {
			if (!strs[i].isBlank()) {
				List<String> op = new ArrayList<String>();
				op.add(strs[i]);
				for (int j = i + 1; j < strs.length; j++) {
					if (!strs[j].isBlank()) {
						if (checkAnagram(strs[i], strs[j])) {
							op.add(strs[j]);
							strs[j] = "";
						}
					}
				}
				output.add(op);
			}
		}
		return output;
	}

	private static boolean checkAnagram(String string1, String string2) {
		int op = 0;
		for (int i = 0; i < string1.length(); i++) {
			op = op ^ (int) string1.charAt(i);
		}
		for (int i = 0; i < string2.length(); i++) {
			op = op ^ (int) string2.charAt(i);
		}
		return (op == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(input);
	}

}
