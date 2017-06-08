package l0806.Task_1;

import java.util.Scanner;

class Rectangle extends GeometricFigure{

    @Override
    void getInfo(){
        Scanner sc = new Scanner();
        System.out.println();
        System.out.printf("Начальная координата x = ");
        System.out.printf("Начальная координата y = ");
        System.out.printf("Ширина = ");
        System.out.printf("Высота = ");
    }
}
