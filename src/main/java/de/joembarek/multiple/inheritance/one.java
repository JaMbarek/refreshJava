package de.joembarek.multiple.inheritance;

interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

//interface three extends one, two {
//    public void print_geeks();
//}


// Drived class
class child implements one, two {

    @Override
    public void print_for() {
        System.out.println("for");
    }

    @Override
    public void print_geek() {
        System.out.println("gook");
    }

/*    @Override
    public void print_geeks() {
        System.out.println("Geeks");
    }*/
}

class Main {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
//        c.print_geeks();
    }
}