package de.joembarek.multilevel.inheritence;

class one {
    public void print_geeks() {
        System.out.println("Geekssssssssssssss");
    }
}

class two extends one {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Drived class
class Main {
    public static void main(String[] args) {
        three g = new three();
        //g.print_geek();
        //g.print_for();
        //g.print_geek();
        g.print_geeks();
    }
}
