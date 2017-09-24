package com.dash.binarytree;

public class DemoTree {

    private TreeNode node;
    
    public static void main(String str[]){
        DemoTree tree=new DemoTree();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(1);
        tree.add(2);
        tree.add(7);

        
        //tree.preTravarsal(3);
        
        tree.preOrderTravarsal(TreeNode.getRootNode());
    }
    public boolean add(Integer newnum){
        TreeNode rootNode=TreeNode.getRootNode();
        TreeNode temp;
        if(rootNode!=null){
            temp=rootNode;
            while(true){
                if(temp.getNum()>newnum){
                    if(temp.getLeftNode()==null){
                        temp.setLeftNode(new TreeNode(newnum,null,null,temp));
                        break;
                    }
                    else{
                        temp=temp.getLeftNode();
                    }
                }
                else{
                    if(temp.getRightNode()==null){
                        temp.setRightNode(new TreeNode(newnum,null,null,temp));
                        break;
                    }
                    else{
                        temp=temp.getRightNode();
                    }
                }
            }
            return true;
        }
        else{
            TreeNode.setRootNode(new TreeNode(newnum,null,null,null));
            return true;
        }
        
    }
    public void preOrderTravarsal(TreeNode node){
        
        if(node!=null){
        	System.out.println(" THE NODE IS :"+node + "AND VALUE IS "+node.getNum());
        	System.out.println(" THE LEFT NODES ARE ");

            preOrderTravarsal(node.getLeftNode());
            System.out.println(" THE RIGHT NODES ARE ");
            preOrderTravarsal(node.getRightNode());
        }
    }
    public void inOrderTravarsal(TreeNode node){
        
        if(node!=null){
            inOrderTravarsal(node.getLeftNode());
            System.out.println(" THE NODE VALUE IS :"+node.getNum());
            inOrderTravarsal(node.getRightNode());
        }
    }
    public void postOrderTravarsal(TreeNode node){
        
        if(node!=null){
            
            postOrderTravarsal(node.getLeftNode());
            postOrderTravarsal(node.getRightNode());
            System.out.println(" THE NODE VALUE IS :"+node.getNum());
        }
    }
    public void preTravarsal(Integer findnum){
        TreeNode node=TreeNode.getRootNode();
        if(node.getNum()>findnum){
            node=node.getLeftNode();
        }
        else if (node.getNum()<findnum){
            node=node.getRightNode();
        }
        else if(node.getNum()==findnum){
        	System.out.println(" THE LOOK UP NODE IS :"+node.getNum());
        }
        if(node!=null){
            preOrderTravarsal(node);
            preOrderTravarsal(node);
        }
    }
}

