import java.util.ArrayList;

public class Tree {
    public class Node {
        private int value;
        private Node rightChild;
        private Node leftChild;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            Node parent = getParent(value);
            if (value >= parent.value) {
                parent.rightChild = node;
            } else {
                parent.leftChild = node;
            }
        }
    }

    public Node getParent(int value) {
        Node current = root;
        Node parent = root;
        while (current != null) {
            parent = current;
            if (value >= current.value) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
        }
        return parent;
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value)
                return true;
            if (value > current.value) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
        }
        return false;

    }

    public int max() {
        int max = root.value;
        Node current = root;
        while (current != null) {
            max = current.value;
            current = current.rightChild;
        }
        return max;
    }

    public int min() {
        int min = root.value;
        Node current = root;
        while (current != null) {
            min = current.value;
            current = current.leftChild;
        }
        return min;
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);

    }

    public void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.leftChild);
        System.out.print(root.value + " ");
        inOrder(root.rightChild);

    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.value + " ");

    }

    public void descendingOrder(Node root) {
        if (root == null)
            return;
        descendingOrder(root.rightChild);
        System.out.print(root.value + " ");
        descendingOrder(root.leftChild);


    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;

    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        if (isLeaf(root)) {
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public boolean equals(Tree tree) {
        return equals(root, tree.root);
    }

    private boolean equals(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return root1.value == root2.value && equals(root1.rightChild, root2.rightChild) && equals(root1.leftChild, root2.leftChild);
        }
        return false;
    }

    public void kthElementFromRoot(Node root, int distance, ArrayList<Integer> arrayList) {
        if (root == null)
            return;
        if (distance == 0) {
            arrayList.add(root.value);
            return;
        }
        kthElementFromRoot(root.leftChild, distance - 1, arrayList);
        kthElementFromRoot(root.rightChild, distance - 1, arrayList);

    }

    void levelOrder(Node root) {
        if (root == null)
            return;
        int treeHeight = height(root);
        for (int i = 0; i <= treeHeight; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            kthElementFromRoot(root, i, list);
            System.out.println(list);
        }
    }
}
