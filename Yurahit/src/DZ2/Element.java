package DZ2;

public class Element<E> {
    private Element<E> prev;
    private Element<E> next;
    private E value;
    private Element(){}
    protected Element(Element<E> prev, Element<E> next, E value ){
        Element<E> e = new Element<>();
        this.value = value;
        this.prev = prev;
        this.next = next;
        if (e.hasPrev()) { this.prev.next = e;}
        if (e.hasNext()) { this.next.prev = e;}
    }
    boolean hasPrev(){
        return this.prev != null;
    }
    protected boolean hasNext(){
        return this.next != null;
    }

    public E getValue() {
        return value;
    }

    public Element<E> getNext(){
        if (hasNext()) return next;
       return null;
    }

    public Element<E> getPrev(){
        if (hasPrev()) return prev;
        return null;
    }

    public void setNext(Element<E> next) {
        this.next = next;
    }

    public void setPrev(Element<E> prev) {
        this.prev = prev;
    }
}
