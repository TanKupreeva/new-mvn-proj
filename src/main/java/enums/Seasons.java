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
        switch (number) {
            case 12:
            case 1:
            case 2:
                return WINTER;
            case 3:
            case 4:
            case 5:
                return SPRING;
            case 6:
            case 7:
            case 8:
                return SUMMER;
            case 9:
            case 10:
            case 11:
                return AUTUMN;
        }

       throw new IllegalArgumentException("Incorrect month number " + number);
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
        System.out.println(Seasons.valueOf("AUTUMN").ordinal());

    }
}