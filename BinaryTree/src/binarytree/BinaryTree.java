
package binarytree;

public class BinaryTree {

    
    private nodeTree root;
    
    private class nodeTree {
    private nodeTree left;
    private nodeTree rigth;
    private int data;
    
    public nodeTree (int data) {
        this.data = data;
    }
}
    public void createBinaryTree () {
        nodeTree firstValue = new nodeTree(1);
        nodeTree secondValue = new nodeTree(23);
        nodeTree thirdValue = new nodeTree(45);
        nodeTree fourthvalue = new nodeTree(12);
        nodeTree fiftvalue = new nodeTree(32);
        
        root = firstValue;
        firstValue.left = secondValue;
        firstValue.rigth = thirdValue;
        
        secondValue.left = fourthvalue;
        secondValue.rigth = fiftvalue;
    }
    
    public void TraversalOutput(nodeTree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        TraversalOutput(root.left);
        TraversalOutput(root.rigth);
    }
    
    
    

    public static void main(String[] args) {
     BinaryTree bina = new BinaryTree();
     
     bina.createBinaryTree();
     bina.TraversalOutput(bina.root);
    }
    
}
