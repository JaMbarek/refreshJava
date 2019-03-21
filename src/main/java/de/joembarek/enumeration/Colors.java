package de.joembarek.enumeration;

public enum Colors {
    RED("#ff0000"),
    BLUE("#3366cc"),
    BLACK("#000000");

    private String hexValue;

    private Colors(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}

class Test {

    public static void main(String[] args) {
        Colors color = Colors.BLUE;

        switch (color) {
            case RED:
                System.out.println("From Switch" + color.getHexValue());
                break;
            case BLUE:
                System.out.println("From Switch" + color.getHexValue());
                break;
            case BLACK:
                System.out.println("From Switch" + color.getHexValue());
                break;
        }


        for (Colors c : Colors.values()) {
            System.out.println("From For loop "+c);
        }
    }
}