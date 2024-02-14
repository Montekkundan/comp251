package assignment6;


public class BinaryTreeApplication {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<>();

        Position<Integer> root = binaryTree.addRoot(1);
        Position<Integer> leftChild = binaryTree.addLeft(root, 2);
        Position<Integer> rightChild = binaryTree.addRight(root, 3);
        binaryTree.addLeft(leftChild, 4);
        Position<Integer> childOfLeftChild = binaryTree.addRight(leftChild, 5);
        binaryTree.addLeft(childOfLeftChild, 6);
        binaryTree.addRight(childOfLeftChild, 7);
        
        System.out.println("Inorder Tree Traversal:");
        for (Position<Integer> position : binaryTree.inorder()) {
            System.out.print(position.getElement() + " ");
        }
    }
}

//public class BinaryTreeApplication {
//    public static void main(String[] args) {
//        LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<>();
//
//        Position<Integer> root = binaryTree.addRoot(1);
//        Position<Integer> leftChild = binaryTree.addLeft(root, 2);
//        Position<Integer> rightChild = binaryTree.addRight(root, 3);
//        binaryTree.addLeft(leftChild, 4);
//        Position<Integer> childOfLeftChild = binaryTree.addRight(leftChild, 5);
//        binaryTree.addLeft(childOfLeftChild, 6);
//        binaryTree.addRight(childOfLeftChild, 7);
//
//        printBinaryTree(binaryTree, root, "");
//    }
//
//    private static void printBinaryTree(LinkedBinaryTree<Integer> binaryTree, Position<Integer> position, String relation) {
//        if (position == null) {
//            return;
//        }
//
//        if (binaryTree.root().equals(position)) {
//            System.out.println("Binary Tree Structure:");
//            System.out.println("Root: " + position.getElement());
//        } else {
//            System.out.println(relation + position.getElement());
//        }
//
//        if (binaryTree.left(position) != null) {
//            printBinaryTree(binaryTree, binaryTree.left(position), "Left Child of " + position.getElement() + ": ");
//        }
//        if (binaryTree.right(position) != null) {
//            printBinaryTree(binaryTree, binaryTree.right(position), "Right Child of " + position.getElement() + ": ");
//        }
//    }
//}
