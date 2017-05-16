public class App_1 {
    public static void main (String[] args){
        int a = 0;
        Test myObject; // объявление переменной (тип + название)
        /*
        System.out.print(myObject); // ошибка - переменная не инициализированна
        */
        myObject = null;     // нулевая ссылка
        //myObject.toString();  // при обращении  к ее полям - ошибка NullPointExeption
        myObject = new Test(); // создание объекта в куче. возвращается ссылка на него
        System.out.println(myObject);  // вывод объекта на экран

        Test2 object2 = new Test2(); // создание объекта типа Test2
        System.out.println(object2.x); // вывод переменной х объекта object2
        object2.x = 32;  //  запись значения в переменную
        System.out.println(object2.x);
        object2.objectTest = new Test(); // запись нового объекта типа Test в поле objectTest объекта object2
        object2.setX(-10);  // вызов метода setX класса object2
        System.out.println(object2.x);   // вывод нового значения (измененого методом setX, переменной x объекта
        int dx = object2.getDoubleX();   // вызов метода и получение его результата
        System.out.println(dx);   // вывод результата
        Test2 obj3 = new Test2();  // при наличии хоть одного конструктора (даже с параметрами) создание конструктора без параметров невозможно
        //obj3.setX(10);
        Test2 obj4 = new Test2(20);  // создание объекта при помощи конструктора с параметрами
    }
}
class  Test{
}

class Test2{
    int x;              // поле типа int
    Test objectTest;    // поле типа Test
    Test2(){            // конструктор без параметров
        //x=10;
        this(10);       // вызов другого констуктора   // цепочка конструкторов
    }
    Test2(int x){       // конструктор с параметрами
        this.x = x;
    }
    void setX(int newX){        // метод.принимающий параметры
        this.x = newX;               // и ничего не возвращающий
    }
    int getDoubleX(){           // метод возвращающий значение
        return x*2;
    }
}
