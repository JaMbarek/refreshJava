package de.joembarek.staticTest;

class A {
    void fun() {
        System.out.println("A.fun()");
    }
}

class B extends A {
    void fun() {
        System.out.println("B.fun().............");
    }
}

class Main {
    public static void main(String args[]) {
        A a = new B();
        a.fun();  // prints A.fun()
    }
}