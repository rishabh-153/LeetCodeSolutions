import java.util.Arrays;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0,max=0;
        for(int i=0;i<nums.length-1;i++) {
        	int current = nums[i];
        	int j=1;
        	int next = nums[i+j];
        	while(current==next) {
        		count++;
        		j++;
        		next=nums[j];
        	}
        	if(next-1==current) {
        		count++;
        	}else {
        		count=0;
        	}
        	if(count>max) {
        		max=count;
        	}
        }
        return max+1;
    }
	public static void main(String[] args) {
		int[] num1= {110,200,111,112,113,114,109,100};
		System.out.println(longestConsecutive(num1));
		int[] num2= {0,0,2,3,4,1,5,6,7,8,9};
		System.out.println(longestConsecutive(num2));
	}

}
