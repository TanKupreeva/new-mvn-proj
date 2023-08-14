package enums;

import java.util.Locale;
import java.util.Scanner;

public enum Seasons {
    SUMMER, AUTUMN, WINTER, SPRING;

    public static Seasons getSeasonByNum(int number) {
        switch (number) {
            case 1:
                return WINTER;
            case 2:
                return SPRING;
            case 3:
                return SUMMER;
            case 4:
                return AUTUMN;
        }
        return null;
    }

    public static Seasons getS(int number) {
        if (number == 12 || number == 1 || number == 2)
            return WINTER;
        if (number == 3 || number == 4 || number == 5)
            return SPRING;
        if (number == 6 || number == 7 || number == 8)
            return SUMMER;
        if (number == 9 || number == 10 || number == 11)
            return AUTUMN;
        else throw new IllegalArgumentException("Incorrect month number " + number);
    }
}

class SeasonsTester {
    public static void main(String[] args) {
        Seasons s1 = Seasons.WINTER;
        switch (s1) {
            case WINTER:
                System.out.println("Finally snow!");
                break;
            case SUMMER:
                System.out.println("Best season ever! ");
                break;
            default:
                System.out.println("=)");
        }
        System.out.println(Seasons.valueOf("AUTUMN").ordinal());
        System.out.println("Input number of month");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        //String seasonName = sc.next();
      //  Seasons s2 = Seasons.valueOf(seasonName);
        switch (Seasons.getS(monthNumber)) {
            case WINTER:
                System.out.println("Finally snow!");
                break;
            case SUMMER:
                System.out.println("Best season ever! ");
                break;
            default:
                System.out.println("=)");
        }

    }
}