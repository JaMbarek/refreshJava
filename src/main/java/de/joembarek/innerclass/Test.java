package de.joembarek.innerclass;

class OuterClass {

    private static int x = 10;
    private int y = 10;
    // Static nested class
    public static class NestedStaticClass {
        public void print() {
            System.out.println("Message from nested static class" + x );
        }
    }
}

public class Test {
    public static void main(String args[]){
        // create instance of nested Static class
        OuterClass.NestedStaticClass sc = new OuterClass.NestedStaticClass();

        // call nonstatic method of nested static class
        sc.print();
    }
}
