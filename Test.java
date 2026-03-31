interface Nee {

    void m1();
}
class NeeImpl implements Nee {

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
class NeeImpl2 implements Nee {

    @Override
    public void m1() {
        System.out.println("m2");
    }
}
class Test {
    public static void main(String[] args) {
        Nee n1 = new NeeImpl();
        n1.m1();
        Nee n2 = new NeeImpl2();
        n2.m1();
    }
}   