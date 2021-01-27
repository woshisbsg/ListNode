
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Solution {





    public int[][] threeOrders (TreeNode root) {
        int[][] finalresult = new int[3][];
        ArrayList<Integer> resultfirstorder = new ArrayList<>();
        ArrayList<Integer> resultmiddleorder = new ArrayList<>();
        ArrayList<Integer> resultpostorder = new ArrayList<>();

        finalresult[0] = firstorder(root,resultfirstorder).stream().mapToInt(Integer::valueOf).toArray();
        finalresult[1] = middleorder(root,resultmiddleorder).stream().mapToInt(Integer::valueOf).toArray();
        finalresult[2] = postorder(root,resultpostorder).stream().mapToInt(Integer::valueOf).toArray();



        return finalresult;

    }

    //使用递归遍历二叉树的三种顺序。

    public static ArrayList<Integer> firstorder(TreeNode root, ArrayList<Integer> resultfirstorder){

        if(root != null){
            resultfirstorder.add(root.val);
            firstorder(root.left, resultfirstorder);
            firstorder(root.right, resultfirstorder);
        }
        return resultfirstorder;

    }

    public static ArrayList<Integer> middleorder(TreeNode root, ArrayList<Integer> resultmiddleorder){

        if(root != null){
            middleorder(root.left, resultmiddleorder);
            resultmiddleorder.add(root.val);
            middleorder(root.right, resultmiddleorder);
        }
        return resultmiddleorder;
    }

    public static ArrayList<Integer> postorder(TreeNode root, ArrayList<Integer> resultpostorder){

        if(root != null){
            postorder(root.left, resultpostorder);
            postorder(root.right, resultpostorder);
            resultpostorder.add(root.val);
        }
        return resultpostorder;
    }





}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
