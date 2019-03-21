package de.joembarek.overwrite;

// A Simple Java program to demonstrate
// Overriding and Access-Modifiers

class Parent {
    // private methods are not overridden
    private void m1() {
        System.out.println("From parent m1()");
    }

    protected void m2() {
        System.out.println("From parent m2()");
    }

    final void m3() {
        System.out.println("From parent final m3()");
    }

    static void m4() {
        System.out.println("From parent static m4()");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1() {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2() {
        System.out.println("From child m2()");
    }

    static void m4() {
        System.out.println("From child static m4()");
    }
}

// Driver class
class Main {
    public static void main(String[] args) {

       /* String a = "hallo";
        String b = "hallo";

        System.out.println(a.equals(b));
        System.out.println("a hashcode: " + a.hashCode());
        System.out.println("a tostring: " + a.toString());
        System.out.println("b hashcode: " + b.hashCode());
        System.out.println("b tostring: " + b.toString());



*/

        Parent obj1 = new Parent();
        Parent obj4 = new Child();

        System.out.println(obj1.equals(obj4));
        System.out.println("obj1 hashcode: " + Integer.toHexString(obj1.hashCode()));
        System.out.println("obj1 tostring: " + obj1.toString());
        System.out.println("obj4 hashcode: " + Integer.toHexString(obj4.hashCode()));
        System.out.println("obj1 tostring: " + obj4.toString());


        obj1.m2();
        obj1.m3();
        obj1.m4();
        System.out.println("\n");
        Parent obj2 = new Child();
        obj2.m2();
        obj2.m3();
        obj2.m4();

        System.out.println("\n");
        Child obj3 = new Child();
        obj3.m4();
    }
}