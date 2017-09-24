package com.dash.binarytree;

public class TreeNode {

    private Integer num;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;
    private static TreeNode rootNode;
    public TreeNode(Integer num) {
        this.num = num;
    }

    public TreeNode(Integer num, TreeNode leftNode, TreeNode rightNode,
            TreeNode parent) {
        this.num = num;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.parent = parent;
    }
    
    
    public static TreeNode getRootNode(){
        return rootNode;
    }

    public Integer getNum() {
        return num;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public TreeNode getParent() {
        return parent;
    }

    public static void setRootNode(TreeNode rootNode) {
        TreeNode.rootNode = rootNode;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

	@Override
	public String toString() {
		//return "TreeNode [num=" + num + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
		return "TreeNode [num=" + num + "]";
	}
    
}



