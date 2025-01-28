package dz.manyTasks.aston;

public class Task {
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int increment(int count) {
        return count + 1;
    }
    private String name;
    private int age;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public Task(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        int count = 0;
//        while (count < 5) {
//            increment(count);
//        }
//        System.out.println(count);

        int em [] = new int[]{90};
        System.out.println(em.length);
        String str = (String) new Object();



    }



}
