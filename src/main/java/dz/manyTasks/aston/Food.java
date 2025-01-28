package dz.manyTasks.aston;

public class Food {
    public static void main(String[] args) {
        Potato potato = new Potato(){
            @Override
            public void peel(){
                System.out.println("чистим картошку в анонимном классе");
            }
        };
        potato.peel();
    }
}
