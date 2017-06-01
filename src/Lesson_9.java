/*
 * Ошибки:
 * Исключения:
 * try{
 *  }catch(){
 *      }
 *  }catch
  *
  * Выполнить действия произошла ошибка, либо нет.
  *     finally {
  *         }
* Простарнство имен (пакет): // для нераздувания имен класов. Разделять логически компоненты
*   Множество классов.
     *   java.io - классы ввода вывода
     *   java. util - класс утилит
    * Название классов начинается с БОЛьШОЙ буквы   Class Loader (Pascal CASE)
    * Название переменных с маленькой буквы
    * Название методов начинается с маленькой буквы и каждое слово следующее с Большой setName (CAMEL CASE)
    * Константы пишется Большими и разделяется знаком подчеркивания.
    * Наименование паветов к примеру в компании Epam /     com.epam.website.web. .....
*/
import java.util.NoSuchElementException;
import java.util.Scanner;
//import d2.util.Point;           // импортирование классов ищ пакета d2. util  ошибка в том, что импортирован класс
                                  // одноименный с другим пакетом
//import java.util.*; импортировать все классы
public class Lesson_9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = null;
        int number = 0;
        try {
            input = sc.nextLine();
            number = Integer.parseInt(input);
            if (number == 12){
                throw new InvalidNumber12Exaption("Было введено число 12. Error!");
            }
                System.out.println(42 / number);
        }catch(NoSuchElementException e) {
                System.err.println("Строка не введена");
        }catch(NumberFormatException e) {
            System.err.println("Введено не число");

        }catch (InvalidNumber12Exaption e) {
            System.err.println("Было введено число 12");
        }catch(ArithmeticException e){
                System.err.println("Деление на 0");
        }finally{  // выполнение действия в любом случае независимо от того, есть ли ошибка или нет
                System.err.println("Вычесление завершено");
                sc.close();
        }
        /*try{
            int i = 24/0;
            throw new IllegalArgumentException();
        }catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("Произошла ошибка");  // упрощение записи ошибок
        }*/
        try{
            NumberFormatException numberFormatException = new NumberFormatException("Введено не число");
            Exception exception = new Exception("Неправильное вычисление", numberFormatException);
            throw exception;
        }catch(Exception e){
            System.out.println(e.getCause()); // вывод причины ошибки
        }
        d3.util.Point p1 = new d3.util.Point();
        d2.util.Point p2  = new d2.util.Point();
    }
}
/* Создание класа проверяющего на неввод числа 12*/
class InvalidNumber12Exaption extends ArithmeticException{ // класс исключений.
    public InvalidNumber12Exaption(String message){
        super(message);
    }
}
