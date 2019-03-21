package de.joembarek.innerclass.anonymousinnerclass;

interface Animal {
    void eat();
}

class Runner {

    private String x = "X";
    static String y = "Y";
    public String z = "Z";
    final String j = "J";


    Animal a = new Animal() {
        public void eat() {
            System.out.println("eat" + y);
            System.out.println("eat" + x);
            System.out.println("eat" + z);
            System.out.println("eat" + j);
        }
    };


}

public class Test {
    public static void main(String args[]) {

        Runner r = new Runner();
        r.a.eat();
    }
}
