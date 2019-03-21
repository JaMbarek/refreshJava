package de.joembarek.hashCode;

public class Person {
    private String lastName;
    private String firstName;
    private boolean female;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if (this.female != other.female) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 19 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 19 * hash + (this.female ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" + "lastName=" + lastName + ", firstName=" + firstName
                + ", female=" + female + '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFemale(true);
        p1.setFirstName("d");
        p1.setLastName("f");
        Person p2 = new Person();
        p2.setFirstName("d");
        p2.setLastName("f");
        p2.setFemale(true);


        System.out.println(p1.equals(p2));
        System.out.println("a hashcode: " + p1.hashCode());
        System.out.println("a tostring: " + p1.toString());
        System.out.println("b hashcode: " + p2.hashCode());
        System.out.println("b tostring: " + p2.toString());

    }
}


