package mock.test;

public class DeleteAValueFromList {

	public static void main(String[] args) {
		DeleteAValueFromList obj = new DeleteAValueFromList();
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(1,
				new ListNode(7))));
		obj.removeElements(head, 1);

	}

	public ListNode removeElements(ListNode head, int val) {
		
		while (head != null && head.val == val) {
			head = head.next;
		}
		if(head==null) {
			return null;
		}
		ListNode temp=head,prev=null;
		 while (temp != null) 
	        {
	            while (temp != null && temp.val != val) 
	            {
	                prev = temp;
	                temp = temp.next;
	            }
	  
	            if (temp == null)
	                return head;
	  
	            prev.next = temp.next;
	  
	            temp = prev.next;
	        }
		return head;
	}

}
