package Stuff;

public class App3 {
    public static void main(String[] args){
        int [] ints = null;
        //System.out.println(ints[0]);
        ints = new int[10];
        System.out.println(ints[0]);
        System.out.println(ints[8]);
        System.out.println(ints[9]);
        ints = new int[]{0,1,1,1,2};
        System.out.println(ints[4]);
        // вывод массива
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
        /* многомерные массивы*/
        float[][] a = new float[3][3];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                a[i][j] =i+j;

            }
        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
        // зубчатые массивы
        double[][] d = new double[10][];
        for (int i = 0; i < 10 ; i++) {
            d[i] = new double[i+1];
        }
        for (int i = 0; i < d.length ; i++) {
            System.out.println(" Длина = "+ d[i].length);
        }

    }
}
