

import java.util.HashSet;

public class containsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        int size=nums.length;
        HashSet<Integer> elem = new HashSet<Integer>();
        for(int n:nums) {
        	elem.add(n);
        }
        return elem.size()<size;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {1,2,3,1};
		containsDuplicate(inp);
	}

}
