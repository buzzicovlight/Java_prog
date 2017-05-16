import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Lesson_5 {
    public static void main(String [] args) {
        List<Test5> tests = new ArrayList<Test5>();
        //System.out.println(Test5.Close); // обращение к константам
        System.out.println(Test5.factorial(13));
        System.out.println(Test5.factorial2(15));

        ///while (true) {                       // выполнение цикла будет происходить бесконечно
         //   Test5 test = new Test5();
          //  test.incX();
         //   tests.add(test);
       // }

        Account2 acc = new Account2();
        acc.deposit(100);
        acc.withdraw(110);
        acc.withdraw(90);
        System.out.println(acc.getMoney());
    }
     public static Test createTest(){
        Test t = new Test();
        return t;
     }
}

class Test5 {
     static int x = 0; // принадлежит классу если есть static
     static final int Open = 1;     // обявление переменной ,которую изменить нельзя, КОНСТАНТЫ
     static final int Close = 1;
     final int TYPE = 42;
    @Override   // аннотация . не выполнение так, как в класе object
    protected void finalize(){   // принадлежит объекту
        System.out.println("Test = " + x);
                }
    public void incX(){
        this.x++;
    }
    /*рекурсивные методы, метод, который вызывает сам себя*/
    public static double factorial(int n){
        if (n<=1) return 1;
        else return n*factorial(n-1);
    }
    /*решение рекурсии, он не подсчитывает правильно, но не выпадает в ошибку*/
    public static double factorial2(double n){
        double res = 1;
        for (double i = 1; i <= n; i++){
            res *=i;
        }
        return res;
    }
    /*модификаторы доступа
    * public - Доступны извне
    * */
}

class Account2 {
    private int money;                  // никто.кроме объета не может обратиться
    private static final int COUNT = 2; // принадлежит только классу
    // положить деньги на счет
    //
    public void deposit (int money){
        this.money += money;  // инкапсуляция
    }
    //снять деньгис со счета
    public void withdraw(int money){
        if (this.money < money){
            System.err.println(String.format("Вы хотите снять на %d  + рублей больше,чем есть", money - this.money));
        }
        else {
            this.money -= money;
        }
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){

    }
}

/* класс блокнот
* Страницы (количество)
* МОжно писать
* На страницу только  определенное количество символов
* Листы вырывать нельзя
* Цвет облажки */
class Notebook{
    private int pageCount;      //количество страниц
    private String[] pages;     // текст самих страниц / массив текста
    private String colorName;   // цвет обложки
    public Notebook(int pageCount, String colorName){  // конструктор
        if (pageCount >0){
            this.pageCount = pageCount;
            pages = new String[pageCount];
            for (int i = 0; i <pageCount; i++){
                pages[i] = "";   // чтобы не выводились пустые строки, присваиваем им нулевые значения
            }
            this.colorName = colorName;
        }
    }
    // пишем ручкой, т.е. стирать нельзя
    // метод ввода текста
    public void putText(int page, String newText){
        if (!(page < 0 || page >= pageCount)){
            pages[page] = pages[page] + newText;
        }
    }
    // текст определенной страниыц

    public String getPage(int page){
        if (!(page < 0 || page >= pageCount)){
            return pages[page];
        }
        return "";
    }
    //содержимое блокнота
    public String getText(){
        String temp = "";
        for( int i = 0; i <pageCount; i++){
            if (pages[i].length()!=0){
            temp += pages[i]+"\n";
            }
        }
        return temp;
    }
    @Override
    public String toString(){
        return String.format("Блокнот цвета %s, %d страниц", colorName,pageCount);
    }
    public static void main (String[] args){
        Notebook n1 = new Notebook(20,"orange");
        n1.putText(0,"Hello");
        n1.putText(1,"World");
        System.out.println(n1);
        System.out.println(n1.getPage(0));
        System.out.println(n1.getPage(1));

    }
}

