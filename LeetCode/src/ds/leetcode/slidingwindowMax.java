package ds.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingwindowMax {

	public static int[] maxSlidingWindow(int[] nums, int k) {
//		int len = nums.length-k+1;
//		int[] op = new int[len];
//		
//		for(int i=0;i<nums.length-k;i++) {
//			op[i]=maxWindow(nums,i,i+k-1);
//		}
//		return op;
//	}
//
//	private static int maxWindow(int[] nums, int i, int j) {
//		int max = Integer.MIN_VALUE;
//		for(int k=i;k<=j;k++) {
//			if(nums[k]>max) {
//				max=nums[k];
//			}
//		}
//		return max;
		Deque<Integer> deque = new ArrayDeque<>();
		int[] op = new int[nums.length-k+1];
		int j=0;
		for(int i=0;i<k;i++) {
			while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.removeLast();
			}
			deque.add(i);
		}
		op[j++] = nums[deque.peek()];
		for(int i=k;i<nums.length;i++) {
			while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.removeLast();
			}
			if(!deque.isEmpty() && deque.peek() <= i - k) deque.removeFirst();
			deque.add(i);
			op[j++] = nums[deque.peek()];
		}
		return op;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
