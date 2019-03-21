package de.joembarek.abstractclass;

public class Sub extends Super {


    @Override
    public void create() {
        x = "successfully";
        System.out.println("Created !!" + x);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.create();
    }
}
