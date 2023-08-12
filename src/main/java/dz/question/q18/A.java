package dz.question.q18;

public abstract class A {
    abstract void a1();

    void a2() {
    }
}

class B extends A {
    void a1() {
    }

    void a2() {
    }

}
class C extends B{
    void c1(){}
}
class Test{
    public static void main(String[] args) {
        A x = new B();
        C y = new C();
        A z = new C();
        x.a1();
        x.a2();
        y.c1();
        z.a2();
        z.a1();

    }
}