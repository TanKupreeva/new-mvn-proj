package enums;
//import all static stuff
import static enums.Constans.*;

//import static enums.Constans.PI;

//import specific member
import  static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Test {
    public static void main(String[] args) {
        cos(2);

        double x = PI + Constans.PI;
        Math.random();
        System.out.println(Math.random());
        random(100);
        System.out.println(ONE);
        Problem problem1 = new Problem("Wrong password.");
        problem1.setSeverity(Severity.BLOCKER);
        problem1.resolve();
    }




    static int random(int bound){
        int x = (int)Math.random()*bound;
        return x;
    }






}
