package dataStructureQueue;

public class Queue {
    private int maxSize; //для управления количеством ячеек (Queue = line)
    private long[] queueArray; //ячейки для хранения данных
    private int front; //позиция индекса элемента спереди на лицевой стороне линии - указатель
    private int rear; //позиция индекса элемента сзади линии
    private int nItems; //счетчик для хранения элементов

    public Queue(int size) {  //чтобы инициализировать структуру данных с каким то размером, количеством элементов
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; //индексая позиция первой ячейки массива
        rear = -1; //в массиве нет элемента который можно было бы считать последним
        nItems = 0; //у нас пока еще нет элементов в массиве
    }

    public void insert(long j) { //нужно вставить данные типо лонг тем самым заполняя линию элементами и вставляя их в конец
        if (rear==maxSize-1) {  //вызывание перезаписи-циркуляр
            rear =-1; //если последний элемент будет равен последнему элементу в массиве то следующие вставленные элементы будут вставляться в начало и заменять предыдущие первые
        }
        rear++; //с каждым вставленным элементом увеличивается конечный элемент который становится последним
        queueArray[rear] = j; //если это ноль то мы вставленый элемент присваиваем к нулевому индексу в массиве если первый то к первому и тд
        nItems++; //количество элементов соответственно тоже увеличивается
    }

    public long remove() { //удаляет элемент спереди линии
        long temp = queueArray[front];
        front++;
        if (front==maxSize) {
            front=0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){ //для заглядывания кто будет в начале линии
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public void view() { //временная вещь которая используется для просмотра содержимого(всей линии из чисел) в структуре данных
        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++ ) { //мы будем перебирать массив
            System.out.print(queueArray[i] + " ");  //напечатаем конкретную элемент с позицией индекса i
        }
        System.out.print("]");
    }


}
