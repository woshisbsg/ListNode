import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int numberOfNode = sc.nextInt();
            if(numberOfNode == 0){
                System.out.println("WTF");
            }
            ArrayList<Integer> nodesValue = new ArrayList<>();

            for(int i = 0; i < numberOfNode; i++){
                nodesValue.add(sc.nextInt());
            }
            ListNode head = new ListNode(nodesValue.get(0));
            for(int i = 1; i < nodesValue.size(); i++){
                ListNode temp = new ListNode(nodesValue.get(i));
                addNode(temp, head);
            }
            int n = sc.nextInt();

            System.out.println(getNthconvert(head,n,nodesValue.size()));

        }

    }
    public static void addNode(ListNode current, ListNode head){
        while(head != null && head.next != null){
            head = head.next;
        }
        head.next = current;
    }

    public static int getNthconvert(ListNode head, int n, int lenOfListNode){
        ListNode current = head;
        int target = lenOfListNode - n;
        for(int i = 0; i < target; i++){
            head = head.next;
        }
        if(head != null){
            return head.val;
        }
        else{
            return 0;
        }

    }

}
class ListNode{
    ListNode next = null;
    int val;
    ListNode(int val){
        this.val = val;
    }
}
