//program for miltiple inheritance using interface
class A {
    void m1() {
        System.out.println("m1");
    }
}
class B {
    void m2() {
        System.out.println("m2");
    }
}
class C extends A {
    void m3() {
        System.out.println("m3");
    }
}
class D extends B {
    void m4() {
        System.out.println("m4");
    }
}
class E extends C {
    void m5() {
        System.out.println("m5");
    }
}
class F extends D {
    void m6() {
        System.out.println("m6");
    }
}
public class MultipleInheritance{
    public static void main(String[] args) {
        E e = new E();
        e.m1();
        e.m3();
        e.m5();
        F f = new F();
        f.m2();
        f.m4();
        f.m6();
    }
}