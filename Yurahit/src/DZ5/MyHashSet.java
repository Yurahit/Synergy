package DZ5;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet<T> {
    private int capasity = 10;
    private MyBucket<T>[] buckets;
    private int size = 0;
    private class MyBucket<T> {
        private List<T> entries;

        private MyBucket(){
            entries = new LinkedList<T>();
        }

        private List<T> getEntries() {
            return entries;
        }
        private void addEntry(T entry){
            entries.add(entry);
        }
        private void removeEntry(T entry){
            entries.remove(entry);
        }
    }

    public MyHashSet(){
        this.buckets = new MyBucket[capasity];
    }

    private int getHash(T value){
        return  ((value.hashCode() & 0xfffffff) % capasity);
    }

    private T getEntry(T value){
        int hash = getHash(value);
        for (int i = 0; i < buckets[hash].getEntries().size(); i++) {
            if (buckets[hash].getEntries().get(i).equals(value)) return value;
        }
        return null;
    }

    public boolean containsValue(T value){
        int hash = getHash(value);
        if (buckets[hash] == null) return false;
        if (getEntry(value) == null) return false;
        return true;
    }

    public void put(T value){
        if (!containsValue(value)){
            int hash = getHash(value);
            if (buckets[hash] == null) {
                buckets[hash] = new MyBucket<T>();
            }
            buckets[hash].addEntry(value);
            size++;
        }
    }

    public void delete(T value){
        if (containsValue(value)){
            int hash = getHash(value);
            buckets[hash].removeEntry(getEntry(value));
            size--;
        }
    }

    public void printHashSet(){
        for (int i = 0; i < capasity; i++) {
            if (buckets[i] != null){
                System.out.print("Bucket #" + i + ": ");
                for (int j = 0; j < buckets[i].getEntries().size(); j++) {
                    System.out.print(buckets[i].getEntries().get(j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
