import java.util.Scanner;

public class Lifo {
    public static void main (String[] args){
        String sourse;                                   // исходная строка
        Scanner scanner = new Scanner(System.in);        // сканер для чтения
        sourse = scanner.nextLine();                     // читаем строку
        Stack  charStack =new Stack(sourse.length());
        for (int i = 0; i < sourse.length(); i++) {
            char c = sourse.charAt(i);
            switch (c){
                case '(':
                case '{':
                case '[':
                    charStack.push(c);
                    break;
                case ']':
                    if (charStack.size()==0){
                        System.out.println("Скобки не сбалансированны");
                        return;
                    }else{
                        char s = charStack.pop();
                        if (s!= '['){
                            System.err.println("Скобки не сбалансированны");
                            return;
                        }
                    }
                    break;
                case '}':
                    if (charStack.size()==0){
                        System.out.println("Скобки не сбалансированны");
                        return;
                    }else{
                        char s = charStack.pop();
                        if (s!= '{'){
                            System.err.println("Скобки не сбалансированны");
                            return;
                        }
                    }
                    break;
                case ')':
                    if (charStack.size()==0){
                        System.out.println("Скобки не сбалансированны");
                        return;
                    }else{
                        char s = charStack.pop();
                        if (s!= '('){
                            System.err.println("Скобки не сбалансированны");
                            return;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        if (charStack.size()!=0){
            System.err.println("Cкобки не сбалансированы");
        }else{
            System.out.println("Выражение правильно");
        }
    }
}
/**
 Класс ,представлящий собой стек символов
 (первым вошел , - первым вышел)
 **/
class Stack{
    char[] symbols; // массив ячеек символов
    int pointer;    // указатель на свободную ячейку
    public Stack(int size){
        symbols = new char[size];
        pointer = 0;
    }
    public void push(char c){
        if(pointer == symbols.length){    // если свободных ячеек не осталось
            System.err.println("Стек переполнен!");
        }else{
            symbols[pointer] = c;          // вставка в свободную ячейку
            pointer++;                     // сдвих указателя на следующую свободную ячейку
        }
    }
    public char pop(){
        if (pointer == 0){                     // если свободная ячейка самая первая
            System.err.println("Стек пуст");   //
            return 0;
        }else{
            pointer--;                         // сдвигаем указатель , возвращаем символ, лежащий на вершине стека
            char c = symbols[pointer];
            symbols[pointer] = 0;
            return c;
        }
    }
    public int size(){                         //количество символов в стеке
        return pointer;
    }
}