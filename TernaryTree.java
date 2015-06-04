package ternarytree;

import java.math.BigDecimal;

public class TernaryTree {
    Node root;
    void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if(root == null) {
            root = newNode;
            return;
        }
        
    }
    Node ternarySearch(int value,Node root) {
        if(root == null) return null;
        if(value == root.value) return root;
        if(value < root.left.value) return ternarySearch(value, root.left);
        if((value > root.left.value) && (value <root.right.value)) return ternarySearch(value, root.middle);
        if(value > root.right.value) return ternarySearch(value, root.right);
    }

    public static void main(String[] args) {
        
    }
    
}
