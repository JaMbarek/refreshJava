package de.joembarek.staticTest;

public class Runner {

    // NotifyService ns = new NotifyService();
    static NotifyService ns = new NotifyService();
    public static void main(String[] args) {

        int i = 0;
        boolean stop = true;
        while (stop) {
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " : " + ns.printTime());
            if (i == 100)
                stop = false;
        }
    }
}
