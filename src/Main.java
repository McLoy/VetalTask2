import java.util.Arrays;

/**
 * Created by McLoy on 22.04.2016.
 */
public class Main {

    public static void main(String[] args) {

        int i = 0;

        int[] Box = new int[10];

        for(i=0; i<10; i++)
        Box[i] = i*2;

        System.out.println("Вывод массива");
        for (i=0;i<Box.length-1;i++)
            System.out.println(Box[i]);

        String[] Boys = {"Олег", "Ваня", "Вова", "Константин"};
        System.out.println("Output Boys array");
        System.out.println(Boys.length);
        for (int j = 0; j <Boys.length ; j++) {
            System.out.println(Boys[j]);
        }


        System.out.println("Two-dimentional array");
        int[][] BigArray = new int[2][3];
        for (int k = 0; k < BigArray.length; k++) {
            for (int h = 0; h < BigArray[k].length ; h++) {
                BigArray[k][h] = (int)(Math.random()*5);
            }
        }
        System.out.println(Arrays.deepToString(BigArray));



    }
}
