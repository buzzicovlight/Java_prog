public class Less_6_2 {
    public static void main (String[] args){
        Box box = new Box(1,1,1);
        System.out.println(box.getVolume());
        System.out.println(box);
        Box box2 = new Box(2,3,4);
        System.out.println(box2.getVolume());
        System.out.println(box);
        WeighteBox box3 = new WeighteBox(3,3,3,54);
        System.out.println(box3.getDensity());
        System.out.println(box);
        System.out.println(box.equals(box2));
        System.out.println(box.equals(new Box(1,1,1)));
        }
}
