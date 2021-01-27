import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = b;
        System.out.println(FindFirstCommonNode(a,d).val);




    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
            if(p1 != p2){
               if(p1 == null){
                   p1 = pHead2;
               }
               if(p2 == null){
                   p2 = pHead1;
               }
            }
        }
        return p1;
    }


    /*
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            // 寻找公共节点
            if (p1 != p2) {
                // 判断谁先走到了头 先走到头的回来继续走
                // 相当于减去长链表比短链表长的部分 然后2个相同长度的链表从头开始遍历
                // 时间复杂度为O(2n) 比我自己写的O(n^2)复杂度的代码好很多
                if (p1 == null) {
                    p1 = pHead2;
                }
                if (p2 == null) {
                    p2 = pHead1;
                }
            }
        }
        return p1;
    }

     */


}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;

    }
}




