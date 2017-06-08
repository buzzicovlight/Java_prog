package l0806.Task_1;
/*Геометрические фигуры
    Разработать программу для *графического редактора*.Есть обобщенная фигура, которую можно рисовать на экране.
    Саму фигуру создать нельзя. Каждая фигура должна иметь строкое описание. Фигур может несколько:
      - Прямоугольник (состоит из координат начальной точки х,у и ширины и высоты)
      - Круг (состоит из координат начальной точки х,у и радиуса)
      - Многоугольник (состоит из массива точек, точек должно быть > = 4 )
* */
public class Task_1 {
    public static void main (String[] args){
        GeometricFigure g1 = null;
        g1 = new Rectangle();
        Rectangle r1 = new Rectangle();
        g1 = new Rectangle();
        r1.getInfo();
        //Circle c1 = (Circle)g1; // приведение геометрической фигуры к классу круг
        GeometricFigure g2 = new Circle();
        g2.getInfo();
    }
}
