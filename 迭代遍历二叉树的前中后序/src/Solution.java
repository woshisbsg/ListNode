import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public void preorder(TreeNode root, ArrayList<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop();
            list.add(current.val);
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left !=null){
                stack.push(current.left);
            }


        }

    }

    public void middleorder(TreeNode root, ArrayList<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.empty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }
    }

    public void postorder(TreeNode root, ArrayList<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
    }


}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
