package dataStructureQueue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);  //инициализируем линию, структуру данных с количествои элементов
        myQueue.insert(100); //вставляем числа в эту структуру данных
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);
        myQueue.insert(33);
        myQueue.insert(144);
        myQueue.view();
    }
}
