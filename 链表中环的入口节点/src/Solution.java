import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next =c;
        c.next = e;


        //b.next = a;
        ListNode f = detectCycle(a);
        if(f == null){
            System.out.println("null");
        }
        else{
            System.out.println(f.val);
        }



    }
    public static ListNode detectCycle(ListNode head) {
        /*

        try{
            ListNode current1 = head;
            ListNode current2 = head;
            ListNode temp = head;
            boolean b = false;
            if(current1 == null || current1.next == null || current1.next.next == null){
                return null;
            }
            while(current1 != null && current1.next != null){
                current1 = current1.next;
                current2 = current2.next.next;
                if(current1 == current2){
                    b = true;
                    break;
                }
            }
            //System.out.println(current1.val);
            if(b == false){
                return null;
            }
            else{
                if(temp == current1){
                    return temp;
                }
                while(temp != null){
                    current1 = current1.next;
                    temp = temp.next;
                    if(current1 == temp){
                        return temp;
                    }
                }
            }

            return null;
        }
        catch (Exception e){
            return null;
        }

         */

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //slow == fast说明一定存在环
            if(slow == fast){
                ListNode temp = head;
                while(temp != slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow;
            }
        }
        return null;





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
