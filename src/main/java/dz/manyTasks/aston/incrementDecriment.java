package dz.manyTasks.aston;

public class incrementDecriment {


    public static int method(int[]array, int ... vararg){
        return 1;
    }
    public static void main(String[] args) {
        method(new int[]{1,2,3}, new int[]{4,5,6});
        method(new int[]{1,2,3}, 4,5);
//        method(1,2,3);
//        method(, );
//        method(new int[]{1,2,3}, );




//       int  y= 10;
//        int z = ++y * y--;
//        System.out.println(z);
//        System.out.println(y);


//        int x = 4;
//        int y = ++x * 3 / x-- + --x;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);



        float f = 100.001f;
        double d = f;
        System.out.println(d);



        short s = 10;
        s = (short) (s + s);
        System.out.println(s);

        double d1 = 0.1;
        double d2 = 0.2;
        double sum = d1 + d2;
        System.out.println(sum);
        byte x = -128;

        x=(byte) (x- 2);

        System.out.println(x);

        String test = "Hello";
        String test2 = new String("Hello");
        test2=test2.intern();
        System.out.println(test==test2);
test.concat(test2);

    }
}
