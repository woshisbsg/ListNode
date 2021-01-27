public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode();
        TreeNode h = new TreeNode();
        root.left = b;
        root.right = c;
        b.left = d;
        b.right = e;
        e.left = f;
        e.right = g;
        c.left = a;
        c.right = h;


        root.val = 3;
        root.left.val = 5;
        root.left.left.val = 6;
        root.left.right.val = 2;
        root.left.right.left.val = 7;
        root.left.right.right.val = 2;
        root.right.val = 3;
        root.right.left.val = 0;
        root.right.right.val = 8;

        Solution solution= new Solution();

        System.out.println(solution.lowestCommonAncestor(root,6,4));
    }

    public  int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        return CommonAncestor(root,o1,o2).val;


    }

    public TreeNode CommonAncestor (TreeNode root, int o1, int o2) {
        if(root == null || root.val == o1 || root.val == o2){
            return root;
        }
        TreeNode leftNode = CommonAncestor(root.left, o1,o2);
        TreeNode rightNode = CommonAncestor(root.right,o1,o2);
        if(leftNode == null){
            return rightNode;
        }
        if(rightNode == null){
            return  leftNode;
        }

        return root;
    }




}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
