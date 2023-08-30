package DZ6;

public class MyIntPriorityQueue {
    private int size;
    private int front,rear;
    private int[] items;
    MyIntPriorityQueue(){//конструктор по умолчанию
        front = -1;
        rear = -1;
        size = 5;
        items = new int[size];
    }
    MyIntPriorityQueue(int size){//конструктор с указанием размера очереди
        front = -1;
        rear = -1;
        this.size = size;
        items = new int[this.size];
    }

    public boolean isEmpty(){
        if (front == -1){
            return true;
        }
        return false;
    }

    public void enqueue(int item){// Закончит программу, если очередь заполнена
        if (rear == size - 1){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if (front == -1){
            front = 0;
        }
        rear++;
        items[rear] = item;//Добавление элемента

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = front; i < rear; i++) {
                if(items[i] > items[i+1]){
                    isSorted = false;
                    buf = items[i];
                    items[i] = items[i+1];
                    items[i+1] = buf;
                }
            }
        }//Сортировка массива
        System.out.println("Item enqueued and sorted");
    }
    public int pop(){ //Закончит программу, если очередь пуста
        if (front == -1){
            System.out.println("Queue is empty!");
            System.exit(1);
        }
        int item = items[front];
        if (front == rear){
            front = -1;
            rear = -1;
            return item;
        }
        for (int i = 0; i < rear; i++) {
            items[i] = items[i+1];
        }
        rear--;
        return item;//удаление элемента
    }
}
