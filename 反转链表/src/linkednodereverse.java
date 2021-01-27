

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class linkednodereverse {
    public static void main(String[] args) {

    }
    /*
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null; // 当前节点的前一个节点
        ListNode next = null; // 当前节点的下一个节点
        while( head != null){
            next = head.next; // 记录当前节点的下一个节点位置；
            head.next = pre; // 让当前节点指向前一个节点位置，完成反转
            pre = head; // pre 往右走
            head = next;// 当前节点往右继续走
        }
        return pre;

    }

     */

    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        ListNode temp = null;
        while(head != null){
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;

            /*
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;

             */
        }
        return pre;
    }
}
