package org.example;

@FunctionalInterface
interface SayHello {
    void display(String say);
}

class Hello {
    public Hello(String say) {
        System.out.print(say);
    }

    public void display(String say) {
        System.out.println(say);
    }
}

public class DemoMethodReference4 {
    public static void main(String[] args) {
        SayHello ref = Hello::new;
        ref.display("Welcome to gpcoder.com");
    }

}
