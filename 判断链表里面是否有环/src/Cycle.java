import java.util.ArrayList;
import java.util.Iterator;

public class Cycle {
    public boolean hasCycle(ListNode head) throws NullPointerException {
        ListNode current = head;
        ListNode temp = head;



            while(current != null && current.next != null){
                current = current.next.next;
                temp = temp.next;
                if(current == temp){
                    return true;
                }
            }
            return false;







    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}
