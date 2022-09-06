import java.util.ArrayList;
import java.util.List;

public class maximumsubarrayvalue {
	public static long maxSubarrayValue(List<Integer> arr) {
	    // Write your code here
		long sum1=0,sum2=0,sum3=0;
		long maxDiff=0;
		for(int i=0;i<arr.size()-1;i++) {
			int pivot1=arr.get(i);
			int pivot2=arr.get(i+1);
			sum1=(pivot1-pivot2)*(pivot1-pivot2);
			if(sum1>maxDiff) {
				maxDiff=sum1;
			}
			for(int j=i+2;j<arr.size()-1;j=j+2) {
				pivot1+=arr.get(j);
				pivot2+=arr.get(j+1);
				sum1=(pivot1-pivot2)*(pivot1-pivot2);
				if(sum1>maxDiff) {
					maxDiff=sum1;
				}
			}
			if(arr.size()%2!=0) {
				pivot1+=arr.get(arr.size()-1);
				sum1=(pivot1-pivot2)*(pivot1-pivot2);
				if(sum1>maxDiff) {
					maxDiff=sum1;
				}
			}
		}
		return maxDiff;
	 }
	public static void main(String[] args) {
		List<Integer> inp = new ArrayList<Integer>();
		inp.add(1);
		inp.add(-1);
		inp.add(1);
		inp.add(-1);
		inp.add(1);
		System.out.println(maxSubarrayValue(inp));
	}
}
