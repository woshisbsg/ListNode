import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        ListNode e = new ListNode();

        a.val = 1;
        a.next = b;
        b.val = 2;
        b.next = c;
        c.val = 3;
        c.next = d;
        d.val = 4;
        d.next = e;
        e.val = 5;
        e.next = null;




        Solution s = new Solution();
        ListNode temp = new ListNode();
        temp = s.reverseKGroup(a,2);

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }



    }

    //使用Arraylist，暴力拆解法
    /*
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if(head == null){

            return null;
        }
        if(head.next == null){
            return head;
        }
        if(k == 1){
            return head;
        }



            ArrayList<ListNode> node = new ArrayList<>();

            int counter = 1;
            int remainingNodeNumber = 0;
            ListNode current = null;
            current = head;
            node.add(current);

            while(current != null && current.next != null){
                current = current.next;
                counter++;
                node.add(current);
            }


            int numberOfReverse = node.size() / k;
            int counter1 = 0;


            ArrayList<ListNode> temp = new ArrayList<>();
            ArrayList<ListNode> result = new ArrayList<>();

            for(int j = 0; j < numberOfReverse; j++){
                while(counter1 < k){
                    temp.add(node.get(0));
                    node.remove(0);
                    counter1++;
                }
                Collections.reverse(temp);
                for(int i = 0; i < temp.size(); i++){
                    result.add(temp.get(i));
                }
                counter1 = 0;
                temp.clear();
            }

            if(node.size() != 0){
                for(int i = 0; i < node.size(); i++){
                    result.add(node.get(i));
                }
            }

            for(int i = 0; i < result.size() - 1; i++){
                result.get(i).next = result.get(i+1);
            }

            result.get(result.size() - 1).next = null;

            return result.get(0);




    }

     */

    //使用链表的方法


    public ListNode reverseKGroup (ListNode head, int k) {
        if(head==null||head.next==null||k==1) return head;
        ListNode res = new ListNode();
        res.next = head;
        int length = 0;
        ListNode pre = res,
                cur = head,
                temp = null;
        while(head!=null){
            length++;
            head = head.next;
        }
        //分段使用头插法将链表反序
        for(int i=0; i<length/k; i++){
            //pre作为每一小段链表的头节点，负责衔接
            for(int j=1; j<k; j++){
                //temp = cur.next;
               // cur.next = temp.next;
                //相当于头插法，注意：
                //temp.next = cur是错误的，temp需要连接的不是前一节点，而是子序列的头节点
               // temp.next = pre.next;
               // pre.next = temp;


                temp = cur.next;
                cur.next = cur.next.next;
                temp.next = pre.next;
                pre.next = temp;


            }
            //每个子序列反序完成后，pre，cur需要更新至下一子序列的头部
            pre = cur;
            cur = cur.next;
        }
        return res.next;
    }







}


class ListNode {
    int val;
    ListNode next = null;
  }

