import java.util.*;
 class A3 {
    public void hello(String s) {
        System.out.println("A3: Hello From " + s);
    }
}

 class B3 extends A3 {
    @Override
    public void hello(String s) {
        super.hello(s); // call the parent's hello() method
        System.out.println("B3: Hello From " + s);
    }
}

public class p15_Dynamic_method {
    public static void main(String[] args) {
        A3 a = new B3();
        a.hello("Dynamic Method Dispatch");
        B3 b = new B3();
        b.hello("Method Overriding");
    }
}