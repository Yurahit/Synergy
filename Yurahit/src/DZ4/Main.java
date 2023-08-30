package DZ4;

public class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer> myTreeSet = new MyTreeSet<>();
        myTreeSet.add(60);
        myTreeSet.add(40);
        myTreeSet.add(80);
        myTreeSet.add(65);
        myTreeSet.add(20);
        myTreeSet.add(30);
        myTreeSet.printTree();
        if (myTreeSet.contains(25)) myTreeSet.add(5);
        if (myTreeSet.remove(80)) myTreeSet.remove(40);
        myTreeSet.printTree();
    }
}
