public class deletNode {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        int counter = 1;
        int counter2 = 1;
        ListNode temp1 = head;
        ListNode temp2 = head;

        if(head.next == null){
            return null;
        }

        while(temp1!= null && temp1.next != null){
            temp1 = temp1.next;
            counter++;
        }
        int zhengshucounter = counter - n;
        if(zhengshucounter == 0){
            return head.next;
        }

        while(temp2 !=null && temp2.next != null){
            if(counter2 == zhengshucounter){
                temp2.next = temp2.next.next;
            }
            temp2 = temp2.next;
            counter2++;

        }

        return head;
    }
}

class ListNode {
   int val;
   ListNode next = null;
 }

