package org.example;

import java.util.Collections;

public interface Functional {
    public String h(String a);
}
class A{
    public void b(){
        Functional functional = a -> {return a;};
        System.out.println(functional.h("haong"));
    }

    public static void main(String[] args) {
        A a = new A();
        a.b();
    }
}
