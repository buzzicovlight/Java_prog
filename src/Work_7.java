import java.util.Scanner;
/*
*  Cоздать класс Уточка.
*  У даного класса должно быть свойство - объем желудка.
*  Написать для даного класа фуекцию поедания хлеба.
*  В данную функцию должен передаваться объем съеденного хлеба и соответвено уменьшаться место в желудке.
*  Когда уточка заполнит желудок на 90% функция должна выдать надпись, что уточка не может больше есть хлеб
*  */
public class Work_7 {
    public static void main(String [] args){
        String temp;
        int food;
        Duck donald = new Duck(20);
        Scanner scanner = new Scanner(System.in);
        while (donald.sizeStomach > 0){
            System.out.println("Покормите утку в граммах");
            temp = scanner.nextLine();
            food = Integer.parseInt(temp);
            donald.sizeStomach = donald.food(food);
        }
    }
}
class Duck{
    int sizeStomach;  // размер желудка
    Duck(int sizeStomach){
        this.sizeStomach = sizeStomach;
    }
    public int food(int forage){
        int temp = sizeStomach;
        if( forage > sizeStomach){
            System.out.println("Объем желудка меньше чем количество еды");
            /*проверка на переполнение*/
        }else{
            temp = sizeStomach - forage;
        }
        return temp;
    }
}
