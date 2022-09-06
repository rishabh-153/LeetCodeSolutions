package ds.leetcode;

public class stepstozero {
	public int numberOfSteps(int num) {
        int counter=0;
        while(num!=0) {
        	num=num%2==0?num/2:num-1;
        	counter++;
        }
        return counter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stepstozero obj = new stepstozero();
		System.out.println(obj.numberOfSteps(0));
	}

}
