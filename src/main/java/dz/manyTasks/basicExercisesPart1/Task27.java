package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {

            String oct, hex;
            int dec;
            Scanner sc = new Scanner(System.in);

            System.out.println("Input OCT number : ");
            oct = sc.nextLine();

            dec = Integer.parseInt(oct, 8);
            hex = Integer.toHexString(dec);

            System.out.println("HEX number is: "+ hex);
        }

}
