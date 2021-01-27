import java.util.*;

public class binarytreeBFS {
    public static void main(String[] args) {
        TreeNode root = null;
        binarytreeBFS a = new binarytreeBFS();
        System.out.println(a.levelOrder(root));
    }

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> finalresult = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque();

        if(root != null){
            queue.offer(root);
            TreeNode temp = null;
            while(!queue.isEmpty()){

                ArrayList<Integer> arrayList = new ArrayList<>();
                int len = queue.size();
                for(int i = 0; i < len; i++){
                    temp = queue.pollFirst();
                    if(temp.left != null){
                        queue.offer(temp.left);
                    }
                    if(temp.right != null){
                        queue.offer(temp.right);
                    }
                    arrayList.add(temp.val);
                }
                if(!arrayList.isEmpty()){
                    finalresult.add(arrayList);
                }
            }
        }
        return finalresult;

    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 }

