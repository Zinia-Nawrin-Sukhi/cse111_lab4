public class MyClass {
    public static void main(String[]args) {
        // Your algorithm goes here.
A a1 = new A();
B b1 = new B();
B b2 = new B(b1);
b1.methodA(1, 2);
b2.methodB(3, 2);

    }
}