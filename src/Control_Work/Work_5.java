package Control_Work;

/*
 * Cоздайте метод, который будет считывать сколько денег получает работник в неделю. Метод должен принимать на
 * входе два аргумента(зарплата в час, кол-во проработанных часов).
 * Условия:
 * 1. Кажлый час после 40 считается за полтора.
 * 2. Работник не может работать больше, чем 60 часов в неделю.
 * 3 Работник не может получать менбше 8 долларов в час.
 */
public class Work_5 {
    public static void main (String[] args){
        Worker Alex = new Worker(2, 40);
        System.out.format("Зарплата работника = %.1f",Alex.salary());
    }
}
class Worker{
    int salaryHour;
    int countHour;

    Worker(int salaryHour,int countHour){
        this.salaryHour = salaryHour;
        this.countHour = countHour;
        if (salaryHour < 8 ){
            System.err.println("Работник не может получать меньше 8 долларов в час");
            System.exit(0); // прерывание выполнения программы
        }
        if (countHour > 60 ){
            System.err.println("Работник не может работать больше 60 часов в неделю");
            System.exit(0); // прерывание выполнения программы
        }
    }
    double salary(){
        double sum = 0;
        int temp = countHour-40;
        sum = ((countHour*salaryHour)+(temp*salaryHour*1.5));
        return sum;

    }
}