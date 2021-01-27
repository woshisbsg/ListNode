import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack3 = new Stack<Integer>();

    public static void main(String[] args) {
        Solution a = new Solution();
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.push(4);
        System.out.println(a.pop());
        a.push(5);
        System.out.println(a.pop());
        System.out.println(a.pop());
    }

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if(stack2.isEmpty()){
            int len = stack1.size();
            for(int i = 0; i < len; i++){
                stack2.push(stack1.pop());
            }
        }
        else {
            int stack2len = stack2.size();
            for(int i = 0; i < stack2len; i++){
                stack3.push(stack2.pop());
            }

            int stack1len = stack1.size();
            for(int i = 0; i < stack1len; i++){
                stack2.push(stack1.pop());
            }

            int stack2len1 = stack2.size();
            for(int i = 0; i < stack2len1; i++){
                stack3.push(stack2.pop());
            }

            int stack3len = stack3.size();
            for(int i = 0; i < stack3len; i++){
                stack2.push(stack3.pop());
            }
        }
        return(stack2.pop());


    }
}
