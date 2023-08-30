package DZ5;

import java.util.Set;

public class Main{
    public static void main(String[] args) {
        MyHashSet<Integer> myHashSet = new MyHashSet<Integer>();
        myHashSet.put(122);
        myHashSet.put(774);
        myHashSet.put(554);
        myHashSet.put(54848);
        myHashSet.put(21);
        myHashSet.put(7878);
        myHashSet.put(231);
        myHashSet.put(484);
        myHashSet.put(211321);
        myHashSet.put(4484);
        myHashSet.put(45494);
        myHashSet.put(524);
        myHashSet.put(54);
        myHashSet.put(5);
        myHashSet.printHashSet();
        if (myHashSet.containsValue(21)) myHashSet.delete(21);
        myHashSet.printHashSet();
    }
}