package DZ4;


public class MyTreeSet<T> {
    private int size = 0;
    private Node<T> root = null;
    private class Node<T>{
        T value;
        Node<T> right = null;
        Node<T> left = null;
        Node(T value){
            this.value = value;
        }
    }
    public void add(T value){
        if (root == null){
            root = new Node<>(value);
            size++;
        }
        addHelper(root,value);
    }
    private boolean addHelper(Node<T> node,T value){
        Comparable<? super T> k = (Comparable<? super T>) value;
        int cmp = k.compareTo(node.value);
        if (cmp > 0){
            if (node.right == null){
                node.right = new Node<>(value);
                size++;
                return true;
            }
            return addHelper(node.right,value);
        }
        if (cmp < 0){
            if (node.left == null){
                node.left = new Node<>(value);
                size++;
                return true;
            }
            return addHelper(node.left,value);
        }
        return false;
    }
    public void printTree(){
        System.out.print("[");
        printHelper(root);
        System.out.println("]");
    }
    private void printHelper(Node<T> node){
        if (node.left != null) printHelper(node.left);
        System.out.print(node.value + " ");
        if (node.right != null) printHelper(node.right);
    }
    private Node<T> findHelper(Node<T> node, T value){
        Comparable<? super T> k = (Comparable<? super T>) value;
        int cmp = k.compareTo(node.value);
        if (cmp < 0) {
            if (node.left == null)
                return null;
            else
                return findHelper(node.left,value);
        }

        if (cmp > 0) {
            if (node.right == null)
                return null;
            else
                return findHelper(node.right, value);
        }
        return node;
    }
    public boolean contains(T value){
        return findHelper(root,value) != null;
    }

    public boolean remove(T value){
        Node<T> delete = removeHelper(root,value);
        return delete != null;
    }
    private Node<T> removeHelper(Node<T> node, T value){
        Comparable<? super T> k = (Comparable<? super T>) value;
        int cmp = k.compareTo(node.value);
        if (cmp > 0) {
            node.right = removeHelper(node.right, value);
        }
        else if (cmp < 0) {
            node.left = removeHelper(node.left, value);
        }
        else{
            if ((node.left == null)&&(node.right == null)){
                node = null;
            }
            else if (node.right != null){
                node.value = minInMax(node);
                node.right = removeHelper(node.right, node.value);
            }
            else {
                node.value = maxInMin(node);
                node.left = removeHelper(node.left,node.value);
            }
        }
        return node;
    }
    private T minInMax(Node<T> node){
        node = node.right;
        while (node.left != null){
            node = node.left;
        }
        return node.value;
    }
    private T maxInMin(Node<T> node){
        node = node.left;
        while (node.right != null){
            node = node.right;
        }
        return node.value;
    }

    public int getSize() {
        return size;
    }
}