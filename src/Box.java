import org.omg.CORBA.Object;

public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) { // конструктор
        if (width > 0 && height > 0 && depth > 0) {
            this.depth = depth;
            this.height = height;
            this.width = width;
        }
    }
    public double getVolume() {   // метод вычисления объема
        return this.depth * this.width * this.height;
    }
    public String toString() {
        return String.format("Ящик размером %.2f м *%.2f м*%.2f м*%.2f м", this.width, this.height, this.depth);
    }
    @Override
    public boolean equals(Object obj){  // сравнение объектов
        if (obj.getClass()!= Box.class){  // сравнение классов объектов
            return false;
        }else {
            Box b = (Box) obj;   // приведение объекта к классу box
        }
        if (this.width == b.width && this.height == b.height && this.depth == b.depth){
            return true;
        }else{
            return false;
        }
    }
}