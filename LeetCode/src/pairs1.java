import java.util.ArrayList;
import java.util.List;

public class pairs1 {
	public static int pairs(int k, List<Integer> arr) {
	    // Write your code here
		int count=0;
		for(int i=0;i<=arr.size()-2;i++) {
			for(int j=i+1;j<=arr.size()-1;j++) {
				if(arr.get(i) - arr.get(j)==k || arr.get(j) - arr.get(i)==k) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		List<Integer> inp = new ArrayList<Integer>();
		inp.add(1);
		inp.add(5);
		inp.add(3);
		inp.add(4);
		inp.add(2);
		// TODO Auto-generated method stub
		System.out.println(pairs(2, inp));
	}

}
