package mock.test;


public class GuessGame{
    public int guessNumber(int n) {
    	 int start = 1;
    	    int end = n;
    	    
    	    while(start<=end){
    	        
    	        int mid = start + (end-start)/2;
    	        
    	        if(guess(mid)==-1){
    	            end = mid - 1;
    	            
    	        } else if(guess(mid)==1){
    	            start = mid + 1;
    	        } else{
    	            return mid;
    	        }
    	        
    	    }
    	    
    	       return end; 
    }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}