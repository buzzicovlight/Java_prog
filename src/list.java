public class list {
    private Node head;
    private int size;

    public list(){    // конструктор
        head = new Node();
        head.prev = head;
        head.next = head;
        size = 0;
    }
    public void pushHead(char c){
        Node nextHead = head.next;  //      кто идет после головы
        Node newNext = new Node();   //, новый узел после головы
        newNext.c = c;               // назначаем символ
        newNext.next = nextHead;        // следующий после вставленного, старый следующий
        newNext.prev = head;            // предидущйи перед вставленным -голова
        nextHead.prev = newNext;        // для старого следующего новый ,это предидущий
        head.next = newNext;            // следующий за головой новый вставленный
        size++;                         // увеличиваем размер списка
    }
    public void pushTail(char c){
        Node prevHead = head.prev;      // кто идет перед головой
        Node newPrev = new Node();      // новый узел перед головой
        newPrev.c = c;                   // назначаем символ
        newPrev.next = head;         // следующйи за новым - голова
        newPrev.prev = prevHead;     // предидущий перед новым  -старый предидущий
        prevHead.next = newPrev;     // предидущий перед головой - новый
        size++; // увеличиваем размер списка
    }

    public char pullHead() {
        if (head.next == head) {  // если следующий за головой сама голова то список пустой
            return (char) -1;
        } else {
            Node headNext = head.next; // получаем ссылку на первый элемент, вытягиваем из него символ
            char c = headNext.c;
            head.next = headNext.next; // следующий за головой теперь следовавший за вытянутым
            headNext.next.prev = head; // предидущий для следовавшего теперь голова
            size--;     // уменьшаем размер
            return c;  // возвращаем символ
        }
    }
    public char pullTail(){
        if (head.prev == head){
            return(char)-1; // если предидущий за головой  сама голова, список пустой
        }else{
            Node headPrev = head.prev; // получаем ссылку на последний элемент
            char c = headPrev.c;       // вытягиваем из него символ
            head.prev = headPrev.prev; // предидущий перед головой
            headPrev.prev.next = head; // следующий для предидущего теперь голова
            size--;                     // уменьшаем размер
            return c;                   // возвращаем символ
        }
    }
    public int getSize(){
        return size;
    }
    private class Node{  // внутренний класс
        char c;         // символ
        Node next;       // ссылка на следующий символ
        Node prev;       // ссылка на предидущий символ

    }

}
