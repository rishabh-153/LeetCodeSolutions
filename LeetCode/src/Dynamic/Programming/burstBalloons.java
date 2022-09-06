package Dynamic.Programming;

public class burstBalloons {
	public static int maxCoins(int[] nums) {
		int min=0;
		int max = nums.length;
		if(max==1) {
			return nums[min];
		}
		int op=0;
        for(int i=0;i<nums.length;i++) {
        	if(i==min) {
        		op+=(nums[i]*nums[i+1]);
        	}else if(i+1==max) {
        		op+=(nums[i]*nums[i-1]);
        	}else {
        		op+=(nums[i]*nums[i-1]*nums[i+1]);
        	}
        }
        return op;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,5};
		System.out.println(maxCoins(input));
	}

}
