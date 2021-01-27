public class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        ListNode e = new ListNode();

        a.val = 1;
        a.next = b;
        b.val = 1;


        /*
        c.val = -49;
        c.next = d;
        d.val = -49;
        d.next = e;
        e.val = -47;

         */



        ListNode result = deleteDuplicates(a);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }





    }
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode current = head;
        if(head == null){
            return head;
        }


        while(current.next != null){


            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }


        }

        return head;

    }
}

class ListNode {
   int val;
   ListNode next = null;
 }

