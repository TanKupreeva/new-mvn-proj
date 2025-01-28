package dz.manyTasks.aston;

public class B extends A{
    @Override
    public String method(int a) {
        return "2";
    }

    @Override
    public  void doA() {

    }

//    @Override
//    public void doC(String s) {
//
//    }

//    @Override
//    private void doD() {
//
//    }

    @Override
    public void doE() {

    }
public  static  void met(double[]array){
    System.out.println(array.length);
}
    public static void main(String[] args) {
         met(new double[]{});

//        met(1);
//        met();
//        met(1,2,3);
        met(new double[]{1.01,1.02});
        B b = new B();
        System.out.println(b.method(1));

        int number = 12241;
        System.out.println((number%100/10)%10);
        System.out.println(9%10);



        String [] w= {"1","2"};
//        double [] d=new {1.0d,1.1d};
        char[] c = new char[]{'f','g'};
        int[] n = {1,2,3};


        System.out.println(12%13);
        System.out.println(25/2);
        System.out.println(24/2);
        System.out.println(24%2);
    }
}
