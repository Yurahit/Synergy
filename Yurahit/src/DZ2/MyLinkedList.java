package DZ2;

public class MyLinkedList<E> {
    private Element<E> first;
    private Element<E> last;
    public MyLinkedList(){
        first = null;
        last = null;
    }
    public void addLast(E value){
        Element<E> e = new Element<>(last,null,value);
        last = e;
        if (first == null) {first = e;}
    }
    public void addFirst(E value){
        Element<E> e = new Element<>(null,first,value);
        first = e;
        if (last == null) {last = e;}
    }
    public void addIndex(Integer index, E value) throws IndexOutOfBoundsException {
        Element<E> e = elementAtIndex(index);
        new Element<>(e.getPrev(),e,value);
    }
    private Element<E> elementAtIndex(Integer index) throws IndexOutOfBoundsException {
        Element<E> e = this.first;
        for (int i = 1; i < index; i++) {
            e = e.getNext();
            if (e == null) throw new IndexOutOfBoundsException();
        }
        return e;
    }
    public E getElementAtIndex(Integer index) throws IndexOutOfBoundsException{
        return elementAtIndex(index).getValue();
    }
    public E getFirst(){
        return first.getValue();
    }
    public E getLast(){
        return last.getValue();
    }
    public void deleteFirst(){
        try{
            first.getNext().setPrev(null);
            first = first.getNext();
        }
        catch (Exception e){first = null;last = null;}
    }
    public void deleteLast(){
        try{
            last.getPrev().setNext(null);
            last = last.getPrev();
        }
        catch (Exception e){first = null;last = null;}
    }
    public void deleteAtIndex(Integer index) throws IndexOutOfBoundsException{
        Element<E> e = elementAtIndex(index);
        if (e.hasPrev()) {e.getPrev().setNext(e.getNext());}
        if (e.hasNext()) {e.getNext().setPrev(e.getPrev());}
    }
}
