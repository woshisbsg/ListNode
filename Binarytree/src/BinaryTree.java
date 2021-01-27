public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {
        root.frontShow();

    }
}



 class TreeNode {
    int data;                   //给节点赋值
    TreeNode leftNode;   //树的左子节点
    TreeNode rightNode;  //树的右子节点

    public TreeNode(int data){
        this.data = data;
    }

//写两个节点的set方法

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;

    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;

    }

//具体的前序遍历如下，用到递归思想

    public void frontShow() {
        System.out.print(this.data);
        if(leftNode != null){
            leftNode.frontShow();
        }
        if(rightNode != null){
            rightNode.frontShow();
        }
    }
}