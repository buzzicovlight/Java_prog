import org.omg.CORBA.Object;

import java.util.StringTokenizer;

public class WeighteBox  extends Box{  // класс наследник
    private double weight;
    public WeighteBox(double width, double height, double depth, double weight) {
        super(width, height, depth);  // вызов родительского конструктора
        if (weight > 0) {
            this.weight = weight;
        }
    }
    public double getWeight(){
            return this.weight;
        }
        public double getDensity(){
            return this.weight/this.getVolume();
        }

    /*@Override  // переопределение о
    public String toString() {
        return String.format("Ящик размером %.2f м *%.2f м*%.2f м*%.2f м", this.width,this.height,this.depths);
    }*/
    public String toString(){
        return super.toString()+String.format(",массой = %.2f кг ", this.weight);
    }

    @Override
    public boolean equals(Object obj){
        if (obj.getClass()!= WeighteBox.class){
            return false;
        }
        WeighteBox box = (WeighteBox) obj;  // приведение
    }
    if(this.weight!= box.getWeight()){ // Для ускорения работы сравниваем вес, если он равен сравниваем стороны и объем
        return false;
    }else{
        return super.equals(obj);
    }
}
