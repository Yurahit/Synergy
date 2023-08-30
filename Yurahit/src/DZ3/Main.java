package DZ3;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(10);
        myBinaryTree.add(20);
        myBinaryTree.add(5);
        myBinaryTree.add(7);
        myBinaryTree.add(2);
        myBinaryTree.add(30);
        System.out.println(myBinaryTree.min());// 2
        myBinaryTree.printTree();
        if (myBinaryTree.contains(5)) myBinaryTree.remove(5);
        myBinaryTree.printTree();
    }
}
