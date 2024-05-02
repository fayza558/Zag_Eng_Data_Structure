public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(12);
        tree.insert(10);
        tree.insert(8);
        tree.insert(9);
        tree.insert(5);
        tree.insert(7);
        tree.insert(13);
        System.out.println(tree.find(8));
        System.out.println(tree.max());
        System.out.println(tree.min());
        tree.preOrder(tree.root);
        System.out.println("");
        tree.inOrder(tree.root);
        System.out.println("");
        tree.postOrder(tree.root);
        System.out.println("");
        tree.descendingOrder(tree.root);
        System.out.println("");
        System.out.println("The height = " + tree.height(tree.root));
        AVL avl =new AVL ();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        System.out.println("");

    }
}