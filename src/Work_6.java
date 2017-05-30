/*
* Создайте класс орезков на координатной плоскости, описав в нем все необходимые свойства, подобрав им понятные имена
* и правильные  типы данных.
*  1. Опишите в классе конструктор, позволяющий при создании нового объекта явно задать все его свойства.
 *  Если это необходимо, то проверьте допустимость их значений в констукторе(например, в классе обыкновенных дробей нельзя
 *  создавать дробь с нулевым знаменатилем.
 * 2. Создайте в классе метод, проверяющий равна ли длина двух отрезков.
 * 3. С использованием построенного класса создайте два отрезка: один от точки (1.1) до точки (2.2)
  * второй отрезок от точки (-3.0) до точки (1.1) .
  * Проверьте с помощью созданого метода равна ли длина и если равна выведите соответсвующее сообщение на экран*/

public class Work_6 {
    public static void main(String[] args) {
        Segment First  = new Segment(1,1,2,2);
        Segment Second = new Segment(1,1,2,2);
        if (First.Check(Second) == true) {
            System.out.println("Длина отрезков равна");
        } else {
            System.out.println("Длина отрезков не равна");
        }
    }
}
class Segment{
    int startPointX;
    int startPointY;
    int endPointX;
    int endPointY;
    Segment(int startPointX, int startPointY, int endPointX, int endPointY){
        /*сделать проверку на правильность ввода координат!!!!!!!!!*/
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.endPointX = endPointX;
        this.endPointY = endPointY;
    }
    double lengthSegment(){
        double lengthSegments;
        lengthSegments = Math.sqrt(Math.pow((endPointX-startPointX),2)+(Math.pow((endPointY-startPointY),2)));
        return lengthSegments;
    }
    public boolean Check(Segment other){
        return this.lengthSegment() == other.lengthSegment();
    }
}